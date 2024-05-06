package p5;


// SÓLO PUEDE DECLARSE UN MÉTODO ABSTRACTO Y DEBE HACERSE

@FunctionalInterface
public interface ICalculadora {

	// CONSTANTES
	public static final int SUMAR 	= 1;
	public static final int RESTAR 	= 2;
	
	// RECUERDA QUE EL MÉTODO DECLARADO EN LA INTERFAZ ES IMPLÍCITAMENTE ABSTRACTO ...
	//	no hace falta que lo indiques.
	
	public abstract double operar(double x, double y, int operacion);	

}
