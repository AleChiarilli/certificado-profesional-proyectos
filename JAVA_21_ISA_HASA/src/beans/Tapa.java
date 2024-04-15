package beans;


public class Tapa {

	private String color; // BLANKED VARIABLE.
	
	
	
	public Tapa() {
		this("BLANCO");
	}
	
	public Tapa(String color) {
		//super();
		this.color = color;
	}
	
	
	
	@Override
	public String toString() {
		return "TAPON: " + color + " ---> " + hashCode();
	}
	
}
