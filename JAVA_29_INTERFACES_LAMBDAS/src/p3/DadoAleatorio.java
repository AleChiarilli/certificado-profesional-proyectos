package p3;

public class DadoAleatorio {

	public static void main(String[] args) {
		
		//ÉSTO NO SE PUEDE
		// InterfazDado dado = new InterfazDado();
		
		
		
		//RELLENARLA CON UNA CLASE INTERNA ANONIMA Y DE LA QUE SE GENERARÁ
		//AUTOMATICAMENTE UN OBJETO SOBRE ÉL, INVOCAREMOS EL MÉTODO.

		
		Dado dado = new Dado() {
								@Override
								public int jugar() {
									return 0;
								}
							};
	}
	
}
