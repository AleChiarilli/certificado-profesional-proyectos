package electro;

import interfaces.InterfaceFrigo;

public class Frigo implements InterfaceFrigo {
	//ATRIBUTOS:
	private String marca = null;
	
	
	
	
	//CONSTRUCTORES:
	public Frigo() {
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
