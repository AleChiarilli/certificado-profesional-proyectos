package factorias;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public abstract class FactoriaConexiones {

	//////////////////////////////// GESTIÓN DE LA CONEXIÓN ///////////////////////////////
	
	// DETALLES DE LA CONEXIÓN.
	private static final String URL 		= "jdbc:mysql://localhost:3306/hangar";
	private static final String USER 		= "root";
	private static final String PASSWORD 	= "formacion"; // "master"
	
	
	// CARGAR EN MEMORIA EL DRIVER DE CONEXIÓN ...
	//		... NO OLVIDAR EL AÑADIR LAS LIBRERIAS JDBC AL PROYECTO ...
	//				BUILD PATH - ADD EXTERNAL JARS.
	static {	
		try {			
			//Class.forName("com.mysql.jdbc.Driver"); 	// VERSIÓN 5 - deprecated - NO FUNCIONA CON MYSQL 8.
			Class.forName("com.mysql.cj.jdbc.Driver");	// VERSIÓN 8.			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("\nERROR: NO SE HA PODIDO CARGAR EL DRIVER \n" + cnfe);
		}	
	}
	
	
	// MAPA HILOS-CONEXIONES (ThreadLocal).
	private static  final Map<Thread, Connection> mapaHilosConexiones;
	
	// BIS
	static {
		mapaHilosConexiones = new HashMap<>(); // [Thread] - [Connection] ... INFERENCIA DE TIPOS JAVA 8.
	}
	

	// SOLICITUD DE UN NUEVO OBJETO CONEXIÓN AL DRIVERMANAGER (AUTOCONFIRMADA POR DEFECTO).
	public final static synchronized Connection solicitarNuevaConexion() throws SQLException {		
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	
	
	// MÉTODO PARA LOGRAR TRANSACCIONALIDAD (CONEXIÓN REUTILIZADA - HAY QUE DESACTIVAR LA AUTOCONFIRMACIÓN DML).
	//
	// RECORDAR: LA CONEXIÓN SE ABRE EN EL DAO (uno de ellos) Y SE CONFIRMA EN LA FACHADA.	
	public final static synchronized Connection solicitarReutilizarConexion() throws SQLException {
		
		Thread queHilo = Thread.currentThread();
		
		System.out.println("\n\n\n\n\n>>> EL HILO " + queHilo.getName() + " SOLICITA CONEXION.");		
		
		Connection conexion = mapaHilosConexiones.get(queHilo);
		
		// SI LA CONEXIÓN REGISTRADA CON ANTERIORIDAD EN EL MAPA ESTÁ OK, REUTILIZARLA.
		if(conexion != null && !conexion.isClosed()) {
			System.out.println("\nSE REUTILIZA LA CONEXION ... " + conexion);
			return conexion;
		}
		
		
		// SI NO, CREAR UNA NUEVA Y REGISTRARLA EN EL MAPA PARA EL HILO ACTUAL.
		conexion = solicitarNuevaConexion();
		
		mapaHilosConexiones.put(queHilo, conexion);
		
		System.out.println("\nSE CREA Y REGISTRA UNA NUEVA CONEXION ... " + conexion);

		// DML == INSERT / UPDATE / DELETE ... AUTO-CONFIRMAN LA TRANSACCIÓN.
		//
		// DESACTIVAR AUTOCONFIRMACIÓN PARA TRANSACCIONALIDAD;
		conexion.setAutoCommit(false);
		
		return conexion;
		
	}

	
	// CIERRE DE LA CONEXIÓN Y SUS ELEMENTOS ASOCIADOS IMPLÍCITAMENTE.
	public static synchronized final void cerrarConnection(Connection conexion) throws SQLException {
		if(conexion != null && !conexion.isClosed()) {
			System.out.println("\n\t ---> CIERRE DE LA CONEXION ... " + conexion + "\n");
			conexion.close();										// CERRAR CONEXIÓN
			mapaHilosConexiones.remove(Thread.currentThread());		// ELIMINAR EL REGISTRO DEL MAPA.
		}
	}
	
	
	
	
	/// PRUEBA PARCIAL ... lanzar excepciones fuera del main sólo para la prueba rápida ///
	public static void main(String[] args) throws SQLException {
		
		System.out.println("CARGA DE DRIVER JDBC OK \n\n");
		
		System.out.println("NUEVA 1 ---> " + solicitarNuevaConexion());
		System.out.println("NUEVA 2 ---> " + solicitarNuevaConexion());
		
		
		System.out.println("\n==================================================\n");
		
		System.out.println("\t REUTILIZAR A ---> " + solicitarReutilizarConexion());
		System.out.println("\t REUTILIZAR B ---> " + solicitarReutilizarConexion());
		System.out.println("\t REUTILIZAR C ---> " + solicitarReutilizarConexion());

		
		System.out.println("\n==================================================\n");

		Connection conexion = solicitarNuevaConexion();
		System.out.println("APERTURA DE UNA NUEVA CONEXION ---> " + conexion);
		cerrarConnection(conexion);
		
	}
	
}


/*

CARGA DE DRIVER JDBC OK 


NUEVA 1 ---> com.mysql.cj.jdbc.ConnectionImpl@17bffc17
NUEVA 2 ---> com.mysql.cj.jdbc.ConnectionImpl@338fc1d8

==================================================



>>> EL HILO main SOLICITA CONEXION.

SE CREA Y REGISTRA UNA NUEVA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@480d3575
	 REUTILIZAR A ---> com.mysql.cj.jdbc.ConnectionImpl@480d3575


>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@480d3575
	 REUTILIZAR B ---> com.mysql.cj.jdbc.ConnectionImpl@480d3575


>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@480d3575
	 REUTILIZAR C ---> com.mysql.cj.jdbc.ConnectionImpl@480d3575

==================================================

APERTURA DE UNA NUEVA CONEXION ---> com.mysql.cj.jdbc.ConnectionImpl@194fad1

	 ---> CIERRE DE LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@194fad1

*/