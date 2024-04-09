package casa_madre;


public class HijaMenor extends Madre {

	public static void main(String[] args) {
		
		// LA HIJA MENOR PUEDE VER EL DINERO DE LA MADRE PORQUE ACCEDE POR
		//	DERECHOS DE PAQUETE (paquete de definición  == paquete de uso).
		
		System.out.println("DINERO MADRE ---> " +
											new Madre().dinero);
		
		System.out.println("DINERO EN HIJA MENOR POR HERENCIA ---> " +
													new HijaMenor().dinero);


		
	}
	
}
