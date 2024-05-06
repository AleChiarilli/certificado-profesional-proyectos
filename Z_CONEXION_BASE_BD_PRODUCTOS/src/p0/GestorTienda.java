package p0;

import java.sql.Connection;
import java.sql.DriverManager;
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
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("OK ... DRIVER CARGADO EN MEMORIA");
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR: NO SE HA PODIDO CARGAR EL DRIVER \n" + e);
		}
		
		//////////////////////////////////////////////////////////////////
		
		
		// 2. OBTENER UNA CONEXION CONTRA LA BASE DE DATOS (cable).

		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("OK ... 2 - CONEXION OBTENIDA" + conexion);
			
		} catch (SQLException e) {
			System.out.println("ERROR: NO SE HA PODIDO OBTENER LA CONEXION " + e);
		}

		
		// 3. OBTENER UN OBJETO SENTENCIA PARA EJECUTAR LA CONSULTA CONTRA LA BD. 
		
		Statement st; 
		
		try {
			st = conexion.createStatement();
			System.out.println("OK ... 3 - OBJETO SENTENCIA \n\t" + st);
			
		} catch (Exception e) {
			System.out.println("ERROR: NO SE HA PODIDO OBTENER EL OBJETO SENETNCIA \n" + e);
		}
		
	}
	
}
