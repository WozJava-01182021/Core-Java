package robertd.core_java.lesson09;

import java.util.List;

import robertd.core_java.common.animal.AnimalType;
import robertd.core_java.common.animal.RandomAnimalBuilder;
import robertd.core_java.common.ecosystem.EcosystemType;

public class BuilderPattern<Animal> {
	
	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();
		
		// Not using builder setters:
		List<Animal> animals = (List<Animal>) new RandomAnimalBuilder(AnimalType.MAMMAL).build(10);
		System.out.println("Display list of animals without filtering");
		System.out.println();displayResults(animals);
		System.out.println("----------------------------------\n");
		
		animals = (List<Animal>) new RandomAnimalBuilder(AnimalType.MAMMAL).setDebug(true).setEcosystem(EcosystemType.SAVANNAH).build(10);
		System.out.println("Display list of animals with filtering for SAVANNAH");
		System.out.println();displayResults(animals);
		System.out.println("----------------------------------\n");
		
		animals = (List<Animal>) new RandomAnimalBuilder(AnimalType.MAMMAL).setEcosystem(EcosystemType.WOODLANDS).build(10);
		System.out.println("Display list of animals with filtering for WOODLANDS");
		System.out.println();displayResults(animals);
		System.out.println("----------------------------------\n");
		

		System.out.println("===================================================================\n\n");
	}
	
	private void displayResults(List<Animal> animalList) {
		for (Animal a : animalList) {
			System.out.println(a);
		}
	}

}
