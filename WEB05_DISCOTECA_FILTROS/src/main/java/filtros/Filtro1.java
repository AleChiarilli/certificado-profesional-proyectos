package filtros;


import java.io.IOException;
import java.util.HashSet;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class Filtro1 implements Filter {
	
	private static final long serialVersionUID = 1L;

	
    @Override
    public void init(FilterConfig fc) throws ServletException {
    	System.out.println("\n>>>>>>> SE DESPLIEGA EL FILTRO 1 ... " + hashCode() + "\n");
    	fc.getServletContext().setAttribute("listaIP", new HashSet<String>());
    }
	
	
    
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// EL FILTRO 1 SE ENCARGA SIMPLEMENTE DE CREAR LA COLECCIÓN DE IP's (SET - NO REPETIDOS).
		
		// PROPAGAR LA PETICIÓN ENTRANTE ("... puedes seguir ").
		
		System.out.println("\tFILTRO 1: " + request.getParameter("nombre") + " ... SOLICITA ENTRAR A LA DISCOTECA.\n");
		
		chain.doFilter(request, response);
		
	}


	
    @Override
    public void destroy() {        
        System.out.println(">>>>>>>>>>>>>> SE DESTRUYE EL FILTRO 1");    
    }	
	
}


/*

FILTRO 1: MANUEL ... SOLICITA ENTRAR A LA DISCOTECA.


FILTRO 2: IP DETECTADA: 127.0.0.1 ---> NOMBRE: MANUEL

FILTRO 2: IPs ACTUALMENTE EN LA LISTA: 
	[]

FILTRO 2: OK, EL USUARIO MANUEL PUEDE ENTRAR.

---> EN EL SERVLET ... DiscotecaServlet

FILTRO 1: MANUEL ... SOLICITA ENTRAR A LA DISCOTECA.


FILTRO 2: IP DETECTADA: 127.0.0.1 ---> NOMBRE: MANUEL

FILTRO 2: IPs ACTUALMENTE EN LA LISTA: 
	[127.0.0.1]

FILTRO 2: UPPPS, EL USUARIO MANUEL NO PUEDE ENTRAR.
FILTRO 1: ANA ... SOLICITA ENTRAR A LA DISCOTECA.


FILTRO 2: IP DETECTADA: 127.0.0.1 ---> NOMBRE: ANA

FILTRO 2: IPs ACTUALMENTE EN LA LISTA: 
	[127.0.0.1]

FILTRO 2: UPPPS, EL USUARIO ANA NO PUEDE ENTRAR.
FILTRO 1: JESUS MARIA ... SOLICITA ENTRAR A LA DISCOTECA.


FILTRO 2: IP DETECTADA: 0:0:0:0:0:0:0:1 ---> NOMBRE: JESUS MARIA

FILTRO 2: IPs ACTUALMENTE EN LA LISTA: 
	[127.0.0.1]

FILTRO 2: OK, EL USUARIO JESUS MARIA PUEDE ENTRAR.

---> EN EL SERVLET ... DiscotecaServlet

FILTRO 1: ANGEL ... SOLICITA ENTRAR A LA DISCOTECA.


FILTRO 2: IP DETECTADA: 0:0:0:0:0:0:0:1 ---> NOMBRE: ANGEL

FILTRO 2: IPs ACTUALMENTE EN LA LISTA: 
	[0:0:0:0:0:0:0:1, 127.0.0.1]

FILTRO 2: UPPPS, EL USUARIO ANGEL NO PUEDE ENTRAR.

*/