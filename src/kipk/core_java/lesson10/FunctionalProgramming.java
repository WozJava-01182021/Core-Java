package kipk.core_java.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import kipk.core_java.common.animal.RandomAnimalBuilder;
import kipk.core_java.common.animal.Sex;
import kipk.core_java.common.animal.domestic.Dog;

public class FunctionalProgramming {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork");
		
		lambdaSyntax();
		passingLambdasIntoMethods();
		
		System.out.println("===============================================");
	}
	
	List<Dog> pack = (List<Dog>) new RandomAnimalBuilder(Dog.class).build(10);
	private List<Dog> dogQuerier(Predicate<Dog> expression) {
		List<Dog> result = new ArrayList<>();
		
		for (Dog d : pack) {
			if(expression.test(d)) {
				result.add(d);
			}
		}
		
		return result;
	}
	
	private void passingLambdasIntoMethods() {
		System.out.println("2. Passing lambdas into the dogQuerier metho: ");
		
		System.out.println("Minimum age of 7: " + dogQuerier(d -> d.getAge() >= 7));
		System.out.println("Maximum weight of 20: " + dogQuerier(d -> d.getWeight() <= 20));
		System.out.println("Dogs like Shotgun: " + dogQuerier(d -> {boolean b = d.getAge() > 15;
																	b &= d.getWeight() < 20;
																	b &= d.getSex() == Sex.MALE;
																	return b; } ) );
	}

	private void lambdaSyntax() {
		System.out.println("Dogs in pack: ");
		for (Dog d : pack) {
			System.out.println(d);
		}
		System.out.println();
		
		System.out.println("1. Find dogs older than 10");	//'d' is implied from the generic <Dog>
		Predicate<Dog> pred1 = d -> d.getAge() > 10;
		for (Dog d : pack) {
			if(pred1.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println();
		
		System.out.println("1. Find dogs older than 5");
		Predicate<Dog> pred2 = (d) -> d.getAge() > 5;		//Parenthesis left of arrow are optional
		for (Dog d : pack) {
			if(pred2.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println();
		
		System.out.println("1. Find dogs heavier than 50");
		Predicate<Dog> pred3 = (Dog d) -> d.getWeight() > 50;		//Parenthesis required if explicitly declaring d
		for (Dog d : pack) {
			if(pred3.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println();
		
		System.out.println("1. Find dogs heavier than 50");
		Predicate<Dog> pred4 = (Dog d) -> {return d.getWeight() > 20;};		//Using curly braces around expression to right of arrow
		for (Dog d : pack) {												//Curly braces require return statement and ending semicolon
			if(pred4.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println();
		
		System.out.println("1. Find female dogs over 9 weighing < 20");
		Predicate<Dog> pred5 = d -> { boolean result = d.getAge() > 9 && //Multiple States require curly braces
														d.getWeight() < 20;
									result &= d.getSex() == Sex.FEMALE;
									return result;
									};
		for (Dog d : pack) {										
			if(pred5.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println("---------------------------------------\n");

	}
	
	private void compareLambdasAndTestMethodReferences() {
		System.out.println("Predicate interface with method references vs lambdas");
		
		String str = "abcdef";
		
		System.out.println("Using String Class");
		Predicate<String> pred1Lambda = s -> str.startsWith(s);
		System.out.println("Starts with 'A':" + pred1Lambda.test("A"));
		System.out.println("Starts with 'a':" + pred1Lambda.test("a"));
		
		Predicate<String> pred1MethRef = str::startsWith;
		System.out.println("Starts with 'A':" + pred1Lambda.test("A"));
		System.out.println("Starts with 'a':" + pred1Lambda.test("a"));
		
		Dog dog = new Dog("Scruffy");
		dog.setAge(15);
		dog.setWeight(27);
		dog.setBreed("bulldog");
		
		System.out.println("\nUsing Dog Class:");
		Predicate<Dog> pred2Lambda = d -> d.getAge() > 12;
		System.out.println("Scruffy over 12? " + pred2Lambda.test(dog));

	}

}
