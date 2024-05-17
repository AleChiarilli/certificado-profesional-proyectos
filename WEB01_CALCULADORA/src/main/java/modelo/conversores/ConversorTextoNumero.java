package modelo.conversores;


import excepciones.TextoNoNumericoException;


public abstract class ConversorTextoNumero {

	// OBLIGAMOS AL SERVLET A QUE TENGA EN CUENTA QUE SE PUEDE PRODUCIR UNA EXCEPCIÓN
	//	AL CONVERTIR EL TEXTO DEL PARÁMETRO DE ENTRADA EN NÚMERO.
	
	public static final synchronized int convertir(String texto) throws TextoNoNumericoException {
		
		int numero;
		

		// VERIFICAR SI EL TEXTO ES NUMÉRICO:
		
		try {
			
			numero = Integer.parseInt(texto);
			
		}catch(NumberFormatException nfe) {
			System.out.println("ERROR: " + nfe);
			throw new TextoNoNumericoException(texto);
		}
		
		return numero;
		
	}
	
}
