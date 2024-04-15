package beans;


public class Etiqueta {

	private String texto;
	
	
	
	public Etiqueta() {
		this("AGUA MINERAL");
	}
	
	public Etiqueta(String texto) {
		this.texto = texto;
	}
	
	
	
	@Override
	public String toString() {
		return "ETIQUETA: " + texto + " ---> " + hashCode();
	}
	
}
