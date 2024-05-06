package p1;

import java.time.LocalTime;

public interface InterfazReloj {

	//METODOS ESTATICOS JAVA 8 
	
	public static String dimeLaHora() {
		return "LA HORA ES ... " + LocalTime.now();
	}
	
}
