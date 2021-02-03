/*
 * Reference Variables:
 *		Upcast - Up the inheritance tree to a more general type
 *		Downcast - Down the inheritance tree to a more specific type
 *
 * primitive casting - converts primitives from one type to another
 * 		implicit - conversion happens automatically
 * 		explicit - must write the cast in parenthesis
 * 		widening - going from smaller to larger datatype (can be implicit)
 * 		narrowing - going from larger to smaller datatype (must be explicit)
 * 
 */
package robertd.core_java.lesson03;

import robertd.core_java.common.animal.*;
import robertd.core_java.common.animal.domestic.Cat;
import robertd.core_java.common.animal.domestic.Dog;
import robertd.core_java.common.animal.domestic.Horse;
import robertd.core_java.common.animal.mammals.*;

public class VariableCasting {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		System.out.println();
		castReferenceVariables();
		castPrimitives();
	}

	private void castReferenceVariables() {
		System.out.println();
		System.out.println("1. Casting reference variables");
		System.out.println();
		// Upcasting going up the inheritance tree from a specific type to a more
		// general type:
		Dog d = new Dog();
		Carnivore carn = d;
		Animal anim = d;
		Mammal mam = d;

		Cat c = new Cat();
		carn = c;
		anim = c;
		mam = c;

		Horse h = new Horse();
		anim = h;
		mam = h;

		// Downcasting is going from a general type to a more specific type
		anim = new Lion();
		carn = (Carnivore) anim; // Downcasting must be explicit

//		anim = c;
		anim = d;
		if (anim instanceof Dog) {
			d = (Dog) anim;
			d.befriendly();

			((Dog) anim).befriendly();
		}
		System.out.println();

		System.out.println("1b. Using animalHospital:");
		System.out.println();
		// These method calls are using upcasting
		animalHospital(new Lion());
		animalHospital(new Cat());
		animalHospital(new Horse());
	}

	private void animalHospital(Animal a) {
		// These casts are all downcasts
		if (a instanceof Pet) {
			((Pet) a).befriendly();
		}

		if (a instanceof Carnivore) {
			((Carnivore) a).hunt();
		}

		if (a instanceof Horse) {
			((Horse) a).eat();
			System.out.println();
		}
	}

	private void castPrimitives() {
		System.out.println();
		System.out.println("2. Casting primitives");
		System.out.println();
		byte b = 5;
		short s = 50;
		int i = 500;
		long lng = 5000;
		float f = 50_000.0f;
		double d = 500_000.0;

		double test;
		test = s;
		System.out.println("test = " + test);

		long test2;
		test2 = i; // Upcasting
		test2 = (long) d; // downcasting must be explicit
		System.out.println("test = " + test2);

		byte testbyte = 0;
		testbyte = (byte) i;
		System.out.println("testByte = " + testbyte);
	}
}