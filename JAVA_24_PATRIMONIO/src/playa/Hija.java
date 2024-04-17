package playa;


import ciudad.Madre;


public final class Hija extends Madre {

	private final static int PRECIO_TIERRAS 	= 150000;
	private final static int PRECIO_CHALET 		= 300000;
	private final static int PRECIO_APARTAMENTO = 180000;
	
	
	private int apartamento;

	
	public Hija() {
		super(PRECIO_TIERRAS, PRECIO_CHALET);
		apartamento = PRECIO_APARTAMENTO;
	}
	
	
	private int calcularPatrimonio() {		
		return tierras + chalet + apartamento;		
	}
	
	
	// MÉTODO PUENTE QUE PERMITE EL ACCESO AL MÉTODO PRIVADO calcularPatrimonio.
	public int hacerLaRosca() {
		return calcularPatrimonio();
	}
	
	
	
	
	public static void main(String[] args) {		
		
		Hija hija = new Hija();
		
		System.out.println("PATRIMONIO DE HIJA ... " + 
										hija.calcularPatrimonio() + "\n\n");
		
		
		Novio novio = new Novio();
		
		String respuestaSiNo = novio.quieresCasarte(hija);
		
		System.out.println("LA HIJA PREGUNTA: ¿QUIERES CASARTE? ... " + "\n\t" +
								"EL NOVIO RESPONDE: " + respuestaSiNo);
		
	}
	
}
