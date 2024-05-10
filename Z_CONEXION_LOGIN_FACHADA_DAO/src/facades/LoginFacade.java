package facades;


import daos.LoginDAO;
import interfaces.ILogin;


public class LoginFacade implements ILogin {

	
	private LoginDAO loginDAO;
	
	
	public LoginFacade() {
		loginDAO = new LoginDAO();
	}
	
	
	// DELEGACIÓN DE LA FACHADA SOBRE EL DAO INTERNO O DE COMPOSICIÓN FUERTE (en
	//	si la fachada no hace nada, salvo coordinar a los DAO's que utilice ya 
	//	que estos no hablan entren ellos).
	
	// OJO, SI QUIERES OPERACIONES DE TIPO ATÓMICO (TRANSACCIONALES) ES LA FACHADA
	//	LA QUE DEBE CONFIRMAR LA MÚLTIPLE-OPERACIÓN Y CERRAR A CONTINUACIÓN LA
	//	CONEXIÓN ... USA THREAD-LOCAL.
	
	@Override
	public boolean getAccess(String user, String password) {
		return loginDAO.getAccess(user,password) ;
	}

}