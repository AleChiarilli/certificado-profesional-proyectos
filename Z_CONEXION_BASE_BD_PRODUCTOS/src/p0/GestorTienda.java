package p0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorTienda {
	
	private static final String URL = "jdbc:mysql://localhost:3306/tienda";
	private static final String USER = "root";
	private static final String PASSWORD = "master";
	
	public static void main(String[] args) {
		
		// 1. CARGAR EN MEMORIA EL DRIVER DE CONEXION.
		// 				--NO TE OLVIDES DE AGREGAR LAS LIBRERIAS
		
		try {
			// ESTO ES PARA CARGAR EL "OBJETO FANTASMA" DE MYSQL
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("OK ... DRIVER CARGADO EN MEMORIA" + "\n\n");
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR: NO SE HA PODIDO CARGAR EL DRIVER \n" + e);
		}
		
		//////////////////////////////////////////////////////////////////
		
		
		// 2. OBTENER UNA CONEXION CONTRA LA BASE DE DATOS (cable).

		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("OK ... 2 - CONEXION OBTENIDA" + conexion + "\n");
			
		} catch (SQLException e) {
			System.out.println("ERROR: NO SE HA PODIDO OBTENER LA CONEXION " + e + "\n\n");
		}

		
		// 3. OBTENER UN OBJETO SENTENCIA PARA EJECUTAR LA CONSULTA CONTRA LA BD. 
		
		Statement st = null; 
		ResultSet rs = null;
		
		try {
			//	 COLOCAMOS LA QUERY DE SQL TAL CUAL:
			final String query = "SELECT nombre, precio FROM productos;";
			
			st = conexion.createStatement();
			rs = st.executeQuery(query);
			
			while(rs.next()) {						//1 O 2 SON EL NÚMERO DE LA COLUMNA A LA QUE TE REFIERES
				String nombre_posicional = rs.getString(1);
				String nombre_nominal = rs.getString("nombre");
				
				double precio_posicional = rs.getDouble(2);
				double precio_nominal = rs.getDouble("precio");
				
				System.out.println(nombre_posicional + " -----> " + precio_nominal);
			}
			System.out.println("\n\n" + "OK ... 3 - OBJETO SENTENCIA \n\t" + st);
			System.out.println("OK ... 3 - OBJETO RESULTSET \n\t" + rs);
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR: NO SE HA PODIDO OBTENER EL OBJETO SENETNCIA \n" + e);
		}
		
		
		try {
			
			if (st != null) {st.close();}
			if (conexion != null && !conexion.isClosed()) {
															conexion.close();}
		
		} catch (SQLException e) {
			System.out.println("ERROR: FALLO AL CERRAR EL RESULTSET ->" + e);
		}
		
		//INSTRUCCIONES - SON INTERFACES (no son clases, es decir, son abstractas):
		//	Statement				-> SENTENCIAS SIMPLES
		//	PreparedStatement		-> SENTENCIAS PARAMETRIZADAS (?) ... PRECOMPILADAS == MUY RAPIDAS
		//	CallableStatement		-> PROCEDIMIENTOS ALMACENADOS. (VIVEN EN LA BASE DE DATOS Y LOS LLAMAS
		//																							DESDE JAVA)
		
		//ResultSet
		//ResultSetMetaData
		
		
		
		//DADA LA INSTRUCCION Statement / PreparedStatement ...
		// .execute()       -->boolean
		// .executeUpdate() --> int: cuantos registros se han visto afectador por ejecutar la query
		
		
		
		// CIERRE DE LOS EKEMENTOS EN ORDEN INVERSO A COMO SE ABRIERON:
		//	ResultSet -> Statement -> Connection.
		// ***CERRAR LA CONEXION YA IMPLICA EL CIERRE AUTOPMATICO DEL RESTO, PERO ES MAS
		
		
		//TIPOS DE ORDENES:
		//DDL	-> DATA DEFINITION LANGUAGE 	-> CREARA TABLAS INDICES ....	 ETC
		//DML	-> DATA MANIPULATION LANGUAGE	-> INSER / DELETE / UPDATE ... 	MODIFICAR
		//DCL	-> DATA CONTROL LANGUAGE		-> COMMIT, ROLLBACK, TRANSA...	TRANSACIONALIDAD
		//Y ENTONCES DONDE PONEMOS EL SELECT?  ....  EL SELECT ES SELECT
		
		// COMANDOS
//		DELETE FROM productos; 			-> BORRA LOS DATOS EXISTENTES PERO MANTIENE EL INDICE DEL AUTOINCREMENTAL (contador)
//		
//		TRUNCATE productos; 			-> BORRA LOS DATOS Y EL ÍNDICE
//		
//		DROP TABLE productos; 			-> DESTRUYE POR COMPLETO LA TABLA.
	}
	
}
