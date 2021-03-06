/*
 * 
 *  * Local variables declared in a method
 *  
 * instance variables declared at the class level without the static keyword
 * class variables declared at the class level with the static keyword
 * 
 */
package robertd.core_java.lesson01;

import robertd.core_java.lesson01.exercises.Dog;

public class Initialization {
	Dog topDog;
	int instantInt;
	double instantDouble;
	boolean instantBoolean;
	char instantChar;
	
	public void inClassWork() {
	System.out.println(this.getClass().getSimpleName() + ".inClassWork()");

	// Local variables are not initialized
	int x;
//	System.out.println(x);
//	int z = x + 5;
	
	Dog aDog;
//	System.out.println(aDog);
	
	//Reference variables that are at the class level are automatically initialized to null
	System.out.println(topDog);
	System.out.println(instantInt);
	System.out.println(instantDouble);
	System.out.println(instantBoolean);
	System.out.println(instantChar);
	
	// Arrays, even local arrays are initialized using default values
	int[] nums = new int[4];	
	for (int i=0; i<nums.length; i++) {
		System.out.println(nums[i]);
	}
	
	Dog[] pets = new Dog[4];
	for (int i=0; i<pets.length; i++) {
		System.out.println(pets[1]);
	}
	}
}
