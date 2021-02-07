package kipk.core_java.common.animal.mammals;

public class Gazelle extends Mammal {

	public Gazelle() {
		setType("gazelle");
		MAX_AGE = 15;
		MATURITY = 2;
		BIRTH_WEIGHT = 5;
		ADULT_FEMALE_MIN_WEIGHT = 33;
		ADULT_FEMALE_MAX_WEIGHT = 55;
		ADULT_MALE_MIN_WEIGHT = 44;
		ADULT_MALE_MAX_WEIGHT = 77;
		setMaxRunningSpeed(50);
	}
	
	@Override
	public void move() {
		System.out.println(getType() + " stalking through the grass");
	}

}
