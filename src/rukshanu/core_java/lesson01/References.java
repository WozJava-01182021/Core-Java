/*
 * References.java Copyright 2015 Steve Montgomery all rights reserved
 * 
 * Primitives hold an actual value, reference variables hold an address to an object (p 54)
 */
package rukshanu.core_java.lesson01;

import rukshanu.core_java.lesson01.exercises.Car;
import rukshanu.core_java.lesson01.exercises.Dog;

class Book {}

public class References {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
	}
	
    public static void main(String[] args) {
		// Life and death on the heap (pp 57-58)
		Book b = new Book();
		Book c = new Book();
		// Both objects are on the heap right now.
		Book d = c;
		// Both c and d now refer to the same object
		c = b;
		// c no longer points to Book 2, but both b & c point to Book 1
		d = null;
		// There is no connection now to Book 2 so it gets garbage collected

		//Declare a reference variable
		Dog myDog;
		// create an object
		myDog = new Dog(); // the = links the object to the reference variable
		// Make the object do something using the dot operator
		myDog.name = "Shotgun";
		myDog.weight = 17;
		myDog.bark();

		// Now create a reference variable and a Car object
		Car myCar;
		myCar = new Car();
		myCar.drive();
        
		Car yourCar = new Car();       
        // Both Car objects are now on the heap
        yourCar.make = "Toyota";
        yourCar.color = "beige";
        yourCar.drive();

		yourCar = myCar;
		System.out.println("Connection to the Toyota is lost");
		// Now yourCar and myCar both point to the Ford and the Toyota is left hanging.
		// The Toyota gets garbage collected because nothing references it
		myCar.drive();
		yourCar.drive();

		myCar = null;
        // Now myCar doesn't refer to any object so we get an exception:
//        myCar.drive();
		System.out.println(myCar);
		System.out.println(yourCar);
		yourCar.drive();
    }

}
