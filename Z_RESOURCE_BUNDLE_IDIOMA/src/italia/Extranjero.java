package italia;


import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Scanner;


public class Extranjero {

	private static final String FICHERO = "ficheros.diccionarioES_IT";
		
	
	private static final ResourceBundle rb;
	
	static {
		rb = ResourceBundle.getBundle(FICHERO);
		//System.out.println("\n---> " + rb + "\n");
	}
	
	
	///////////////////////
	
	private final static String solicitarPalabra() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("INTRODUCE PALABRA ... ");
		
		String palabra = sc.nextLine();
		
		sc.close();
		
		return palabra;
		
	}
	
	
	private final static String traducir(String palabra) {	// palabra == la clave == K
		return rb.getString(palabra);
	}
	
	
	public static void traducir() {

		// helado (sí) - caramelo (no)
		final String palabra = solicitarPalabra().toLowerCase();
		
		try  {		
			String traduccion = traducir(palabra);
			System.out.println("\n\t" + palabra + " ---> " + traduccion);
			
		} catch(MissingResourceException mre) {
			System.out.println("\n\n\t>>> NO CONOZCO LA PALABRA ... " + palabra);
				
		} finally {
			// HAYA O NO EXCEPCIÓN SE EJECUTARÁ ESTE BLOQUE DE CÓDIGO ...
			// SE USA PRINCIPALMENTE PARA CERRAR RECURSOS ACTIVOS Y QUE YA NO SE
			// NECESITEN ... EL SCANNER SI LO HUBIERA DEFINIDO EN ESTE MÉTODO.
		}		
		
	}
	
	
	
	
	public static void main(String[] args) {

		traducir();
		
		System.out.println("\n\nFIN DE PROGRAMA");
		
	}
	
}
