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

import java.util.List;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.RandomAnimalBuilder;
import kipk.core_java.common.animal.Sex;
import kipk.core_java.common.animal.fish.*;
import kipk.core_java.common.animal.mammals.*;

public class Constructors {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		testOverloadedConstructors();
		testRandomAnimalBuilder();
		
		System.out.println("================================================================");

	}
	
	private void testOverloadedConstructors() {
		System.out.println("1. Test constructor overloading");
		Animal[] zoo = new Animal[4];
		zoo[0] = new Lion(6, 300, Sex.MALE);
		zoo[1] = new Elephant(30);
		zoo[2] = new Swordfish(); //this one is calling the no-args constructor
		zoo[3] = new Swordfish(20); //this one is calling the int constructor
		System.out.println();
		
		for (Animal a :zoo) {
			System.out.println(a);
			a.eat();
			a.move();
			a.sleep();
			System.out.println();
		}
	}
	
	private void testRandomAnimalBuilder() {
		System.out.println("2. Test RandomAnimalBuilder");
		List<Animal> animals = (List<Animal>)new RandomAnimalBuilder().build(6);
		
		for (Animal a :animals) {
			System.out.println(a);
			a.eat();
			a.move();
			a.sleep();
			System.out.println();
		}
		System.out.println();
	}

}
