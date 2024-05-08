package factorias;


import static factorias.FactoriaConexiones.queHilo;

import java.sql.SQLException;


public class Hilo extends Thread {

	// BAUTIZAR EL HILO.
	public Hilo(String nombre) {
		super(nombre);
	}
	
	
	@Override
	public void run() {
		
		try {
		
			System.out.println(queHilo() + " ---> " + FactoriaConexiones.solicitarConexion());
			FactoriaConexiones.retardar();
			
			System.out.println(queHilo() + " ---> " + FactoriaConexiones.solicitarConexion());
			FactoriaConexiones.retardar();
			
			System.out.println(queHilo() + " ---> " + FactoriaConexiones.solicitarConexion());
			FactoriaConexiones.retardar();
			
		} catch(SQLException sqle) {
			
			System.out.println("ERROR: " + sqle);
			
			// CAPTURAR Y RELANZAR (no comprobativa)
			//throw new RuntimeException(sqle.getMessage());
			
		}

	}
	
}
