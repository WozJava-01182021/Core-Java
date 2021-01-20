/*
 * Abstract class - a class that must be subclasses to be used
 * 1. A class may contain one or more abstract methods which have to be implemented by
 *    a sub class(es)
 * 2. An abstract class can contain non abstract (concrete) methods. If you want to add
 *    a new method that applies to all subclasses, the method can simply be implemented
 *    in the abstract class.
 * 3. An abstract class definition begins with the keyword "abstract" keyword followed by
 *    Class definition
 * 4. Abstract classes are useful in a situation when some general methods should be
 *    implemented and other specialized behavior should be implemented by subclasses
 */
package kipk.core_java.lesson02;

import kipk.core_java.common.animal.mammals.Lion;

public class AbstractClasses {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		testAbstractMammal();
		
		System.out.println("===========================================================================");
	}
	
	private void testAbstractMammal() {
		Lion scar = new Lion();
		scar.grow();
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

}
