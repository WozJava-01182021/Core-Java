package robertd.core_java.lesson04;

import robertd.core_java.common.animal.*;
import robertd.core_java.common.animal.mammals.*;

public class RelationalOperators {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
	
		testRelationalOperators();
		
		System.out.println("-------------------------------------------------------\n\n");
	}
	
	private void testRelationalOperators() {
		System.out.println();
		System.out.println("1. Relational operators");
		System.out.println();
		
		int x = 9;
		long y = 11;
		System.out.println("x < y: " + (x < y));
		System.out.println("x <= y: " + (x <= y));
		System.out.println("x > y: " + (x > y));
		System.out.println("x >= y: " + (x >= y));
		System.out.println();
		
		System.out.println("1b. The instanceof operator");
		System.out.println();
		Animal aRef = new Lion();
		if (aRef instanceof Carnivore) {
			((Carnivore)aRef).hunt();

		} else {
			System.out.println("aRef is not a Carnivore");
		}
		

	}
}
