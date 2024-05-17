package servlets;


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;
      
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
														throws ServletException, IOException {

		System.out.println("\n\t SE HA LLEGADO AL SERVLET ---> " + 
													getClass().getSimpleName() +
														" - HASHCODE: " + hashCode() + "\n");
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		String path 		= request.getServletPath();	
		
		String uri 			= request.getRequestURI();
		
		String url 			= request.getRequestURL().toString();
		
		String queryString 	= request.getQueryString();
	
		String method		= request.getMethod();
		
		String remoteHost	= request.getRemoteHost();
		
		String remoteAddr	= request.getRemoteAddr();
		
		
		System.out.println("\n PATH: " + path);
		System.out.println("\n URI: " + uri);
		System.out.println("\n URL: " + url);
		System.out.println("\n QUERY-STRING: " + queryString);
		System.out.println("\n METHOD: " + method);
		System.out.println("\n REMOTE HOST: " + method);
		System.out.println("\n REMOTE ADDRESS: " + remoteAddr);		
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		System.out.println("\n\t request.getServletPath() ---> " + request.getServletPath());
		
		// request.getServletPath() ---> /SumarServlet.do
		
		String peticionOriginal = request.getServletPath();
		
		// reenvio ---> /SumarServlet			... LOS SALTOS EN EL SERVIDOR REQUIEREN DEL SLASH (BARRA)
		
		String reenvio = peticionOriginal.substring(0, peticionOriginal.indexOf("."));
		
		System.out.println("\n\t reenvio ---> " + reenvio);
		
		// LLAMAR AL TAXISTA - INTERFAZ DE SALTO RequestDispatcher.
		
		// REENVÍO == "PROPAGAR LA PETICIÓN ACTUAL == MISMA PAREJA DE REQUEST+RESPONSE"
		request.getRequestDispatcher(reenvio).forward(request, response);
		
		
		System.out.println("\n\t SE HA PRODUCIDO EL SALTO A ---> " + reenvio);	
		
	}

}
