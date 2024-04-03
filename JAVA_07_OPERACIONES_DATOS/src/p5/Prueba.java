package p5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prueba {
	
	public static void main(String[] args) {
		
		//Los arrays son type-safe, por lo que no se pueden colocar otros tipos de datos en un array
		 			//int[] numeros = {1,2, "3"};
		//por ejemplo, éste arriba no funcionaría
		
		
		//creamos el array
		Animal[] animales = {new Pajaro(), new Dragon(), new Mono()};
		
		//usamos un forEach para mostrarlo en consola
		for (Animal animal : animales) {
			System.out.println(animal.alimentarse());
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		List<Animal> animalesGenero = new ArrayList<Animal>();
		
		animalesGenero.add(new Pajaro());
		animalesGenero.add(new Dragon());
		animalesGenero.add(new Mono());
		
		System.out.println(animalesGenero);
		
		//Utilizando ésta manera con Iterator, es como hacer un forEach, utilizando sus métodos abstractos, como "Iterator.iterator()"
		Iterator it = animalesGenero.iterator();
		
			// Animal a = animalesGenero.get(0);
		
		while(it.hasNext()) {
			// Animal a = (Animal) it.next();
			System.out.println();
			
		}
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// de ésta manera, se pueden tener List, con tipado CONTROLADO (como los Arrays),
		// y obtener todas las ventajas de los métodos de Lists pero -TIPADO CONTROLADO-
		
		// gracias a éstos <Integer> a cada lado, podemos tipar las listas.
		List<Integer> a = new ArrayList<Integer>();
		
		a.add(3);
		
		// Y por lo tanto, no podría agregar un objeto new Pajaro() porque me da error.
		// no son del mismo tipo!!
		//         a.add(new Pajaro());
		
	}
	
}
