/*
 * A constructor is a special method that is used to instantiate an object
 * 1. Must have the same name as its class
 * 2. Must NOT have a return type
 * 4. Cannot be final, abstract or static
 * 
 * 
 * Every class MUST have a constructor, If you do not write one, one will be created for you by the
 * compiler. This is called the default constructor
 * 
 * DEFAULT constructors follow the above rules plus
 * 6. Has the same access level as the class
 * 7. Has no arguments
 * 8. Has the call to super()
 * 
 * The default constructor looks like this:
 * public ClassName() {
 * 	      super();
 * }
 * 
 */
package rukshanu.core_java.lesson02;

public class Constructors {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
				
		System.out.println();
	}
}
