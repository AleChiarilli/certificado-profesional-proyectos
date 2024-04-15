package p0;


import java.util.Arrays;
import java.util.List;


public class Prueba {

	// SOLO ADMITE List<Animal> Y NO List<Gato> O List<Perro> ... NO SE CUMPLE LA
	//	REGLA IS-A CUANDO TRABAJAMOS CON LA MARCA DE GÉNERO, QUIERE EL TIPO EXACTO Y
	//	NO LOS SUBTIPOS.
	
	//public static void imprimir(List<Animal> animales) {
	
	// SI QUIERES SUBTIPOS O SUPERTIPOS UTILIZA:
	//
	// <? extends T>
	// <? super T>			... T == Type o tipo.
	
	
	public static void imprimir(List<? extends Animal> animales) {
	
		for (Animal animal : animales) {
			System.out.println("---> " + animal);
		}
		
	}
	
	
	
	////////////////////////////////////
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
				
		// OK ... PIDE ANIMALES.
		//List<Animal> animales = Arrays.asList(a1, a2, new Perro());
		
		List<Animal> animales = Arrays.asList(a1, a2, new Perro());
		
		//System.out.println(animales);
		
		imprimir(animales);
		
		//////////////////////////////////////////////////////////
		
		
		Gato g1 = new Gato();
		Gato g2 = new Gato();
			
		// ERROR PORQUE SÓLO QUIERE GATOS.
		//List<Gato> gatos = Arrays.asList(g1, g2, new Perro());
		
		List<Gato> gatos = Arrays.asList(g1, g2);
		
		//System.out.println(gatos);
		
		imprimir(gatos);
		
		
	}
	
	
	
}



class Animal {
	
	@Override
	public String toString() {
		return getClass().getSimpleName().toUpperCase() + " ... " + hashCode();
	}
	
	
}

class Gato extends Animal {}

class Perro extends Animal {}