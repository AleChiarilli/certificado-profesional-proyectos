package p0;


public class Prueba {

	public static void main(String[] args) {
		
		A a = new A();
		a = new B();
		a = new C();
		a = new D();
		
		
		C c = new C();
		D d = new D();
		
		// c = d; // NO
		
		//c = (C)d; // NO
		
		
		a = c;	// OK ... UNA VEZ QUE SE COMPRUEBA Y SE ASIGNA EL OBJETO A LA REFERENCIA,
				//			EL COMPILADOR LO QUE VE ES EL TIPO DE LA REFERENCIA Y NO
				//			DEL OBJETO QUE MANEJA, LO QUE TIENE DENTRO.
		
		c = (C)a; 	// OK ... SIN EL CASTING ES ERROR, PORQUE NO PUEDO METER 
				//			EL SUPERTIPO EN UN SUBTIPO -> LA DESPROMOCIÓN DEBE
				//			SER FORZOSA, NÚNCA AUTOMÁTICA.
		
		
		//////////////////////////////
		
		
		//d = a;	// NO
		
		d = (D)a;	// NO .. EN EJECUCIÓN ERROR ... LO QUE HAY EN a ES REALMENTE UN C.
		
	}
	
	
	
}



class A {}

class B extends A {}



class C extends B {}

class D extends B{}