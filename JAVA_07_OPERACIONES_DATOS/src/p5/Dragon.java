package p5;

public class Dragon extends Animal{

	@Override
	public String alimentarse() {
		return super.alimentarse() + "... VACAS";
	}
}
