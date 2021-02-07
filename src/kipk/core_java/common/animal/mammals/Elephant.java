package kipk.core_java.common.animal.mammals;

import java.util.concurrent.ThreadLocalRandom;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.Sex;

public class Elephant extends Mammal {
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	

	
	public Elephant() {
		setType("elephant");
		MAX_AGE = 70;
		MATURITY = 15;
		BIRTH_WEIGHT = 200;
		ADULT_FEMALE_MIN_WEIGHT = 5300;
		ADULT_FEMALE_MAX_WEIGHT = 7700;
		ADULT_MALE_MIN_WEIGHT = 8800;
		ADULT_MALE_MAX_WEIGHT = 13900;
		setMaxRunningSpeed(20);
	}
	
	public Elephant (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
	
	
	//***********************Method Section****************************
//Class Animal overrides
	@Override
	public void eat() {
		System.out.println(getType() + " chomping tree branches");
	}
	
	@Override
	public void move() {
		System.out.println(getType() + " shuffling ponderously");
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
			result = ThreadLocalRandom.current().nextInt(5,20);
		}
		return result;
	}
	
	//Elephant return type is a covariant return
	public Elephant reproduce() {
		if (getSex() == Sex.MALE) {
			System.out.println("Male " + getType() + " looks for female" + getType());
			return null;
		}
		
		if (getAge() > MATURITY) {
			Elephant baby = new Elephant();
			if (ThreadLocalRandom.current().nextBoolean()) {
				baby.setSex(Sex.MALE);
			}
			return baby;
		} else {
			System.out.println("Female " + getType() + " is not old enough.");
			return null;
		}
	}


}
