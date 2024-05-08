package factorias;


import java.sql.SQLException;

import static factorias.FactoriaConexiones.queHilo;

public class HilosCliente {

	
	//////////////////////////// MAIN /////////////////////////////////
	
	public static void main(String[] args) {

		/*
		
		Thread hiloEjecucion = Thread.currentThread();
		
		System.out.println("\nHILO ACTUAL O EN EJECUCION ---> " + hiloEjecucion.getName() + "\n\n");
		
		*/
		
		
		// SOLICITANDO DESDE EL HILO JURRACA:
		
		Hilo hiloJurraca = new Hilo("JURRACA");
		
		// ARRANCA EL HILO CON star() ... run() es simplemente el método que define
		//		lo que hará el hilo UNA VEZ ARRANCA == PLANIFICADO POR EL SCHEDULER
		//		
		// MAL ---> hiloJurraca.run();
		
		hiloJurraca.start(); // LO GESTIONA EL PLANIFICADOR Y LE ASOCIA PILA DE EJECUCIÓN.
		
		
		
		
		
		// SOLICITANDO DESDE EL HILO MAIN:
		
		try {
			
			System.out.println(queHilo() + " ---> " + FactoriaConexiones.solicitarConexion());
			FactoriaConexiones.retardar();
			
			System.out.println(queHilo() + " ---> " + FactoriaConexiones.solicitarConexion());
			FactoriaConexiones.retardar();
			
			System.out.println(queHilo() + " ---> " + FactoriaConexiones.solicitarConexion());
			FactoriaConexiones.retardar();
			
		} catch(SQLException sqle) {
			System.out.println("ERROR: " + sqle);		
		}
		
	}	
	
}




/*





 >>> EL HILO main SOLICITA CONEXION.

SE CREA Y REGISTRA UNA NUEVA CONEXION ... com.mysql.jdbc.Connection@6e8cf4c6
main ---> com.mysql.jdbc.Connection@6e8cf4c6




 >>> EL HILO JURRACA SOLICITA CONEXION.

SE CREA Y REGISTRA UNA NUEVA CONEXION ... com.mysql.jdbc.Connection@5d586413
JURRACA ---> com.mysql.jdbc.Connection@5d586413




 >>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.jdbc.Connection@6e8cf4c6
main ---> com.mysql.jdbc.Connection@6e8cf4c6




 >>> EL HILO JURRACA SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.jdbc.Connection@5d586413
JURRACA ---> com.mysql.jdbc.Connection@5d586413




 >>> EL HILO JURRACA SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.jdbc.Connection@5d586413
JURRACA ---> com.mysql.jdbc.Connection@5d586413




 >>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.jdbc.Connection@6e8cf4c6
main ---> com.mysql.jdbc.Connection@6e8cf4c6


*/
