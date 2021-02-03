/*
 * There are four levels of access, but only three access modifiers
 * Variables and methods with no access modifier have package (default) level of access
 * Access modifiers:
 * public - anyone can see it with an import statement
 * protected - package + kids (in same package or inherits from)
 * private - visible only in the class itself
 * 
 * Non-access modifiers:
 * final - can't be changed
 * abstract - must be overridden (methods) or extended (classes)
 * static - can be used without instantiating an object
 * 
 * synchronized - used in multi-threaded applications to prevent collisions between thread
 * transient - in fileIO to ignore variables in serialization
 * 
 * volatile - used in multi-threading to reconcile data modified in multiple threads 
 * strictfp - forces floating point notation to use IEEE754 standard
 * native - method is implemented in another language
 */

package robertd.core_java.lesson01;

public class Modifiers {
	
	// Class variables use the static keyword
	static String classVar  ="Class variables";
	
	private final double TEST_FINAL = 123456.789;
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		// Can't change a constant:
//		TEST_FINAL = 987.654321;
	}	
	
//	public abstract void testAbstractMethod();
}

//class ExtendString extends String {};