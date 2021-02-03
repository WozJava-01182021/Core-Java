package robertd.core_java.lesson03;

import java.util.List;

import robertd.core_java.common.animal.Animal;
import robertd.core_java.common.animal.RandomAnimalBuilder;
import robertd.core_java.common.animal.Sex;
import robertd.core_java.common.animal.mammals.Elephant;
import robertd.core_java.common.animal.mammals.Lion;

public class Overloading {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		simpleOverloading();
		testElephantWeight();
		testLionWeight();
		testRandomAnimal();

	}

	private void simpleOverloading() {
		System.out.println();
		System.out.println("1. Overloading in the same class");
		System.out.println();
		Animal a1 = new Animal();
		a1.setAge(1);
		a1.setRandomWeightByAge();
		System.out.println(a1);

		Animal a2 = new Animal();
		a2.setAge(1);
//			a2.setRandomWeightByAge(100, 150, 125, 200, 10);
//			System.out.println(a2);
//			a2.setSex(Sex.MALE);
//			a2.setRandomWeightByAge(100, 150, 125, 200, 10);

		a1.setAge(20);
		a1.setRandomWeightByAge();
		System.out.println(a2);
//			a2.setRandomWeightByAge(100, 150, 125, 200, 10);
//			System.out.println(a2);
//			a2.setSex(Sex.MALE);
//			a2.setRandomWeightByAge(100, 150, 125, 200, 10);
		System.out.println(a2);
	}

	private void testElephantWeight() {
		System.out.println();
		Elephant ellie = new Elephant();

		// Test the birth weight
		ellie.setRandomWeightByAge();
		System.out.println(ellie);

		// Test the boundry
		ellie.grow();
		System.out.println(ellie);

		// Test the weight at MATURITY
		ellie.setAge(14);
		ellie.setRandomWeightByAge();
		System.out.println(ellie);
		ellie.grow();
		System.out.println(ellie);
		ellie.grow();
		System.out.println(ellie);
		System.out.println();

		Elephant manny = new Elephant();
		manny.setSex(Sex.MALE);

		// Test the birth weight
		manny.setRandomWeightByAge();
		System.out.println(manny);

		// Test the weight at MATURITY
		manny.setAge(14);
		manny.setRandomWeightByAge();
		System.out.println(manny);
		manny.grow();
		System.out.println(manny);
		manny.grow();
		System.out.println(manny);
	}

	private void testLionWeight() {
		System.out.println();
		Lion sarabi = new Lion();

		// Test the birth weight
		sarabi.setRandomWeightByAge();
		System.out.println(sarabi);

		// Test the boundry
		sarabi.grow();
		System.out.println(sarabi);

		// Test the weight at MATURITY
		sarabi.setAge(14);
		sarabi.setRandomWeightByAge();
		System.out.println(sarabi);
		sarabi.grow();
		System.out.println(sarabi);
		sarabi.grow();
		System.out.println(sarabi);
		System.out.println();

		Lion mufasa = new Lion();
		mufasa.setSex(Sex.MALE);

		// Test the birth weight
		mufasa.setRandomWeightByAge();
		System.out.println(mufasa);

		// Test the weight at MATURITY
		mufasa.setAge(14);
		mufasa.setRandomWeightByAge();
		System.out.println(mufasa);
		mufasa.grow();
		System.out.println(mufasa);
		mufasa.grow();
		System.out.println(mufasa);
	}
	
	private void testRandomAnimal() {
		System.out.println("2. In RandomAnimal no-arg constructor");

		System.out.println();
		List<Animal> animals = (List<Animal>)new RandomAnimalBuilder().build(3);
		for (Animal a : animals) {
			a.grow();
			System.out.println(a);
			System.out.println();
		}
	}
}
