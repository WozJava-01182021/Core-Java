package robertd.core_java.common.animal.domestic;

import robertd.core_java.common.animal.*;
import robertd.core_java.common.animal.mammals.Carnivora;

public class Cat extends Carnivora implements Pet {
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

	public Cat() {
		setType("cat");
		MAX_AGE = 20;
		MATURITY = 2;
		prey.add("mouse");
		prey.add("dead bird");
		prey.add("Purina cat food");
		prey.add("kibbles");

	}

	// Supports Pet interface
	@Override
	public boolean haslicense() {
		return false;
	}

	@Override
	public void befriendly() {
		System.out.println(name + " rubs against your leg!");

	}
}