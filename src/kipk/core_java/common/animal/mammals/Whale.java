package kipk.core_java.common.animal.mammals;

public class Whale extends Mammal {
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	
	public Whale() {
		setType("whale");
	}
	
	
	//***********************Method Section****************************
	//Class Animal overrides
	@Override
	public void eat() {
		System.out.println(getType() + " gulping plankton");
	}
	
	@Override
	public void move() {
		System.out.println(getType() + " breaching out of the water");
	}
	
	@Override
	public void sleep() {
		System.out.println(getType() + " basks in the sun");
	}
}
