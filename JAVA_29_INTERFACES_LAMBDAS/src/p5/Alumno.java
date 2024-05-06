package p5;


import static p5.ICalculadora.RESTAR;
import static p5.ICalculadora.SUMAR;

import java.util.Scanner;


public class Alumno {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        x = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        y = scanner.nextDouble();
		
		
		
		ICalculadora calculadora = FabricaCalculadoras.solitarCalculadora();
		
		final double resultadoSuma = calculadora.operar(x, y, SUMAR);
		
		final double resultadoResta = calculadora.operar(x, y, RESTAR);
		
		System.out.println(resultadoSuma);
		System.out.println(resultadoResta);
		
	}
	
}


/*

DADOS LOS NUMEROS ... X = 5.0, Y = 7.0 :

LA SUMA ES IGUAL A 12.0

LA RESTA ES IGUAL A -2.0

*/