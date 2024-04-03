package p7;

public class Wrappers {
	public static void main(String[] args) {
		
		/*
		 
		 boolean	 ->		Boolean
		 
		 byte	 ->		Byte
		 short	 ->		Short
		 char	 ->		Character
		 
		 int	 ->		Integer
		 long	 ->		Long
		 
		 float	 ->		Float
		 double	 ->		Double
		 */
		
		Boolean wb1 = true;
		Boolean wb2 = Boolean.parseBoolean("true"); //true
		Boolean wb3 = Boolean.parseBoolean("TRUE"); //true
		Boolean wb4 = Boolean.parseBoolean("HOLA_MUNDO"); //false
		Boolean wb5 = Boolean.parseBoolean("1"); //false
		
		//System.out.println(wb5);
		
		
		Integer wrapper22 = 129;
		
		byte b = wrapper22.byteValue();
		
		double d = wrapper22.doubleValue();
		System.out.println(b);
		System.out.println(d);
		
		
		//EL COMPILADOR DICE QUE NO A LA AUTO-PROMOCION + AUTOBOXING AL MISMO TIEMPO
		
		// Long largo = 5;		// de int a Long (porque 5 lo entiende como un Int)
								// y luego de long a Long (wrapper)
		
							
								//AUTOPROMOCIÓN int -> long
								//AUTOBOXING long -> Long(wrapper)
		
		
		
		
		
		
		
	}
}
