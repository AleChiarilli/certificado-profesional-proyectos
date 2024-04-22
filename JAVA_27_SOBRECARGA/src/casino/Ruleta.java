package casino;


import java.util.Random;


public class Ruleta {
	
	//private static final int RANGO = 10;
	
	
	private static final int RANGO;
	
	static {
		RANGO = 10;
	}

	
	
	private static final int girarBolita() {
		return new Random().nextInt(RANGO) + 1;	// [1..10]
	}
	
	
	//////////////////////////// SOBRECARGA /////////////////////////////////
	
	
	public static final int apostar() {

		
		
		return 0;
	}
	
	
	
	
	public static final int apostar(int numero) {
		// TODO
		return 0;
	}
	
	
	
	
	public static final int apostar(int ... numeros) {
		
		if(numeros.length > 3) {
			// HARDCODING ... DEBE UTILIZAR UN FICHERO PROPERTIES (ResourceBundle)
			throw new RuntimeException("SOLO PUEDES APOSTAR UN MAXIMO DE 3 NUMEROS A LA VEZ");
		}
		
		
		
		// TODO
		return 0;
	}	
	
	
	
	////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {

		apostar(4,2,8,5);
		
	}
	
}
