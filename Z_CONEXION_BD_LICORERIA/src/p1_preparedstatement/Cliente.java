package p1_preparedstatement;

import java.sql.ResultSet;

public class Cliente {

	public static void main(String[] args) {
		ResultSet rs = GestorLicoreria.comprarBebidasSinAlcohol();
		System.out.println(rs);
	}
	

	
}
