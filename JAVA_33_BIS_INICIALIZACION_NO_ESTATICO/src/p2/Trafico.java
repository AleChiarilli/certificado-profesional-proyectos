package p2;

import java.util.Random;

public class Trafico {

	private final static int generarNumero09() {
		return new Random().nextInt(10); // [0..9]
	}
	
	private final static char generarLetraAZ() {
		
		/*
		int minimo = 'A';
		int maximo = 'Z';
		int rango = maximo - minimo;
		*/
		
		//int rango = 'Z' - 'A';
				
		return (char)((new Random().nextInt(('Z' + 1) - 'A')) + 'A');  
		
	}
	
	public static String generarMatricula() {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=4; i++) {
			sb.append(generarNumero09());
		}
		
		sb.append(generarLetraAZ());
		
		return sb.toString();
		
	}
	
	
	/////////////////////////////////////////////////////
	
	// RELLENADO CON 0:
	
	private String generarMatriculaOtraVersion() {
		
		int numeros = new Random().nextInt(10000); // 0 .. 9999 .... 22
		
		String cadenaNumeros = String.valueOf(numeros);  // "22"
		
		int longitudCadenaNumeros = cadenaNumeros.length(); // 2

		
		StringBuilder cadenaFinal = new StringBuilder(); // ""
		
		int relleno = 4 - longitudCadenaNumeros; // 4 - 2 = 2
				
		for(int i=1; i<=relleno; i++) {	// 0     00   000
			cadenaFinal.append("0");
		}
		
		cadenaFinal.append(cadenaNumeros); // 0022
		
		cadenaFinal.append(generarLetraAZ()); // 0022X
		
		return cadenaFinal.toString();
	}
	
	
	
}
