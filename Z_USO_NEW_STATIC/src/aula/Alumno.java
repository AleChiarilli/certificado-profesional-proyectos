package aula;

import utiles.Calculadora;

public class Alumno {

	public static void main(String[] args) {
		
		final double x = 5;
		final double y = 8;
		
		Calculadora calculadora = new Calculadora();
		
		
		
		//double resultadoSuma = Calculadora.sumar(x,y);	
		double resultadoSuma = calculadora.suma(x,y);  //ÉSTO ES INSTANCIA POR LO TANTO 
		
		
		double resultadoResta = Calculadora.resta(x,y); //AQUÍ BUSCA A EL STATIC DE SU CLASE
	}
	
	
}
