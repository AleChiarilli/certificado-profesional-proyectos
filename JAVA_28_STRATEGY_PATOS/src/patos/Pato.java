package patos;


import manejadores.IPato;
import manejadores.IVolador;


/*public*/ abstract class Pato implements IPato {

	private IVolador volador; // null
	
	
	/*
	private String tipo;
	
	{
		tipo = getClass().getSimpleName();
	}
	*/
	
	
	// CONSTRUCTOR PARAMETRIZADO (no tengo ya el implícito, que no pide nada)
	public Pato(IVolador volador) {
		this.volador = volador;		// POLIMORFISMO.
	}
	
	
	
	// AQUÍ ESTÁ LA MAGIA ... UN MÉTODO FINAL, IMPLEMENTADO, CUYO COMPORTAMIENTO REAL
	//	NO ES SIEMPRE EL MISMO, SINO QUE DEPENDE DE LA IMPLEMENTACIÓN DEL SUPERTIPO
	// 	VOLADOR ELEGIDA POR CADA CLASE HIJA EN PARTICULAR (a través del encadenamiento
	//	de constructores ... "papá, cómprame ésto".
		
	@Override
	public final String volar() {
		return volador.volar();
	}
	
	
	
	@Override
	public String toString() {
		return "PATO: " + getClass().getSimpleName() + " ---> " + hashCode() + "\n\t" +
					volar(); 
	}	
	
}
