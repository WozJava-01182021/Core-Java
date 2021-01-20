package rukshanu.core_java.lesson01;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WorkingWithStrings {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork");
		
		stringConcatenation();
		//if there is not a pre-existing method you can create one by clicking the red X and selecting the option, but this will put the method directly below the call
		caseStudies();
		otherUsefulStringMethods();
		
		System.out.println();
	}
	
	private void stringConcatenation() {
		System.out.println("1. String concatenation");
		String y = "Sail";
		// Use single ' for characters, " for strings
		y = y + ' ' + "the ";
		// += concatenates whatever is on the right right with y and then reassigns the result to y
		// += is known as a compound assignment operator
		y += "Atlantic";
		
		System.out.println("y = " + y);
		
		// Using the concat method
		y = y.concat(" Ocean");
		System.out.println("y = " + y);
		
		// Strings can be concatenated with numbers
		String numTest = "number test";
		System.out.println(17 + 3 + numTest); // 17 + 3 is addition
		System.out.println(17 + numTest + 3);
		System.out.println(numTest + 17 + 3); // 17+ 3 is String concatenation
				
	}
	
	private void caseStudies() { //reminder that method camel case goes lower-case first, class goes upper-case
		System.out.println("2. Case Studies");
		
		String hobbit = "Bilbo Baggins";
		String hobbit1 = "Bilbo Baggins";
		String hobbit2 = "bilbo baggins";
		
		System.out.println("Original String = " +hobbit);
		System.out.println("upper case = " +hobbit.toUpperCase());
		System.out.println("lower case = " + hobbit.toLowerCase());
		
		System.out.println("Comparing hobbit and hobbit1");
		System.out.println("using == :" + hobbit == hobbit1);
		System.out.println("using equals(): " +hobbit.equals(hobbit1));
		System.out.println("using equalsIgnoreCase() :" + hobbit.equalsIgnoreCase(hobbit1));
		

		System.out.println("Comparing hobbit and hobbit2");
		System.out.println("using == :" + hobbit == hobbit1);
		System.out.println("using equals(): " +hobbit.equals(hobbit1));
		System.out.println("using equalsIgnoreCase() :" + hobbit.equalsIgnoreCase(hobbit1));
		
	}
	
	private void otherUsefulStringMethods() {
		System.out.println();
		String s = "Contentment!";
		String s2 = "";
		System.out.println("isEmpty() " + s.isEmpty()); //checks to see if is empty
		System.out.println("isEmpty() " + s2.isEmpty());
		System.out.println("contains() " + s.contains("tent")); // checks to see if specifics are contained
		System.out.println("endsWith() " + s.endsWith("!")); //checks final character and if they match
		System.out.println("length() " + s.length()); // checks length of string
		// In substringg the first number is 0 based, sencond number is 1 based. This returns 7 - 3 = 4 characters
		System.out.println("substring() " + s.substring(3,7)); //finds characters between denoted values in the string
		
	}
}
