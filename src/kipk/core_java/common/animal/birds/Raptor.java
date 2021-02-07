package kipk.core_java.common.animal.birds;

import java.util.ArrayList;
import java.util.List;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.Carnivore;

public abstract class Raptor extends Bird implements Carnivore {
	protected List<String> prey = new ArrayList<>();
	
	protected String preyFound = null;
	protected String preyCaught = null;
	
	public Raptor() {
		
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
