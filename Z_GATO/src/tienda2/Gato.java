package tienda2;

public class Gato {
	// A C M      ---> implícitamente
	
	
	
	// ATRIBUTOS			//BLANK VARIABLES
	private String nombre = "FELIX";	// null
	private String color = "BLANCO";	// null
	private int edad = 3;		// 0 
	
	
	
	
	
	// CONSTRUCTOR IMPLÍCITO
	/*
		public Gato() {
			super();
		}
	*/
	
	
	
	
	
	//METODOS
	//Implícitamente se heredan métodos toString(), hashCode() y equals()
	
	@Override
	public String toString() {
		//DEVOLVER EL ESTADO DEL OBJETO ... el conjunto de propiedades
		// de estas en un determinado momento del tiempo
		return "GATO: " + hashCode() + "\n"
				+ "nombre ... " + nombre + "\n"
				+ "color ... " + color + "\n"
				+ "edad ... " + edad + "\n"
				;
	}
	
}
