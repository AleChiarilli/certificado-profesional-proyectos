package animales;

public class Pajaro extends Animal{

	@Override
	public String consultar() {
		return super.consultar() + " SE LE LIMPIAN LAS PLUMAS";
	}
	
}
