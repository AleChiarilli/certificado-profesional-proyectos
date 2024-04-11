package casa;

public class Prueba {

	
	public static void main(String[] args) {
		
		Madre madre = new Madre();	
		Hija hija = new Hija();
	
	
		Madre x = madre;		
		System.out.println(x.hablar()); 
	
		
		System.out.println("\n\n-------------------------\n\n");
		
		
		x = hija;
		System.out.println(x.hablar());

		
				
		System.out.println("\n\n-------------------------\n\n");
		
		x.comer();
		
		System.out.println("\n\n-------------------------\n\n");
		
		Madre.comer();
		Hija.comer();
		
		
	}	
	
}
