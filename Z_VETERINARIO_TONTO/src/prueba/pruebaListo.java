package prueba;

import animales.Gato;
import veterinario.veterinarioListo;

public class pruebaListo {

	
	public static void main(String[] args) {
		
		veterinarioListo listo = new veterinarioListo();
		
		String consultaGato = listo.consultar(new Gato());
		
		System.out.println(consultaGato);
		
	}
}
