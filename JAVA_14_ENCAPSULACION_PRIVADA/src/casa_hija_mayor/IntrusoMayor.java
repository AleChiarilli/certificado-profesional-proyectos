package casa_hija_mayor;


import casa_madre.Madre;


public class IntrusoMayor {

	public static void main(String[] args) {
		
		/*
		System.out.println("DINERO MADRE ---> " +
								new Madre().dinero);

		System.out.println("DINERO MADRE EN HIJA MENOR ---> " +
											new HijaMayor().dinero);
		*/
		
		new Madre().verDinero();
		new HijaMayor().verDinero();

	}
	
}