package p5;

public abstract class Animal {

		public String alimentarse() {
			return "EL " + getClass().getSimpleName().toUpperCase() + " COME";
		}

		@Override
		public String toString() {
			return getClass().getSimpleName().toUpperCase() + " : " + hashCode();
		}
		
		
		
		
}
