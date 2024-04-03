package p5;

public class Pajaro extends Animal {
	
	@Override
	public String alimentarse() {
		return super.alimentarse() + "... ALPISTE";
	}
}
