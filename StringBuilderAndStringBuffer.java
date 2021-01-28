/*                 
 * StringBuilderAndStringBuffer.java Copyright 2015, Steve Montgomery, All rights reserved
 * 
 * StringBuilder is the non thread safe version of StringBuffer
 * StringBuilder objects are mutable i.e. they can be changed
 * You do NOT need to do the reassignment
 * 
 * StringBuilder starts out with an initial capacity of 16 + the string 
 * its created with, but gets updated automatically (exam watch p 270)
 * 
 * StringBuilder/StringBuffer methods you need to know
 * 		append()
 * 		capacity()
 * 		charAt()
 *		delete(int start, int end)
 * 		deleteCharAt()
 * 		indexOf(), lastIndexOf()
 *		insert(int start, String)
 * 		length()
 *		replace(int start, int end, String)
 * 		reverse()
 * 		substring()
 * 		toString()
 */
package robertd.core_java.Lesson07;

import robertd.core_java.common.animal.domestic.Dog;

public class StringBuilderAndStringBuffer {
	
public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();
		mutabilityComparison();
		
//		StringBuilder sb = "Climb";			// Illegal
		StringBuilder sb = new StringBuilder("Climb");
		String s = capacity(sb);
		System.out.println("s = " + s + ", sb = " + sb);
		System.out.println();
		s = manipulatingText(s, sb);
		System.out.println("s = " + s + ", sb = " + sb);
		System.out.println();
		otherMethods(sb);
		methodChaining(sb);
		System.out.println("===================================================================\n\n");
	}

	private void mutabilityComparison() {
		System.out.println("1. Comparing the mutability of StringBuilder to immutable String:");
		System.out.println();
		// Strings are immutable and point to new objects
		String w = "  W  ";
		putO(w);
//		w.concat("W");
		w = w.concat("W");
		System.out.println("w = " + w);
		System.out.println();
		System.out.println("--------------------------------");  
		
		// StringBuilder is mutable and can be altered from within a method
		StringBuilder y = new StringBuilder("  Y  ");
		putO(y);
		y.append("W");
		System.out.println("y = " + y);
        System.out.println();
		System.out.println("-------------------------------------------------------------\n");    	
	}
	// Create a private void method "putO(String s)" 
	// In the method run the trim method on the string
	// then append "O"
	private void putO(String s) {
		System.out.println("s = " + s);
		System.out.println();
		s = s.trim();
		System.out.println("s = " + s);
		System.out.println();
		s += "O";
		System.out.println("s = " + s);
		System.out.println();
	}
	
	// Create a private void method "putO(StringBuilder s)" 
	// In the method then append an "O"
	private void putO(StringBuilder sb) {
		System.out.println("sb = " + sb);
		System.out.println();
		// This code removes ALL spaces, not just those at the beginning and end
		for (int i=sb.length()-1; i>=0; i--) {
			if (sb.lastIndexOf(" ") == i) {
				sb.deleteCharAt(i);
			}
		}
		System.out.println("sb = " + sb);
		System.out.println();
		sb.append('O');
		System.out.println("sb = " + sb);
		System.out.println();
	}
	
	private String capacity(StringBuilder sb1) {
		System.out.println("2. Understanding capacity");
		System.out.println();
		System.out.println("2a. Initial capacity on construction:");
		System.out.println();
		System.out.println("sb1 capacity: " + sb1.capacity());
		System.out.println();
		StringBuilder sb2 = new StringBuilder();
		System.out.println("Default capacity: " + sb2.capacity());
		System.out.println();
		// int constructor sets capacity:
		StringBuilder sb3 = new StringBuilder(28);
		System.out.println("Using constructor capacity: " + sb3.capacity());
		System.out.println();
		
		System.out.println("\n2b. Compare String vs StringBuilder concatenation");
		System.out.println();
		String s1 = "Climb";
		String s2 = new String("Everest");
		s1 = s1.concat(" Mt. ").concat(s2);
		System.out.println("Concatenated String: " + s1);
		System.out.println();
		
		sb2 = new StringBuilder(s2);
		System.out.println("Original sb1: " + sb1 + "; length: " + sb1.length() + ", capacity: " + sb1.capacity());
		System.out.println();
		System.out.println("Original sb2: " + sb2 + "; length: " + sb2.length() + ", capacity: " + sb2.capacity());
		System.out.println();
		//Use the append method to add to a mutable StringBuilder object
		sb1.append(" Mt. ").append(sb2);		// append(String) & append(StringBuilder)
		System.out.println("Appended sb1: " + sb1 + "; length: " + sb1.length() + ", capacity: " + sb1.capacity());
		System.out.println();
		
		sb2.append(": Capacity is grown automatically if needed");
		System.out.println("Appended sb2: " + sb2 + "; length: " + sb2.length() + ", capacity: " + sb2.capacity());
        System.out.println();
		System.out.println("-------------------------------------------------------------\n");    	
		return s1;
	}
	
	private String manipulatingText(String s, StringBuilder sb1) {
		System.out.println("3. Manipulating String vs StringBuilder");
		System.out.println();
		System.out.println("Starting text s = " + s + ", sb1 = " + sb1);
		System.out.println();
		System.out.println("3a. Deleting text in the middle:");
		System.out.println();
		// String doesn't have a delete method, use replace with an empty string
		s = s.replace(" Mt.", ""); 
		sb1.delete(sb1.indexOf(" "), sb1.lastIndexOf(" "));
		System.out.println("s = " + s + ", sb1 = " + sb1);
		System.out.println();
		
		System.out.println("3b. Deleting text to the end:");
		System.out.println();
		// For String use substring
		s = s.substring(0, s.indexOf(' '));
		sb1.delete(sb1.indexOf(" "), sb1.length());
		System.out.println("s = " + s + ", x = " + sb1);
		System.out.println();
		
		System.out.println("3c. Adding text at the end:");
		System.out.println();
		s = s.concat(" the mountains");
		sb1.append(" the mountains");
		System.out.println("s = " + s + ", x = " + sb1);
		System.out.println();
		
		System.out.println("3c. Adding text in the middle:");
		System.out.println();
		// String doesn't have an insert method
		s = s.replace("the", "the Andes");
		sb1.insert(sb1.lastIndexOf(" "), " Andes");
		System.out.println("s = " + s + ", x = " + sb1);
		System.out.println();
		
		System.out.println("3d. Replacing characters:");
		System.out.println();
		s = s.replace("mo", "Mo");
		sb1.replace(16, 17, "M");
		System.out.println("s = " + s + ", x = " + sb1);
		System.out.println();
		
		System.out.println("3e. Trimming capacity:");
		System.out.println();
		System.out.print("Before: " + sb1.capacity());
		System.out.println();
		sb1.trimToSize();
		System.out.println("  After: " + sb1.capacity());
		System.out.println();
        System.out.println("-------------------------------------------------------------\n");    	
		return s;
	}
	
	private void otherMethods(StringBuilder x) {
		StringBuilder sb1 = new StringBuilder(x);
		System.out.println("4a. reversed: " + sb1.reverse()); 	    // only available in StringBuilder
		System.out.println();
		x.append(new Dog("Sprout"));
		System.out.println("4b. Add object: " + x);
		System.out.println();
		System.out.println("4c. charAt(31): " + x.charAt(31));
		System.out.println();
		System.out.println("4d. deleteCharAt(31): " + x.deleteCharAt(31));
		System.out.println();
		System.out.println(x.substring(0,16));
		System.out.println();
		System.out.println(x.substring(16));
		System.out.println();
        System.out.println("-------------------------------------------------------------\n");    	
	}
	
	private void methodChaining(StringBuilder x) {
		System.out.println("5. Method Chaining");
		System.out.println();
		// Chained methods are evaluated left to right:
		System.out.println("Before: " + x);
		System.out.println();
		System.out.println("Capacity = " + x.capacity());
		System.out.println();
		x.delete(x.indexOf("a"), x.length())
			.replace(6, 16, " ")
			.insert(6, "up")
			.append(" Rainier")
			.trimToSize();
		System.out.println("After: " + x);
		System.out.println();
		System.out.println("Capacity = " + x.capacity());
		System.out.println();
        System.out.println("-------------------------------------------------------------\n");    	
	}
}







