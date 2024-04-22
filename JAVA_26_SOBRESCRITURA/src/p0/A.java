package p0;


public class A {
		
	// OVERRIDEN
	public void m0() {}

	protected int m1(int x) {
		return 0;
	}

	// NO VISIBLE DIRECTAMENTE EN LA HIJA.
	private void m2() {}
	
	
	////////////////// ESTÁTICOS //////////////////////
	
	
	public static void m3() {
		System.out.println("SOY m3() DE MADRE");
	}	
	
	public static final void m4() {} // FINAL
		
}





