package filtros;


import java.io.IOException;
import java.util.Set;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletResponse;


public class Filtro2 extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;



	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("\n>>>>>>> SE DESPLIEGA EL FILTRO 2 ... " + hashCode() + "\n");
		// NO HACEMOS NADA MÁS.
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String nombre = request.getParameter("nombre");
		String ipUsuario = request.getRemoteAddr();
		
		System.out.println("\n\t FILTRO 2: IP DETECTADA: " + ipUsuario + " ---> NOMBRE: " + nombre);
		
		
		
		Set<String> listaIP = (Set<String>) request.getServletContext().getAttribute("listaIP");
		
		System.out.println("\n\t FILTRO 2: IPs ACTUALMENTE EN LA LISTA: \n\t\t" + listaIP);
		
		
		// COMPROBAR SI ES LA PRIMERA VEZ PARA EL USUARIO:
		//
		// SI ES NUEVO (1ª vez - NO EXISTE):
		if(! listaIP.contains(ipUsuario)) {
			
			System.out.println("\n\t FILTRO 2: OK, EL USUARIO " + nombre + " PUEDE ENTRAR.");
			listaIP.add(ipUsuario);
			chain.doFilter(request, response);
			
		} else {
			
			System.out.println("\n\t FILTRO 2: UPPPS, EL USUARIO " + nombre + " NO PUEDE ENTRAR.");
			
			// El response de entrada al método (ServletResponse) NO DISPONE del método sendRedirect ...
			//	castea, convierte la referencia a HttpServletResponse y se solucionará:
			
			// DE UN FICHERO DE PROPIEDADES ...
			final String mensaje = "LA ENTRADA SON 10 EUROS, CON DERECHO A 1 CONSUMICION.";
			
			// HACEMOS UN REDIRECCIONAMIENTO (nueva petición == nuevo request) EN LUGAR DE UN REENVÍO.
			((HttpServletResponse)response).sendRedirect("index.jsp?mensaje=" + mensaje);
			
		}
		
		
		
	}


	
	public void destroy() {
		System.out.println(">>>>>>>>>>>>>> SE DESTRUYE EL FILTRO 2");
	}
	
}
