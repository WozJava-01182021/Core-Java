/*
 * RandomAnimalBuilder.java Copyright 2015,2017,2019 Steve Montgomery, All rights reserved
 * This class will build a specified number of animals of a specified type
 * 
 */
package kipk.core_java.common.animal;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

import kipk.core_java.common.animal.birds.*;
import kipk.core_java.common.animal.domestic.*;
import kipk.core_java.common.animal.fish.*;
import kipk.core_java.common.animal.mammals.*;
import kipk.core_java.common.animal.reptiles.*;
import kipk.core_java.common.ecosystem.EcosystemType;

public final class RandomAnimalBuilder {
//**************************** VARIABLES SECTION ******************************
	private AnimalType type = null;

	private Class species = null;

	// Variables for file handling
	private Path parentDir = Paths.get("src", "kipk", "core_java", "common",  "animal");
	private String parentPkg = "kipk.core_java.common.animal";
	private boolean debug = false;

	private EcosystemType ecoSystem = null;

//*************************** CONSTRUCTOR SECTION *****************************
	// Use this constructor to build random animal types
	public RandomAnimalBuilder() {
	}

	// Use this constructor to build random animals of a specific AnimalType
	public RandomAnimalBuilder(AnimalType t) {
		type = t;
	}

	// Use this constructor to build random animals of a particular species
	public RandomAnimalBuilder(Class cls) {
		species = cls;
	}

//****************************** METHOD SECTION *******************************
	// Builder design pattern used to set non mandatory parameters
	// Methods that set various parameters instead of creating multiple constructors
	public RandomAnimalBuilder setEcosystem(EcosystemType ecoType) {
		ecoSystem = ecoType;
		return this;
	}

	public RandomAnimalBuilder setDebug(boolean db) {
		debug = db;
		return this;
	}

	// Ends Builder Design pattern setters
	
	// The build method is also part of the Builder Design Pattern
	public List<? extends Animal> build(int count) {
		List<Animal> result = new ArrayList<>();
		
		for (int i=1; i<=count; i++) {
			Animal a;

			if (type != null) {
				a = buildType(type);
			} else if (species != null) {
				a = buildClass();
			} else {
				a = buildRandom();
			}
			
			if (a == null) continue;

			// Set animal to a random age within animal's age range
			a.setAge(ThreadLocalRandom.current().nextInt(0, a.getMaxAge()));
			// Set the new animal's sex, default is FEMALE, so set half to MALE
			if (ThreadLocalRandom.current().nextBoolean()) a.setSex(Sex.MALE);
			// After age and sex is set, set weight within reasonable range
			a.setRandomWeightByAge();
			// Finally set a random health level for the initial start
			a.setHealth((byte)ThreadLocalRandom.current().nextInt(-3,8));
			result.add(a);
		}

		return result;
	}

	private Animal buildRandom() {
		Animal a = null;
		switch (ThreadLocalRandom.current().nextInt(6)) {
		case 0:
			a = buildBird(); break;
		case 1:
			a = buildFish(); break;
		case 2:
			a = buildReptile(); break;
		case 3:
			a = buildDomestic(); break;
		default:
			a = buildMammal();
		}
		return a;
	}

	private Animal buildType(AnimalType t) {
		Animal a = null;
		switch (t) {
		default:
		case ZOO:
			a = buildZoo(); break;
		case MAMMAL:
			a = buildMammal(); break;
		case BIRD:
			a = buildBird(); break;
		case FISH:
			a = buildFish(); break;
		case REPTILE:
			a = buildReptile(); break;
		case DOMESTIC:
			a = buildDomestic(); break;
		}
		return a;
	}

	private Animal buildClass() {
		Animal newAnimal = null;
		String className = species.getCanonicalName();
//		System.out.println(clsName);
		try {
			newAnimal = (Animal)Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return newAnimal;
	}

	private Animal buildZoo() {
		Animal newAnimal;
		switch (ThreadLocalRandom.current().nextInt(6)) {
		case 0:
			newAnimal = buildBird(); break;
		case 1:
			newAnimal = buildReptile(); break;
		default:
			newAnimal = buildMammal(); break;
		}
		return newAnimal;
	}

	private List<String> mammalClasses = null;
	private Mammal buildMammal() {
		Mammal newMammal = null;
		
		if (mammalClasses == null) {
			mammalClasses = getClassList("mammals");
			if ( mammalClasses.isEmpty()) return null;
		}

		int index = ThreadLocalRandom.current().nextInt(mammalClasses.size());
		String name = mammalClasses.get(index);
		try {
			newMammal = (Mammal)Class.forName(name).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return newMammal;
	}

	private List<String> birdClasses = null;
	private Bird buildBird() {
		Bird newBird = null;
		if (birdClasses == null) {
			birdClasses = getClassList("birds");
			if ( birdClasses.isEmpty()) return null;
		}

		String name = birdClasses.get(ThreadLocalRandom.current().nextInt(birdClasses.size()));
		try {
			newBird = (Bird)Class.forName(name).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return newBird;
	}

	private List<String> fishClasses = null;
	private Fish buildFish() {
		Fish newFish = null;
		if (fishClasses == null) {
			fishClasses = getClassList("fish");
			if ( fishClasses.isEmpty()) return null;
		}

		int index = ThreadLocalRandom.current().nextInt(fishClasses.size());
		String name = fishClasses.get(index);
		try {
			newFish = (Fish)Class.forName(name).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		return newFish;
	}

	private List<String> reptileClasses = null;
	private Reptile buildReptile() {
		Reptile newReptile = null;
		reptileClasses = (reptileClasses == null) ? getClassList("reptiles") : reptileClasses;
		if ( reptileClasses.isEmpty()) return null;
		String name = reptileClasses.get(ThreadLocalRandom.current().nextInt(reptileClasses.size()));
		try {
			newReptile = (Reptile)Class.forName(name).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newReptile;
	}

	private Animal buildDomestic() {
		Domesticatable newAnimal = null;
		switch (ThreadLocalRandom.current().nextInt(4)) {
		default:
		case 0:
			newAnimal = new Dog(); break;
		case 1:
			newAnimal = new Cat(); break;
		case 2:
			newAnimal = new Horse(); break;
		}

		return (Animal) newAnimal;
	}

	private List<String> listFilesUsingLambdas(String subDir) {
		Path dir = Paths.get(parentDir.toString(), subDir);
		List<String> classes = new CopyOnWriteArrayList<>();
		String pkg = parentPkg + "." + subDir;

		try {
			Files.list(dir)
				.filter(p -> Files.isRegularFile(p))
				.map(p -> p.getFileName().toString())
				.forEach(s -> { String cls = s.substring(0, s.indexOf('.'));
								cls = pkg + "." + cls;
								classes.add(cls);
								return;	});
		} catch (IOException e) { e.printStackTrace(); }
		return classes;
	}

	private List<String> getClassList(String subDir) {
		Path dir = Paths.get(parentDir.toString(), subDir);
		List<String> classes = new CopyOnWriteArrayList<>();
		String pkg = parentPkg + "." + subDir;
		if (debug) {
			System.out.println(dir);
			System.out.println(pkg);
		}

		File entry = dir.toFile();
		if (entry.isDirectory()) {
			String[] entryNames = entry.list();
			for (String fileName : entryNames) {
				String clsName = pkg + "." + fileName.substring(0, fileName.indexOf("."));
//				if (debug) System.out.println("Found: " + clsName);
				classes.add(clsName);
			}
		}

		// Loop through the list and attempt to instantiate the class
		for (String clsName : classes) {
			Animal a = null;
			try {
				a = (Animal)Class.forName(clsName).newInstance();
				if (ecoSystem != null && (ecoSystem != EcosystemType.UNKNOWN || ecoSystem != EcosystemType.VARIOUS)) {
					if (a.getEcosystem() != ecoSystem) {
						if (debug) System.out.println("Removing ecosystem " + a.getEcosystem() + " from class list");
						classes.remove(clsName);
					}
				}
			} catch (ClassNotFoundException | IllegalAccessException e) {
//				e.printStackTrace();
				System.out.println(e + ": " + e.getCause());
				System.exit(1);
			} catch (InstantiationException ie) {
				// Remove abstract classes or interfaces from the list
				if (debug) System.out.println("Removing " + clsName + " from class list");
				classes.remove(clsName);
//				System.out.println(ie + ": " + ie.getCause());
			}
		}

		return classes;
	}

	public void testGetClassList(String subDir) {
		debug = true;
		List<String> classes = getClassList(subDir);
		for (String s : classes) {
			System.out.println(s);
		}
		debug = false;
	}

}
