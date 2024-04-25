package almacen;


public class Collar {

	// ATRIBUTOS:
	private String nombre; 		// null // EAGERLY
	
	
	
	// CONSTRUCTORES:
	private Collar() {
		this("en blanco");
	}
	
	
	private Collar(String nombre) {
		this.nombre = nombre;
	}
	

	
	
	// GETTER:
	public String getNombre() {
		return nombre;
	}
	
	
	// SETTER:
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	// MÉTODO DE FALSA FACTORÍA - FAKE FACTORY:	
	public static Collar solicitarCollar() {
		return new Collar();
	}
	
	public static Collar solicitarCollar(String nombre) {
		return new Collar(nombre);
	}
	
	
	// TO-STRING:
	@Override
	public String toString() {
		return "COLLAR: " + nombre + " ---> " + hashCode();
	}
	
}