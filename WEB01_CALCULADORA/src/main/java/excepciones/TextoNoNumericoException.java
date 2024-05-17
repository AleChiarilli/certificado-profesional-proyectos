package excepciones;


public class TextoNoNumericoException extends Exception { // ROJA == CHECKED

	private static final long serialVersionUID = 1L;

		
	public TextoNoNumericoException(String texto) {	
		// USA FICHERO DE PROPIEDADES.
		super("ERROR: EL VALOR " + texto + " ... NO ES NUMERICO \n\n");		
	}
	
}
