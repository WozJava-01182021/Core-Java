/* Interfaces are like 100% abstract classes and are a contract:
 *    A Java Interface can contain only method declarations and public static
 *    final constants and doesn't contain their implementation. The classes
 *    which implement the Interface must provide the method definition for all
 *    the methods present.
 *
 * An interface is also used in situations when a class needs to extend more
 *    than one class. In java its not possible to have multiple inheritance of
 *    classes. An interface can be used when it is required to implement more
 *    than one interfaces.
 *
 * Interface Rules
 *	1. Interface methods are implicitly public and abstract (Java 8: unless declared default or static)
 *	2. All variables defined in an interface must be public, static and final (constants)
 *	3. Interface methods cannot be final, strictfp or native
 *	4. An interface can extend one or more other interfaces
 *	5. An interface cannot extend anything but another interface
 *	6. An interface cannot implement anything (interface or class)
 *	7. An interface must be declared with the keyword interface
 *	8. Interface types can be used polymorphically
 */
package kipk.core_java.lesson02;

import kipk.core_java.common.animal.domestic.Cat;
import kipk.core_java.common.animal.domestic.Dog;
import kipk.core_java.common.animal.domestic.Horse;
import kipk.core_java.common.animal.mammals.Lion;

public class Interfaces {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork");
		testPetInterface();
		testCarnivoreInterface();
		// Student Exercise: Make Fish implement Carnivore and test it in a method in this class
		testFishClass();
		
		System.out.println("===================================================================================================\n\n");
	}
	
	private void testPetInterface() {
		System.out.println("1. Test the Pet interface");
		
		Dog aDog = new Dog();
		System.out.println(aDog);
		aDog.setName("Lassie");
		aDog.setBreed("collie");
		aDog.beFriendly();
		
		Cat aCat = new Cat();
		System.out.println(aCat);
		aCat.setName("Morris");
		aCat.setBreed("tabby");
		aCat.beFriendly();
		
		Horse aHorse = new Horse();
		System.out.println(aHorse);
		aHorse.setName("Shadowfax");
		aHorse.setBreed("rohan");
		
	}
	
	private void testCarnivoreInterface() {
		System.out.println("Test the Carnivore interface");
		Lion simba = new Lion();
		simba.hunt();
		
		Dog abe = new Dog();
		abe.setName("Abe");
		abe.hunt();
		
		Cat ditto = new Cat();
		ditto.setName("Ditto");
		ditto.hunt();
	}
	private void testFishClass() {
		System.out.println("Test the Fish Class");
		
	}
	

}
