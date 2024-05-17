package servlets;


import java.io.IOException;

import excepciones.TextoNoNumericoException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.beans.Calculadora;
import modelo.conversores.ConversorTextoNumero;


@WebServlet("/SumarServlet")
public class SumarServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
	
			System.out.println("\n\t\t ===> HE LLEGADO AL SERVLET SUMAR - MODO GET");
			
			// OBTENER LOS PARÁMETROS DE LA PETICIÓN ENTRANTE (cliente).
			
			// ?x=5&y=7
			// String --> "5"
			
			String x = request.getParameter("x");
			
			String y = request.getParameter("y");

			System.out.println("\nPARAMETRO X = " + x);
			System.out.println("\nPARAMETRO Y = " + y);
			
			////////// LLAMAR AL MODELO PARA QUE CONVIERTA A NÚMERO LOS VALORES DE ENTRADA ///////////////
			
			try {
				
				int valorX = ConversorTextoNumero.convertir(x);
				int valorY = ConversorTextoNumero.convertir(y);
				
				// EL SERVLET SÓLO DEBE IMPLEMENTAR LÓGICA DE DESPACHAMIENTO Y NUNCA,
				//	LÓGICA DE NEGOCIO (por ejemplo sumar 2 números).
				
				//int resultadoSuma = valorX + valorY;
				
				int resultadoSuma = Calculadora.sumar(valorX, valorY);
								
				System.out.println("\n\t ---> RESULTADO SUMA: " + resultadoSuma);
				
				
				// CREAR ATRIBUTO PARA LA VISTA Y REENVIAR:
				
				request.setAttribute("resultadoSuma", resultadoSuma);
				
				
				// INDICAR TAMBIÉN LA OPERACIÓN:
				request.setAttribute("operacion", " SUMA ");

				
				// REENVIAR A LA VISTA FINAL:
				
				//request.getServletContext().getRequestDispatcher("salto")
				
				request.getRequestDispatcher("/WEB-INF/paginas/resultados.jsp").forward(request, response);
				
			} catch(TextoNoNumericoException tnne) {				
				request.setAttribute("error", tnne);
				request.getRequestDispatcher("/error.jsp").forward(request, response);				
				System.out.println("\nERROR: " + tnne);
			}
			
			
			
			
			
			
			
			
			
			
			/*
			// ?sabor=FRESA&sabor=VAINILLA&sabor=CHOCOLATE
			// String[] --> {"FRESA","VAINILLA","CHOCOLATE"}
			request.getParameterValues("SABORES"); 		
			
			// Enumeration<String> .... while - hasMoreElements() - nextElement().
			request.getParameterNames();
			*/
			
			
	}
	
}
