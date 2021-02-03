package robertd.core_java.lesson01;

public class WorkingWithStrings {
	
	public void inClassWork() {	
	    System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
	
	    stringConcatenation();
	    caseStudies();
	    otherUsefulStringMethods();
	
	    System.out.println();
    }	
	
    private void stringConcatenation() {
	    System.out.println("1.String concatenation");
	    String y = "Sell";
	    // USe single ticks for characters and double ticks for Strings
	    y = y + " " + "the ";
	    // += concatenates whatever is on the right with y and the reassigns the result to y
	    // += is the known as a compound assignment operator
	    y += "Atlantic";
	
	    System.out.println("y = " + y);
	    
	    // Using the concat method
	    y = y.concat(" Ocean");
	    System.out.println("y = " + y);
	    
        // Strings can be concatenated with numbers
	    String numTest = "number test";
	    System.out.println(17 + 3 + numTest);       // 17 + 3 is addition
	    System.out.println(17 + numTest + 3);
	    System.out.println(numTest + 17 +3);        // 17 + 3 is string concatenation
	    
    }

	private void caseStudies() {
		System.out.println("2. Case studies");
		
		String hobbit = "Bilbo Baggins";
		String hobbit1 = "Bilbo Baggins";
		System.out.println("Original String = " + hobbit);
		System.out.println("upper case = " + hobbit.toUpperCase());
		System.out.println("lower case =" + hobbit.toLowerCase());
		
		System.out.println("Comparing hobbit and hobbit1");
		System.out.println("Using == :" + hobbit == hobbit1);
		System.out.println("Using equals():" + hobbit.equals(hobbit1));
		System.out.println("Using equalsIgnoreCase(): " + hobbit.equalsIgnoreCase(hobbit1));
		
		System.out.println("Comparing hobbit and hobbit2");
		String hobbit2 = "bilbo baggins";
		System.out.println("Using == :" + hobbit == hobbit2);
		System.out.println("Using equals():" + hobbit.equals(hobbit2));
		System.out.println("Using equalsIgnoreCase(): " + hobbit.equalsIgnoreCase(hobbit2));
		
	}
	
	private void otherUsefulStringMethods() {
		String s = "Contentment!";
		String s2 = "";
		System.out.println("isEmpty() " + s.isEmpty());
		System.out.println("isEmpty() " + s2.isEmpty());
		System.out.println("contains() " + s.contains("tent"));
		System.out.println("endswith() " + s.endsWith("!"));
		System.out.println("length() " + s.length());
		// In substring the first number is 0 based, the send number is 1 based. This returns 7 - 3 - 4 characters
		System.out.println("substring() " + s.substring(3,7));
		
	}

}
