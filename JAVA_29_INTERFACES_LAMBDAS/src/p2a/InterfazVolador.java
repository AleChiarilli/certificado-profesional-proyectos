package p2a;


public interface InterfazVolador {

	// MÉTODO QUE SE HEREDARÁ POR AQUELLAS CLASES QUE IMPLEMENTEN LA INTERFAZ
	public default String volar() {
		return "SI VUELA";
	}

	
	public default String volar(int distancia) {
		return "VUELA ... " + distancia + " KILOMETROS";
	}

	
}
