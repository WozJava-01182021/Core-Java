
/*
 * Classes model 2 things: state and behavior
 * State (what  a class knows) is modeled by instance variables
 * Behavior (what a class does) is modeled by instance methods
 * 
 */
package rukshanu.core_java.lesson01;

import rukshanu.core_java.lesson01.exercises.Dog;

public class ClassesAndObjects {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork");
		//Declaring a reference variable of type Dog,but does NOT create in object;
		Dog d;
		System.out.println("Dog object not created yet");
		
		//This instantiates a Dog object in memory
		d = new Dog();
		System.out.println("Dog object created in memory");
		d.weight = 12;
		d.name = "Tiny";
		d.bark();
		
		d.weight =17;
		d.name = "Abe";
		d.bark();
	}

}

