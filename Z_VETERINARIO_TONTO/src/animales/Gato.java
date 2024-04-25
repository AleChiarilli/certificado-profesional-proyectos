package animales;

public class Gato extends Animal{

	@Override
	public String consultar() {
		return super.consultar() + " SE LE PEINA";
	}
	
}
