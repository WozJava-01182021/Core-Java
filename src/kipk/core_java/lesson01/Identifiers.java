/*
 * Rules for identifiers
 * 1. Must start with a letter, $, or underscore
 * 2. May contain letters, numbers, underscores, and currency characters
 * 3. No limit to length
 * 4. Can't use a Java keyword
 * 5. Identifiers are case sensitive
 */

package kipk.core_java.lesson01;

import kipk.core_java.lesson01.exercises.Cat;
import kipk.core_java.lesson01.exercises.Dog;

public class Identifiers {
	String test = "instance variable";
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork");
		
		// type in legal identifiers
		int myExceedinglyLong4$TestingMember_JustToSeeHowFarWeCanPushTheEnvelope;
		int __a;
		int $c;
		int _______2_w;
		int _$;
		String Class = "Bad Identifier";
		
		//illegal identifiers
		
//		byte 7e = 10;
//		short default = 4;
		
		String test = "1st String";
		String Test = "2nd String"; // doesn't follow conventions
		System.out.println(test + " " + Test);
		
		//without an import statement, you have to use the fully qualified path name
		kipk.core_java.lesson01.exercises.Dog myDog = new kipk.core_java.lesson01.exercises.Dog();
		myDog.sleep();
		
		System.out.println();
	}

}
