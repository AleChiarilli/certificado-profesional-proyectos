package p0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiccionarioMap {

	public static void main(String[] args) {
		
		List<Integer> listado = new ArrayList<Integer>();
		listado.add(22);
		listado.add(-61);
		//listado.add("ANA");
		
		System.out.println(listado);
		
		////////////////////////////////////////////
		
		//TODAS LAS COLECCIONES TIENEN QUE TENER UN TIPADO
		Map<String, Integer> cochesMapa = new HashMap<String, Integer>();
		
		cochesMapa.put("BMW", 20000);
		cochesMapa.put("Porsche", 50000);
		
		final String quien = "ALEXANDRA";
		
		System.out.println("HEMOS CONTRATADO A ... " + quien + " PARA UNA " 
								+ " SESION DE FOTOS. NOS CUESTA ... " + 
									cochesMapa.get(quien) + " €.");
		
		
		
	}
	
	
}
