package rukshanu.core_java.common.animal.mammals;

public class Horse extends Mammal {
	
	public Horse() {
		setType("horse");
	}

//Class Animal overrides
		@Override
		public void eat() {
			System.out.println(getType() + " grazes on grass");
		}
		
		@Override
		public void move() {
			System.out.println(getType() + " gallops");
		}
		
		@Override
		public void sleep() {
			System.out.println(getType() + " lays on its side");
		}
}
