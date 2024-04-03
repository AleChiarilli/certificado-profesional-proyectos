package p9;

public class Frigorifico implements InterfaceFrigo {
	//ATRIBUTOS:
	private String marca = null;
	
	
	
	
	//CONSTRUCTORES:
	public Frigorifico() {
		marca = "SAMSUNG";
	}
	
	
	// MÉTODOS:
	@Override
	public void enfriar() {
		System.out.println("EL FRIGO ENFRIA!!!");
	}
	
	@Override
	public String toString() {
		System.out.println("FRIGO DE LA MARCA " + marca);
	}
}
