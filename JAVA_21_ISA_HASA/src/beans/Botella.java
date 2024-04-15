package beans;


public class Botella extends Envase {

	private Tapa tapa;
	private Etiqueta etiqueta;
	

	public Botella() {		
		this(100);
	}
	
	
	public Botella(int capacidad) {	
		super(capacidad);
		tapa = new Tapa();
		etiqueta = new Etiqueta();
	}

	public Botella(int capacidad, String colorTapon, String texto) {
		super(capacidad);
		tapa = new Tapa(colorTapon);
		etiqueta = new Etiqueta(texto);
	}
	
	
	@Override
	public String toString() {		
		return super.toString() + "\n" +
				"BOTELLA: " + hashCode() + "\n" +
				tapa + "\n" + 
				etiqueta;
				
	}

}
