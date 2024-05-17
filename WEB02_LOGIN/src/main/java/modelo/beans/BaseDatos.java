package modelo.beans;


public abstract class BaseDatos {

	private static final String USUARIO = "JUAN";
	private static final String CLAVE = "123";
	
	public static final synchronized boolean login(String usuario, String clave) {
		return USUARIO.equals(usuario) && CLAVE.equals(clave);
	}
	
}
