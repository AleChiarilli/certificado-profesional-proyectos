package tienda;

import figuras.Figura;

public class Tienda {
	
	public static double consultarPrecio(Figura ... figuras) { // REST		
		
		double precioTotal = 0;
		
		for (Figura figura : figuras) {
			precioTotal += figura.getPrecio();
			System.out.println(figura + "\n");
		}
		
		return precioTotal;
		
	} 
	
}
