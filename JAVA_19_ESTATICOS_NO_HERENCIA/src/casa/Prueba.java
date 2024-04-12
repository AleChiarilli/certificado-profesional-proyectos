package casa;

public class Prueba {

	
	public static void main(String[] args) {
		
		// PREGÚNTATE ... ¿EL MÉTODO INVOCADO ES ESTÁTICO O POLIMÓRFICO?
		
		// ESTÁTICO (static) == ! POLIMÓRFICO (no static)
		
		// SI EL MÉTODO ES ESTÁTICO, NO DEPENDE DE LA INSTANCIA CON LA QUE
		//	SE HAYA PODIDO CARGAR LA REFERENCIA, LUEGO LA DEFINICIÓN, LO 
		//	QUE HACE EL MÉTODO, SE BUSCA EN LA REFERENCIA (LADO IZQUIERDO
		//	DE LA ECUACIÓN). LO RESUELVE EL COMPILADOR EN TIEMPO DE COMPILACIÓN,
		//	(CUANDO ESTAMOS ESCRIBIENDO EL CÓDIGO == RESOLUCIÓN TEMPRANA O INMEDIATA).
		
		// SI POR EL CONTRARIO EL MÉTODO NO ES ESTÁTICO, ES DECIR, ES POLIMÓRFICO,
		//	LA RESOLUCIÓN DE LO QUE HACE EL MÉTODO, SE ESTABLECE POR ENLAZADO DÍNAMICO
		//	O TARDÍO (LAZY-BINDING), BUSCÁNDOSE EN EL POSIBLE OBJETO CON EL QUE HAYAMOS
		//	CARGADO LA REFERENCIA (LADO DERECHO DE LA ECUACIÓN). LO RESUELVE LA MÁQUINA
		//	VIRTUAL EN TIEMPO DE EJECUCIÓN, ES DECIR, HAY QUE ESPERAR A EJECUTAR EL 
		//	PROGRAMA PARA VER QUÉ OBJETO QUEDA FINALMENTE EN LA REFENCIA E INVOCAR SOBRE
		//	EL DICHO MÉTODO.
		
		// IMAGINA UN ARRAY DE ANIMALES CON GATO, PERRO Y PAJARO.
		// CARGA UNA REFERENCIA CON UNO DE ELLOS ALEATORIAMENTE (Math.random())
		// SOBRE DICHA REFERENCIA INVOCA AL MÉTODO emitirSonido().
		// SI GATO == "MIAUU", SI PERRO == "GUAUU", SI PAJARO == "PIOPIO" ...
		// ... ES IMPOSIBLE SABER CON SEGURIDAD QUÉ OBJETO SERÁ EL ELEGIDO PERO
		// TODOS Y CADA UNO DE ELLOS SON VÁLIDOS PARA LA REFERENCA ANIMAL, PORQUE
		// ES LA MADRE DE TODOS ELLOS. AL EJECUTAR, LA JVM INVOCARÁ AL MÉTODO 
		// SOBRE EL OBJETO QUE, POR AZAR, HAYA SIDO ASIGNADO A LA REFERENCIA Y ES
		// POR ÉSTO, QUE HAY QUE ESPERAR A VER QUÉ QUEDA AHÍ ... SE LE DENOMINA O
		// LLAMA: ENLAZADO DINÁMICO, TARDIO O "PEREZOSO" ... no me gusta esta palabra.
		
		// ESTAMOS CUMPLIENDO CON LA REGLA DE LA OOP "PROGRAMA EN BASE A UN SUPERTIPO
		// Y NO A UNA IMPLEMENTACIÓN", Y CUMPLIENDO EL PRINCIPIO DE SUSTITUCIÓN
		// DE LA MÁTEMATICA Y CIENTÍFICA DE LA COMPUTACIÓN, LA SEÑORA LISKOV ...
		// TODA CLASE DERIVADA (HIJA) DEBE PODER SER SER SUSTITUIDA POR SU CLASE BASE
		// (MADRE) MANTENIÉNDOSE LA INTEGRIDAD DEL PROGRAMA (QUE TODO SIGA FUNCIONANDO),
		// UNO DE LOS 5 PRINCIPIOS S.O.L.I.D, CONCRETAMENTE EL (L).
		// 
		// AL FINAL LO QUE HACEMOS ES PROGRAMAR EN BASE AL SUPERTIPO (INTERFAZ O CLASE
		//	ABSTRACTA PRINCIPALMENTE) PARA CONSEGUIR DESACOPLAMIENTO Y ADAPTABILIDAD 
		//  (CONSIGO LA ADAPTABILIDAD PORQUE PUEDO CAMBIAR UNA HIJA POR OTRA MÁS
		//	EFICIENTE SIEMPRE Y CUANDO, CUMPLA CON EL CONTRATO ACTUAL ... EL MICROONDAS
		//	ANALÓGICO - DE RUEDA SIN PANTALLA Y 700W DE POTENCIA, LO CAMBIO O REEMPLAZO,
		//	CABE EN EL HUECO QUE DEJA EL OTRO, POR UNO NUEVO DIGITAL - BOTONES TÁCTILES,
		//	CON PANTALLA DIGITAL Y 2000W DE POTENCIA y si te pones con pantalla de Tv
		//	QLED 4K haciendo de puerta, PERO AL FINAL, AMBOS MODELOS IMPLEMENTAN EL 
		//	CONTRATO DE INTERFAZ O CLASE ABSTRACTA ... calentar(int tiempo).
		
		// TOMA CHAPA PARA QUE LO PIENSES EL FIN DE SEMANA !!.
		
		
		
		
		////////// NO ESTÁTICO ... MANDA EL OBJETO - LADO DERECHO - NO LA REFERENCIA.

		// POLIMÓRFICO:
		
		Madre madre = new Madre();	
		Hija hija = new Hija();
	
	
		Madre x = madre;		
		System.out.println(x.hablar()); 
	
		
		System.out.println("\n\n-------------------------\n\n");
		
		
		x = hija;
		System.out.println(x.hablar());

		
		
		
		////////// ESTÁTICO ... MANDA LA REFERENCIA - LADO IZQUIERDO - NO EL OBJETO.

		// NO POLIMÓRFICO:
		
		System.out.println("\n\n-------------------------\n\n");
		
		x.comer();
		
		System.out.println("\n\n-------------------------\n\n");
		
		Madre.comer();
		Hija.comer();
		
		
	}	
	
}
