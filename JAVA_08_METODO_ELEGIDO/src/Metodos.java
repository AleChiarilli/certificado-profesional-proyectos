
public class Metodos {
	
	// con la sobrecarga, podemos tener un mismo método que reciba
	// distintos tipos de parámetros
	public static void imprimir(byte algo) {
		System.out.println(algo);
	}
//	//puedes ver que tienen el mismo nombre
//	public static void imprimir(int algo) {
//		System.out.println(algo);
//	}
//	
//	public static void imprimir(long algo) {
//		System.out.println(algo);
//	}
//	
//	public static void imprimir(float algo) {
//		System.out.println(algo);
//	}
//	
//	public static void imprimir(double algo) {
//		System.out.println(algo);
//	}
	
	///////////////////////////////////////////////////
//	
//	public static void imprimir(Integer algo) {
//		System.out.println(algo);
//	}
	
	public static void imprimir(Long algo) {
		System.out.println(algo);
	}
	
	
	public static void main(String[] args) {
		imprimir(5L);
	}
	
}
