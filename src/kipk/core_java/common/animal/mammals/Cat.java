package kipk.core_java.common.animal.mammals;

import kipk.core_java.common.animal.Pet;

public class Cat extends Carnivora implements Pet {
	// Supports Nameable interface
	private String name;
	public String getName() { return name; }
	public void setName(String n) { name = n; }
	
	//Supports Domesticatable interface
	private String breed = "";
	public String getBreed() { return breed; }
	public void setBreed(String b) { breed = b; }
	
	
	//====================Constructors and Intialization Blocks Section========================
	
	public Cat() {
		setType("cat");
		MAX_AGE = 20;
		MATURITY = 2;
		prey.add("tree mouse");
		prey.add("kibble");
		prey.add("bird");
		prey.add("gecko");
		prey.add("rabbit");
	}
	
	
	//===================================Methods Section=======================================
	//Supports the Pet Interface
	@Override
	public boolean hasLicense() {
		return false;
	}
	@Override
	public void beFriendly() {
		String describe = name + " the " +breed;
		System.out.println(describe + " rubs against your leg.");
	}

}