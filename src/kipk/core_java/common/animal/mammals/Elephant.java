package kipk.core_java.common.animal.mammals;

import java.util.concurrent.ThreadLocalRandom;

public class Elephant extends Mammal {
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	
	public Elephant() {
		setType("elephant");
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


}
