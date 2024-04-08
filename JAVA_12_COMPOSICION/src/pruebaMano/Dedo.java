package pruebaMano;

public class Dedo {
	private int posicion;
	
	public Dedo(int posicion) {
		this.posicion = posicion;
	}
	
	
	@Override
	public String toString() {
		return "DEDO - " + posicion + "\t\t" + hashCode();
	}
}
