package p2;


public class PruebaDeInterfaces {

	public static void main(String[] args) {
		
		/*
		I0 i0; 
		System.out.println(i0);	// ERROR
		
		I1 i1 = null;		
		System.out.println(i1); // null
		*/
		
		
		I0 i0 = null;
		
		I1 i1 = null;
		
		
		//i0 = i1;		// TIENES QUE FORZAR EL CASTING.
		i0 = (I0)i1;
				
		
		
		
		System.out.println("!! FIN DE PROGRAMA !! ");
		
	}
	
}



class A {}




interface I0 {}

interface I1 {}