package p2;

public interface InterfazVolador {

	// MÉTODOS QUE SE HEREDARÁN PRO AQUELLAS CLASES QUE IMPLEMENTEN LA INTERFAZ
	public default String volar() {
		return "SI VUELA";
	}
	
	
	//SE PUEDE SOBRECARGAR
	public default String volar(int distancia) {
		return "SI VUELA" + distancia +  "KILOMETROS";
	}
	
}
