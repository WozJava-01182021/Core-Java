/*
 * Abstract class - a class that must be subclassed to be used
 * 1. A class may contain one or more abstract methods which have to be implemented by
 *    a sub class(es).
 * 2. An abstract class can contain non abstract (concrete) methods. If you want to add
 *    a new method that applies to all subclasses, the method can simply be implemented
 *    in the abstract class.
 * 3. An abstract class definition begins with the keyword "abstract" keyword followed by
 *    Class definition.
 * 4. Abstract classes are useful in a situation when some general methods should be
 *    implemented and other specialized behavior should be implemented by subclasses.
 *
 */
package robertd.core_java.lesson02;

import robertd.core_java.common.animal.birds.*;
import robertd.core_java.common.animal.mammals.*;

public class AbstractClasses {
	// *********************************VARIABLES SECTION***************************

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		testAbstractMethods();
		testAbstractBird();
		testAbstractRaptor();
//		testAbstractClasses();

		System.out.println();
	}
	
	private void testAbstractMethods() {
		System.out.println("1. If a class has abstract methods, the class must be abstract");
		System.out.println();
		
//		Bird newBird = new Bird();
//		newBird.move();
		System.out.println();
	}
	
	private void testAbstractRaptor() {
		System.out.println("1a. Abstract methods MAY be implemented in abstract classes");
		System.out.println();
		Hawk bird1 = new Hawk();
		System.out.println("Can swim? " + bird1.canSwim());
		System.out.println();
		System.out.println("1b. You don't have to implement abstract methods in abstract classes");
		System.out.println();
		System.out.println("Can run? " + bird1.canRun());
		System.out.println();
		System.out.println("1c. Abstract methods MAY be implemented in abstract classes");
		System.out.println();
		
		
	}
	
	private void testAbstractBird() {
		System.out.println("2. Abstract methods must be implemented in the first concrete class");
		System.out.println();
		
		Bird bird1 = new Emu();
		bird1.move();
		
		Bird bird2 = new Duck();
		bird2.move();
		
		Bird bird3 = new Hawk();
		bird3.move();
	}
	
	private void testAbstractClasses() {
		Lion scar = new Lion();
		scar.grow();
		scar.grow();
		scar.grow();
		scar.grow();
		scar.grow();
		scar.grow();
		System.out.println(scar);
		System.out.println(scar.getRunningSpeed());
		scar.setHealth((byte)0);
		System.out.println(scar.getRunningSpeed());
		scar.setHealth((byte)-5);
		System.out.println(scar.getRunningSpeed());
				
	}
	// *************************CONSTRUCTOR SECTION*********************************

	// ****************************METHOD SECTION***********************************

}
