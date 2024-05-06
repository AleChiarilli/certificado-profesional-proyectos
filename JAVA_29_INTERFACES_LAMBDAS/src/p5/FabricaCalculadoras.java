package p5;


import static p5.ICalculadora.*;


public abstract class FabricaCalculadoras {

	private static final ICalculadora calculadora;
	
		
	
	static {
		
		calculadora = (x,y,operacion) -> {
											
											switch(operacion) {
												
												case SUMAR:
													return x+y;
												
												case RESTAR:
													return x-y;
													
												default:
													throw new RuntimeException("ERROR - OPERACION DESCONOCIDA");
													
											}
											
										};
		
	}
	

	public static final ICalculadora solitarCalculadora() {
		return calculadora;
	}

}
