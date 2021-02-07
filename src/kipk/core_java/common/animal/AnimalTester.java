package kipk.core_java.common.animal;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import kipk.core_java.common.animal.birds.*;
import kipk.core_java.common.animal.fish.*;
import kipk.core_java.common.animal.mammals.*;
import kipk.core_java.common.animal.reptiles.*;
import kipk.core_java.common.ecosystem.EcosystemType;


public class AnimalTester {
	public static AnimalTester at = new AnimalTester();
	static private Path parentDir = Paths.get("src", "kipk", "core_java", "common",  "animal");
	private String parentPkg = "kipk.core_java.common.animal";

	public static void main(String[] args) {
		
//		at.testRandomAnimalBuilder();
//		at.testAnimalTypes(AnimalType.FISH, 6);
//		at.testSpecificAnimalClass();

//		at.checkAnimalClasses(AnimalType.MAMMAL);
		at.checkAnimalFile(Paths.get(parentDir.toString(), "mammals", "Lion.java"));
		
//		at.checkEcosystemFilter();
	}

	private void testSpecificAnimalClass() {
		List<Gazelle> herd = (List<Gazelle>)new RandomAnimalBuilder(Gazelle.class).build(20);
		for (Gazelle animal : herd) {
			animal.sleep();
		}
		
	}

	private void testRandomAnimalBuilder() {
		System.out.println("1. Test RandomAnimalBuilder:");
		List<Animal> animals = (List<Animal>)new RandomAnimalBuilder().build(6);
		for (Animal a : animals) {
			System.out.println(a);
//			a.eat();
//			a.move();
//			a.sleep();
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
			List<Reptile> lizards = (List<Reptile>) new RandomAnimalBuilder(AnimalType.REPTILE).build(numToTest);
			displayResults = lizards;
			break;
		case DOMESTIC:
			List<Animal> domestics = (List<Animal>) new RandomAnimalBuilder(AnimalType.DOMESTIC).build(numToTest);
			displayResults = domestics;
			break;
		case ZOO:
		default:
			List<Animal> animals = (List<Animal>)new RandomAnimalBuilder(AnimalType.ZOO).build(6);
			displayResults = animals;
			break;
		}

		for(Animal a : displayResults) {
			System.out.println(a);
		}
		System.out.println();
	}

	private void checkAnimalFile(Path targetFile) {
		String data = null;
		try (BufferedReader br = Files.newBufferedReader(targetFile)) {
		boolean eatMethodFound=false, sleepMethodFound=false, moveMethodFound=false;
			while((data = br.readLine()) != null) {
				if (data.contains("public void eat()")) eatMethodFound = true;
				if (data.contains("public void sleep()")) sleepMethodFound = true;
				if (data.contains("public void move()")) moveMethodFound = true;
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
		}
		
	}

	private void checkAnimalClasses(AnimalType type) {
		List<String> animalClasses = null;
		String pkgName = null;
		switch (type) {
		default:
		case MAMMAL:
			pkgName = "mammals"; break;
		case BIRD:
			pkgName = "birds"; break;
		case FISH:
			pkgName = "fish"; break;
		case REPTILE:
			pkgName = "reptiles"; break;
		case DOMESTIC:
			pkgName = "domestic"; break;
		}

		if (pkgName != null) {
			animalClasses = getClassList(pkgName);
	
			for (String fullName : animalClasses) {
				String className = fullName.substring(fullName.lastIndexOf('.') + 1);
				Path fileName = Paths.get(parentDir.toString(), pkgName, className + ".java");
				System.out.println("Checking " + fileName);
				checkAnimalFile(fileName);
			}
		}
		
	}

	private List<String> getClassList(String subDir) {
		Path dir = Paths.get(parentDir.toString(), subDir);
		List<String> classes = new CopyOnWriteArrayList<>();
		String pkg = parentPkg + "." + subDir;

		File entry = dir.toFile();
		if (entry.isDirectory()) {
			String[] entryNames = entry.list();
			for (String fileName : entryNames) {
				String clsName = pkg + "." + fileName.substring(0, fileName.indexOf("."));
				classes.add(clsName);
			}
		}

		// Loop through the list and attempt to instantiate the class
		for (String clsName : classes) {
			Animal a = null;
			try {
				a = (Animal)Class.forName(clsName).newInstance();
			} catch (ClassNotFoundException | IllegalAccessException e) {
				System.out.println(e + ": " + e.getCause());
				System.exit(1);
			} catch (InstantiationException ie) {
				// Remove abstract classes or interfaces from the list
				classes.remove(clsName);
			}
		}

		return classes;
	}

	private void checkEcosystemFilter() {
		List<Mammal> mammals = (List<Mammal>) new RandomAnimalBuilder(AnimalType.MAMMAL).setEcosystem(EcosystemType.SAVANNAH).build(20);

		for(Mammal mammal : mammals) {
			System.out.println(mammal);
			mammal.move();
			mammal.move();
			mammal.move();
			System.out.println();
		}
		System.out.println();
		
	}
}
