/*
 * A constructor is a special method that is used to instantiate an object
 * 	1. Must have exactly the same name as its class
 * 	2. Must NOT have a return type
 * 	3. Can NOT be final, abstract, or static
 * 	4. Can have any access modifier including private
 * 	5. The first statement in a construct MUST be a call to this() or super(). If you do
 * 		not write this statement, the compiler will insert a call to super()
 * 
 * Every class MUST have a constructor, if you do not write one, one will be created
 * for you by the compiler. This is called the default constructor.
 * 
 * DEFAULT constructors follow all the above rules plus:
 * 	6. Has the same access level as the class
 * 	7. Has no arguments
 * 	8. Has the call to super()
 * The default constructor looks like this:
 * public ClassName() {
 * 		super();
 * }
 */

package kipk.core_java.lesson02;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.fish.Swordfish;
import kipk.core_java.common.animal.mammals.*;

public class Constructors {
	
	public void inClassWOrk() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		Animal[] zoo =new Animal[4];
		zoo[0] = new Lion(6);
		zoo[1] = new Elephant(30);
		zoo[2] = new Swordfish();
		zoo[2] = new Swordfish(20);
		System.out.println();
		
		for (Animal a :zoo) {
			a.eat();
			a.move();
			a.sleep();
			System.out.println();
		}
	}

}
