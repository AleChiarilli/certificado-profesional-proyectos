package p1;

public class Calculadora {

	public static double obtenerMediaAritmetica(double ... datos) {
		
		if(datos.length == 0) {
			throw new RuntimeException("!!! ERROR, NO HAS INTRODUCIDO NINGUN DATO !!!");
		}
		
		System.out.println("HAS INTRODUCIDO UN TOTAL DE ... " + datos.length + " DATOS");
		
		double sumaTotal = 0;
		
		for(double dato : datos) {
			sumaTotal += dato;
			System.out.println("---------> " + dato);
		}
						
		return sumaTotal / datos.length;		
	}
	
	
	public static void main(String[] args) {

		/*
		System.out.println("MEDIA ARITMETICA A ... " + 
								obtenerMediaAritmetica(4.3, 7, Math.PI, Math.E, 5, -3));
		
		
		System.out.println("\n\n");
		
		
		System.out.println("MEDIA ARITMETICA B ... " +
								obtenerMediaAritmetica(new double[] {2,2,2}) );

		*/
		
		
		System.out.println("MEDIA ARITMETICA C ... " +
								obtenerMediaAritmetica());
		
		
	}
	
}
