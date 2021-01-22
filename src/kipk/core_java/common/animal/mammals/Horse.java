package kipk.core_java.common.animal.mammals;

import kipk.core_java.common.animal.Domesticatable;

public class Horse extends Mammal implements Domesticatable {
	
	private String name;
	public String getName() { return name; }
	public void setName(String n) { name = n; }
	
	//Supports Domesticatable interface
	private String breed;
	public String getBreed() { return breed; }
	public void setBreed(String b) { breed = b; }
	
	public Horse() {
		setType("horse");
		MAX_AGE = 30;
		MATURITY = 12;
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
