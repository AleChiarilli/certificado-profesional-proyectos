package p0;

import java.util.Arrays;
import java.util.List;

public class Array_List {
	
	public static void main(String[] args) {
		
		//un ARRAY después que se crea no se puede modificar,
		// por eso, debemos indicar cuántos elementos tiene int[],
		//y se quedará así siempre. Si se quiere modificar, se utilizaría un LIST
		int[] numeros_a = new int[] {1,2,3};
		int[] numeros_a1 = new int[] {1,2,3};
		
		int[] numeros_b = {1,2,3};
		//éstas dos maneras de declarar de arriba son iguales, en una se declara
		
		
		System.out.println(numeros_a);
		System.out.println(numeros_a1);
		System.out.println(numeros_b);
		
		
		
		
		//AHORA LAS LISTAS, LAS USAREMOS PARA PODER "JUGAR" CON ELLAS
		//RECOGEREMOS UNA VARIABLE arrayNumeros Y LA CONVERTIREMOS
		//PARA PODER USAR LOS METODOS DE UN List EN UN Array.
		
		Integer[] arrayNumeros = {1,2,3};
		System.out.println(arrayNumeros);
		
		List<Integer> listadoNumeros = Arrays.asList(arrayNumeros);
		System.out.println(listadoNumeros);
		
		
		
		
		
	}
}
