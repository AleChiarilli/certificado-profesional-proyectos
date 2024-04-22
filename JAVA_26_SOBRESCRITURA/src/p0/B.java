package p0;


class B extends A {
	
	// OVERRIDES
	@Override
	public void m0() {}
	
	
	// protected y public
	@Override
	public int m1(int x) {
		return 101;
	}
	
	
	// NO SOBRESCRITURA ... EL m2 DE LA MADRE ES PRIVADO == LA HIJA PUEDE HACER LO QUE QUIERA,
	//	PORQUE NO VE AL DE LA MADRE (aunque sí lo tiene == HERENCIA NO VISIBLE DIRECTAMENTE).
	Object m2() {
		return null;
	} 
	
	//@Override		// LO ESTÁTICO NO SE HEREDA (sólo lo estoy viendo) ... NO PUEDO HACER OVERRIDE.
	public static void m3() {
		System.out.println("SOY m3() DE HIJA");
	}
	
	// SI ES FINAL EN LA MADRE NO PUEDO CREAR LA VERSIÓN EN LA HIJA SEA O NO SEA ESTÁTICO.
	//public static void m4() {}
	
}
