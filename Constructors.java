package robertd.core_java.lesson03;

import java.util.List;

import robertd.core_java.common.animal.AnimalType;
import robertd.core_java.common.animal.RandomAnimalBuilder;
import robertd.core_java.common.animal.birds.*;
import robertd.core_java.common.animal.fish.*;
import robertd.core_java.common.animal.mammals.*;

public class Constructors {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		testConstructorChaining();
		testOverloadedRandomAnimalBuilderConstructor();

		System.out.println("-------------------------------------------------------\n\n");
	}

	private void testConstructorChaining() {
		System.out.println("1. Constructor chaining");
		Swordfish swordy = new Swordfish(10);

		System.out.println();
	}

	private void testOverloadedRandomAnimalBuilderConstructor() {
		System.out.println("2. Overloaded RandomAnimal");

		List<Fish> fishes = (List<Fish>) new RandomAnimalBuilder(AnimalType.FISH).build(3);
		System.out.println(fishes);
		System.out.println();

		List<Bird> birds = (List<Bird>) new RandomAnimalBuilder(AnimalType.BIRD).build(3);
		System.out.println(birds);
		System.out.println();

		List<Mammal> mammals = (List<Mammal>) new RandomAnimalBuilder(AnimalType.MAMMAL).build(6);
		System.out.println(mammals);
		System.out.println();
		
		// STUDENT EXERCISE: create random reptiles (and at least one more reptile)

	}
}
