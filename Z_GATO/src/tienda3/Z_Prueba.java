package tienda3;

public class Z_Prueba {
	public static void main(String[] args) {
		Gato gato1 = new Gato("FELIX", "BLANCO", 1);
		Gato gato2 = new Gato("CARLOS", "VERDE", 5);
		Gato gato3 = new Gato("GARFIL", "NARANJA", 9);
		
		System.out.println(gato1);
		System.out.println(gato2);
		gato3.arañar();
	}
}
