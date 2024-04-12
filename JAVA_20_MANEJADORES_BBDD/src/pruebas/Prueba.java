package pruebas;

import beans.GestorBaseDatos;
import interfaces.IAdministrador;
import interfaces.IUsuario;


public class Prueba {
	
	public static void main(String[] args) {
		
		GestorBaseDatos gbd = GestorBaseDatos.obtenerGestorBaseDatos();
		
		IUsuario usuario = gbd;
		IAdministrador admin = gbd;
		
		usuario.realizarConsultar();
		
		admin.realizarBaja();
		admin.realizarAlta();
		admin.realizarConsultar();
		admin.realizarModificacion();
		
	
	}
	
}
