package p0;

public class Prueba {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.setB(b);
		b.setA(a);
		
		A otro = a;
		
		otro = null;
		a = null;
		b = null;
	}
	
	
}
