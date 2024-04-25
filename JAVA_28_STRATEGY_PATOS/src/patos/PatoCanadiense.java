package patos;


import comportamientos.volar.VoladorSi;


/*public*/ class PatoCanadiense extends Pato {

	/*
	public PatoCanadiense() {
		super();
	}
	*/
	
	public PatoCanadiense() {
		super(new VoladorSi()); // MEJOR USA UNA FACTORÍA O SI PUEDES UTILIZA SPRING
	}
	
	
}
