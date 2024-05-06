package p0;


public class Operario {

	public static void main(String[] args) {
		
		// USAR LA CLASE DIRECTAMENTE CON UNA REFERENCIA DE SU PROPIO TIPO:
		Grua grua1 = new Grua();
		grua1.coger();
		grua1.soltar();
		

		// USAR LA CLASE A TRAVÉS DE SU INTERFAZ DE NEGOCIO:
		InterfazGrua grua2 = new Grua();
		grua2.coger();
		grua2.soltar();
		
		
		// USANDO SPRING CORE (IeC_Sp):
		// InterfazGrua grua3 = FactoriaSpring.getBean(InterfazGrua.class);
		// grua3.coger();
		// grua3.soltar();
		
	}
	
}
