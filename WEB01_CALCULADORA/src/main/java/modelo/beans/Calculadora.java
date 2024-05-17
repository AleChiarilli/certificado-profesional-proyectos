package modelo.beans;


public abstract class Calculadora {

	public static final synchronized int sumar(int x, int y) {
		return x + y;
	}
	
}
