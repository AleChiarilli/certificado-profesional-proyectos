package patos;


import comportamientos.volar.VoladorNo;


/*public*/ class PatoGoma extends Pato {

	/*
	public PatoCanadiense() {
		super();
	}
	*/
	
	public PatoGoma() {
		super(new VoladorNo()); // MEJOR USA UNA FACTORÍA O SI PUEDES UTILIZA SPRING
	}
	
	
}
