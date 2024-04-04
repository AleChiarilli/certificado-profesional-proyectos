package figuras;


public abstract class Figura {

	protected double precio;
	
	
	/*
	public Figura() {
		super();
	}
	*/
	
	
	public double getPrecio() {
		return precio;
	}
	
		
	@Override
	public String toString() {
		return getClass().getSimpleName().toUpperCase() + " --> " + precio + " €.";
	}
	
}
