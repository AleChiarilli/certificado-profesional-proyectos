package daos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Scanner;


public abstract class AbstractDAO {

	// DETALLES DE LA CONEXIÓN.
	private static final String URL 		= "jdbc:mysql://localhost:3306/aviones";
	private static final String USER 		= "root";
	private static final String PASSWORD 	= "master";
	
	
	// CARGAR EN MEMORIA EL DRIVER DE CONEXIÓN.
	//		NO TE OLVIDES DE AÑADIR LAS LIBRERIAS JDBC ... ADD EXTERNAL JARS.	
	static {	
		try {
			Class.forName("com.mysql.jdbc.Driver");
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
	

	
	private final static Connection solicitarNuevaConexion() throws SQLException {		
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	
	
	// ESTE ES EL MÉTODO QUE LLAMARÁN LOS DAO'S.
	public final static synchronized Connection solicitarConexion() throws SQLException {
		
		Thread queHilo = Thread.currentThread();
		System.out.println("\n\n\n\n >>> EL HILO " + queHilo.getName() + " SOLICITA CONEXION.");
		
		
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

		// DML == INSERT / UPDATE / DELETE ... AUTO-CONFIRMAN LA TRANSACCIÓN.		
		conexion.setAutoCommit(false);
		
		return conexion;
		
	}

	
	// CERRAR LA CONEXIÓN (no es necesario si el DAO hijo utiliza Try-with-resources)
	protected final void closeConnection(Connection connection) throws SQLException {
		if(connection != null && !connection.isClosed()) {
			connection.close();
		}
	}
	

	
	
	
	//////////////////////////////// RESOURCE BUNDLE ///////////////////////////////
	
	private static final String FICHERO = "ficheros.hangar";
		
	
	private static final ResourceBundle rb;
	
	static {
		rb = ResourceBundle.getBundle(FICHERO);
		//System.out.println("\n---> " + rb + "\n");
	}
	
	
	protected final String solicitarQuery(String query) {
		return rb.getString(query);
	}

}