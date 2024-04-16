package p0;

public class Prueba {
	public static void main(String[] args) {
		new B();
		
	}
}

/////////////////////////////// A ///////////////////////////////
class A {
	public A() {
		System.out.println("CONSTRUCTOR DE ... A" + hashCode());
	}
}

/////////////////////////////// B ///////////////////////////////
class B extends A {
	public B() {
		System.out.println("CONSTRUCTOR DE ... B");
	}
}

/////////////////////////////// C ///////////////////////////////
class C extends B {
	public C() {
		System.out.println("CONSTRUCTOR DE ... C");
	}
}