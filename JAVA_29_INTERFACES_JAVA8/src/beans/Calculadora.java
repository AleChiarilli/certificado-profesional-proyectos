package beans;


import interfaces.ICalculadora;


public class Calculadora implements ICalculadora {

	public static void main(String[] args) {
		
		int aleatorio = new Calculadora().generarNumeroAleatorio();
		
		System.out.println(aleatorio);
		
	}
	
}
