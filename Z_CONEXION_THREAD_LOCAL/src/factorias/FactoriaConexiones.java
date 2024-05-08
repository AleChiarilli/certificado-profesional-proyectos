package factorias;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public abstract class FactoriaConexiones {

	// PROPIEDADES DE LA CONEXIÓN:
	private static final String URL 		= "jdbc:mysql://localhost:3306/licoreria";
	private static final String USER 		= "root";
	private static final String PASSWORD 	= "master" ;
	
	// BIS
	static {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//System.out.println("\nOK ... 1 - DRIVER CARGADO EN MEMORIA");
			
		} catch (ClassNotFoundException cnfe) {
			
			System.out.println("\nERROR: NO SE HA PODIDO CARGAR EL DRIVER \n" + cnfe);
			
		}		
		
	}


	
	
	// MAPA HILOS-CONEXIONES (ThreadLocal).
	private static final Map<Thread, Connection> mapaHilosConexiones;
	
	// BIS
	static {
		mapaHilosConexiones = new HashMap<>(); // [Thread] - [Connection]
	}
	

	
	private static Connection solicitarNuevaConexion() throws SQLException {		
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	
	
	
	
	
	
	public static synchronized Connection solicitarConexion() throws SQLException {
		
		Thread queHilo = Thread.currentThread();
		System.out.println("\n\n\n\n >>> EL HILO " + queHilo.getName() + " SOLICITA CONEXION.");
		
		//mapaHilosConexiones.containsKey(queHilo);
		
		
		Connection conexion = mapaHilosConexiones.get(queHilo);
		
		// SI LA CONEXIÓN REGISTRADA CON ANTERIORIDAD EN EL MAPA ESTÁ OK, REUTILIZARLA.
		if(conexion != null && !conexion.isClosed()) {
			System.out.println("\nSE REUTILIZA LA CONEXION ... " + conexion);
			return conexion;
		}
		
		
		// SI NO, CREAR UNA NUEVA Y REGISTRARLA EN EL MAPA.		
		conexion = solicitarNuevaConexion();
		mapaHilosConexiones.put(queHilo, conexion);
		
		System.out.println("\nSE CREA Y REGISTRA UNA NUEVA CONEXION ... " + conexion);
		
		// SI QUIERO ESTABLECER TRANSACCIONALIDAD EN OPERACIONES ATÓMICAS (varias
		//	operaciones individuales vistas como si fueran todas ellas 1 sola)
		//
		//	GRANITO = CUARZO + FELDESPATO + MICA 
		//
		// DML == INSERT / UPDATE / DELETE ... AUTO-CONFIRMAN LA TRANSACCIÓN.		
		conexion.setAutoCommit(false);
		
		return conexion;
		
	}
	
	
	// QUE HILO
	public static String queHilo() {
		return Thread.currentThread().getName();
	}
	
	
	// RETARDO
	public static void retardar() {
		
		try {
			
			Thread.sleep(new Random().nextInt(2000) + 1); // [1..2000 mseg]
		
		} catch(InterruptedException ie) {
		
			System.out.println("ERROR: " + ie);
		
		}
		
	}

}