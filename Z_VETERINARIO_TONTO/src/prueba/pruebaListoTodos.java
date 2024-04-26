package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import animales.Animal;
import animales.Gato;
import animales.Iguana;
import animales.Pajaro;
import animales.Perro;

public class pruebaListoTodos {

	
	public static void main(String[] args) {
		
		final Animal[] arrayAnimales = {	new Gato(),
								new Perro(),
								new Pajaro(),
								new Iguana()
							};
		
		
		// SUPERTIPO INTERFAZ		 =	CLASE QUE LA IMPLEMENTA
		List<Animal> listadoAnimales = new ArrayList<>(); 
		
		
		final int cuantos = 10;
		for (int i = 0; i < cuantos; i++) {
			listadoAnimales.add(arrayAnimales[new Random().nextInt(arrayAnimales.length)]);
		}
		
		System.out.println(listadoAnimales);
		
	}
}
