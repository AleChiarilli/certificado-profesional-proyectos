package gatos;


public abstract class Gato {

	protected String raza = getClass().getSimpleName(); 

	
	@Override
	public String toString() {
		return raza;
	}
}
