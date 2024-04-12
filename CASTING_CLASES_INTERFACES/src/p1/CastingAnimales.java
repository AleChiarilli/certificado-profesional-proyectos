package p1;


public class CastingAnimales {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		//a.maullar();
		//a.ladrar();
		
		
		Gato g = new Gato();
		g.maullar();
		
		
		Perro p = new Perro();
		p.ladrar();
		
		
		////////////////////////////////////////
		
		
		a = g;
		//a.maullar();
		
		
		//g = a;	// MIRA LOS TIPOS NO LOS POSIBLES OBJETOS QUE HAYA DENTRO DE ELLOS.
		
		g = (Gato)a;
		g.maullar();
		
		
		////////////////////////////////////////
		
		
		a = p;
		//a.ladrar();
		
		//p = a;

		p = (Perro)a;
		p.ladrar();
		
		
		////////////////////////////////////////
		
		
		a = g;
		
		p = (Perro)a;		// EL COMPILADOR AHORA NO SE PREOCUPA (LA ASIGNACIÓN YA SE HIZO) POR EL
							// EL TIPO EFECTIVO O REAL DEL OBJETO QUE ESTÁ DENTRO O RELLANDO LA 
							// REFERENCIA a.
		
		//Exception in thread "main" java.lang.ClassCastException: p1.Gato cannot be cast to p1.Perro
		//at p1.Prueba.main(Prueba.java:51)

		
		
		System.out.println("!! FIN DE PROGRAMA !! ");
		
	}
	

}


class Animal {}

class Gato extends Animal {	
	public void maullar() {}	
}

class Perro extends Animal {	
	public void ladrar() {}	
}