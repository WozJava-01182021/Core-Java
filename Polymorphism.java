package robertd.core_java.lesson03;

import java.util.List;

import robertd.core_java.common.animal.Animal;
import robertd.core_java.common.animal.Carnivore;
import robertd.core_java.common.animal.RandomAnimalBuilder;

/*
 * Polymorphism - changing the behavior of our subclasses. Allows you to treat
 * 		different objects in the same way even if they were created from different
 * 		classes and exhibit different behaviors.
 *
 * We override instance methods to implement polymorphic behavior
 *
 * Rules for overriding a method 
 *   1. The argument list must be exactly the same as the overridden method
 *   2. The return type must be the same or a subclass of the return type in
 *      the overridden method
 *   3. The access level can't be more restrictive, but can be less restrictive
 *   4. Overridden method must be visible (not private)
 *   5. Overridden method can't be final or static
 *   (more overriding rules regarding exceptions in chapter 5)
 *   
 */
public class Polymorphism {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");

		studyPolymorphism();

		System.out.println("-------------------------------------------------------\n\n");
	}

	private void studyPolymorphism() {
		List<Animal> zoo = (List<Animal>) new RandomAnimalBuilder().build(10);

		for (Animal animal : zoo) {
			animal.eat();
			animal.move();
			animal.sleep();
			if (animal instanceof Carnivore) {
				Carnivore carn = (Carnivore) animal;
				carn.hunt();
				// The above two lines can be combined like so:
//				((Carnivore) animal).hunt();
			}
			System.out.println();
		}

	}
	
	private void createYourOwnAnimal() {
		Animal genericAnimal = new Animal(3);
		Animal EmperorPenguin = new Animal();
		EmperorPenguin.setAge(16);
		
		System.out.println(genericAnimal);
		System.out.println(EmperorPenguin);

		
		genericAnimal.eat();
		EmperorPenguin.eat();

		
		genericAnimal.move();
		EmperorPenguin.move();
		
		genericAnimal.sleep();
		EmperorPenguin.sleep();

		
		
	}
}