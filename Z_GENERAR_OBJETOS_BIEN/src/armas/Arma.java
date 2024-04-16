package armas;

import java.util.Random;

// LA ABSTRACCIÓN DE TODAS LAS ARMAS ... UN SUPERTIPO DE PROGRAMACIÓN.

public abstract class Arma {

	public static final int ESPADA = 0;
	public static final int BALLESTA = 1;
	public static final int MAZA = 2;
	
	private static final Arma[] armas = 
		{new Espada(), new Ballesta(), new Maza()};
	
	
	
	// DAÑO INFRINGIDO:
	protected int daño;
	// PROBABILIDAD ACIERTO:
	protected int probabilidadAcierto;
	
	// MÉTODO ATACAR ... ATACA CON EL XXX
	
	
	
	
	// MÉTODO PARA DEVOLVER UNA ARMA ALEATORIA.
	
	// ENCAPSULACIÓN + DEVOLUCIÓN + NOMBRE + (LÍNEA DE PARÁMETROS DE ENTRADA) + POSIBLES EXCEPCIONES { CÓDIGO }
	
	
	// MÉTODO ESTÁTICO DE FALSA FACTORÍA PARA OBTENER UNO DE LOS 3 TIPOS ALEATORIAMENTE.
	public static Arma solicitarArma() {
		
		//int[] numeros = {1,2,3};
		
		
		
		/*
		int aleatorio = new Random().nextInt(armas.length);		
		return armas[aleatorio];		
		*/
		
		return armas[new Random().nextInt(armas.length)];
		
	}
	
	
	public static Arma solicitarArma(int tipo) {

		return armas[tipo];
		
	}
	
}