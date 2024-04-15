package p0;


public class Cerveza /*extends Object*/ {

	private String marca	= "MAHOU";
	private double precio	= 1.25;
	private boolean helada	= false;
	
	
	/*
	public Cerveza() {
		super();
	}
	*/
	
	
	public Cerveza() {}
	
	/*
	
	public Cerveza(String marca) {
		this.marca = marca;
	}

		
	public Cerveza(double precio, String marca) {
		this.marca = marca;
		this.precio = precio;
	}
	
	
	public Cerveza(String marca, double precio, boolean helada) {
		this.marca = marca;
		this.precio = precio;
		this.helada = helada;
	}	
	
	*/

	public Cerveza(String marca, double precio, boolean helada) {		
		this(marca, precio);		
		this.helada = helada;		
	}	
	
			
	public Cerveza(String marca, double precio) {
		this(marca);
		this.precio = precio;
		
	}
	
	
	public Cerveza(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Cerveza [marca=" + marca + ", precio=" + precio + ", helada=" + helada + "]";
	}
	
}
