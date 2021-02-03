package robertd.core_java.common.animal;

public class Emu extends Animal {
	// *********************************VARIABLES SECTION***************************
/*
 *  Variables with getters and setters
 *  Static variables first, others organized by state
 *  
 */
	
	// *************************CONSTRUCTOR SECTION*********************************
/*
 *  Constructors and initialization blocks
 *  static initialization blocks first, regular initialization blocks second
 *  No argument constructor third, other constructors next
 *  
 */
	
	{ // Initialization block runs after the call to super()
		MATURITY = 2;
		MAX_AGE = 5;
		BIRTH_WEIGHT = 1;
		ADULT_FEMALE_MIN_WEIGHT = 10;
		ADULT_FEMALE_MAX_WEIGHT = 15;
		ADULT_MALE_MIN_WEIGHT = 12;
		ADULT_MALE_MAX_WEIGHT = 18;
		
	}
	
	// Constructors
	public Emu() {
		setType("animal type set here");
	}
	
	// ****************************METHOD SECTION***********************************

	/* 
	 * Object method overrides
	 * Animal method overrides
	 * Mammal, Bird, Fish or Reptile method overrides
	 * Support interface
	 */
}