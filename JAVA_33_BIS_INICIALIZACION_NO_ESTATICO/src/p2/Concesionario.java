package p2;


public class Concesionario {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.println(new Coche() + "\n---------------------------\n");
		}

		
		System.out.println("\n\n.........................................\n\n");
		
		
		for(int i=1; i<=5; i++) {
			System.out.println(new Coche("rojo",3) + "\n---------------------------\n");
		}

		
		System.out.println("----------------------------------------------------------");
		
		System.out.println(Coche.solicitarCoche());
		
	}
	
}
