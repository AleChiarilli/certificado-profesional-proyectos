package p2;

public class Coche {

	private final String color;
	private final int numeroPuertas;
	private final String matricula;
	
	
	// BINS
	{
		matricula = Trafico.generarMatricula();		// 1234E
	}
	
	
	public Coche() {
		color = "blanco";		// MEJOR USANDO this(x,y) ...
		numeroPuertas = 5;		//  ... encadenamiento horizontal de constructores.		
	}
	
	
	public Coche(String color) {
		this.color = color;
		numeroPuertas = 5;
	}
	
	
	public Coche(int numeroPuertas) {
		color = "blanco";
		this.numeroPuertas = numeroPuertas;
	}
	
	
	public Coche(String color, int numeroPuertas) {
		this.color = color;
		this.numeroPuertas = numeroPuertas;
	}
	
	
	@Override
	public String toString() {
		return "COCHE: " + hashCode() + 
					"\n\t COLOR: " + color + 
					"\n\t PUERTAS: " + numeroPuertas + 
					"\n\t MATRICULA: " + matricula;
	}
	
	//METODO FALSA FACTORÍA
	public final static Coche solicitarCoche() {
		return new Coche();
	}
	
}
