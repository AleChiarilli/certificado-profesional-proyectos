package p1;


public class Hija extends Madre {

	public static void comer() {
		
		System.out.println("MI MADRE DICE:");
		
		// EN UN CONTEXTO ESTÁTICO NO PUEDES USAR super NI this PORQUE SE REFIEREN
		//	A UNA INSTANCIA Y ESTAMOS EN LA CLASE (objeto fantasma).
		//super.comer();	
		
		// PUEDO GENERAR UNA INSTANCIA DE LA MADRE Y SOBRE ELLA LLAMAR A SU MÉTODO comer.
		//new Madre().comer();
		
		// ... PERO, NO OLVIDEMOS QUE DICHO MÉTODO ES ESTÁTICO Y POR TANTO NO NECESITA
		//		DE NINGUNA INSTANCIA, LUEGO INVÓCALO SOBRE LA PROPIA CLASE MADRE.
		
		Madre.comer();
		
		System.out.println("PERO YO (LA HIJA) DIGO ... COME HAMBURGUESAS");
		
	}
	
	
	
	public void dormir() {
		System.out.println("NO DUERMO CUANDO ESTOY DE FIESTA");
	}
	
	
	
	////////////////////////////////////////////////////////////
	
	@Override
	public String ahorrar() {
		
		return 
			new Madre().ahorrar() +	
				super.ahorrar() +
					" ... HAY QUE VIVIR LA VIDA Y DIVERTIRSE";
	
	}
	
}
