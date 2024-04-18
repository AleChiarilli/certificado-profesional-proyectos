package bar;


public class Calimocho {

	// SINGLETON:
	
	
	// VARIABLE GLOBAL ESTÃTICA QUE GUARDA UN OBJETO DE LA CLASE
	private static Calimocho calimocho; // null
	
	
	// PRIVATIZAR EL CONSTRUCTOR:
	private Calimocho() {
		//super();
	}
	
	
	// MÃ‰TODO DE ACCESO PARA OBTENER 1 OBJETO DE ESTA CLASE.
	//		DEBE SER ESTÃTICO PARA PODER SER INVOCADO DESDE BORRACHO SIN
	//		NECESIDAD DE CREAR UNA INSTANCIA (constructor privado)
	public static synchronized Calimocho comprarCalimocho() {
		
		if(calimocho == null) {
			calimocho = new Calimocho();
		}
				
		return calimocho;
	}
	
	
	
	
	@Override
	public String toString() {
		return "CALIMOCHO: " + hashCode();
	}
	
}
