package p4;


@FunctionalInterface
public interface InterfazMaquinaPremio {

	public String probarSuerte();
	
	public static void metodo2() {}
	
	public default void metodo3() {}
	
}
