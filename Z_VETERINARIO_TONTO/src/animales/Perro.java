package animales;

public class Perro extends Animal{

	@Override
	public String consultar() {
		return super.consultar() + " SE LE BAÑA";
	}
	
}
