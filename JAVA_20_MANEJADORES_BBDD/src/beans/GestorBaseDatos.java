package beans;

import interfaces.IAdministrador;

public class GestorBaseDatos implements IAdministrador {
	
	public void realizarConsultar() {
		System.out.println(getClass().getSimpleName() + "SE REALIZA UNA Consulta");
	}
	
	
	public void realizarAlta() {
		System.out.println("SE REALIZA UNA Alta");
	}
	
	
	public void realizarBaja() {
		System.out.println("SE REALIZA UNA Baja");
	}

	
	public void realizarModificacion() {
		System.out.println("SE REALIZA UNA Modificacion");
	}

	
	/////////////////////////////////////////////////////////////////////////
	private GestorBaseDatos() {
		
	}
	
	public static GestorBaseDatos obtenerGestorBaseDatos() {
		return new GestorBaseDatos();
	}
	/////////////////////////////////////////////////////////////////////////
}
