package p1_prepared_Statement;

import java.util.ResourceBundle;

public abstract class GestorQueries {

	private static final ResourceBundle rb;
	
	//BIS:
	static {
		final String fichero = "ficheros.queries";		// ruta . nombre_fichero  (sin su .extension)
		rb = ResourceBundle.getBundle(fichero);
		
		System.out.println(rb);
	}
	
	
	
	
	//	METODO PARA HACER LA PETICIÓN
	public static final String obtenerQuery(String cualPeticion) {
		return rb.getString(cualPeticion);
	}
	
	
	
	
	//////////////////////	PRUEBA	//////////////////////
	public static void main(String[] args) {
		System.out.println("OK!!!!");
		
		System.out.println(obtenerQuery("productos.precios.rango"));
	}
}
