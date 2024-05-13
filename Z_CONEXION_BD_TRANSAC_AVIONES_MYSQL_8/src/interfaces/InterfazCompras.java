package interfaces;


public interface InterfazCompras {

	public boolean comprar(String empresa, String modelo, int unidades);

	// NOTAS:
	
	// LA TABLA usos DISPONE DE UN ÍNDICE ÚNICO EN EL CAMPO [USO].
	
	// LA TABLA aviones DISPONE DE UN ÍNDICE ÚNICO EN EL CAMPO [MODELO].
	
	
	// LA TABLA aviones HACE REFERENCIA A LA TABLA usos.
	
	// LA TABLA cobros HACE REFERENCIA A LA TABLA aviones.

	
	// !! OBSERVAR LAS TABLAS Y SUS REGLAS DE INTEGRIDAD REFERENCIAL !!.
	
}