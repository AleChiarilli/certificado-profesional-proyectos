package animales;

public class Animal {

	//DETALLES
	protected String nombre;
	
	protected Animal() {
		nombre = getClass().getSimpleName();
	}
	
	
	public String consultar() {
		return "AL ANIMAL DE TIPO: " + getClass().getSimpleName() + " ... "; 
	}
	
	
	//FACTORIA
	public final Animal solicitarAnimal() {
		
		final String fqn = getClass().getCanonicalName();
		
		Object objetoGenerado = null; 
		
		try {
			objetoGenerado = Class.forName(fqn).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (Animal)objetoGenerado;
		
	}
}
