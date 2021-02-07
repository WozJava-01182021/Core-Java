package kipk.core_java.common.animal.fish;

import kipk.core_java.common.animal.Animal;

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


		@Override
		public void hunt() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public String findPrey() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public boolean catchPrey(Animal target) {
			// TODO Auto-generated method stub
			return false;
		}
		
}
