/*
 * switch statements are branching statements that check for discrete values
 * 			All versions of Java switch works with ints
 * 			As of Java 5 switch works with enums
 * 			As of Java 7 switch works with Strings
 * switch statements only check for equality
 * each case branch must be a constant
 * the default case is optional and can be placed anywhere in the switch statement
 */
package robertd.core_java.lesson05;

public class SwitchStatements {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");

		basicSwitchStatement();
		// See switch on enum AnimalType in RandomAnimalBuilder
		breakAndFallThrough();
		switchOnStrings();

		System.out.println("-------------------------------------------------------\n\n");
	}

	private void basicSwitchStatement() {
		System.out.println();
		System.out.println("1. Switching on ints");
		System.out.println();
		long x = 1;
		int total = 0;

		switch ((int) x) {
		case 1:
			System.out.println("x is 1");
			total += x;
			break;
		case 2:
			System.out.println("x is 2");
			total += x;
			break;
		case 3:
			System.out.println("x is 3");
			total += x;
			break;
		default:
			System.out.println("x is something else");
			total += x;
			break;
		}
		System.out.println("total = " + total);
		System.out.println();
	}

	private void breakAndFallThrough() {
		System.out.println();
		System.out.println("2. Break and fall through");
		System.out.println();
		int x = 1;
		int total = 0;

		switch (x) {
		case 1:
			System.out.println("x is 1");
			total += x;
		case 2:
			System.out.println("x is 2");
			total += x;
		case 3:
			System.out.println("x is 3");
			total += x;
		default:
			System.out.println("x is something else");
			total += x;
		}
		System.out.println("total = " + total);
		System.out.println();
	}

	private void switchOnStrings() {
		System.out.println();
		System.out.println("3. Switching strings as of Java 7");
		System.out.println();
		String dow = "Wednesday";

		switch (dow.toLowerCase()) {
		default:
			System.out.println("It's the weekend.");
			break;
		case "monday":
			System.out.println("Monday, Monday, can't trust that day!");
			break;
		case "tuesday":
			System.out.println("It's taco Tuesday, let's head to the On The Border.");
			break;
		case "wednesday":
			System.out.println("It's humpday.");
			break;
		case "thursday":
			System.out.println("It's throwback Thursday, let's listen to some 90's music.");
			break;
		case "friday":
			System.out.println("It's casual Friday, time for a beer!");
			break;

		}
	}

}
