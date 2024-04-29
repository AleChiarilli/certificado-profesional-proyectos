package p1;

import java.sql.Timestamp;
import java.time.Instant;

public abstract class Bollo {

	//ATRIBUTOS
	protected double precio;
	
	protected static final Timestamp fecha; 
	static {
		fecha = Timestamp.from(Instant.now());
		System.out.println(fecha);
	}
	
	//CONSTRUCTOR
	public Bollo(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder salida = new StringBuilder();
		
		salida.append("TIPO: " + getClass().getSimpleName().toUpperCase() + "\n");
		salida.append("PRECIO: " + precio + "\n");
		salida.append("ENVASADO: " + fecha + "\n");
		
		return salida.toString();
	}
	
}
