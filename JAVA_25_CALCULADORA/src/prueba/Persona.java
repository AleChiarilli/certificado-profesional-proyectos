package prueba;

import beans.Calculadora;

public class Persona {

	public static void main(String[] args) {
		
		
		System.out.println(
				Calculadora.darmeCalculadora().suma(2, 2) + "\n" +
				Calculadora.darmeCalculadora().resta(10, 5)  + "\n" +
				Calculadora.darmeCalculadora().multiplicacion(10, 10) + "\n" +
				Calculadora.darmeCalculadora().division(25, 5)
				);
		
	}
}
