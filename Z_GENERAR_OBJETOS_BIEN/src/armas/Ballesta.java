package armas;


public class Ballesta extends Arma {
	
	// MEJOR QUE EN EL CONSTRUCTO, USA UN BLOQUE DE INICIALIZACIÓN NO ESTÁTICO (se ejecutar por cada instancia
	//	que podamos crear de esta clase).
	
	// B.I.N.S ... BLOQUE DE CÓDIGO - REUTILIZACIÓN DE CÓDIGO DE CONSTRUCTOR.
	
	{
		daño = 2;
		probabilidadAcierto = 90;		
	}
	
	
	
	/*
	public Ballesta() {
		daño = 2;
		probabilidadAcierto = 90;		
	}

	public Ballesta(int x) {
		daño = 2;
		probabilidadAcierto = 90;		
	}
	*/
	
	public Ballesta() {}

	public Ballesta(int daño) {
		this.daño = daño;			// PORQUE ESTE CONSTRUCTOR QUIERE DECIR EL DAÑO POR SI MISMO.
	}	
	
	
}