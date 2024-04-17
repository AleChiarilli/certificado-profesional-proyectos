package pueblo;


public class Abuela {

	protected int tierras;
	
	// SÓLO ENCADENAR EN LAS HIJAS, NO INSTANCIAR (salvo que la encapsulación finalmente
	//	lo permita)
	protected Abuela(int tierras) {
		//super();
		this.tierras = tierras;
	}
	
}
