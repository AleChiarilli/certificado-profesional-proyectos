package guerra;


import java.util.Scanner;


public final class Enigma {

	// LEER DEL TECLADO LA PALABRA A CODIFICAR.
	public static String introducirPalabra() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ESCRIBE ... ");
		
		String leido = sc.nextLine();
		
		sc.close();
		
		return leido;
		
	}
	
	
	// CODIFICAR UNA PALABRA.
	private String codificarPalabra(String palabra) {
		
		//StringBuilder sb = "HOLA";	// MAL.
		
		//StringBuilder sb = new StringBuilder("HOLA"); // BIEN.
		
		System.out.println("PALABRA ---> " + palabra);
		
		StringBuilder sb = new StringBuilder(palabra);
		
		System.out.println("SB ORIGINAL ---> " + sb);
		
		sb.reverse();
		
		System.out.println("SB INVERTIDO ---> " + sb);
		
		palabra = sb.toString();
		
		System.out.println("PALABRA INVERTIDA ---> " + palabra);
		
		char[] arrayCaracteres = palabra.toCharArray();
		
		
		// ACUMULADOR DE CARACTERES.
		StringBuilder palabraCodificada = new StringBuilder();
		
		
		for (char c : arrayCaracteres) {
			
			System.out.println(c + " -> " + (int)c + " -->" + 
									(char)(c+22) + " ---> "+ (int)(c + 22));
			
			palabraCodificada.append((char)(c+22));
			
		}
		
		return palabraCodificada.toString();
		
	}
	
	
	public static void main(String[] args) {
		
		String palabra = introducirPalabra();
		
		String palabraCodificada = new Enigma().codificarPalabra(palabra);
	
		
		System.out.println("\n\n\n");
		
		System.out.println("PALABRA SIN CODIFICAR ... " + palabra);
		
		System.out.println("PALABRA CODIFICADA ... " + palabraCodificada);
		
	}
	
}
