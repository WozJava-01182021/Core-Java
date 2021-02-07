package kipk.core_java.common.animal.reptiles;

public class Crocodile extends Reptile {
	
	public Crocodile() {
		setType("crocodile");
		MAX_AGE = 100;
		MATURITY = 10;
		prey.add("frog");
		prey.add("fish");
		prey.add("rat");
		
	}

}
