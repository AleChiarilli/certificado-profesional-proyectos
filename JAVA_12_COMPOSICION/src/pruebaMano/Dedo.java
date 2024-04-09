package pruebaMano;

public class Dedo {

	private int posicion;
	private Anillo anillo;
	
	public Dedo(int posicion) {
		this.posicion = posicion;
	}
	
	
	// SETTER ... COMPOSICION DÉBIL == AGREGACIÓN
	public void asignarAnillo(Anillo anillo) {
		this.anillo = anillo;
	}
	
	@Override
	public String toString() {
		return "DEDO - " + posicion + "\t\t ... " + hashCode() + "\n" +
					(anillo != null ? anillo : "");
	}
	
}
