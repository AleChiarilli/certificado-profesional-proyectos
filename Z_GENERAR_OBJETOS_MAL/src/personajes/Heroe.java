package personajes;


import armas.Espada;


public class Heroe {

	
	private Espada espada; // MAL
	
	
	public Heroe() {
		espada = new Espada(); // MAL
	}
	
	
	public void atacar() {
		System.out.println("EL HEROE ATACA CON LA ... " + 
								espada.getClass().getSimpleName());	// MAL
	}
	
}
