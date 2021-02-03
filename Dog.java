package robertd.core_java.common.animal.domestic;

import java.util.concurrent.ThreadLocalRandom;

import robertd.core_java.common.animal.*;
import robertd.core_java.common.animal.mammals.Carnivora;

public class Dog extends Carnivora implements Pet {
	// *********************************VARIABLES SECTION***************************

	// Suppports Nameable interface
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	// Supports Domesticatable interface
	private String breed;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String b) {
		breed = b;
	}
	// *************************CONSTRUCTOR SECTION*********************************

	public Dog() {
		setType("dog");
		MAX_AGE = 16;
		MATURITY = 2;
		prey.add("table scraps");
		prey.add("Purina dog food");
		prey.add("grass");
		prey.add("a bone");
		prey.add("a dental chew");
	}
	
	public Dog(String n) {
		this();
		name = n;
	}
	// ****************************METHOD SECTION***********************************
	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
		boolean result = false;
		if (other instanceof Carnivora) {
			result = super.equals(other)
					&& name.equals(((Dog)other).name)
					&& breed.equals(((Dog)other).breed);
		}
		return result;		
	}
	
	@Override
	public int hashCode() {
		int code = super.hashCode();
		code ^= name.hashCode();
		code ^= breed.hashCode();		
		return code;
	}
	// Supports Pet interface
	@Override
	public boolean haslicense() {
		return true;
	}

	@Override
	public void befriendly() {
		String describe = name + " the " + breed;
		System.out.println(describe + " licks your face!");

	}

	// Overloading
	public Dog[] reproduce(int number) {
		Dog[] litter = new Dog[number];
		if (getSex() == Sex.MALE) {
			System.out.println("Male" + getType() + " looks for female " + getType());
			return null;
		}

		if (getAge() > MATURITY) {
			for (int i = 0; i < litter.length; i++) {
				Dog baby = new Dog();
				if (ThreadLocalRandom.current().nextBoolean()) {
					baby.setSex(Sex.MALE);
				}
				litter[i] = baby;
			}
		} else {
			
		}
		return litter;
	}
}