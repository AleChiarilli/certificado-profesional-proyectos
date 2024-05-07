package p2_licoreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//pst  = prepareStatement
public class GestorLicoreriaParametros {
	
	private static final String URL = "jdbc:mysql://localhost:3306/licoreria";
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
		
		
		// 2. OBTENER UNA CONEXION CONTRA LA BASE DE DATOS (cable):
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("OK ... 2 - CONEXION OBTENIDA" + conexion + "\n");
			
		} catch (SQLException e) {
			System.out.println("ERROR: NO SE HA PODIDO OBTENER LA CONEXION " + e + "\n\n");
		}

		
		// 3. OBTENER UN OBJETO SENTENCIA PARA EJECUTAR LA CONSULTA CONTRA LA BD.
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			//	 COLOCAMOS LA QUERY DE SQL TAL CUAL:
			final String query = GestorQueries.obtenerQuery("productos_licoreria.alcoholicas");
			
			pst = conexion.prepareStatement(query);
			System.out.println("LA PS SIN AJUSTAR PARAMETROS: \n " + pst);
			
			System.out.println("LA PS CON LOS PARAMETROS AHORA SÍ AJUSTADOS: \n " + pst);
			
			rs = pst.executeQuery();
			
			while(rs.next()) {						//1 O 2 SON EL NÚMERO DE LA COLUMNA A LA QUE TE REFIERES
				String nombre_posicional = rs.getString(2);
				String nombre_nominal = rs.getString("nombre_producto");
				

				
				System.out.println(nombre_posicional);
			}
			System.out.println("\n\n" + "OK ... 3 - OBJETO SENTENCIA \n\t" + pst);
			System.out.println("OK ... 3 - OBJETO RESULTSET \n\t" + rs);
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR: NO SE HA PODIDO OBTENER EL OBJETO SENTENCIA \n" + e);
		}
		
		
		
		//4. AHORA TENEMOS QUE CERRAR LA QUERY
		try {
			
			if (pst != null) {pst.close();}
			if (conexion != null && !conexion.isClosed()) {
															conexion.close();}
		
		} catch (SQLException e) {
			System.out.println("ERROR: FALLO AL CERRAR EL RESULTSET ->" + e);
		}
		
	}
	
}
