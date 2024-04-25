package interfaces;


import java.util.Random;


public interface ICalculadora {

	// ABSTRACTO (abstract aunque no lo pongas ... estamos en un interfaz)
	//public int generarNumeroAleatorio();
	
	
	// ESTÁTICO (no private ni protected)
	/*
	public static int generarNumeroAleatorio() {
		return new Random().nextInt(100) + 1; // [1..100]
	}
	*/
	
	// MÉTODO DEFAULT ... LO OBTIENE POR HERENCIA LA CLASE QUE IMPLEMENTE LA INTERFAZ.
	//
	//						PUEDES PONER TODOS LOS QUE QUIERAS.
	//
	//						SOLUCIONA EL PROBLEMA DE LA INTERFAZ Y LA NO REUTILIZACIÓN
	//						DE CÓDIGO DEL PATRÓN DE DISEÑO STRATEGY.
	
	// REPITE EL EJERCICIO DE STRATEGY DE LOS PATOS CON PALOMA(vuela) Y GALLINA(no vuela)
	//		PERO UTILIZANDO LOS MÉTODOS DEFAULT DE LAS INTERFACES JAVA 8.
	
	public default int generarNumeroAleatorio() {
		return new Random().nextInt(100) + 1; // [1..100]
	}
	
}
