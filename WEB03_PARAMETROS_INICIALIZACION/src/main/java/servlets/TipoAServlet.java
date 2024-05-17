package servlets;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class TipoAServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// CONSTRUIR LA PÁGINA DESDE ESTE SERVLET (COMO SI FUESE UN JSP):
		
		// NOTA ... LOS SERVLETS NO SE DISEÑARON PARA CONSTRUIR LA VISTA, SINO PARA
		//				ACTUAR DE DESPACHADORES ... usa un JSP o un motor de plantillas
		//											como Thymeleaf (th:xxx)
		
		PrintWriter escritor = response.getWriter();
		
		escritor.println("<!DOCTYPE html>");
		escritor.println("<head></head>");
		escritor.println("<body>");
		escritor.println("<div align='center'>");
		escritor.println("<h1> PARAMETROS </h1>");
		escritor.println("<br/><br/>");
		escritor.println("<p style='color:red; font-size:2cm;'>");
		
		escritor.println(getInitParameter("color"));
		
		escritor.println("</p>");
		escritor.println("</div>");
		escritor.println("</body>");
		escritor.println("</html>");
		
	}
	
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
