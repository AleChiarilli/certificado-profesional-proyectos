package randomNumber;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/RandomNumber")
public class RandomNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	procesarPeticion(request, response);
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
	
	procesarPeticion(request, response);
	}
	

	private void procesarPeticion (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println(">>> HE LLEGADO AL SERVLET ... RuletaXmlServlet");
		
				
				// EL NÚMERO:
				final int rango = 37;		
		
				final int numero = (int)(Math.random() * rango);		// [0 .. 37-1] ... [0..36]
				
	
	// 1 - ESTABLECER EL TIPO DE RESPUESTA (MIME):
	response.setContentType("text/xml");
	
	
	// 2 - CONSTRUIR LA RESPUESTA
	String xml = "";
	
	xml += "<?xml version='1.0'?>";
	
	xml += "<ruleta>";
			
	xml +="<numero>" + numero + "</numero>";
	
	xml += "</ruleta>";
	
	System.out.println("\n >>> XML = \n\n\t" + xml + "\n\n");
	
	
	// ESCRIBIMOS EN LA RESPUESTA DEL NEGOCIADOR AJAX EN FORMATO XML.		
	PrintWriter escritor = response.getWriter();
	escritor.print(xml);
	}

}
