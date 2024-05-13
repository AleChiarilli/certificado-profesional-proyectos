package gestores;


import java.util.ResourceBundle;


public abstract class GestorQueries {

	//////////////////////// FICHERO DE PROPIEDADES - RESOURCE BUNDLE //////////////////
	
	// NOTA: LA CARPETA CON LOS FICHEROS DEBE ESTAR DENTRO DEL PAQUETE src O NO LOS ENCONTRARÁ.
	
	private static final String FICHERO = "ficheros.hangar";
		
	
	private static final ResourceBundle rb;
	
	static {
		rb = ResourceBundle.getBundle(FICHERO);
		//System.out.println("\n---> " + rb + "\n");
	}
	
	
	public static final String solicitarQuery(String query) {
		return rb.getString(query);
	}
	
	
	
	
	
	/// PRUEBA PARCIAL ///
	public static void main(String[] args) {
		System.out.println("RESOURCE-BUNDLE OK!!");
	}
	
}