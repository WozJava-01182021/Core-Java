/*
* Project Requirements (Requirements Specification)
 * 1. Select an ecosystem to simulate.
 * 		1a. The Ecosystem must be unique with regard to other classmates
 * 		1b. The Ecosystem must be diverse enough to be able to create simulations
 * 		1c. Take notes about the ecosystem and how it works. Include weather considerations 
 * 			food availability, seasonality, etc.
 * 2. Identify at least 5 animals to simulate in your ecosystem
 * 		2a. The animals must be chosen with regard to their interactions with each other
 * 		2b. The animals must all be active at the same time (night vs day vs twilight)
 * 		2c. Take notes about how the animals behave with regard to their species, 
 * 			predators or prey and competition with other species for scarce resources
 * 3. Tdentify at least two simulations to create
 * 		3a. Each simulation must involve at least two species
 * 
 * Design Specification
 * 1.	Ecosystem
 * 		1a. EcosystemType must be unique in class.
 * 		1b. Your ecosystem may be given any name but must specify the unique EcosystemType
 * 		1c. Your ecosystem class must derive from this abstract class Ecosystem. 
 * 							The tech lead has sole responsibility for this class
 * 		1d.	Do not include a main() method. Your ecosystem must be called from outside the class
 * 2.	Animal
 * 		2a. The animal class must derive from the Animal class in our hierarchy
 * 		2b. EcosystemType must be specified in each class
 * 		2c. Age related behaviors must be created for eating, moving and sleeping
 * 
 * 		
 */

package kipk.core_java.common.ecosystem;

import java.util.ArrayList;
import java.util.List;

import kipk.core_java.common.animal.Animal;

public abstract class Ecosystem {
/* ************************ VARIABLES, GETTERS AND SETTERS SECTION ********************************
 * Variables with getters and setters
 * Static variables first, others organized by state
 */
	private EcosystemType ecosystemType = EcosystemType.UNKNOWN;
	public void setEcosystem(EcosystemType est) { ecosystemType = est; }
	public EcosystemType getEcosystem() { return ecosystemType; }

	protected List<Animal> nearbyAnimals = new ArrayList<>();
	public List<Animal> getnearbyAnimals() { return new ArrayList<Animal>(nearbyAnimals); }

/* ********************* CONSTRUCTORS AND INITIALZATION BLOCKS SECTION ****************************
 * Constructors and initialization blocks
 * static initialization blocks first, regular initialization blocks second
 * No argument constructor third, other constructors next
 */

	
/* ******************************* METHODS SECTION ************************************************
 * Methods other than getters and setters section
 * These should be organized by parent classes, overrides first
 */
	public abstract void listPopulation();
	public abstract void findNearbyAnimals();
}
