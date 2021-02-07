package kipk.core_java.common.animal.birds;

import kipk.core_java.common.animal.Carnivore;

public class Hawk extends Raptor implements Carnivore{

	public Hawk() {
		setType("Hawk");
		MAX_AGE = 12;
		MATURITY = 2;
		prey.add("mouse");
		prey.add("squirrel");
		prey.add("turtle");
	}

}
