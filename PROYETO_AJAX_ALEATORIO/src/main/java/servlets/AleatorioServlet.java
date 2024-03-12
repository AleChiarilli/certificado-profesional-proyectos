package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/AleatorioServlet")
public class AleatorioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	}
	

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarPeticion(request, response);
	
	}

	
	
	
	
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("HE LLEGADO AL SERVLET AleatorioServlet");
		
		int aleatorio = (int)(Math.random() * 100) + 1;
		
		
		
		
		
		System.out.println("HA SALIDO " + aleatorio);
		
		String xml = "<?xml version='1.0' encoding='UTF-8'?>";
		
		xml += "<ruleta>";
		
		xml += "<numero>";
		
		xml += aleatorio;
		
		xml += "</numero>";
		
		xml += "</ruleta>";
		
		System.out.println("TEXTO XML = " + xml);
		
		
		

		response.setContentType("application/xml");

		
		response.getWriter().print(xml);
		
		
		
		
	}
}
