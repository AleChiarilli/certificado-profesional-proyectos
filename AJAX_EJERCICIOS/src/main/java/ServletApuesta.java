package servlets;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletApuesta")
public class ServletApuesta extends HttpServlet {


	private static final long serialVersionUID = 1L;

	
	
	public void service(HttpServletRequest request,
							HttpServletResponse response)
								throws ServletException, IOException {
		
		
		// GENERAR Y DEVOLVER UN NÚMERO ALEATORIO ENTRE 1 .. 100:
		
		int aleatorio = (int)(Math.random() * 100) + 1;
		
		System.out.println("\n\t >>>>> HA SALIDO EL ... " + aleatorio);
		
		
	}

}
