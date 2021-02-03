/*
 * Primitives.java Copyright 2013, 2015, 2021 Steve Montgomery all rights reserved
 * 
 * Variable - placeholder used to identify data. There are two types of variables: primitive and reference.
 * Variables fall into two categories based on what kind they are
 *   primitives - built into the language itself using java keywords
 *   reference - stores the address of an object on the heap
 * 
 * Type - what a particular variable is
 * Identifier - the name of a variable. Identifiers must be composed of only Unicode characters, numbers, 
 *             currency symbols and connecting characters. (rules p 53)
 * Primitive - Data types defined directly in Java. They have their own keywords.
 *             They are byte, short, int, long, float, double, boolean and char.
 * Keyword - one of 50 reserved words which have a predefined meaning in Java (table p 53)
 * Numeric datatypes - numbers: byte, short, int, long, float, double
 * Integer datatypes - numbers without decimal points: byte, short, int, long
 * Floating point datatypes - numbers with a decimal point: float, double
 * Literal - a source code representation of data. They can be primitives, strings and null
 * 
 * Based on location
 * Local variables declared in a method
 * instance variables declared at the class level without the static keyword
 * class variables declared at the class level with the static keyword
 */

package robertd.core_java.lesson01;

public class Primitives {
	static String classVar = "Class Variable";
	String instanceVar = "Instance Variable";

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
	    // int is the type, count is the name or identifier (p50)
	    int count;
	    
	    // three ways to assign a value to a variable (p52):
	    count = 12;        // using a literal
	    int other = 6;
	    count = other;     // using another variable
	    count = other * 3; // using an expression
	    
		// numeric literals
		byte w = 127;			// bytes are 8 bits long		range -128 to +127
		// STUDENT EXERCISE: change w to 0, 128, -128, -129, what happens?
		
		short x = 32767;		// shorts are 16 bits long		range -32768 to +32767
		x = 32767;        		// in range
		// STUDENT EXERCISE: change x to 32768, -32768, -32769, what happens?
		
		int y = 1234567891;				// ints are 32 bits long		range -2e31 to +2e31-1
		long z = -1234567890123456789L;	// longs are 64 bits long       range -2e63 to +2e63-1
		long numberOfStarsInMilkyWay = 200_000_000_000L;
		// integer literal default is an int (32 bits)
		System.out.println("byte = " + w + ",  short = " + x + ",  int = " + y + ",  long = " + z);
		// STUDENT EXERCISE: remove the L, change it to lower case, what happens?

		// floating point literals
		double d = 123456789.123456789;
		float f = 123456789.123456789F;
		System.out.println("double = " + d + ",  float f = " + f );
		// STUDENT EXERCISE: remove the F, change it to f, what happens?
		
		// booleans
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1 = " + b1 + ",  b2 = " + b2);
		
		// characters
		char a = 'a';
		char p = '\t'; // tab
		char c = 66;
		char c1 = '\u0066';
		System.out.println("a = " + a + ",  p = " + p + ",  c = " + c + ",  c1 = " + c1);
		// STUDENT EXERCISE: change p to \b, \\, \', \", \n, \r, what happens?

		System.out.println();
	}

}
