package animales;

public class Iguana extends Animal{

	@Override
	public String consultar() {
		return super.consultar() + " SE LE LIMPIAN LAS ESCAMAS";
	}
	
}
