package daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import factorias.FactoriaConexiones;
import gestores.GestorQueries;


public class CobrosDAO extends AbstractDAO {

	public void facturar(String empresaCliente, String modelo, int unidades) throws SQLException  {
		
		// DEBERÍA COMPROBARSE EN PRIMER LUGAR SI EL MODELO SOLICITADO EXISTE (SE VERIFICA
		//	AUTOMÁTICAMENTE POR RELACIÓN REFERENCIAL) Y DE SER ASÍ, QUE SE DISPONGA DEL STOCK
		//	SUFICIENTE PARA ATENDER AL PEDIDO DEL CLIENTE.
		
		// EN ESTE CASO SE GENERA DIRECTAMENTE EL ALTA EN LA TABLA DE COBROS PARA 
		//	FORZAR A QUE SEA EL FALLO EN LA TRANSACCIÓN, POR STOCK INSUFICIENTE, EL
		//	QUE REALMENTE ANULE EL ALTA EN COBROS (facturar) SOLICITADO POR ESTE DAO
		//	Y COMPROBAR ASÍ, EL CONCEPTO DE TRANSACCIONALIDAD (LA POLÍTICA DEL TODO O
		//	NADA EN LA OPERACIÓN ATÓMICA == UNIÓN DE OPERACIONES INDIVIDUALES QUE 
		//	CONSTITUYEN Y SE VEN, COMO UNA SOLA).
		
		Connection conexion = FactoriaConexiones.solicitarReutilizarConexion();
		
		
		// QUERY 1 -> SELECT PRECIO FROM aviones WHERE MODELO LIKE ?;		
		PreparedStatement ps = conexion.prepareStatement(GestorQueries.solicitarQuery("aviones.consultar.modelo.precio"));
		ps.setString(1, modelo);
				
		System.out.println("\n>>> PS_1 (CONSULTAR PRECIO AVION): \n\t" + ps);
				
		ResultSet rs = ps.executeQuery();

		if(!rs.next()) {
			throw new RuntimeException("\nERROR: EL MODELO SOLICITADO NO EXISTE.");
		}

		// IMPORTE UNITARIO PARA EL MODELO SOLICITADO:
		int importeUnitario = rs.getInt("IMPORTE_UNITARIO");
		
		
		
		// QUERY 2 -> INSERT INTO cobros (EMPRESA_CLIENTE, MODELO, UNIDADES, IMPORTE_UNITARIO, IMPORTE_TOTAL) VALUES (?,?,?,?,?);
		ps = conexion.prepareStatement(GestorQueries.solicitarQuery("aviones.cobros.facturar"));
		
		ps.setString(1, empresaCliente);
		ps.setString(2, modelo);
		ps.setInt(3, unidades);
		ps.setInt(4, importeUnitario);
		ps.setInt(5, importeUnitario * unidades);

		System.out.println("\n>>> PS_2 (ALTA EN COBROS - FACTURAR): \n\t" + ps);
		
		ps.executeUpdate();
		
	}

	

	
	
	/// PRUEBA PARCIAL ///
	public static void main(String[] args) throws SQLException {
		
		new CobrosDAO().facturar("JURRACA AIR COMPANY", "F14 TOMCAT", 9);
		
		FactoriaConexiones.solicitarReutilizarConexion().commit();
		
		System.out.println("\nFIN PRUEBA FACTURACION - CobrosDAO ..... REFRESCA LA TABLA Y OBSERVA RESULTADOS.");
		
	}
	
}