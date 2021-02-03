package robertd.core_java.common.animal;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import robertd.core_java.common.animal.birds.*;
import robertd.core_java.common.animal.fish.*;
import robertd.core_java.common.animal.mammals.*;
import robertd.core_java.common.animal.reptiles.*;

public class AnimalTester {

	public static AnimalTester at = new AnimalTester();
	
	static private Path parentDir = Paths.get("src", "robertd", "core_java", "common", "animal");


	public static void main(String[] args) {

//      at.testRandomAnimalBuilder();
//		at.testAnimalTypes(AnimalType.MAMMAL, 10);
//		at.testSpecificAnimalClass();
		
//		at.checkAnimalClasses(AnimalType.MAMMAL);
		at.checkAnimalFile(Paths.get(parentDir.toString(), "mammals", "BlueWhale.java"));

	}

	private void testSpecificAnimalClass() {
		List<BlueWhale> pod = (List<BlueWhale>) new RandomAnimalBuilder(BlueWhale.class).build(16);
		for (BlueWhale animal : pod) {
			animal.eat();
		}
	}

	private void testRandomAnimalBuilder() {
		System.out.println("1. Test RandomAnimalBuilder: ");
		List<Animal> animals = (List<Animal>) new RandomAnimalBuilder().build(6);
		for (Animal a : animals) {
			System.out.println(a);
// a.eat();
// a.move();
//a.sleep();
			System.out.println();
		}
		System.out.println();
	}

	private void testAnimalTypes(AnimalType typeToTest, int numToTest) {
		System.out.println("2. Overloaded RandomAnimalBuilder");
		List<? extends Animal> displayResults;
		switch (typeToTest) {
		case FISH:
			List<Fish> fishes = (List<Fish>) new RandomAnimalBuilder(AnimalType.FISH).build(numToTest);
			displayResults = fishes;
			break;
		case BIRD:
			List<Bird> birds = (List<Bird>) new RandomAnimalBuilder(AnimalType.BIRD).build(numToTest);
			displayResults = birds;
			break;
		case MAMMAL:
			List<Mammal> mammals = (List<Mammal>) new RandomAnimalBuilder(AnimalType.MAMMAL).build(numToTest);
			displayResults = mammals;
			break;
		case REPTILE:
			List<Reptile> reptiles = (List<Reptile>) new RandomAnimalBuilder(AnimalType.REPTILE).build(numToTest);
			displayResults = reptiles;
			break;
		case DOMESTIC:
			List<Animal> domestics = (List<Animal>) new RandomAnimalBuilder(AnimalType.DOMESTIC).build(numToTest);
			displayResults = domestics;
			break;
		case ZOO:
		default:
			List<Animal> animals = (List<Animal>) new RandomAnimalBuilder(AnimalType.ZOO).build(numToTest);
			displayResults = animals;
			break;
		}

		for (Animal a : displayResults) {
		}
		System.out.println();
	}


	private void checkAnimalFile(Path targetFile) {
		String data = null;
		try (BufferedReader br = Files.newBufferedReader(targetFile)) {
			boolean eatMethodFound = false, sleepMethodFound = false, moveMethodFound = false;
			while ((data = br.readLine()) != null) {
				if (data.contains("public void eat()"))
					eatMethodFound = true;
				if (data.contains("public void sleep()"))
					sleepMethodFound = true;
				if (data.contains("public void move()"))
					moveMethodFound = true;
			}
			if (!eatMethodFound) {
				System.out.println("You need to override the eat method");
			}
			if (!sleepMethodFound) {
				System.out.println("You need to override the sleep method");
			}
			if (!moveMethodFound) {
				System.out.println("You need to override the move method");
			}
		} catch (IOException ioe) {
			System.out.println(ioe);
			System.out.println();
		}
	}

}
