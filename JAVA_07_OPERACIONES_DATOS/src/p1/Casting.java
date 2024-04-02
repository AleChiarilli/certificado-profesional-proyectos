package p1;

public class Casting {
	
	public static void main(String[] args) {
		
	byte dineroByte = 127;
	
	//dinero = dinero +10;
	//dineroByte += 10;
	
	System.out.println("DINERO = " + dineroByte);
	//así saldrá -119 en la consola, por un error,
	//ya que BYTE siempre trabajará entre -127 A 127

	
	int dineroInt = dineroByte + 10; //aquí se ha autopromocionado a Int
	System.out.println("DINERO = " + dineroInt);
	
	}
}
