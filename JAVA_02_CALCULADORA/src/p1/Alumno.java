package p1;

import java.util.Scanner;

import p0.Calculadora2;

public class Alumno {

	public static void main(String[] args) {
		
		// final double radio = 2.5;
		
		//PREGUNTA EL INPUT
		System.out.println("DIME EL RADIO...");
		
		//SE CREA EL SCANNER
		Scanner sc = new Scanner(System.in);
		
		//EL SCANNER RECIBE EL VALOR
		String cadenaLeida = sc.nextLine();
		//SE CIERRA EL SCANNER
		sc.close();
		
		
		//SE CONVIERTE EL VALOR A DOUBLE, Y SE ASIGNA EL VALOR A RADIO
		double radio = Double.parseDouble(cadenaLeida);
		
		
		
		//SE APLICAN LOS METODOS
		final double area = Calculadora2.areaDeCirculo(radio);
		final double perimetro = Calculadora2.perimetroDeCirculo(radio);
		
		//SE MUESTRAN EN CONSOLA
		System.out.println(area);
		System.out.println(perimetro);
	}
	
}

