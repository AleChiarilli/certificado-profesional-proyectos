package prueba;


import java.util.Random;


public class Prueba {

	public static void main(String[] args) {
				
		final int prohibido = 6;
		
		
		while(true) {
			
			int aleatorio = new Random().nextInt(6) + 1; // [1..6]
			
			if(aleatorio == prohibido) {
				
				throw new NumeroProhibidoException();
				
				//throw new NumeroProhibidoException("MENSAJE PERSONALIZADO");

			}
			
			System.out.println("\n---> " + aleatorio);
			
		}
		
		
	}	
	
}



//////////////////////////////////////////////////////////////////////////////////

// AZUL ... NO COMPROBATIVA - NO ME OBLIGA A GESTIONAR LA POSIBLE EXCEPCIÓN.
// 	RuntimeException

// ROJA ... COMPROBATIVA - ME OBLIGA A GESTIONAR LA POSIBLE EXCEPCIÓN.
//	Exception

//////////////////////////////////////////////////////////////////////////////////


@SuppressWarnings("serial")
class NumeroProhibidoException extends RuntimeException {	// AZUL
	
	//private static final long serialVersionUID = 1L;

	public NumeroProhibidoException() {
		this("HA SALIDO EL NUMERO PROHIBIDO");
	}

	
	public NumeroProhibidoException(String mensaje) {
		super(mensaje);
	}
	
}


