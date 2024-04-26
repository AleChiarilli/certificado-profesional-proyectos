package veterinario;

import animales.Animal;
import manejadores.InterfazConsulta;

public class veterinarioListo implements InterfazConsulta {

	@Override
	public String consultar(Animal animal) {
		return animal.consultar();
	}
	
	
}
