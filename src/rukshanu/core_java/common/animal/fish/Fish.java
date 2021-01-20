package rukshanu.core_java.common.animal.fish;

import rukshanu.core_java.common.animal.Animal;

public abstract class Fish extends Animal {
	//***********************Variables Section*************************
	//***********************Constructor Section***********************
	
	public Fish() {
		setType("unkown fish");
	}
	
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