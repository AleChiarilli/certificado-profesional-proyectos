package casa;


public class Hija extends Madre {

	// POLIMORFICO:
	@Override
	public String hablar() {
		return "MI MADRE DICE ... " + super.hablar() + "\n\n" + 
					"... PERO YO CREO QUE HAY QUE DISFRUTAR DE LA JUVENTUD - ECLESIASTES";		
	}
	

	// NO POLIMÓRFICO == ESTÁTICO == NO SE PUEDE SOBRESCRIBIR:	
	// CUANDO EL MÉTODO ESTÁTICO EN LA MADRE ES TAMBIÉN FINAL, LA HIJA NO PODRÁ
	//	APORTAR SU PROPIA VERSIÓN DE DICHO MÉTODO.
	
	// @Override SIEMPRE FALLA PORQUE REALMENTE NO HAY SOBRESCRITURA ... LO ESTÁTICO
	// NO SE HEREDA.
	public static void comer() {
		System.out.println("LA HIJA DICE ... YO PREFIERO HAMBURGUESAS (FAST FOOD)");
	}
	
}
