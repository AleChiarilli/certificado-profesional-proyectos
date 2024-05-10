package fachadas;


import java.sql.SQLException;
import daos.AvionesDAO;
import daos.CobrosDAO;
import interfaces.ICompra;


public class CompraFachada implements ICompra {

	private AvionesDAO avionesDAO;
	private CobrosDAO cobrosDAO;
	
	
	public CompraFachada() {
		// USA FACTORÍA O INYECCIÓN AUTOMÁTICA POR SPRING
		avionesDAO = new AvionesDAO();
		cobrosDAO = new CobrosDAO();
	}
	
	
	@Override
	public String comprar(String modelo) {
		
		String mensaje = "";
		
		// OPERACIÓN ATÓMICA == DEL GRIEGO "INDIVISIBLE".
		try {
			
			// COBRAR ANTES DE DARME CUENTA QUE NO TENGO STOCK PARA ENVIÁRTELO:
			//
			//	TODO A 1 MILLÓN DE EUROS.
			
			// 1 - FACTURAR
			cobrosDAO.facturar();
			
			// 2 - REDUCIR STOCK
			avionesDAO.reducirStock(1);		
			
			mensaje = "OK !!!";
			
			// 3A - SI TODO VA BIEN:
			//conexion.commit();
			
		} catch(SQLException sqle) {
			System.out.println("ERROR: " + sqle);
			
			// 3B - SI FALLO:
			//conexion.rollback();
			
			mensaje = "FALLO";
		}
		
		return mensaje;
	}

}
