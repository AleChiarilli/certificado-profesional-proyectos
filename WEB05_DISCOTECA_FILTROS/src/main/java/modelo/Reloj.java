package modelo;


import java.time.LocalTime;


public abstract class Reloj {

	public static String consultarHora() {
		
		return LocalTime.now().withNano(0).toString();	// HH:MM:SS
		
	}
	
}
