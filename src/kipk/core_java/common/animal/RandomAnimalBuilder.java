package kipk.core_java.common.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import kipk.core_java.common.animal.mammals.*;

public class RandomAnimalBuilder {
	//***********************Variables Section*************************
	
	
	
	
	//***********************Constructor Section***********************

	public RandomAnimalBuilder() {
		
	}
	
	//***********************Method Section****************************
	
	public List<? extends Animal> build (int count) {
		List<Animal> result = new ArrayList<>();
		
		for (int i=1; i<=count; i++) {
			Animal a;
			a = buildMammal();
			result.add(a);
		}
		
		return result;
	}
	
	private Mammal buildMammal() {
		Mammal newMammal = null;
		
		switch (ThreadLocalRandom.current().nextInt(4)) {
		
			case 0:
				newMammal = new Elephant(); break;
			case 1:
				newMammal = new Monkey(); break;
			case 2:
				newMammal = new Lion(); break;
			case 3:
				newMammal = new Whale(); break;
			case 4:
				newMammal = new Horse(); break;
				
		}
		return newMammal;
		
	}
	
}
