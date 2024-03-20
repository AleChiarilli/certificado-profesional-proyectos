package p1;

public class SaludarQuien {
	public static void main(String[] args) {
		
		if (args.length >= 1) {
			
			for (String amigo : args) {
				System.out.println("HOLA ... " + amigo);
			}

			
		} else {
			
			System.out.println("A QUIÉN QUIERES QUE SALUDE?");
			
		}
	}
		
}