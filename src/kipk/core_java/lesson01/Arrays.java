package kipk.core_java.lesson01;

import kipk.core_java.lesson01.exercises.Cat;
import kipk.core_java.lesson01.exercises.Dog;

public class Arrays {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		primitiveArrays();
		referenceVariableArrays();
		
		System.out.println();
	}
	
	private void primitiveArrays() {
		
		// First step is to declare the array
		int [] myNums;
		// Second step is to create (construct or define)
		myNums = new int[7];
		// Third step is to fill the array
		myNums[0] = 6;  //indexes for arrays start at 0
		myNums[1] = 7;
		myNums[2] = 8;
		myNums[3] = 9;
		myNums[4] = 10;
		myNums[5] = 11;
		myNums[6] = 12;
		//if you try to add an element with an index larger than the array you get an
		//an ArrayIndexOutOfBoundException
//		myNums[7] = 13;
		
		//Arrays are type-safe, this causes a compile error
//		myNums[3] = true;
//		myNums[3] = 3.14	
		
		
		// Declaration and Definition on the same line
		double [] dollars = new double[12];
		// Declaration, definition, and initialization 
		int [] manyNums = {1,2,3,4,5,6,7,8,910,11,12,13,14,15};
		
		// Arrays are immutable. There is no way to grow or shrink the array.
		
		// Other legal array declarations that are NOT recommended:
		int num [];
		//Legal in C++ not in Java
//		int [5] nums;
		
	}
	
	private void referenceVariableArrays() {
		
		Dog[] kennel;
		
		kennel = new Dog[3];
		
		kennel[0] = new Dog();
		kennel[1] = new Dog();
		kennel[2] = new Dog();
		
//		kennel[1] = new Cat();
		
		// Using the array
		kennel[0].name = "Lassie";
		kennel[1].name = "Snoopy";
		kennel[2].name = "Rover";
		kennel[0].weight = 70;
		kennel[1].weight = 10;
		kennel[2].weight = 21;
		
		// To process the array we can use a afor-each loop
		for (Dog d : kennel) {
			d.bark();
		}
		
	}

}
