package tienda4;

public class Gato {
	// A C M      ---> implícitamente
	
	
	
	// ATRIBUTOS			//BLANK VARIABLES
	private String nombre;	// null
	private String color;	// null
	private int edad;		// 0 
	
	
	
	
	
	// CONSTRUCTOR IMPLÍCITO
	/*
		public Gato() {
			super();
		}
	*/
	
	public Gato(String nombre, String color, int edad) {
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
	}
	
	public Gato(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	
	public Gato(String nombre) {
		this.nombre = nombre;
	}
	
	public Gato() {
	}
	
	
	
	
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
