package p3;

public class AnimalGatoPerro {

	public static void main(String[] args) {
	
		Animal[] animales = {new Gato(), new Perro()};
		
		//int aleatorio = (int) (Math.random() * animales.length);
		
		Animal bicho = animales [ (int) (Math.random() * animales.length) ];
		System.out.println("QUE BICHO HA SALIDO ... " + bicho);
		
		if (bicho instanceof Gato) {
			
			System.out.println(
					((Gato)bicho).maullar()
					);
			
		} else {
			System.out.println(
					((Perro)bicho).ladrar()
					);
		}
		
	}
}

class Animal {
	
	@Override
	public String toString() {
		return getClass().getSimpleName().toUpperCase();  //JAVA REFLECTION == INTROSPECCIÓN
	}
}

class Gato extends Animal {
	public String maullar() {
		return "PRRRMIAUUUUU";
	}

}
class Perro extends Animal {
	public String ladrar() {
		return "GUAU GUAU";
	}
	
}