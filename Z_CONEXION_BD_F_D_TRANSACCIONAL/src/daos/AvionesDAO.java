package daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AvionesDAO extends AbstractDAO {

	public void reducirStock(int cuantos) throws SQLException {
		
		Connection conexion = solicitarConexion();
		
		PreparedStatement ps = conexion.prepareStatement(solicitarQuery("aviones.reducir.stock"));
		
		// SELECT -> SELECT -----------------> ORDEN DE TIPO executeQuery()  : ResultSet.
		
		// DML --> UPDATE/INSERT/DELETE -----> ORDEN DE TIPO executeUpdate() : int.
		ps.executeQuery();

	}

	
	public static void main(String[] args) throws SQLException {
		
		new AvionesDAO().reducirStock(1);
		
		System.out.println("\nFIN");
	}
	
}



