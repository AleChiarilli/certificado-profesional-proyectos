package p0;


public class A {

	public String saludar() {
		return "HOLA";
	}
	
}



class B extends A {

	public String saludar(String quien) {
		return "HOLA " + quien;
	}
	
	
	public String saludar(String quien, int veces) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=veces; i++) {
			sb.append(i + " -> HOLA " + quien + "\n");
		}
		
		return sb.toString();
	}
		
}