package veterinario;

import animales.Gato;
import animales.Iguana;
import animales.Pajaro;
import animales.Perro;

public class veterinarioSubnormal {

	//SOBRECARGA INEFICIENTE DEL METODO. ES MEJOR USAR EL SUPERTIPO O ABSTRACCION
	public String consultarGato(Gato gato) {
		return gato.consultar();
	}
	
	public String consultarIguana(Iguana iguana) {
		return iguana.consultar();
	}
	
	public String consultarPerro(Perro perro) {
		return perro.consultar();
	}
	
	public String consultarPajaro(Pajaro pajaro) {
		return pajaro.consultar();
	}
	
}
