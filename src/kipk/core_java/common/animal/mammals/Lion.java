package kipk.core_java.common.animal.mammals;

import java.util.concurrent.ThreadLocalRandom;

public class Lion extends Mammal {
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	
	public Lion() {
		setType("lion");
	}
	public Lion (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
	
	
	//***********************Method Section****************************
//Class Animal overrides
	@Override
	public void eat() {
		System.out.println(getType() + " gnawing on meat");
	}
	
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
