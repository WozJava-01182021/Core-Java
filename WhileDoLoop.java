/*
 * do and while loops require a boolean expression
 *
 * do loops are guaranteed to run at least once
 * while loops may not execute at all
 *
 * do loops have a while expression at the end and requires a semicolon
 *
 */
package robertd.core_java.lesson05;

import robertd.core_java.common.animal.mammals.Lion;

public class WhileDoLoop {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");

		whileAndDoLoopBasics();
		testWhileWithLion();

		System.out.println("-------------------------------------------------------\n\n");
	}

	private void whileAndDoLoopBasics() {
		System.out.println();
		System.out.println("1a. While Loop");
		System.out.println();
		int count = 7;
		while (count < 6) {
			System.out.print(count + " ");
			count++;
		}
		System.out.println();

		System.out.println("1b. Do Loop");
		count = 7;
		do {
			System.out.print(count + " ");
			count++;
		} while (count < 6);
		System.out.println();

		// Infinite loops:
//		while(true) {}
//		
//		do {} while(true);

	}
	
	private void testWhileWithLion() {
		System.out.println();
		System.out.println("Growing a lion:");
		System.out.println();
		Lion aLion = new Lion();
		
		while (aLion.getAge() < aLion.getMAX_AGE()) {
			aLion.hunt();
			aLion.grow();
			System.out.println();
		}
	}
}