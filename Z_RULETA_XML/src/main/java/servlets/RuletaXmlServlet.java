package servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/RuletaXmlServlet")
public class RuletaXmlServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	// WRAPPER DE LOS PRIMITIVOS int.
	private final Integer[] numerosRojos 	= {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
	private final Integer[] numerosNegros 	= {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
	
	// VER LOS ARRAYS COMO LISTAS (INTERFAZ List) PARA PODER HACER USO DEL MÉTODO contains (includes en Javascript).
	private List<Integer> losRojos = Arrays.asList(numerosRojos);
	private List<Integer> losNegros = Arrays.asList(numerosNegros);
	
	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
													throws ServletException, IOException {
		
		procesarPeticion(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
													throws ServletException, IOException {
		
		procesarPeticion(request, response);
	}

	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println(">>> HE LLEGADO AL SERVLET ... RuletaXmlServlet");

		
		// EL NÚMERO:
		final int rango = 37;		

		final int numero = (int)(Math.random() * rango);		// [0 .. 37-1] ... [0..36]
		
		
		
		// EL COLOR:
		String color;
		
		if(losRojos.contains(numero)) {
			color = "RED";
		} else {
			color = "BLACK";
		}
		
				
		
		// LA PARIDAD:
		String paridad;
		
		if(numero %2 == 0) {
			paridad = "PAR";
		} else {
			paridad = "IMPAR";
		}
		
		
		//////////////////////////////////// ESCRIBIR EN EL NEGOCIADOR AJAX ////////////////////////////////
		
		// 1 - ESTABLECER EL TIPO DE RESPUESTA (MIME):
		response.setContentType("text/xml");
		
		
		String xml = "";
		
		xml += "<?xml version='1.0'?>";
		
		xml += "<ruleta>";
				
		xml +="<numero>" + numero + "</numero>";		
		xml +="<color>" + color + "</color>";		
		xml +="<paridad>" + paridad + "</paridad>";
				
		xml += "</ruleta>";
		
		
		System.out.println("\n >>> XML = \n\n\t" + xml + "\n\n");
		
		
		// ESCRIBIMOS EN LA RESPUESTA DEL NEGOCIADOR AJAX EN FORMATO XML.		
		PrintWriter escritor = response.getWriter();
		escritor.print(xml);
		
	}	
	
}
