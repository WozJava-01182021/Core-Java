/*
 * 	A functional interface is an interface with one and only one abstract
 * 		method
 *  A functional interface can have multiple static or default methods
 *		(see Predicate in the Java 8 API)
 */

package robertd.core_java.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import robertd.core_java.common.animal.RandomAnimalBuilder;
import robertd.core_java.common.animal.Sex;
import robertd.core_java.common.animal.domestic.Dog;

public class FunctionalProgramming {

	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();

		lambdaSyntax();
		passingLambdasIntoMethods();

		System.out.println("===================================================================\n\n");
	}

	List<Dog> pack = (List<Dog>) new RandomAnimalBuilder(Dog.class).build(10);

	private List<Dog> dogQuerier(Predicate<Dog> expression) {
		List<Dog> result = new ArrayList<>();
		for (Dog d : pack) {
			if (expression.test(d)) {
				result.add(d);
			}
		}
		return result;
	}

	private void passingLambdasIntoMethods() {
		System.out.println("2. Passing lambdas into the dogQuerier method: ");

		System.out.println("Minimum age of 7: " + dogQuerier(d -> d.getAge() >= 12));
		System.out.println("Maximum weight of 20: " + dogQuerier(d -> d.getWeight() <= 20));
		System.out.println("Dogs like Bubbles: " + dogQuerier(d -> {
			boolean b = d.getAge() > 12;
			b &= d.getWeight() < 30;
			b &= d.getSex() == Sex.MALE;
			return b;
		}));
	}

	private void lambdaSyntax() {
		System.out.println("Dogs in pack: ");
		for (Dog d : pack) {
			System.out.println(d);
		}
		System.out.println();

		System.out.println("1. Find dogs older than 10");
		Predicate<Dog> pred1 = d -> d.getAge() > 10; // 'd' is implied from <Dog>
		for (Dog d : pack) {
			if (pred1.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println();
		System.out.println("2. Find dogs younger than 5");
		Predicate<Dog> pred2 = (d) -> d.getAge() < 5; // Paranthesis left of arrow are optional
		for (Dog d : pack) {
			if (pred2.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println();
		System.out.println("3. Find dogs heavier than 50");
		Predicate<Dog> pred3 = (Dog d) -> d.getWeight() < 5; // Paranthesis required if explicitly declaring d
		for (Dog d : pack) {
			if (pred3.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println();
		System.out.println("4. Find dogs lighter than 20");
		Predicate<Dog> pred4 = (Dog d) -> {
			return d.getWeight() < 20;
		}; // Using curly braces around expression to right of arrow
		for (Dog d : pack) { // Curly braces require return statement and ending semicolon
			if (pred4.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println("5. Find Female dogs over 9 weighing < 20");
		Predicate<Dog> pred5 = d -> {
			boolean result = d.getAge() > 9 && d.getWeight() < 20; // Multiple statements require curly braces
			result &= d.getSex() == Sex.FEMALE;
			return result;
		};
		for (Dog d : pack) {
			if (pred5.test(d)) {
				System.out.println(d);
			}
		}
		System.out.println("---------------------------------------\n");

	}
}