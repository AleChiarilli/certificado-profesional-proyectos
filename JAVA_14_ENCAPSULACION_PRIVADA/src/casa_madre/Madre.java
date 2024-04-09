package casa_madre;


public class Madre {

	private int dinero = 1000;

	// SI DECIDES NO COLOCAR ESTE "GETTER", EL ATRIBUTO NO SERÁ VISIBLE
	//	(acceso indirecto ... método puente o accesor)
	
	// COMENTA O DESCOMENTA EL SIGUIENTE MÉTODO PARA VER COMO EL RESTO DE
	//	CLASE PUEDE O NO PUEDE ACCEDER AL DINERO.
		
	public void verDinero() {
		System.out.println(dinero);
	}
	
	
	public static void main(String[] args) {		
		//System.out.println("INICIO");
		
		System.out.println("DINERO ... " + new Madre().dinero);
	}
	
}
