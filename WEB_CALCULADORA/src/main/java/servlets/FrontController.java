package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class FrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
																	throws ServletException, IOException {
		
		System.out.println("SE HA LLEGADO AL SERVLET ----> " + getClass().getSimpleName() + "HASHCODE: " + hashCode() );
		
		
		
		
		System.out.println("request.getServletPath() ----> " + request.getServletPath());
		
		
		//request.getServletPath() ----->  /sumar.do
		
		String peticionOriginal = request.getServletPath();
		
		//renvio -----> /sumar
		
		String reenvio = peticionOriginal.substring(0, peticionOriginal.indexOf("."));
		
		System.out.println("reenvio ----> " + reenvio);
		
		
		//Ahora llamas al taxista - interfaz de salto RequestDispatcher.
		request.getRequestDispatcher(reenvio).forward(request, response);
		
	}

}
