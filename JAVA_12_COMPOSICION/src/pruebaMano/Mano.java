package pruebaMano;

public class Mano {

	private Dedo[] dedos;	// Ã‰STO ES SÃ“LO LA REFERENCIA, EL MANEJADOR.
	
	
	
	public Mano(int cuantos) {
		
		dedos = new Dedo[cuantos];	// CREAMOS EL ARRAY.
		
		for(int i=0; i<cuantos; i++) {
			dedos[i] = new Dedo(i+1);
		}
		
		// ASIGNAR ANILLO EN EL DEDO DE POSICIÃ“N 3:
		asignarAnillo("ESMERALDAS");
		
	}
	
	
	////////// MÃ‰TODO DE NEGOCIO ... COLOCAR 1 AÃ‘ILLO EN 1 DEDO:
	public void asignarAnillo(String piedra) {
		
		// PROCESO DE DELEGACIÃ“N ... "DELEGATE":
		dedos[2].asignarAnillo(new Anillo(piedra));
		
		//dedos[2].asignarAnillo(new Anillo());
	}
	
	////////////////////////////////////////////////////////////
	
	
	@Override
	public String toString() {
		
		String salidaDedos = "";
		
		for (Dedo dedo : dedos) {
			salidaDedos += "\t" + dedo + "\n";
		}
		
		
		return "MANO -> " + hashCode() + "\n\n" + salidaDedos; 
		
	}	
	
}
