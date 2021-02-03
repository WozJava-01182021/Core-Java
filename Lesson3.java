/*
 * * Overloading provides a way to perform an operation on different types of input.
 *
 * Rules for overloading a method
 *   1. The argument list must be different
 *   2. The return type may be different
 *   3. The access level may be different
 *   4. Must be in the same class or subclass
 *   (more overloading rules regarding exceptions later)
 */

package robertd.core_java.lesson03;

public class Lesson3 {

	public static void main(String[] args) {
		// *********************************VARIABLES SECTION***************************
		// Lesson 3 Parameters
		VariableCasting vc = new VariableCasting();
		vc.inClassWork();

		// Lesson 3 Return types
		ReturnTypes rt = new ReturnTypes();
		rt.inClassWork();

		// Lesson 3 Overloading
		Overloading overloading = new Overloading();
		overloading.inClassWork();

		// Lesson 3 Overloading Constructors
		Constructors studyConstructors = new Constructors();
		studyConstructors.inClassWork();
		InitBlocks init = new InitBlocks();
		init.inClassWork();

		// Lesson 3 Overriding methods
		Polymorphism overriding = new Polymorphism();
		overriding.inClassWork();

		// *************************CONSTRUCTOR SECTION*********************************

		// ****************************METHOD SECTION***********************************

	}
}