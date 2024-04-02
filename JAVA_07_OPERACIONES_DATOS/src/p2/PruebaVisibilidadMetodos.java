package p2;

public class PruebaVisibilidadMetodos {
	
	public static void main(String[] args) {
		
		Animal animal = new Perro();
		
		animal.respirar();
		
		//animal.ladrar();
		
		((Perro)animal).ladrar();
		
		
	}
	
}

class Animal {
	
	// EL MÉTODO ES POLIMORFICO PORQUE NO ES ESTÁTICO (no pone static)
	public void respirar() {
		System.out.println("EL " + getClass().getSimpleName() + " RESPIRA");
	}

}

class Perro extends Animal {
	public void ladrar() {
		System.out.println("GUAU, GUAU ... PAM PAM");
	}
}