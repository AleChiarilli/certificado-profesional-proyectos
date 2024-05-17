package servlets;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.beans.BaseDatos;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	/*

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("\n\t >>> 1 ... ENTRADA POR service(ServletRequest request, ServletResponse response)");

		service( (HttpServletRequest)request, (HttpServletResponse)response);
		
	}
	
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("\n\t >>> 2 ... SEGUIMOS POR service(HttpServletRequest request, HttpServletResponse response)");

		
		String modo = request.getMethod();
		
		System.out.println("\n\t -----------> PETICION DETECTADA EN MODO ... " + modo + "\n");
		
		if("get".equalsIgnoreCase(modo)) {			
			doGet(request, response);			
			
		} else if("post".equalsIgnoreCase(modo)) {
			doPost(request, response);
			
		}
		
	}

	*/
	
	
	/// LOS MÉTODOS QUE DEBE REALMENTE SOBRESCRIBIR EL DESARROLLADOR SON LOS PROPIOS DEL PROTOCOLO HTTP:
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
	
		procesarPeticion(request, response);
		
	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
	
		procesarPeticion(request, response);
		
	}

	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////

	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
	
			System.out.println("\n\t\t ===> EN EL METODO procesarPeticion.");
			
			String usuario	= request.getParameter("usuario");			
			String clave	= request.getParameter("clave");


			////////// LLAMAR AL MODELO PARA QUE CONVIERTA A NÚMERO LOS VALORES DE ENTRADA ///////////////
			
			boolean accesoSiNo = BaseDatos.login(usuario, clave);	
			
			if(accesoSiNo) {
				
				// REENVÍO:
				request.getRequestDispatcher("/WEB-INF/paginas/bienvenida.jsp").forward(request, response);
				
			} else {
				
				// REDIRECCIONAMIENTO:
				response.sendRedirect("login.jsp?usuario=" + usuario + 
											"&mensajeError=USUARIO Y/O CLAVE INCORRECTOS");
			}
			
	}	
	
	
}
