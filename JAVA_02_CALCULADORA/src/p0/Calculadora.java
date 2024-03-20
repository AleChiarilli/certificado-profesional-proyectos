package p0;

import java.util.Iterator;

public class Calculadora {

	final static int RANGO = 100;
	
	
	private static int GenerarNumeroAleatorio() {
		return (int)(Math.random() * RANGO + 1);
	}
	
	
	private static int sumar(int x, int y) {
		return x + y;
	}
	
	
	public static int sumarAleatorios (int cuantos) {
		
		int sumaTotal = 0;
		
		for (int i = 1; i < cuantos; i++) {
			int aleatorio = GenerarNumeroAleatorio();
			sumaTotal = sumar(sumaTotal, aleatorio);
		}
	}
	
}
