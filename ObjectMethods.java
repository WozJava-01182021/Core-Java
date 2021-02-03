/*
 * ObjectMethods.java Copyright 2013,2015, Steve Montgomery, All rights reserved
 *
 * class Object methods needed for the exam
 *		String toString()			Returns a text representation of this object
 * 		boolean equals (Object obj)	Decides whether two objects are meaningfully equivalent
 *		int hashCode()				Returns a hashcode int value so that an object can be used in
 *									collection classes that use hashing
 *		void finalize()				Called by garbage collector when an object is no longer referenced
 *		final void notify()			Wakes up a thread that is waiting for this object's lock
 *		final void notifyAll()		Wakes up all threads that are waiting for this objects lock
 *		final void wait()			Causes the current thread to wait until another thread calls
 *									notify() or notifyAll() on this object
 * 		protected Object clone() throws CloneNotSupportedException
 * 									Creates and returns a copy of this object
 */
package robertd.core_java.lesson08;

import robertd.core_java.common.animal.Sex;
import robertd.core_java.common.animal.domestic.Dog;
import robertd.core_java.common.animal.mammals.Lion;

public class ObjectMethods {

	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();

		testAnimalEquality();
		testAnimalHashCode();

		System.out.println("===================================================================\n\n");
	}

	/*
	 * The equals method implementation should follow the equals contract:
	 * 
	 * It is reflexive: for any non-null reference value x, x.equals(x) should
	 * return true. It is symmetric: for any non-null reference values x and y,
	 * x.equals(y) should return true if and only if y.equals(x) returns true. It is
	 * transitive: for any non-null reference values x, y, and z, if x.equals(y)
	 * returns true and y.equals(z) returns true, then x.equals(z) should return
	 * true. It is consistent: for any non-null reference values x and y, multiple
	 * invocations of x.equals(y) consistently return true or consistently return
	 * false, provided no information used in equals comparisons on the objects is
	 * modified. For any non-null reference value x, x.equals(null) should return
	 * false.
	 */

	private void testAnimalEquality() {
		Lion fLion1 = new Lion(5, 300, Sex.FEMALE);
		Lion mLion = new Lion(5, 300, Sex.MALE);
		Lion fLion3 = new Lion(5, 300, Sex.FEMALE);
		Lion fLion4 = new Lion(5, 300, Sex.FEMALE);
		Lion smallFLion = new Lion(5, 300, Sex.FEMALE);
		Lion oldFLion = new Lion(5, 300, Sex.FEMALE);
		System.out.println("5a. Test Animals are reflexive: x.equals(x) must return true.");
		System.out.println("Does fLion1.equals(fLion1)? " + fLion1.equals(fLion1));
		System.out.println("Does mLion.equals(mv2)? " + mLion.equals(mLion));
		System.out.println("Does fLion3.equals(mv3)? " + fLion3.equals(fLion3));
		System.out.println("Does smallFlion.equals(mv5)? " + smallFLion.equals(smallFLion));
		System.out.println("Does oldFLion.equals(oldFLion)? " + oldFLion.equals(oldFLion));
		System.out.println("\n5b. Test Animals are symmetric");
		System.out.println("Does fLion1.equals(mv4)? " + fLion1.equals(fLion4));
		System.out.println("Does fLion4.equals(fLion1)? " + fLion4.equals(fLion1));
		System.out.println("Does fLion1.equals(mv2)? " + fLion1.equals(mLion));
		System.out.println("Does mLion.equals(fLion1)? " + mLion.equals(fLion1));
		System.out.println("Does fLion1.equals(mv5)? " + fLion1.equals(smallFLion));
		System.out.println("Does smallFLion.equals(fLion1)? " + smallFLion.equals(fLion1));
		System.out.println("\n5c. Test Animals are transitive");
		System.out.println(fLion1 + " " + fLion3 + " " + fLion4);
		System.out.println("Does fLion1.equals(mv3)? " + fLion1.equals(fLion3));
		System.out.println("Does fLion3.equals(mv4)? " + fLion3.equals(fLion4));
		System.out.println("Does fLion1.equals(mv4)? " + fLion1.equals(fLion4));
		System.out.println("\n5d. Test Animals are consistent");
		for (byte i = 1; i <= 10; i++) {
			fLion1.setHealth(i);
			System.out.println("Does fLion1.equals(mv2)? " + fLion1.equals(mLion));
			System.out.println("Does mLion.equals(mv3)? " + mLion.equals(fLion3));
			System.out.println("Does fLion3.equals(mv4)? " + fLion3.equals(fLion4));
			System.out.println("Does fLion1.equals(mv4)? " + fLion1.equals(fLion4));
			System.out.println();
		
		}
		System.out.println("\n5e. Test null");
		System.out.println("Does fLion1.equals(null)? " + fLion1.equals(null));
		System.out.println("Does mLion.equals(null)? " + mLion.equals(null));
		System.out.println("Does fLion3.equals(null)? " + fLion3.equals(null));
		System.out.println("Does oldFLion.equals(null)? " + oldFLion.equals(null));
		System.out.println("---------------------------------------------------------------------\n");
	}

	/*
	 * The general contract of hashCode is:
	 * 
	 * Whenever it is invoked on the same object more than once during an execution
	 * 			of a Java application, the hashCode method must consistently return the same
	 * 			integer, provided no information used in equals comparisons on the object is
	 * 			modified. This integer need not remain consistent from one execution of an
	 * 			application to another execution of the same application. 
	 * If two objects are equal according to the equals(Object) method, then calling the hashCode
	 * 			method on each of the two objects must produce the same integer result. 
	 * It is not required that if two objects are unequal according to the
	 * 			equals(java.lang.Object) method, then calling the hashCode method on each of
	 *	   	    the two objects must produce distinct integer results. However, the
	 *		    programmer should be aware that producing distinct integer results for
	 *          unequal objects may improve the performance of hash tables.
	 */

	private void testAnimalHashCode() {
		System.out.println("Testing hashCode contract with Dog:");
		Dog a = new Dog("amy");
		Dog b = new Dog("amy");
		Dog c = new Dog("may");
		Dog d = new Dog("may");
	
		// Override Animal.hashCode
		// What's illegal here?
		System.out.println("a.equals(b) " + a.equals(b) + "\t and a.hashCode()= b.hashcode()? " + (a.hashCode() == b.hashCode()));
		System.out.println("a.equals(c) " + a.equals(c) + "\t and a.hashCode()= c.hashcode()? " + (a.hashCode() == c.hashCode()));
		System.out.println("b.equals(b) " + b.equals(b) + "\t and b.hashCode()= b.hashcode()? " + (b.hashCode() == b.hashCode()));
		System.out.println("d.equals(b) " + d.equals(b) + "\t and d.hashCode()= b.hashcode()? " + (d.hashCode() == b.hashCode()));
		// Override Dog.hashCode to correct the problem
	
		System.out.println("\n7a. Test Animals hashCodes are consistent");
		System.out.println("a: " + a + ", b: " + b);
		for (byte i=1; i<=5; i++) {
			a.setHealth(i);
			System.out.println("a Initial creation:   " + a.hashCode());
		}
	
		System.out.println("\n7b. Include sex in hashCode:");
		b.setSex(Sex.MALE);
		System.out.println("a: " + a + ", b: " + b);
		System.out.println("a Initial creation: " + a.hashCode());
		System.out.println("b.setSex(MALE):     " + b.hashCode());
	
		System.out.println("\n7c. Include age in hashCode:");
		b.setAge(10);
		System.out.println("a: " + a + ", b: " + b);
		System.out.println("a Initial creation: " + a.hashCode());
		System.out.println("b.setAge(10):       " + b.hashCode());
	
		System.out.println("\n7d. Include weight in hashCode:");
		b.setWeight(36);
		System.out.println("a: " + a + ", b: " + b);
		System.out.println("a Initial creation: " + a.hashCode());
		System.out.println("b.setWeight(36):    " + b.hashCode());
	
		System.out.println ("---------------------------------------------------------------------\n");
	}







}
