package rukshanu.core_java.common.animal.fish;

import java.util.concurrent.ThreadLocalRandom;

import rukshanu.core_java.common.animal.Animal;

public class Swordfish extends Fish {
	
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	
	public Swordfish() {
		setType("swordfish");
	}
	
	public Swordfish (int a) {
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


}

