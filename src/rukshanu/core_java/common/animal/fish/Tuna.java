package rukshanu.core_java.common.animal.fish;


public class Tuna extends Fish {

	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************
	
	public Tuna() {
		setType("tuna");
	}
	
	
	//***********************Method Section****************************
	//Class Animal overrides
		@Override
		public void eat() {
			System.out.println(getType() + " eating a squid");
		}
		
}
