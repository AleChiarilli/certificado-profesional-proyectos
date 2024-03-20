

public class Sumador {
	
	public static void main(String[] args) {
		

		if (args.length != 2) {
			System.out.println("ERROR. SE REQUIEREN 2 PARAMETROS");
			return;
		}

		int x;
		int y;


		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);

		} catch(NumberFormatException nfe) {
			System.out.print("ERROR EN LOS PARAMETROS DE ENTRADA");
			return;
		}

		System.out.println("X = " + x + ", Y = " + y);

		//AUTO-BOXING			int 5 -------> Integer 5.
		//AUTO-UNBOXING			Integer 5 ----> int 5.


		//REALIZAR SUMA
		int resultadoSuma = x + y;

		//IMPRIMIR RESULTADOS:
		System.out.println("LA SUMA DE " + x + " + " + y + " ES ... " + resultadoSuma);
	}


}