package rukshanu.core_java.common.animal.mammals;


public class Monkey extends Mammal {
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	
	public Monkey() {
		setType("monkey");
	}
	
	
	//***********************Method Section****************************
//Class Animal overrides
	@Override
	public void eat() {
		System.out.println(getType() + " snacking on bananas");
	}
	
	@Override
	public void move() {
		System.out.println(getType() + " swinging from vines");
	}
	
	@Override
	public void sleep() {
		System.out.println(getType() + " sleeping on a branch");
	}
}

