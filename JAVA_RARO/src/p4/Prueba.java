package p4;

public class Prueba {

	public static void main(String[] args) {
		
		String[] bebidas = {"COCACOLA","WHISKY","VODKA","LEJIA"};
		
		
		String bebidaElegida = bebidas[ (int)(Math.random() * bebidas.length) ];
		
		
		System.out.println("VAS A BEBER ... " + bebidaElegida);
		
		
	}
	
}
