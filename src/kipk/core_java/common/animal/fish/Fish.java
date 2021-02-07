package kipk.core_java.common.animal.fish;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.Carnivore;

public abstract class Fish extends Animal implements Carnivore{
	//***********************Variables Section*************************
	//***********************Constructor Section***********************
	
	public Fish () {
//		System.out.println("In Fish No Arg Constructor");
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
