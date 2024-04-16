package personajes;


import armas.*;


public class Heroe {

	// OOP: PROGRAMA EN BASE A UN SUPERTIPO Y NO A UNA IMPLEMENTACIÓN.
	
	//private Espada espada; // MAL
	private Arma arma;			// BIEN ... EL SUPERTIPO O ABSTRACCIÓN ... PUEDO USAR CUALQUIERA.
	
	
	public Heroe() {
		//espada = new Espada(); // MAL
		//arma = new Arma(); // CLASE ABASTRACTA // MAL
		arma = Arma.solicitarArma();
	}
	
	
	public void atacar() {
//		System.out.println("EL HEROE ATACA CON LA ... " + 
//								espada.getClass().getSimpleName());	// MAL
	}
	
}
