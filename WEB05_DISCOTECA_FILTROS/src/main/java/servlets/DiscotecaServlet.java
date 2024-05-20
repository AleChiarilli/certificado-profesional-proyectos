package servlets;


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Reloj;


public class DiscotecaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("\n---> EN EL SERVLET ... " + getClass().getSimpleName() + "\n");
		
		/// TU CÓDIGO DE DESPACHAMIENTO ///
		
		//// HORA ... COMO ATRIBUTO ///
		request.setAttribute("horaActual", Reloj.consultarHora());
		
		request.getRequestDispatcher("/WEB-INF/paginas/invitacion.jsp").
						forward(request, response);
		
	}
	
	
}
