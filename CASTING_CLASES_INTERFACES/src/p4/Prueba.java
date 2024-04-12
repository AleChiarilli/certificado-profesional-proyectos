package p4;


public class Prueba {

	public static void main(String[] args) {
		
		
		// OK, UN PAJARO SÍ ES TAMBIÉN UN VOLADOR ADEMÁS DE SER UN SERVIVO.
		
		IVolador volador = new Avion();
		
		ISerVivo serVivo = new Pajaro();
		
		
		volador = (IVolador)serVivo; 	// PAPA .. EL COMPILADOR DICE OK.
										// MAMA .. LA MÁQUINA VIRTUAL TAMBIÉN DICE OK.
		
		// IVolador = Pajaro
		
		
		
		/*

		// ERROR DE CASTEO PORQUE EL OBJETO QUE FINALMENTE MANEJA LA INTERFAZ NO ES COMPATIBLE CON ELLA. 
		
		ISerVivo serVivo = new Pajaro();
		
		IVolador volador = new Avion();
		
		
		
		serVivo = (ISerVivo)volador; // PAPA .. EL COMPILADOR DICE OK.
		
		
		//	ISerVivo		=		new Avion (línea 10) // ERROR DE CASTEO ENTRE CLASES.
	
		//Exception in thread "main" java.lang.ClassCastException: p4.Avion cannot be cast to p4.ISerVivo
		//	at p4.Prueba.main(Prueba.java:14)

		 */
		
		
		System.out.println("OK. FIN DE PROGRAMA !!");
		
	}
	
}


