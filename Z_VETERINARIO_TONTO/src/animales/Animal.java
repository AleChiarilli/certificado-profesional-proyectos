package animales;

public abstract class Animal {

	public String consultar() {
		return "AL ANIMAL DE TIPO: " + getClass().getSimpleName() + " ... "; 
	}
	
}
