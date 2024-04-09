package casa_hija_mayor;


import casa_madre.Madre;


public class IntrusoMayor {

	public static void main(String[] args) {
		
		// NO PUEDE POR LO MISMO QUE LA HIJA MAYOR:
		/*
		System.out.println("DINERO MADRE ---> " +
								new Madre().dinero);
		*/
		
		// ESTA TAMPOCO PORQUE EL PAQUETE DE DEFINICIÓN Y USO NO COINCIDEN ..
		//	POR ESO SE DICE QUE PROTECTED ES UN PRIVADO QUE SE HEREDA, O LO 
		//	QUE ES LO MISMO, LO PUEDE USAR LA HIJA POR ELLA MISMA PERO NO EL
		//	RESTO DE CLASES DE SU MISMO PAQUETE.
		
		/*
		System.out.println("DINERO MADRE EN HIJA MENOR ---> " +
											new HijaMayor().dinero);
		*/
		
		
		System.out.println("INTRUSO MAYOR ---> " + new HijaMayor().entregarDinero());
		
	}
	
}