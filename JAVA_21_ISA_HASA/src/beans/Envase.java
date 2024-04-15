package beans;


public abstract class Envase {

	protected int capacidad;		// 0
	
		
	public Envase() {}				// 0
	
	
	public Envase(int capacidad) {	// la que me digas.
		this.capacidad = capacidad;
	}
	
	
	
	@Override
	public String toString() {
		return "ENVASE: " + capacidad + " cl" + " ---> " + hashCode();
	}	
	
}
