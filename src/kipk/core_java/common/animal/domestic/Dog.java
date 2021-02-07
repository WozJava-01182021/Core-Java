package kipk.core_java.common.animal.domestic;

import java.util.concurrent.ThreadLocalRandom;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.Pet;
import kipk.core_java.common.animal.Sex;
import kipk.core_java.common.animal.mammals.Carnivora;

public class Dog extends Carnivora implements Pet {
	// Supports Nameable interface
	private String name;
	public String getName() { return name; }
	public void setName(String n) { name = n; }
	
	//Supports Domesticatable interface
	private String breed = "";
	public String getBreed() { return breed; }
	public void setBreed(String b) { breed = b; }
	
	
	//====================Constructors and Intialization Blocks Section========================
	
	public Dog() {
		setType("dog");
		MAX_AGE = 16;
		MATURITY = 2;
		prey.add("table scraps");
		prey.add("bone");
		prey.add("dog food");
		prey.add("grass from the lawn.");
		prey.add("dog treat");
		
		
	}
	public Dog(String newName) {
		//set name to 
		name = newName;
	}
	
	
	//===================================Methods Section=======================================
	//Supports the Pet Interface
	@Override
	public boolean hasLicense() {
		return true;
	}
	@Override
	public void beFriendly() {
		String describe = name + " the " +breed;
		System.out.println(describe + " licks your face");
	}
	
	//OVERLOADING
	public Dog[] reproduce(int number) {
		Dog[] litter = new Dog[number];
		if (getSex() == Sex.MALE) {
			System.out.println("Male" + getType() + "looks for female" + getType());
			return null;
		}
		
		if (getAge() > MATURITY) {
			for (int i=0; i<litter.length; i++) {
				Dog baby = new Dog();
				if (ThreadLocalRandom.current().nextBoolean()) {
					baby.setSex(Sex.MALE);
				}
				litter[i] = baby;
			}
		} else {
			return null;
		}
		return litter;
	}

}
