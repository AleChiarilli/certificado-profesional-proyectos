package pruebaMano;


public class Mano {

	private Dedo[] dedos;	// Ã‰STO ES SÃ“LO LA REFERENCIA, EL MANEJADOR.
	
	
	
	public Mano(int cuantos) {
		
		dedos = new Dedo[cuantos];	// CREAMOS EL ARRAY.
		
		for(int i=1; i<=cuantos; i++) {
			dedos[i] = new Dedo(i);
		}
		
	}
	
	
	@Override
	public String toString() {
		
		String salidaDedos = "";
		
		for (Dedo dedo : dedos) {
			salidaDedos += "\t" + dedo + "\n";
		}
		
		
		return "MANO -> " + hashCode() + "\n" + salidaDedos; 
		
	}	
	
}
