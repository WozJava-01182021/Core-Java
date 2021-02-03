/*
 * Rules for identifiers
 * 1. Must start with a letter, dollar sign or underscore
 * 2. May contain letters, numbers, underscores and currency characters
 * 3. No limit to length
 * 4. Ca't use a Java keyword
 * 5. Identifiers are case sensitive
 * 
 * 
 */

package robertd.core_java.lesson01;

public class Identifiers {
	String test = "instance variable";
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		//type in legal and illegal identifiers
		int myExceedinglylong4$TestingNumber_variableIdentifiersJust25SeeHowFarWeCanPushTheEnvelope;
		int _a;
		int $c;
		int _____2_w;
		int _$;
		String Class = "Bad identifiers";
		byte e7 = 10;
		
		// Illegal identifiers		
//		byte 7e = 10;
//		short default;
		
		String test = "1st string";
		String Test = "2nd string";     // Doesn't follow the conventions
		System.out.println(test + " " + Test);
		
		// Without an import statement, you have to use the fully qualified path name
		robertd.core_java.lesson01.exercises.Dog myDog = new robertd.core_java.lesson01.exercises.Dog();
        myDog.sleep();
        
		System.out.println();
	}
}
