package daos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// ESTA CLASE SE ENCARGA DE:
//
//	1. CARGAR DRIVER DE LA BD.
//	2. OFRECER CONEXIONES
//	3. CERRAR CONEXIONES
//	4. OFRECER LAS QUERIES (no lo hemos hecho, para el siguiente ejercicio de comprar)


public abstract class AbstractDAO {

	// DETALLES DE LA CONEXIÓN.
	private static final String URL 		= "jdbc:mysql://localhost:3306/login_from_japan";
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
	
	
	
	
	// SOLICITAR NUEVA CONEXIÓN
	protected Connection getConnection() throws SQLException {		
		return DriverManager.getConnection(URL,USER,PASSWORD);		
	}
	
	
	
	// CERRAR LA CONEXIÓN (no es necesario si el DAO hijo utiliza Try-with-resources)
	protected void closeConnection(Connection connection) throws SQLException {
		if(connection != null && !connection.isClosed()) {
			connection.close();
		}
	}
	
	
	
	// MEJOR EN FICHERO DE PROPIEDADES:
	// 		QUERY PARA SOLICITAR EL ACCESO (ENTRAR AL SISTEMA ... SÓLO QUIERO QUE ME DIGAS true / false)
	protected final String query_login = 			
				"SELECT 'OK' AS 'ACCESO' FROM login WHERE USER_EMAIL=? AND PASSWORD=?;";
	
				//"SELECT USER_EMAIL AS 'ACCESO' FROM login WHERE USER_EMAIL=? AND PASSWORD=?;";			
				//"SELECT 'OK' AS 'ACCESO' FROM login WHERE USER_EMAIL='bombillaloca' AND PASSWORD='7406';";
	
}
