package gatos;


public abstract class Gato {

	protected String raza = getClass().getSimpleName(); 

	
	//hashCode
	@Override
	public int hashCode() {
		return raza.hashCode();
	}
	
	//equals
	public boolean equals(Object object) {
		if (getClass() != object.getClass()) {
			return false;
		}
		Gato otroGato = (Gato)object;
		
		return raza.equals(otroGato.raza);
	}
	
	
	@Override
	public String toString() {
		return raza;
	}
}
