/*
 * There are four levels of access, but only 3 modifiers
 * 
 * Variables and Methods with no access modifier have package or (default) level of access
 * 
 * Access Modifiers:
 * public - anyone can see it with an import statement
 * protected - package + kids (in the same package or inherits from)
 * private - visible only in the class itself
 * 
 * Non Access Modifiers:
 * final - can't be changed
 * abstract - must be overridden (methods) or extended (classes)
 * static - can be used without instantiating an object
 * 
 * Advanced NA Modifiers:
 * synchronized - used in multi-threaded applications to prevent collisions between threads
 * transient - in fileIO to ignore variables in serialization

 * 
 * Rarely Used NA Modifiers
 * volatile - used in multi-threading to reconcile data modified in multiple threads
 * strictfp - forces floating point notation to use IEEE754 standard
 * native - method is implemented in another language
 */
package rukshanu.core_java.lesson01;

public class Modifiers {
	
	//Class variables use the static keyword
	static String classVar = "Class variable";
	
	private final double TEST_FINAL = 123456.789;
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		//Can't change a constant:
//		TEST_FINAL = 987.654321; causes a compile error
	}
	
//	public abstract void testAbstractMethod();

}

//class ExtendString extends String {};

