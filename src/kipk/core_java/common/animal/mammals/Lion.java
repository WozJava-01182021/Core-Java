package kipk.core_java.common.animal.mammals;

import java.util.concurrent.ThreadLocalRandom;

import kipk.core_java.common.animal.Sex;

public class Lion extends Carnivora {
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	
	{
		setType("lion");
		MAX_AGE = 14;
		MATURITY = 5;
		BIRTH_WEIGHT = 200;
		ADULT_FEMALE_MIN_WEIGHT = 250;
		ADULT_FEMALE_MAX_WEIGHT = 400;
		ADULT_MALE_MIN_WEIGHT = 330;
		ADULT_MALE_MAX_WEIGHT = 550;
		setMaxRunningSpeed(50);
		prey.add("gazelle");
		prey.add("wildebeast");
		prey.add("impala");
		prey.add("monkey");
		prey.add("gnu");
		prey.add("baboon");
	}
	
	
	public Lion() { }
	
	public Lion(int age, int weight, Sex sex) {
		setAge(age);
		setWeight(weight);
		setSex(sex);
	}
	
	
	//***********************Method Section****************************
//Class Animal overrides
	
	@Override
	public void move() {
		System.out.println(getType() + " stalking through the grass");
	}
	
	@Override
	public void sleep() {
		System.out.println(getType() + " dozzing on a rock");
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
}
