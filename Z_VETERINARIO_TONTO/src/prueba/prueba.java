package prueba;

import animales.Gato;
import veterinario.veterinarioSubnormal;

public class prueba {

	
	public static void main(String[] args) {
		
		veterinarioSubnormal subnormal = new veterinarioSubnormal();
		
		String consultaGato = subnormal.consultarGato(new Gato());
		
		System.out.println(consultaGato);
		
	}
}
