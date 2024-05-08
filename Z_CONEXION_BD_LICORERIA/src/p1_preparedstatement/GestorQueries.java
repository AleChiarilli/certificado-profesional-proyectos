package p1_preparedstatement;


import java.util.ResourceBundle;


public abstract class GestorQueries {

	private static final ResourceBundle rb;
	
	
	// BIS:
	static {		
		
		// ruta.nombre_fichero (sin la extensión .properties)		
		final String fichero = "ficheros.queries";						
		rb = ResourceBundle.getBundle(fichero);
		
		//System.out.println(rb);
		
	}
		
	
	public static final String obtenerQuery(String query) {
		
		return rb.getString(query);
		
	}
	
	
	
	
	//////////////////// PRUEBA /////////////////////
	
	public static void main(String[] args) {
		
		//System.out.println("OKKK !!!");
		
		System.out.println(obtenerQuery("productos.precios.rango"));
	
	}

}