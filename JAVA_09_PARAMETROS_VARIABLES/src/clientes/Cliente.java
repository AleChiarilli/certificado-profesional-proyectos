package clientes;


//import figuras.*;		// WILDCARD.

import figuras.Camus;
import figuras.Mu;
import figuras.Shaka;


import tienda.Tienda;


public class Cliente {

	public static void main(String[] args) {
		
		double precioTotal = Tienda.consultarPrecio(new Shaka(), new Camus(), new Mu());		
		
		System.out.println("PRECIO TOTAL ... " + precioTotal);

		
		System.out.println("\n\n");
		
		
		precioTotal = Tienda.consultarPrecio(new Camus());		
		
		System.out.println("PRECIO TOTAL ... " + precioTotal);
		
		
	}
	
}
