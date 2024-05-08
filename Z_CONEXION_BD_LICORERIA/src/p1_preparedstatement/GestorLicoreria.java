package p1_preparedstatement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public abstract class GestorLicoreria {

	// PROPIEDADES DE LA CONEXIÓN:
	private static final String URL 		= "jdbc:mysql://localhost:3306/licoreria";
	private static final String USER 		= "root";
	private static final String PASSWORD 	= "master" ;
	
	
	
	// BIS	
	static {
		iniciarGestor();		
	}
	
	
	
	public static final void iniciarGestor() {
		
		// 1. CARGAR EN MEMORIA EL DRIVER DE CONEXIÓN.
		//
		//		NO TE OLVIDES DE AÑADIR LAS LIBRERIAS ... ADD EXTERNAL JARS.
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("\nOK ... 1 - DRIVER CARGADO EN MEMORIA");
			
		} catch (ClassNotFoundException cnfe) {
			
			System.out.println("\nERROR: NO SE HA PODIDO CARGAR EL DRIVER \n" + cnfe);
			
		}		
		
	}
	
	
	
	
	
	public static final Connection solicitarConexion() {
		
		// 2. OBTENER UNA CONEXIÓN CONTRA LA BASE DE DATOS (cable).
		
		Connection conexion = null;
		
		
		try {
			
			 conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			 
			 System.out.println("\nOK ... 2 - CONEXION OBTENIDA \n\t" + conexion);
			
		} catch (SQLException sqle) {
			
			System.out.println("\nERROR: NO SE HA PODIDO OBTENER CONEXION \n" + sqle);
		}
		
		return conexion;
		
	}
	
	
	
	
	
	public static final ResultSet comprarBebidasSinAlcohol() /* throws SQLException */ {
		
		// 3. OBTENER UN OBJETO SENTENCIA PARA EJECUTAR LA CONSULTA CONTRA LA BD.

		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			final String query = GestorQueries.obtenerQuery("bebidas.alcohol");
			
			// OBTENER LA CONEXIÓN DESDE EL MÉTODO DE ARRIBA.
			ps = solicitarConexion().prepareStatement(query);
			
			System.out.println("\n A) LA PS SIN AJUSTAR PARAMETROS: \n " + ps);
			
			// NO TE OLVIDES DE AJUSTAR LOS PARÁMETROS (si es que los hay) POR POSICIÓN.
			
			// bebidas.alcohol = SELECT nombre, precio FROM bebidas WHERE alcohol = ?;
			
			
			// LLÉVALO A UNA INTERFAZ EN MODO CATÁLOGO DE CONSTANTES.
			final boolean ALCOHOL_NO = false;
			final boolean ALCOHOL_SI = true;
			
			ps.setBoolean(1, ALCOHOL_NO);		// (POSICIÓN DEL PARÁMETRO, VALOR)

			rs = ps.executeQuery();
			
			System.out.println("\n B)LA PS CON LOS PARAMETROS YA AJUSTADOS: \n " + ps);
		
		} catch(SQLException sqle) {
			System.out.println("ERROR: NO SE HA PODIDO EJECUTAR LA SENTENCIA PS \n" + sqle);
		}

		
		return rs;
		
	}
	
	
	
	
	
	public static void imprimirBebidas(ResultSet rs) {
		
		System.out.println("\n\n BEBIDAS SOLICITADAS: \n");
		
		try {
		
			final ResultSetMetaData rsmd = rs.getMetaData();		
			
			final int totalCampos = rsmd.getColumnCount();
			
			
			// RECORRER LOS REGISTROS == FILAS == TUPLAS
			while(rs.next()) {
			
				// RECORRER LOS CAMPOS
				for(int i=1; i<=totalCampos; i++) {
					System.out.println(rsmd.getColumnName(i) + " ---> "+  rs.getString(i));
				}
			
			}
		} catch(SQLException sqle) {
			System.out.println("ERROR: FALLO AL MOSTRAR LAS BEBIDAS DEL RS \n" + sqle);
		}	
		
	}
		
	
	
	
	
	public static final void cerrarConexion(Connection conexion) {
		
		try {
		
			if(conexion != null && !conexion.isClosed()) {
				conexion.close(); // ... CERRANDO AQUÍ YA SERÍA SUFICIENTE.
				System.out.println("\n\n¿CONEXION CERRADA CORRECTAMENTE? ... " +
										conexion.isClosed());				
			
			}
			
		} catch(SQLException sqle) {
			System.out.println("ERROR: FALLO AL CERRAR LA CONEXION \n" + sqle);
		}
		
	}	
		
}