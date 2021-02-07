package kipk.core_java.lesson03;

import java.util.List;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.RandomAnimalBuilder;
import kipk.core_java.common.animal.Sex;
import kipk.core_java.common.animal.mammals.Elephant;

public class Overloading {
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		simpleOverloading();
		testElephantWeights();
		testRandomAnimal();
		System.out.println("==============================================================\n\n");
	}
	


	private void simpleOverloading() {
		System.out.println("1. Overloading in the same class");
		Animal a1 = new Animal();
		a1.setAge(1);
		a1.setRandomWeightByAge();
		System.out.println(a1);
		
		Animal a2 = new Animal();
		a2.setAge(1);
//		a2.setRandomWeightByAge(100, 150, 125, 200, 10);
//		System.out.println(a2);
//		a2.setSex(Sex.MALE);
//		a2.setRandomWeightByAge(100, 150, 125, 200, 10);
//		System.out.println(a2);
		
		a1.setAge(20);
		a1.setRandomWeightByAge();
		System.out.println(a1);
		
//		a2.setAge(20);
//		a2.setRandomWeightByAge(100, 150, 125, 200, 10);
//		System.out.println(a2);
//		a2.setSex(Sex.MALE);
//		a2.setRandomWeightByAge(100, 150, 125, 200, 10);
//		System.out.println(a2);
		System.out.println();
		
	}
	
	private void testElephantWeights() {
		Elephant ellie = new Elephant();
		
		//Test the birth weight
		ellie.setRandomWeightByAge();
		System.out.println(ellie);
		
		//Test the boundary
		ellie.grow();
		
		//Test the weights at MATURITY
		ellie.setAge(14);
		ellie.setRandomWeightByAge();
		System.out.println(ellie);
		ellie.grow();
		System.out.println(ellie);
		ellie.grow();
		System.out.println(ellie);
		System.out.println();
		
		Elephant manny = new Elephant();
		
		manny.setRandomWeightByAge();
		manny.setSex(Sex.MALE);
		System.out.println(manny);
		
		manny.grow();
		
		manny.setAge(14);
		manny.setRandomWeightByAge();
		System.out.println(manny);
		manny.grow();
		System.out.println(manny);
		manny.grow();
		System.out.println(manny);
		System.out.println();
		

	}
	
	private void testRandomAnimal() {
		System.out.println("Testing Random Animal");
		List<Animal> animals = (List<Animal>) new RandomAnimalBuilder().build(3);
		for (Animal a : animals) {
			System.out.println(a);
			a.grow();
			System.out.println(a);
			System.out.println();
		}
	}
	

}
