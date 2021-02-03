package robertd.core_java.lesson03;

import robertd.core_java.common.animal.Animal;
import robertd.core_java.common.animal.Sex;
import robertd.core_java.common.animal.domestic.Dog;
import robertd.core_java.common.animal.mammals.Elephant;
import robertd.core_java.common.animal.mammals.Lion;

public class ReturnTypes {
//*********************************VARIABLES SECTION***************************	

	// *************************CONSTRUCTOR SECTION*********************************
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		System.out.println();
		testEnumSex();
		nullReturnsAreOk();
		covariantReturns();
		returningArrays();
	}
	// ****************************METHOD SECTION***********************************

	private void testEnumSex() {
		System.out.println();
		System.out.println("1. Test the Sex enum");
		System.out.println();
		Animal animal = new Animal();
		System.out.println(animal);
		animal.setSex(Sex.MALE);
		animal.grow();
		System.out.println(animal);

		Elephant elephant = new Elephant();
		System.out.println(elephant);
		elephant.setSex(Sex.MALE);
		elephant.setAge(15);
		elephant.setWeight(2300);
		System.out.println(elephant);

	}

	private void nullReturnsAreOk() {
		System.out.println();
		System.out.println("2. null is a valid return value");
		System.out.println();
		Animal baby;
		Lion mufasa = new Lion(6, 200, Sex.MALE);
		mufasa.reproduce();
		baby = ((Lion) mufasa).reproduce();
		System.out.println(baby);

		Lion sarabi = new Lion(4, 600, Sex.FEMALE);
		sarabi.grow();
		sarabi.reproduce();
		baby = ((Lion) sarabi).reproduce();
		System.out.println(baby);

		System.out.println();

	}

	private void covariantReturns() {
		System.out.println("3. Covariant returns are allowed in overriding methods");
		System.out.println();
		Elephant baby;
		Elephant elmore = new Elephant(17);
		elmore.setSex(Sex.MALE);
		baby = (Elephant) elmore.reproduce();
		System.out.println("baby = " + baby);

		Elephant ellie = new Elephant(15);
		ellie.setSex(Sex.FEMALE);
		baby = (Elephant) ellie.reproduce();
		System.out.println("baby = " + baby);

		System.out.println();
	}

	private void returningArrays() {
		System.out.println("4. Arrays are valid return types");
		System.out.println();
		Dog[] newLitter;
		Dog mother = new Dog();
		mother.setAge((4));
		newLitter = mother.reproduce(6);

		for (Dog d : newLitter) {
			System.out.println(d);
		}
		System.out.println();
	}

}
