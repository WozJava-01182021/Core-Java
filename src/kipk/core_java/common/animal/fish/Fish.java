package kipk.core_java.common.animal.fish;

import kipk.core_java.common.animal.Animal;

public abstract class Fish extends Animal {
	//***********************Variables Section*************************
	//***********************Constructor Section***********************
	//***********************Method Section****************************

	@Override
	public void move() {
		System.out.println(getType() + " swimming with the current");
	}
	
	@Override
	public void sleep() {
		System.out.println(getType() + " goes into a torpor");
	}	
	
}
