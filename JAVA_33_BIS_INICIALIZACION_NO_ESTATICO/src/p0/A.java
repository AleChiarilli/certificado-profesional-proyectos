package p0;


public class A {

	{
		System.out.println("BLOQUE BINS DE A - 1");
	}
	
	
	public A() {
		System.out.println("CONSTRUCTOR DE A()");
	}

	
	public A(int x) {
		System.out.println("CONSTRUCTOR DE A(int)");
	}
	
	
	{
		System.out.println("BLOQUE BINS DE A - 2");
	}
	
	
	static {
		System.out.println("BLOQUE BIS DE A - 1");
	}
	
	static {
		System.out.println("BLOQUE BIS DE A - 2");
	}
	
}
