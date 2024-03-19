package p8;

public abstract class Bombilla {
	
	final int PRECIO = 1;
	
	public abstract String iluminar(); 
	
	public int consultarPrecio() {
		return PRECIO;
	}
}
