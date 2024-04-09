package casa_hija_mayor;


import casa_madre.Madre;


public class HijaMayor extends Madre {

	////////////////////////
	// PRUEBA CON public, protected, "default" A ENCAPSULAR EL SIGUIENTE MÉTODO,
	//	EL INTRUSO MAYOR LO VERÁ Y PODRÁ SACARLE EL DINERO A LA HIJA MAYOR.
	
	protected int entregarDinero() {
		return dinero + 300;
	}

	
	
	public static void main(String[] args) {
		
		// Hija mayor no tiene derechos de paquete sobre la clase madre porque sencillamente
		//	esta en un paquete distinto a ella (definción != uso).
		/*
		System.out.println("DINERO MADRE ---> " +
											new Madre().dinero);
		*/
		
		// LO PODRÁ USAR, PERO A TRAVÉS DE UNA INSTANCIA DE ELLA MISMA !!!
		
	
		System.out.println("DINERO EN HIJA MENOR POR HERENCIA ---> " +
													new HijaMayor().dinero);
	
		
	}
	
}
