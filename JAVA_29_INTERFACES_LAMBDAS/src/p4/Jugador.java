package p4;

import java.util.Random;

public class Jugador {

	
	public static void main(String[] args) {
		
		//CON CLASE INTERNA:
		InterfazMaquinaPremio maquinaPremio = new InterfazMaquinaPremio() {
			
			@Override
			public String probarSuerte() {
				
				int aleatorio = new Random().nextInt(2); // [0..1]
				
				return aleatorio == 1 ? "GANASTE EL PREMIO" : "NO GANAS NADA";
			}
			
		};
		
		System.out.println(maquinaPremio.probarSuerte());
		System.out.println(maquinaPremio.probarSuerte());
		
		
		
		//CON UNA LAMBDA:
		InterfazMaquinaPremio maquinaPremio2 = 
				() -> {
					return (new Random().nextInt(2) == 1 ? "GANASTE EL PREMIO" : "NO GANAS NADA");
				};
		
	}
	
}
