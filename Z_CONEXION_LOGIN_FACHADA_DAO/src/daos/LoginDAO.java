package daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO extends AbstractDAO {

	public boolean getAccess(String user, String password) {
		
		// TRY WITH RESOURCES ... AUTOCIERRE DE TODOS LOS ELEMENTOS - JAVA 7:
		
		/*
		try (recursos){
			código a probar
			
		} catch(tipo excepcion) {
			código a ejecutar si hubo error
		}
		*/
		
		
		
		try (

				Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(query_login);
				// SI TIENES PARÁMETROS EN EL ps AQUÍ NO USES EL ResultSet:
				//		ResultSet rs = ps.executeQuery();
				
			) 	{

				// AJUSTE DE PARÁMETROS:
				//ps.setString(1,"bombillaloca");
				//ps.setString(2,"7406");

				ps.setString(1, user);
				ps.setString(2, password);
			
			
				// TRY WITH RESOURCES ANIDADO:
				try (ResultSet rs = ps.executeQuery();) {

					// ¿CÓMO SABER SI EL USUARIO Y LA CONTRASEÑA INTRODUCIDOS SON VÁLIDOS?
					//		HAZ SIMPLEMENTE rs.next() 	... 1 registro si usuario y clave válidos.
					//									...	0 registros si no == return true/false.

					return rs.next();					
					
				}

				// TODOS LOS RECURSOS SE CERRARÁN AUTOMÁTICAMENTE.
			
		} catch (SQLException sqle) {
		    throw new RuntimeException("ERROR: \n", sqle);			
		}
		
	}
	
}
