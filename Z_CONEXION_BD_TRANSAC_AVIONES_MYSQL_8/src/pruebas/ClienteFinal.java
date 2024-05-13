package pruebas;


import static catalogos.CatalogoAviones.PEGASUS;
import factorias.FactoriaFachadas;
import interfaces.InterfazCompras;


public class ClienteFinal {

	public static void main(String[] args) {
		
		InterfazCompras agenteCompras = FactoriaFachadas.obtenerFachada(InterfazCompras.class);

		
		// UNO A UNO, 4 PEDIDOS SUCESIVOS (los 3 primeros bien y falla en el 4º por falta de stock):		

		System.out.println("\n\n\n................ EFECTUAR COMPRAS ................\n");
		
		
		
		boolean[] operacionesCompra = new boolean[4];

		operacionesCompra[0] = agenteCompras.comprar("JURRACA AIR COMPANY", PEGASUS, 1);
		operacionesCompra[1] = agenteCompras.comprar("FLYING SAUCER Q&Q", PEGASUS, 1);
		operacionesCompra[2] = agenteCompras.comprar("SMAUG EL DESOLADOR", PEGASUS, 1);
		operacionesCompra[3] = agenteCompras.comprar("CAPITAN SEVILLA DINAMIC 88", PEGASUS, 1);		
		
		
		System.out.println("\n\n\n................ EVALUAR RESULTADOS ................\n");
		
		
		for (int i=0; i<operacionesCompra.length; i++) {
			System.out.println("COMPRA " + (i+1) + " ... " + operacionesCompra[i] + "\n");
		}

		

		
		
		/*
		
		// O BIEN 4 EN EL MISMO PEDIDO
		
		agenteCompras.comprar("JURRACA AIR COMPANY", PEGASUS, 4);
		
		// SE PRODUCE EL FALLO AL INTENTAR COMPRAR LA CUARTA UNIDAD YA QUE SÓLO HABÍA 3 EN STOCK.

		*/
		
		
		
		// ACTUALIZAR EL STOCK DIRECTAMENTE SOBRE LA BASE DE DATOS Y/O REALIZAR PRUEBAS
		//		CON EL RESTO DE MODELOS.
		
		System.out.println("\n\nTRABAJO FINALIZADO POR HOY");
		
	}
	
}

/*
 PARA REALIZAR NUEVAS PRUEBAS:
 
	1) ACTUALIZAR EL STOCK DE LA TABLA aviones A MANO ... 3 unidades para PEGASUS VBJ.
	
	2) EJECUTAR EN EL CLIENTE GRÁFICO DE LA BD (VACÍA LA TABLA Y RESETEA EL AUTOINCREMENTAL): 
			TRUNCATE cobros;

*/







/*

AVION_ID  MODELO       USO      IMPORTE_UNITARIO   STOCK  
--------  -----------  -------  ----------------  --------
       1  F14 TOMCAT   MILITAR            300000         1
       2  AIRBUS A380  CIVIL           400000000         2
       3  PEGASUS VBJ  PRIVADO           6000000         3

       
       
FACTURA_ID  EMPRESA_CLIENTE  MODELO  UNIDADES  IMPORTE_UNITARIO  IMPORTE_TOTAL  
----------  ---------------  ------  --------  ----------------  ---------------
       
       


>>>>> EJECUCIÓN DEL PROGRAMA - pruebas.ClienteFinal - método main.



................ EFECTUAR COMPRAS ................






>>> EL HILO main SOLICITA CONEXION.

SE CREA Y REGISTRA UNA NUEVA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@1807e3f6





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@1807e3f6

>>> PS_1 (CONSULTAR PRECIO AVION): 
	com.mysql.cj.jdbc.ClientPreparedStatement: SELECT IMPORTE_UNITARIO FROM aviones WHERE MODELO LIKE 'PEGASUS VBJ';

>>> PS_2 (ALTA EN COBROS - FACTURAR): 
	com.mysql.cj.jdbc.ClientPreparedStatement: INSERT INTO cobros (EMPRESA_CLIENTE, MODELO, UNIDADES, IMPORTE_UNITARIO, IMPORTE_TOTAL) VALUES ('JURRACA AIR COMPANY','PEGASUS VBJ',1,6000000,6000000);





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@1807e3f6

>>> PS_3 (REDUCIR STOCK PARA EL MODELO SOLICITADO): 
	com.mysql.cj.jdbc.ClientPreparedStatement: UPDATE aviones SET STOCK = STOCK - 1 WHERE MODELO LIKE 'PEGASUS VBJ';

	 !!! ENHORABUENA, EL PEDIDO SE HA REALIZADO CON EXITO !!! 

	 ---> CIERRE DE LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@1807e3f6






>>> EL HILO main SOLICITA CONEXION.

SE CREA Y REGISTRA UNA NUEVA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@3e78b6a5





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@3e78b6a5

>>> PS_1 (CONSULTAR PRECIO AVION): 
	com.mysql.cj.jdbc.ClientPreparedStatement: SELECT IMPORTE_UNITARIO FROM aviones WHERE MODELO LIKE 'PEGASUS VBJ';

>>> PS_2 (ALTA EN COBROS - FACTURAR): 
	com.mysql.cj.jdbc.ClientPreparedStatement: INSERT INTO cobros (EMPRESA_CLIENTE, MODELO, UNIDADES, IMPORTE_UNITARIO, IMPORTE_TOTAL) VALUES ('FLYING SAUCER Q&Q','PEGASUS VBJ',1,6000000,6000000);





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@3e78b6a5

>>> PS_3 (REDUCIR STOCK PARA EL MODELO SOLICITADO): 
	com.mysql.cj.jdbc.ClientPreparedStatement: UPDATE aviones SET STOCK = STOCK - 1 WHERE MODELO LIKE 'PEGASUS VBJ';

	 !!! ENHORABUENA, EL PEDIDO SE HA REALIZADO CON EXITO !!! 

	 ---> CIERRE DE LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@3e78b6a5






>>> EL HILO main SOLICITA CONEXION.

SE CREA Y REGISTRA UNA NUEVA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@64b0598





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@64b0598

>>> PS_1 (CONSULTAR PRECIO AVION): 
	com.mysql.cj.jdbc.ClientPreparedStatement: SELECT IMPORTE_UNITARIO FROM aviones WHERE MODELO LIKE 'PEGASUS VBJ';

>>> PS_2 (ALTA EN COBROS - FACTURAR): 
	com.mysql.cj.jdbc.ClientPreparedStatement: INSERT INTO cobros (EMPRESA_CLIENTE, MODELO, UNIDADES, IMPORTE_UNITARIO, IMPORTE_TOTAL) VALUES ('SMAUG EL DESOLADOR','PEGASUS VBJ',1,6000000,6000000);





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@64b0598

>>> PS_3 (REDUCIR STOCK PARA EL MODELO SOLICITADO): 
	com.mysql.cj.jdbc.ClientPreparedStatement: UPDATE aviones SET STOCK = STOCK - 1 WHERE MODELO LIKE 'PEGASUS VBJ';

	 !!! ENHORABUENA, EL PEDIDO SE HA REALIZADO CON EXITO !!! 

	 ---> CIERRE DE LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@64b0598






>>> EL HILO main SOLICITA CONEXION.

SE CREA Y REGISTRA UNA NUEVA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@50f6ac94





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@50f6ac94

>>> PS_1 (CONSULTAR PRECIO AVION): 
	com.mysql.cj.jdbc.ClientPreparedStatement: SELECT IMPORTE_UNITARIO FROM aviones WHERE MODELO LIKE 'PEGASUS VBJ';

>>> PS_2 (ALTA EN COBROS - FACTURAR): 
	com.mysql.cj.jdbc.ClientPreparedStatement: INSERT INTO cobros (EMPRESA_CLIENTE, MODELO, UNIDADES, IMPORTE_UNITARIO, IMPORTE_TOTAL) VALUES ('CAPITAN SEVILLA DINAMIC 88','PEGASUS VBJ',1,6000000,6000000);





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@50f6ac94

>>> PS_3 (REDUCIR STOCK PARA EL MODELO SOLICITADO): 
	com.mysql.cj.jdbc.ClientPreparedStatement: UPDATE aviones SET STOCK = STOCK - 1 WHERE MODELO LIKE 'PEGASUS VBJ';

	 --- LO SENTIMOS, PERO EL PEDIDO NO SE HA PODIDO REALIZAR POR FALTA DE STOCK --- 
	 --------- SE ANULA EL COBRO CORRESPONDIENTE A ESTE PEDIDO (ROLLBACK) ---------- 


	 ---> CIERRE DE LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@50f6ac94




................ EVALUAR RESULTADOS ................

COMPRA 1 ... true

COMPRA 2 ... true

COMPRA 3 ... true

COMPRA 4 ... false



TRABAJO FINALIZADO POR HOY
       
       
       
       
       
       
>>>>> FIN DE LA EJECUCIÓN DEL PROGRAMA.
       
       
       
AVION_ID  MODELO       USO      IMPORTE_UNITARIO   STOCK  
--------  -----------  -------  ----------------  --------
       1  F14 TOMCAT   MILITAR            300000         1
       2  AIRBUS A380  CIVIL           400000000         2
       3  PEGASUS VBJ  PRIVADO           6000000         0
       
       
       
FACTURA_ID  EMPRESA_CLIENTE      MODELO       UNIDADES  IMPORTE_UNITARIO  IMPORTE_TOTAL  
----------  -------------------  -----------  --------  ----------------  ---------------
       001  JURRACA AIR COMPANY  PEGASUS VBJ         1           6000000          6000000
       002  FLYING SAUCER Q&Q    PEGASUS VBJ         1           6000000          6000000
       003  SMAUG EL DESOLADOR   PEGASUS VBJ         1           6000000          6000000       





......................................................................................
......................................................................................
......................................................................................





SI SE DECIDE REALIZAR UN PEDIDO ÚNICO DE 4 UNIDADES == FALLARÁ YA QUE SÓLO HAY 3 DISPONIBLES:





................ EFECTUAR COMPRAS ................






>>> EL HILO main SOLICITA CONEXION.

SE CREA Y REGISTRA UNA NUEVA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@1807e3f6





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@1807e3f6

>>> PS_1 (CONSULTAR PRECIO AVION): 
	com.mysql.cj.jdbc.ClientPreparedStatement: SELECT IMPORTE_UNITARIO FROM aviones WHERE MODELO LIKE 'PEGASUS VBJ';

>>> PS_2 (ALTA EN COBROS - FACTURAR): 
	com.mysql.cj.jdbc.ClientPreparedStatement: INSERT INTO cobros (EMPRESA_CLIENTE, MODELO, UNIDADES, IMPORTE_UNITARIO, IMPORTE_TOTAL) VALUES ('JURRACA AIR COMPANY','PEGASUS VBJ',4,6000000,24000000);





>>> EL HILO main SOLICITA CONEXION.

SE REUTILIZA LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@1807e3f6

>>> PS_3 (REDUCIR STOCK PARA EL MODELO SOLICITADO): 
	com.mysql.cj.jdbc.ClientPreparedStatement: UPDATE aviones SET STOCK = STOCK - 4 WHERE MODELO LIKE 'PEGASUS VBJ';

	 --- LO SENTIMOS, PERO EL PEDIDO NO SE HA PODIDO REALIZAR POR FALTA DE STOCK --- 
	 --------- SE ANULA EL COBRO CORRESPONDIENTE A ESTE PEDIDO (ROLLBACK) ---------- 


	 ---> CIERRE DE LA CONEXION ... com.mysql.cj.jdbc.ConnectionImpl@1807e3f6



TRABAJO FINALIZADO POR HOY





*/