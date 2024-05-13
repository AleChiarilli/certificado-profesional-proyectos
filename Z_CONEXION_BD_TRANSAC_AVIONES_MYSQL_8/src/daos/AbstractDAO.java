package daos;


public abstract class AbstractDAO {
	
	@Override
	public String toString() {
		
		return 	"\n\n\t" + 
				">>> TIPO: " + getClass().getCanonicalName() + "\n" +
				">>> HASH: " + hashCode() + 
				"\n\n";

	}
	
}