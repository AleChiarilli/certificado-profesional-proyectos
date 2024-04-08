package p0;

public class Gato {
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ATRIBUTOS              - campos no estáticos ---> son siempre GLOBALES --> 1 por objeto
	// 							SE CREARÁ UNA COPIA POR INSTANCIA FÍSICA ... OBJETO (new / Factory).
	private String nombre;
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// CONSTRUCTORES:         //los constructores se tiene que llamar con el nombre de la clase. y no puede declarar devolución de tipo.
								//si declara, no es un constructor. Sería un método. No abstracto, no static, no abstract, nada.
	
	public Gato() {
		this("CALLEJERO");
	}
	
	
	
	public Gato(String nombre) {
		this.nombre = nombre;
	}
	

	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// MÉTODOS:

		public String maullar(int veces) {
			
			String salida= "MI GATO " + nombre + " DICE: \n\n";
			
			for (int i = 1; i <= veces; i++) {
				salida += "MIAUUU";
			}
			
			return salida;
			}
		
		


		@Override
		public String toString() {
			return "GATO ... " + nombre + " : " + hashCode();
		}
		
		
		
}	