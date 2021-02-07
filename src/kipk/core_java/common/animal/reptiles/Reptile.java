package kipk.core_java.common.animal.reptiles;

import java.util.ArrayList;
import java.util.List;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.Carnivore;

public abstract class Reptile extends Animal implements Carnivore{
	protected List<String> prey = new ArrayList<>();
	
	protected String preyFound = null;
	protected String preyCaught = null;

	public Reptile() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void hunt() {
		
	}
	
	@Override
	public String findPrey() {
		return null;
	}
	@Override
	public boolean catchPrey(Animal target) {
		if (preyFound  == null || preyFound.isEmpty()) {
			System.out.println(getType() + " has not found food yet!");
			return false;
		} else {
			double probability = Math.random();
			if (probability > .5) {
				preyCaught = preyFound;
				return true;
			}
			return false;
		}
	}

}
