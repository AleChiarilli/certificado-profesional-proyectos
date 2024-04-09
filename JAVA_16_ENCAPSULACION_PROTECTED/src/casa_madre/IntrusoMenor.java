package casa_madre;


public class IntrusoMenor {

	public static void main(String[] args) {
		
		// ACCEDE POR DERECHOS DE PAQUETE (los paquetes de definición y uso son
		//	los mismos ... dinero ha sido definido por la clase Madre. La clase
		//	Madre se ha creado en el paquete "casa_madre" y esta clase incluso
		//	también, luego tiene derechos de paquete sobre ella y sobre la hija
		//	menor que también se ha creado en dicho paquete.
		
		System.out.println("DINERO MADRE ---> " +
									new Madre().dinero);

		System.out.println("DINERO MADRE EN HIJA MENOR ---> " +
											new HijaMenor().dinero);		

	}
	
}
