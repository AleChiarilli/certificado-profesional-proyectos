package bar;


public class Borracho {

	public static void main(String[] args) {
		
		/*
		Calimocho calimocho1 = new Calimocho();
		Calimocho calimocho2 = new Calimocho();
		Calimocho calimocho3 = new Calimocho();
		Calimocho calimocho4 = new Calimocho();
		Calimocho calimocho5 = new Calimocho();
		*/

		// ERROR NO PUEDO INSTANCIAR PARA LUEGO PODER LLAMAR A ESE MÉTODO DE INSTANCIA.
		//Calimocho calimocho = new Calimocho().comprarCalimocho();
		
		
		Calimocho calimocho1 = Calimocho.comprarCalimocho();
		Calimocho calimocho2 = Calimocho.comprarCalimocho();
		Calimocho calimocho3 = Calimocho.comprarCalimocho();
		
		System.out.println("C1 ... " + calimocho1);
		System.out.println("C2 ... " + calimocho2);
		System.out.println("C3 ... " + calimocho3);
		
	}
	
}
