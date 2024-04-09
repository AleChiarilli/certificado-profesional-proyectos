package pruebaMano;

public class Anillo {
	
	//ATRIBUTOS
	private String piedra;
	
	//CONSTRUCTOR
	
	public Anillo() {
		piedra = "DIAMANTES";
	}
	
	public Anillo(String piedra) {
		this.piedra = piedra;
	}
	
	@Override
	public String toString() {
		return "EL " + getClass().getSimpleName().toUpperCase() + " TIENE " + piedra + " ----> " + hashCode();
	}
	
	public static void main(String[] args) {
		Anillo anillo1 = new Anillo("RUBI");
		
		System.out.println(anillo1);
	}
}
