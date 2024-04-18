package beans;

import handlers.ManejadorCalculadora;

public class Calculadora implements ManejadorCalculadora {
	
	private static Calculadora calculadora;
	
	
	private Calculadora() {}
	
	
	public static synchronized Calculadora darmeCalculadora() {
		
		if(calculadora == null) {
			calculadora = new Calculadora();
		}
				
		return calculadora;
	}
	
	
	@Override
	public double suma(double x, double y) {
		return x + y;
	}
	
	public double resta(double x, double y) {
		return x - y;
	}
	
	public double multiplicacion(double x, double y) {
		return x * y;
	}
	
	public double division(double x, double y) {
		if (y == 0) {
			return 0;
		}
		return x / y;
	}

	
	
}
