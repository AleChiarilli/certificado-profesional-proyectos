package casa_hija_mayor;


import casa_madre.Madre;


public class HijaMayor extends Madre {

	public static void main(String[] args) {
		
		/*
		System.out.println("DINERO MADRE ---> " +
											new Madre().dinero);
		
		System.out.println("DINERO EN HIJA MENOR POR HERENCIA ---> " +
													new HijaMayor().dinero);
		*/
		
		new Madre().verDinero();
		new HijaMayor().verDinero();
		
	}
	
}
