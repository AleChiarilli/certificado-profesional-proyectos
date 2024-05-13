package fachadas;


import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import daos.AvionesDAO;
import daos.CobrosDAO;
import factorias.FactoriaConexiones;
import interfaces.InterfazCompras;


public class CompraFachada implements InterfazCompras {

	private AvionesDAO avionesDAO;
	private CobrosDAO cobrosDAO;
	
	
	public CompraFachada() {
		// USAR FACTORÍA O INYECCIÓN AUTOMÁTICA POR SPRING PARA LOS DAO's DE LA FACHADA.
		avionesDAO = new AvionesDAO();
		cobrosDAO = new CobrosDAO();
	}
	
	
	@Override
	public boolean comprar(String empresa, String modelo, int unidades) {
		
		Connection conexion = null;		
		boolean ventaSiNo = false;
		
		
		try { 
			conexion = FactoriaConexiones.solicitarReutilizarConexion();
		} catch(SQLException sqle) {
			throw new RuntimeException("ERROR EN FACHADA: " + sqle);
		}
		
		
		// OPERACIÓN ATÓMICA COMPRAR (DEL GRIEGO "INDIVISIBLE") == FACTURAR + REDUCIR STOCK.		
		try {
			
			// FORZAR COBRO ANTES DE VERIFICAR SI HAY STOCK DISPONIBLE (prueba transaccionalidad): 
			
			// 1ª OPERACIÓN - FACTURAR.
			cobrosDAO.facturar(empresa, modelo, unidades);
			
			// 2ª OPERACIÓN - REDUCIR STOCK.
			avionesDAO.reducirStock(modelo, unidades);				
			
			// 3ªA - SI TODO BIEN:			
			conexion.commit();			// CONFIRMACIÓN DE LA OPERACIÓN ATÓMICA EN LA FACHADA.
			ventaSiNo = true;
			System.out.println("\n\t !!! ENHORABUENA, EL PEDIDO SE HA REALIZADO CON EXITO !!! ");
						
		} catch(SQLException sqle) {	// EL CAMPO UNSIGNED NO PERMITE VALORES NEGATIVOS.
			
			// 3ªB - SI FALLO:
			System.out.println("\n\t --- LO SENTIMOS, PERO EL PEDIDO NO SE HA PODIDO REALIZAR POR FALTA DE STOCK --- ");
			System.out.println("\t --------- SE ANULA EL COBRO CORRESPONDIENTE A ESTE PEDIDO (ROLLBACK) ---------- \n");
			System.out.println("\t CAUSA: " + sqle);
			
			try {
				conexion.rollback();	// ANULACIÓN DE LA OPERACIÓN ATÓMICA EN LA FACHADA (DCL).
			} catch (SQLException sqle2) {
				System.out.println("ERROR: " + sqle2);
			}	
			
		} finally {						// FINALLY == CIERRE DE LA CONEXIÓN EN LA FACHADA (HAYA O NO FALLO).
			
			try {
				FactoriaConexiones.cerrarConnection(conexion);
			} catch (SQLException sqle) {
				System.out.println("ERROR: " + sqle);
			}
			
		}
		

		return ventaSiNo;
		
	}

}