/*
 * A constructor is a special method that is used to instantiate an object
 * 1. Must have the same name as its class
 * 2. Must NOT have a return type
 * 4. Cannot be final, abstract or static
 * 
 * 
 * Every class MUST have a constructor, If you do not write one, one will be created for you by the
 * compiler
 * 
 */
package rukshanu.core_java.lesson02;

public class Constructors {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
				
		System.out.println();
	}
}
