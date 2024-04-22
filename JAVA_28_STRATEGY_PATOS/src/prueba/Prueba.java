package prueba;

import patos.Pato;
import patos.PatoCanadiense;
import patos.PatoGomaCohete;

public class Prueba {

	public static void main(String[] args) {
		
		
		Pato pato1 = new PatoCanadiense();
		System.out.println(pato1 + "\n" + pato1.volar());
		
		
		Pato patoCohete = new PatoGomaCohete();
		System.out.println("\n" + patoCohete + "\n" + patoCohete.volar());
		
	}
	
	
	
}
