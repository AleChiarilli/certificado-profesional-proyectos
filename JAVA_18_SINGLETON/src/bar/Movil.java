package bar;


public class Movil {

	private static final Movil movil; // = new Movil(); // EAGERLY
	
	// CON BLOQUE DE INICIALIZACIÓN ESTÁTICO.
	static {
		movil = new Movil();
	}
	
	
	
	private Movil() {}
	
	
	public static Movil solicitarMovil() {
		return movil;
	}
	
}
