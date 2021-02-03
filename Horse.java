package robertd.core_java.common.animal.domestic;

import java.util.concurrent.ThreadLocalRandom;

import robertd.core_java.common.Nameable;
import robertd.core_java.common.animal.Domesticatable;
import robertd.core_java.common.animal.mammals.Mammal;


public class Horse extends Mammal implements Nameable, Domesticatable {
	//*********************************VARIABLES SECTION***************************	
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
	//*************************CONSTRUCTOR SECTION*********************************
	
	public Horse() {
		setType("horse");
		MAX_AGE = 30;
		MATURITY = 6;
	}
	public Horse (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
	//****************************METHOD SECTION***********************************	
	@Override
	public void eat() {
		System.out.println(getType() + " chomping grass");
	}
@Override
public void move() {
	System.out.println(getType() + " galavanting gracefully");
	
}
@Override
public void sleep() {
	System.out.println(getType() + " sleeping on its feet");
}

protected int setRandomWeightByAge(int a) {
	int result;
	if (a < 5) {
		result = a + 1;
	} else {
		result = ThreadLocalRandom.current().nextInt(5, 20);
	}
	return result;
}
}
