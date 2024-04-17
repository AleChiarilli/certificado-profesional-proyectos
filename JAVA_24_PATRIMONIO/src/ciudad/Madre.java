package ciudad;


import pueblo.Abuela;


public class Madre extends Abuela {

	protected int chalet;

	// PROTECTED SÓLO PERMITIRÁ A LA HIJA ENCADENAR SU CONSTRUCTOR, PERO NO INSTANCIAR
	//	UN OBJETO DE ESTA CLASE (EL NOVIO NO PODRÁ HACER NADA DE NADA)
	protected Madre(int tierras, int chalet) {
		super(tierras);
		this.chalet = chalet;
	}
	
}