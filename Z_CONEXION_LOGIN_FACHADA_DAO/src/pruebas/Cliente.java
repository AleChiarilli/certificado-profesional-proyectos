package pruebas;


import java.util.Scanner;

import facades.LoginFacade;
import interfaces.ILogin;


public class Cliente {

	public static void main(String[] args) {
		
		// NO USES EL DAO DIRECTAMENTE ... MODIFICA EL CÓDIGO PARA QUE NO
		//	SEA POSIBLE.
		//LoginDAO acceso = new LoginDAO();
		
		
		// DEBERÍAS TENER UNA FACTORÍA QUE ENCAPSULASE A LA FACHADA Y SU
		// DAO, DE FORMA QUE DEVUELVA UN OBJETO DE LA FACHADA Y QUE EL 
		// CLIENTE LO PUEDA UTILIZAR A TRAVÉS DE SU INTERFAZ DE NEGOCIO O USO.
		ILogin login = new LoginFacade();
		
		String user;
		String password;
		
		// LEER DEL TECLADO:
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("¿USER? ... ");
		user = sc.nextLine();

		System.out.print("¿PASSWORD? ... ");
		password = sc.nextLine();
		
		// CERRAR EL SCANNER (ojo, cierras el teclado permanentemente).
		sc.close();
		
				
		
		System.out.println("\n");
		
			
		System.out.println("\t\t\t¿GOT ACCESS? ... " + 
				((login.getAccess(user, password)) ? "GRANTED" : "DENIED")
						
		);
		
	}
	
}
