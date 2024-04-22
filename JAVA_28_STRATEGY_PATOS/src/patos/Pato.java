package patos;

import comportamientos.volar.Volador;

public abstract class Pato {

	private Volador volador;
	
	protected String tipo;
	
	
	
	
	//{
		//tipo = getClass().getSimpleName();
	//}
	
	//CONSTRUCTOR
	protected Pato(Volador volador) {
		this.volador = volador;
	}
	
	
	//AQUÍ ESTÁ LA MAGIA ... UN METODO FINAL, IMPLEMENTADO, CUYO COMPORTAMIENTO REAL
	// NO ES SIEMPRE EL MISMO, SINO QUE DEPENDE DE LA IMPLEMENTACION DEL SUPERTIPO VOLADOR
	//ELEGIDA POR CADA CLASE HIJA EN PARTICULAR (a través del encadenamiento de constructores)
	public final String volar() {
		return volador.volar();
	}
	
	
	@Override
	public String toString() {
		return "PATO: " + getClass().getSimpleName() ;
	}
	
}
