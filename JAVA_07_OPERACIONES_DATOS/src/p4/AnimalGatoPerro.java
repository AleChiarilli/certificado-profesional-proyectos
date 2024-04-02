package p4;

public class AnimalGatoPerro {

	public static void main(String[] args) {
	
		Animal[] animales = {new Gato(), new Perro(), new Lombriz()};
		
		//int aleatorio = (int) (Math.random() * animales.length);
		
		Animal bicho = animales [ (int) (Math.random() * animales.length) ];
		System.out.println("QUE BICHO HA SALIDO ... " + bicho);
		
		bicho.emitirSonido();
		
	}
}

abstract class Animal {
	
	public abstract String emitirSonido();
	
	@Override
	public String toString() {
		return getClass().getSimpleName().toUpperCase();  //JAVA REFLECTION == INTROSPECCIÓN
	}
}

class Gato extends Animal {
	public String emitirSonido() {
		return "MIAUUU";
	}
}

class Perro extends Animal {
	public String emitirSonido() {
		return "GUAUUUU";
	}
}
	
class Lombriz extends Animal {
	public String emitirSonido() {
		return "NO EMITE SONIDO";
	}
}