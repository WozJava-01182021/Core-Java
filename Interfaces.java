/*
 * Interfaces are like 100% abstract classes and are a contract:
 * 		A Java Interface can contain only method declarations and public static
 * final constants and doesn't contain their implementation. The classes
 * which implement the Interface must provide the method definition for all the methods present.
 *
 * An interface is also used in situation when a class needs to extend more
 * than one class. In java its not possible to have multiple inheritance of
 * classes. An interface can be used when it is required to implement more than one interfaces.
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
package robertd.core_java.lesson02;

import robertd.core_java.common.animal.domestic.Cat;
import robertd.core_java.common.animal.domestic.Dog;
import robertd.core_java.common.animal.domestic.Horse;
import robertd.core_java.common.animal.mammals.Lion;

public class Interfaces {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		testPetInterface();
		testCarnivoreInterface();
		// Student Exercise: Make Fish Implement Carnivora and test it in a method in
		// this class
		System.out.println("---------------------------------------------------------------------\n\n");
	}

	private void testCarnivoreInterface() {
		System.out.println("2. Test the Carnivore Interface");
		Lion mufasa = new Lion();
		mufasa.hunt();

		Dog bubbles = new Dog();
		bubbles.setName("Bubbles");
		bubbles.hunt();

		Cat elsa = new Cat();
		elsa.setName("Elsa");
		elsa.hunt();
	}

	private void testPetInterface() {
		System.out.println("1. Test the Pet Interface");

		Dog aDog = new Dog();
		System.out.println(aDog);
		System.out.println("Name: " + aDog.getName() + ", Breed: " + aDog.getBreed());
		aDog.setName("Lassie");
		System.out.println("Name: " + aDog.getName() + ", Breed: " + aDog.getBreed());
		aDog.setBreed("Collie");
		aDog.befriendly();
		System.out.println();

		Cat aCat = new Cat();
		System.out.println(aCat);
		System.out.println("Name: " + aCat.getName() + ", Breed: " + aCat.getBreed());
		aCat.setName("Garfield");
		aCat.setBreed("Tabby");
		System.out.println("Name: " + aCat.getName() + ", Breed: " + aCat.getBreed());
		aCat.befriendly();
		System.out.println();

		Horse aHorse = new Horse();
		System.out.println("Name: " + aHorse.getName() + ", Breed: " + aHorse.getBreed());
		aHorse.setName("Shadowfox");
		aHorse.setBreed("rohan");
		System.out.println("Name: " + aHorse.getName() + ", Breed: " + aHorse.getBreed());
		System.out.println();

	}

}
