package kipk.core_java.common.animal.mammals;

import java.util.ArrayList;
import java.util.List;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.Carnivore;


/**
 * An animal of taxonic order Carnivora. They have sharp teeth and claws
 * for killing prey
 * Subclass of mammal
 * @author jacob
 *
 */
public abstract class Carnivora extends Mammal implements Carnivore {
//**************************Variables Section***************************	
	
	protected List<String> prey = new ArrayList<>();
	
	protected String preyFound = null;
	protected String preyCaught = null;
	
	
	
//**************************Constructor Section***************************	
	public Carnivora () {
		setType("unknown carnivore");
	}
	

//**************************Method Section***************************		
	
	//Animal Overrides
	@Override
	public void eat() {
		if (preyCaught == null || preyCaught.isEmpty()) {
			System.out.println(getType() + " has nothing to eat.");
		}else {
			System.out.println(getType() + " eats a " + preyCaught);
			preyCaught = null;
		}
	}
	
	//Support Carnivore interface
	@Override
	public void hunt() {
		findPrey();
		catchPrey(null);
		eat();

	}

	@Override
	public String findPrey() {
		if (preyFound == null) {
			int x = (int)(Math.random() * prey.size());
			preyFound = prey.get(x);
		}
		return preyFound;
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
