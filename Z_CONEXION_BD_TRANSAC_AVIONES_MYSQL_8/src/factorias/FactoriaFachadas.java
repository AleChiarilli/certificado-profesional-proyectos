package factorias;


import fachadas.CompraFachada;
import interfaces.InterfazCompras;


public interface FactoriaFachadas {

	// EJEMPLO DE USO DE UNA INTERFAZ CON MÉTODO ESTÁTICO (JAVA 8).
	
	// FACTORÍA DE GÉNERO (modo estático) ... simulación de la factoría SPRING-CORE:
	//
	// SOLICITAR LAS FACHADAS A TRAVÉS DE SU CORRESPONDIENTE INTERFAZ DE USO.
	//		ICompra <--- CompraFachada
	//
	public static <T>T obtenerFachada(Class<T> manejador) {
		
		Object fachada;
		
		if(InterfazCompras.class == manejador) {

			fachada = new CompraFachada();
			
			return manejador.cast(fachada); // VER LA CLASE COMO SU INTERFAZ.
		}
		
		throw new RuntimeException("ERROR: NO SE DISPONE DEL MANEJADOR SOLICITADO");
		
	}

}