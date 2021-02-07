package kipk.core_java.common.animal.fish;

import java.util.concurrent.ThreadLocalRandom;

import kipk.core_java.common.animal.Animal;

public class Swordfish extends Fish {
	
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	
	{
//		System.out.println("In Swordfish initialization block");
		setType("swordfish");
		MAX_AGE = 16;
		MATURITY = 5;
		
	}
	
	public Swordfish() {
//		System.out.println("In Swordfish no-arg constructor");
		

	}
	
	public Swordfish (int a) {
		this();
//		System.out.println("In Swordfish int constructor");
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
	
	
	//***********************Method Section****************************
//Class Animal overrides
	@Override
	public void eat() {
		System.out.println(getType() + " pierces its prey");
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

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String findPrey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean catchPrey(Animal target) {
		// TODO Auto-generated method stub
		return false;
	}


}
