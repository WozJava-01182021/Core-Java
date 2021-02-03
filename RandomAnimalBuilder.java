package robertd.core_java.common.animal;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;



import robertd.core_java.common.animal.birds.*;
import robertd.core_java.common.animal.domestic.Cat;
import robertd.core_java.common.animal.domestic.Dog;
import robertd.core_java.common.animal.domestic.Horse;
import robertd.core_java.common.animal.fish.*;
import robertd.core_java.common.animal.mammals.*;
import robertd.core_java.common.animal.reptiles.*;
import robertd.core_java.common.ecosystem.EcosystemType;

public class RandomAnimalBuilder {

	// *********************************VARIABLES SECTION***************************

	private AnimalType type = null;

	private Class species = null;	

	// Variables for file handling	
	private Path parentDir = Paths.get("src", "robertd", "core_java", "common", "animal");
	private String parentPkg = "robertd.core_java.common.animal";
	private boolean debug = false;
	
	private EcosystemType ecoSystem = null;

	// *************************CONSTRUCTOR SECTION*********************************
	// Use this constructor to build random animal types
	public RandomAnimalBuilder() {

	}

	// Use this Constructor to build random animals of a specific type
	public RandomAnimalBuilder(AnimalType t) {
		type = t;
	}

	// Use this constructor to build random animals of a particular species
	public RandomAnimalBuilder(Class cls) {
		species = cls;
	}
	// ****************************METHOD SECTION***********************************
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

		for (int i = 1; i <= count; i++) {
			Animal a;
			if (type != null) {
				a = buildType(type);
			} else if (species != null) {
				a = buildClass();
			} else {
				a = buildRandom();
			}
			// Set the new animal to a random age based on it's age range
			int age = ThreadLocalRandom.current().nextInt(0, a.getMAX_AGE());
			a.setAge(age);
			// Set the new animal's sex, default is FEMALE, so half to MALE
			if (ThreadLocalRandom.current().nextBoolean())
				a.setSex(Sex.MALE);
			// Set the weight based on animal's age and sex
			a.setRandomWeightByAge();

			result.add(a);
		}
		return result;
	}

	private Animal buildRandom() {
		Animal a = null;
		switch (ThreadLocalRandom.current().nextInt(6)) {
		case 0:
			a = buildBird();
			break;
		case 1:
			a = buildFish();
			break;
		case 2:
			a = buildReptile();
			break;
		case 3:
			a = buildDomestic();
			break;
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
			a = buildZOO();
			break;
		case MAMMAL:
			a = buildMammal();
			break;
		case BIRD:
			a = buildBird();
			break;

		case FISH:
			a = buildFish();
			break;

		case REPTILE:
			a = buildReptile();
			break;

		case DOMESTIC:
			a = buildDomestic();
			break;

		}
		return a;
	}

	private Animal buildClass() {
		Animal newAnimal = null;
		String className = species.getCanonicalName();
		try {
			newAnimal = (Animal) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newAnimal;
	}

	private Animal buildZOO() {
		Animal newAnimal;
		switch (ThreadLocalRandom.current().nextInt(6)) {
		case 0:
			newAnimal = buildBird();
			break;
		case 1:
			newAnimal = buildReptile();
			break;
		default:
			newAnimal = buildMammal();
			break;
		}
		return newAnimal;
	}
	
	private List<String> mammalClasses = null;
	private Mammal buildMammal() {
		Mammal newMammal = null;

		if (mammalClasses == null) {
			mammalClasses = getClassList("mammals");
		}
		
		int index = ThreadLocalRandom.current().nextInt(mammalClasses.size());
		String name = mammalClasses.get(index);
		try {
			newMammal = (Mammal)Class.forName(name).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}
		

		return newMammal;
	}

	private Bird buildBird() {
		Bird newBird = null;
		switch (ThreadLocalRandom.current().nextInt(3)) {
		case 0:
			newBird = new Duck();
			break;
		default:
			newBird = new Hawk();
			break;
		}
		return newBird;
	}

	private Fish buildFish() {
		Fish newFish = null;
		switch (ThreadLocalRandom.current().nextInt(4)) {
		case 0:
			newFish = new Swordfish();
			break;
		default:
			newFish = new Tuna();
			break;
		}
		return newFish;
	}

	private Reptile buildReptile() {
		Reptile newReptile = null;
		switch (ThreadLocalRandom.current().nextInt(2)) {
		default:
			newReptile = new Crocodile();
			break;
		}
		return newReptile;
	}

	private Animal buildDomestic() {
		Domesticatable newAnimal = null;
		switch (ThreadLocalRandom.current().nextInt(4)) {
		default:
		case 0:
			newAnimal = new Dog();
			break;
		case 1:
			newAnimal = new Cat();
			break;
		case 2:
			newAnimal = new Horse();
			break;

		}
		return (Animal) newAnimal;
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
				System.out.println();
//				if (debug) System.out.println("Found: " + clsName);
				classes.add(clsName);
				System.out.println();
			}
		}
		
		// Loop through the list and attempt to instantiate the class
		for (String clsName : classes) {
			Animal a = null;
			try {
				a = (Animal)Class.forName(clsName).newInstance();
				if (ecoSystem != null && ecoSystem != EcosystemType.UNKNOWN || ecoSystem != EcosystemType.VARIOUS) {
					if (a.getEcosystem() != ecoSystem) {
						if (debug) System.out.println("Removing ecosystem " + a.getEcosystem() + " from class list");
						classes.remove(clsName);
					}
				}
			} catch (ClassNotFoundException | IllegalAccessException e) {
//				e.printStackTrace();
				System.out.println(e + ": " + e.getClass());
				System.exit(1);
			} catch (InstantiationException ie) {
				// Remove abtsract classes or interfaces
				System.out.println();
				if (debug) System.out.println("Removing " + clsName + " from class list");
				classes.remove(clsName);
			}
		}
		
		return classes;
	}

	public void testGetClassList(String subDir) {
		debug = false;
		List<String> classes = getClassList(subDir);
		for (String s : classes) {
			System.out.println(s);
			System.out.println();
		}
		debug = false;
	}
}
