/*
 *  Classes model two things: state and behavior
 *  State (what a class knows) is modeled by instance variables
 *  Behavior (what a class does) is modeled by instance methods
 *  
 */
package robertd.core_java.lesson01;

import robertd.core_java.lesson01.exercises.Dog;

public class ClassesAndObjects {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		// Declaring a reference variable of type dog, but does NOT create in object;
		Dog d;
		System.out.println("Dog object not created yet.");
		
		// This instantiates a Dog object in memory
		d =  new Dog();
		System.out.println("Dog object created.");
		
		d.weight = 8;
		d.name = "Bubbles";				
		d.bark();
		
		d.weight = 45;
		d.name = "Bogues";
		d.bark();
		System.out.println();
		
	}

}
