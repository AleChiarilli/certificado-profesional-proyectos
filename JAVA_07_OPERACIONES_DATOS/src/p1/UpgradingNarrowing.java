package p1;

public class UpgradingNarrowing {
	
	public static void main(String[] args) {
		
		//UPCASTING ... PROMOCIONANDO EL SUBTIPO Gato AL SUPERTIPO Animal
		Animal animal = new Gato();
		
		
		//DOWNCASTING ... DESPROMOCIONAR EL SUPERTIPO Animal AL SUBTIPO Gato...
		// ESTAMOS HABLANDO DE LAS REFERENCIAS, LOS MANEJADORES O HANDLERS, NO
		// DE LOS OBJETOS QUE REALMENTE HAYA DENTRO DE LAS MISMAS.
		Gato gato = (Gato)animal;
		
	}
}

// NUNCA DEGINAS MÁS DE 1 CLASE EN EL MISMO FICHERO... NO SE VEN
// EN EL EXPLORADOR DE PROEYCTOS.

class Animal {};
class Gato extends Animal {};