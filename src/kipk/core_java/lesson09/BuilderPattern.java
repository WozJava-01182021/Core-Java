package kipk.core_java.lesson09;

import java.util.List;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.AnimalType;
import kipk.core_java.common.animal.RandomAnimalBuilder;
import kipk.core_java.common.ecosystem.EcosystemType;

public class BuilderPattern {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		//Not using builder setters:
		List<Animal> animals = (List<Animal>) new RandomAnimalBuilder(AnimalType.MAMMAL).build(10);
		System.out.println("Displaying list of animals without filtering");
		DisplayResults(animals);
		System.out.println("----------------------------------------------------------------\n");
		
		animals = (List<Animal>) new RandomAnimalBuilder(AnimalType.MAMMAL).setDebug(true).setEcosystem(EcosystemType.SAVANNAH).build(10);
		System.out.println("Displaying list of animals with filtering for SAVANNAH");
		DisplayResults(animals);
		System.out.println("----------------------------------------------------------------\n");
		
		animals = (List<Animal>) new RandomAnimalBuilder(AnimalType.MAMMAL).setDebug(true).setEcosystem(EcosystemType.WOODLANDS).build(10);
		System.out.println("Displaying list of animals with filtering for WOODLANDS");
		DisplayResults(animals);
		
		System.out.println("================================================================");
	}
	
	private void DisplayResults(List<Animal> animalList ) {
		for (Animal a : animalList) {
			System.out.println(a);
		}
	}


}
