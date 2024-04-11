package casa;


public class Madre {

	// NO ESTÁTICO == POLIMÓRFICO.
	public String hablar() {
		return "QUIEN SIEMBRA AL FINAL RECOGE !!";
	}
	
	
	// ESTÁTICO NO FINAL
	public static void comer() {
		System.out.println("LA MADRE DICE ... COME VERDURAS QUE ES MUY SANO");
	}
	
	
	/*
	// ESTÁTICO Y FINAL
	public static final void comer() {
		System.out.println("LA MADRE DICE ... COME VERDURAS QUE ES MUY SANO");
	}	
	*/
}
