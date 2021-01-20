package kipk.core_java.common.animal.fish;

import java.util.concurrent.ThreadLocalRandom;

public class Swordfish extends Fish {
	
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	
	public Swordfish() {
		System.out.println("In Swordfish no-arg constructor");
		setType("swordfish");

	}
	
	public Swordfish (int a) {
		this();
		System.out.println("In Swordfish int constructor");
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


}
