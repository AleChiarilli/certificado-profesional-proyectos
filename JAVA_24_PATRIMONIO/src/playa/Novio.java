package playa;


import interfaces.InterfazCasamiento;


public class Novio implements InterfazCasamiento {
	
	private static final int NIVEL_INTERES;
	
	
	
	static {
		NIVEL_INTERES = 500000;
	}

	
	/////////////////////////////////////////////////
	
	/*
	private static final String meCasoSiNo(int patrimonio) {
		return ( patrimonio >= NIVEL_INTERES ? "ME CASO" : "VAMOS A PENSARLO UN POCO MAS !!" );
	}

	
	// ESTE MÉTODO ES EL QUE REALMENTE VERÁ LA HIJA.
	public String quieresCasarte(Hija hija) {
		return  meCasoSiNo(hija.hacerLaRosca());
	}
	*/
	
	/////////////////////////////////////////////////
	

	public String quieresCasarte(Hija hija) {
		return ( hija.hacerLaRosca() >= NIVEL_INTERES ? "ME CASO" : "VAMOS A PENSARLO UN POCO MAS !!" );
	}
	
	
	
	public static void main(String[] args) {

		Hija hija = new Hija();
		
		//System.out.println(hija.calcularPatrimonio());
		
		int patrimonioHija = hija.hacerLaRosca();
		
		System.out.println("¿CUANTO TIENE? ... " + patrimonioHija + "\n");
		
		//System.out.println(meCasoSiNo(patrimonioHija));
		
		System.out.println(new Novio().quieresCasarte(hija));
		
	}
	
}
