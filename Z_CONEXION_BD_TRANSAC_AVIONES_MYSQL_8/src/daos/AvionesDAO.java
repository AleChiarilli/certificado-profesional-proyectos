package daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import factorias.FactoriaConexiones;
import gestores.GestorQueries;


public class AvionesDAO extends AbstractDAO {

	public void reducirStock(String modelo, int unidades) throws SQLException {
		
		Connection conexion = FactoriaConexiones.solicitarReutilizarConexion();
		
		PreparedStatement ps = conexion.prepareStatement(GestorQueries.solicitarQuery("aviones.reducirstock.modelo"));
		
		// AJUSTE DE PARÁMETROS EN LA PS (1:UNIDADES - 2:MODELO)
		//
		// aviones.reducirstock.modelo =
		//		UPDATE aviones SET STOCK = STOCK - ? WHERE MODELO LIKE ?;		
		//		UPDATE aviones SET STOCK = STOCK - 1 WHERE MODELO LIKE 'F14 TOMCAT';
		ps.setInt(1, unidades);
		ps.setString(2, modelo);
		
		System.out.println("\n>>> PS_3 (REDUCIR STOCK PARA EL MODELO SOLICITADO): \n\t" + ps);		
		
		// SELECT ---------------------------> ORDEN DE TIPO executeQuery()  : ResultSet.
		
		// DML --> UPDATE/INSERT/DELETE -----> ORDEN DE TIPO executeUpdate() : int.
		ps.executeUpdate();
		
		// LA CONEXIÓN QUEDA ABIERTA A LA ESPERA DE QUE SEA CONFIRMADA/DENEGADA Y CERRADA
		//		EN LA FACHADA.

	}


	


	/// PRUEBA PARCIAL ///
	public static void main(String[] args) throws SQLException {
		
		new AvionesDAO().reducirStock("F14 TOMCAT",1);
		
		// LA FACHADA ES LA QUE HACE COMMIT (LA AUTOCONFIRMACIÓN ESTÁ DESACTIVADA), LUEGO
		// SIN LA SIGUIENTE LÍNEA NO SE CONFIRMARÍAN LOS CAMBIOS EN LA PRUEBA PARCIAL:
		FactoriaConexiones.solicitarReutilizarConexion().commit();
	
		// SI NO HAY STOCK SUFICIENTE, LA SOLICITUD LANZADA DESDE JAVA PROVOCARÁ UNA EXCEPCIÓN Y
		// EL STOCK QUEDARÁ SIN MODIFICAR.
		
		// 		--EXCEPCIÓN-->	com.mysql.cj.jdbc.exceptions.MysqlDataTruncation
		
		/*		
			 >>> EL HILO main SOLICITA CONEXION.
			
			SE CREA Y REGISTRA UNA NUEVA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@5b38c1ec
			PS PARAMETRIZADA: com.mysql.cj.jdbc.ClientPreparedStatement: UPDATE aviones SET STOCK = STOCK - 1 WHERE MODELO LIKE 'F14 TOMCAT';
			Exception in thread "main" com.mysql.cj.jdbc.exceptions.MysqlDataTruncation: Data truncation: BIGINT UNSIGNED value is out of range in '(`hangar`.`aviones`.`STOCK` - 1)'
				at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:95)
				at com.mysql.cj.jdbc.ClientPreparedStatement.executeInternal(ClientPreparedStatement.java:938)
				at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdateInternal(ClientPreparedStatement.java:1106)
				at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdateInternal(ClientPreparedStatement.java:1045)
				at com.mysql.cj.jdbc.ClientPreparedStatement.executeLargeUpdate(ClientPreparedStatement.java:1369)
				at com.mysql.cj.jdbc.ClientPreparedStatement.executeUpdate(ClientPreparedStatement.java:1030)
				at daos.AvionesDAO.reducirStock(AvionesDAO.java:35)
				at daos.AvionesDAO.main(AvionesDAO.java:49)
	*/
		
		
		
		// EN EL CASO DE LANZARSE LA QUERY DESDE EL PROPIO CLIENTE GRÁFICO, RECIBIREMOS UN ERROR:		

		// PARTIMOS DE STOCK = 0 PARA EL "F14 TOMCAT":
		
		// 1 queries executed, 0 success, 1 errors, 0 warnings

		// Query: UPDATE aviones SET STOCK = STOCK - 1 WHERE MODELO LIKE 'F14 TOMCAT'

		// Error Code: 1690
		// BIGINT UNSIGNED value is out of range in '(`hangar`.`aviones`.`STOCK` - 1)'
		
		// SI ASIGNAMOS DIRECTAMENTE UN VALOR NEGATIVO NO HABRÁ ERROR, PERO EL CAMPO NO
		//	QUEDARÁ MODIFICADO.

		
		// EN CUALQUIER CASO, EL CLIENTE FINAL DE LA APLICACIÓN !! NUNCA !! DEBE RECIBIR
		//	UNA EXCEPCIÓN, SINO UN MENSAJE INFORMATIVO CON EL ERROR (LA APLICACIÓN NO SE
		//	PUEDE ROMPER - PARAR).
		
		System.out.println("\nFIN PRUEBA REDUCIR STOCK - AvionesDAO ..... REFRESCA LA TABLA Y OBSERVA RESULTADOS.");
		
	}
	
}