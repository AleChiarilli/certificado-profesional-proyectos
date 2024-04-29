package p0;


public class B extends A {

	{
		System.out.println("BLOQUE BINS DE B - 1");
	}
	
	
	public B() {
		System.out.println("CONSTRUCTOR DE B()");
	}

	
	public B(int x) {
		System.out.println("CONSTRUCTOR DE B(int)");
	}
	
	
	{
		System.out.println("BLOQUE BINS DE B - 2");
	}
	
	
	static {
		System.out.println("BLOQUE BIS DE B - 1");
	}
	
	static {
		System.out.println("BLOQUE BIS - 2");
	}
	
}


/*

BLOQUE BIS - 1
BLOQUE BIS - 2
BLOQUE BINS - 1
BLOQUE BINS - 2
CONSTRUCTOR DE A()

*/
