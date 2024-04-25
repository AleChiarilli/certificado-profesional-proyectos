package tienda;


import almacen.Collar;


public class Gato {

	// A-C-M
	
	// A
	
	// INYECCIÓN POR ATRIBUTO
	//
	// NO QUIERO CREAR YO EL COLLAR ... ACOPLAMIENTO FUERTE
	//private Collar collar = new Collar(); // EAGERLY
	
	// OK.
	//private Collar collar = Collar.solicitarCollar();
		
	private Collar collar; 		// null.
	
	
	
	// C
	public Gato() {} // EL COLLAR NO SE SOLICITA ... null
	
		
	// INYECCIÓN POR CONSTRUCTOR:
	
	// NO ES ADECUADO QUE LA CLASE CONTENEDORA CREE LOS OBJETOS O INSTANCIAS DE SUS
	//	DEPENDENCIAS ... "Y ES QUE ESO NO LO PUEDE HACER OTRO - HOMER THE GARBAGE MAN"
	
	/*
	 
	// !!! NO LO QUIERO !!!
	
	public Gato(String nombre) {
		collar = new Collar(nombre); // USAR new == ACOPLAMIENTO FUERTE
	}
	*/
	
	
	private Gato(String nombre) {
		// USAR new == ACOPLAMIENTO FUERTE ... falla por constructor privado.
		// collar = new Collar(nombre); 
		
		collar = Collar.solicitarCollar(nombre);
	}
	
	
	private Gato(Collar collar) {
		this.collar = collar;
	}
	
	
	// M
	public String maullar() {
		return "MIAUUU !!!";
	}
	
	
	// INYECCIÓN POR MÉTODO:
	// SETTER:
	public void setCollar(Collar collar) {
		this.collar = collar;
	}

	
	
	
	// MÉTODOS DE FALSA FACTORÍA:
	// M1:
	public static Gato solicitarGato() {
		return new Gato();
	}
	

	// M2:
	public static Gato solicitarGato(String nombre) {
		return new Gato(nombre);
	}

	
	// TO-STRING:
	@Override
	public String toString() {
		return "GATO: " + 
					(collar == null ? "SIN COLLAR": collar.getNombre()) +
						" ---> " + hashCode();
	}
	
}
