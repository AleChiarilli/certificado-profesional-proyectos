package pruebas;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import gatos.Angora;
import gatos.Gato;
import gatos.Persa;
import gatos.Siames;
import perros.Perro;


public class Prueba {

	public static void main(String[] args) {
		
		// LIST ... son ordered (índice interno) y admiten repetidos.
		
		// add
		// get
		// remove
		// isEmpty
		// clear ..... muchos métodos
		
		// A CAPÓN:
		// ArrayList listadoGatos = new ArrayList();
		
		
		// SUPERTIPO - IeC:
		//List listadoGatos = new ArrayList();
		
		
		// SUPERTIPO + GÉNERO - <Gato>:
		List<Gato> listadoGatos = new ArrayList<>();
		
		
		// MEJOR SI USAS UNA FACTORÍA PARA OBTENER LOS BEANS Y SI ES SPRING 10/10.
		listadoGatos.add(new Angora());
		listadoGatos.add(new Persa());
		listadoGatos.add(new Siames());
		
		System.out.println(listadoGatos);
		
		//listadoGatos.add(new Perro()); // NO ES IS-A Gato
		
		
		System.out.println("\n---------------------------------\n");
		
		listadoGatos.add(1, new Siames());
		
		System.out.println(listadoGatos);
		
		
		System.out.println("\n---------------------------------\n");
		
		/// NO HAGAS COSAS COMO ESTA (otra referencia al mismo sitio sin género ///
		
		
		/*
		List cualquierCosa = listadoGatos;
		cualquierCosa.add(new Perro());			// <--- NO HOMOGENEIDAD.

		// Exception in thread "main" java.lang.ClassCastException: perros.Perro 
		//	cannot be cast to gatos.Gato at pruebas.Prueba.main(Prueba.java:65)
		
		*/
		
		
		//System.out.println(listadoGatos);
		
		/// PROBLEMA SI USO ITERADOR TAMBIÉN CON GÉNERO:
		
		Iterator<Gato> it = listadoGatos.iterator();
		
		while(it.hasNext()) {
			
			Gato gato = it.next();
			
			System.out.println(gato);
		}
		
		/*
				arrays.length
				cadenasTexto.length()
				colecciones.size()
		*/
		
		
		System.out.println("\n---------------------------------\n");
		
		listadoGatos.clear();
		
		System.out.println(listadoGatos + "\n");
		
		System.out.println("LONGITUD ACTUAL DE LA COLECCION ... " + listadoGatos.size() + "\n");
		
		System.out.println("¿ESTA VACIA? ... " + (listadoGatos.isEmpty()?"SI":"NO") );
	}
	
}
