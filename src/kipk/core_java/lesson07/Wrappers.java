/*
 * Wrappers.java Copyright 2015,2018 Steve Montgomery, All rights reserved
 * Java SE8 Programmer I Exam Guide pp 192,384-388
 * Wrapper: An object that holds the value of a primitive
 *                      
 *            string
 *             /  \
 *            /    \
 *           /      \
 *  primitive ------ wrapped reference
 *
 * Autoboxing
 */
package kipk.core_java.lesson07;

public class Wrappers  {
	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		// Demonstrations minimal coding
		constructorsUsingPrimitives();
		constructorsUsingStrings();
		usingValueOf();
		usingXxxValue();
		usingParseXxx();
		usingToString();
		preJava5UsingWrappers();
		autoboxing();
		autoUnboxing();
		boxingAndEquality();
//		badFormatCode();
		System.out.println("===================================================================\n\n");
	}

	private void constructorsUsingPrimitives() {
		System.out.println("1. Create wrappers using constructors with primitives:");
		Byte wByt = new Byte((byte)127);
		Short wSht = new Short((short)(2015-15));
		Integer wInt = new Integer(32767 - 67);         // Can use expressions
		Long wLng = new Long(0x1234_5678_90L);
		Float wFlt = new Float(3.1415927 * 10);         // no cast or f needed
		Double wDbl = new Double(3.1415927);
		Boolean wBoo = new Boolean(true);
		Character wChr = new Character('\u0066');
		System.out.println("Byte: " + wByt + "; Short: " + wSht + "; Integer: " + wInt);
		System.out.println("Long: " + wLng + "; Float: " + wFlt + "; Double: " + wDbl);
		System.out.println("Boolean: " + wBoo + "; Character: " + wChr);
		System.out.println ("---------------------------------------------------------------------\n");
	}

	private void constructorsUsingStrings() {
		System.out.println("2. Create wrappers using constructors with Strings:");
		// 128 gives NumberFormatException because value is out of range
		Byte wByt = new Byte("127");
		Short wSht = new Short("32767");
		Integer wInt = new Integer("2014");  // can't use expressions: new Integer("1024+7") gives NumberFormatException
		Long wLng = new Long("314");
		Float wFlt = new Float("3.1415927f");           // Can even use f
		Double wDbl = new Double("3.1415927d");
		Boolean wBoo = new Boolean("TruE");         // No problems with case
		// There is no Character constructor that uses Strings
		System.out.println("Byte: " + wByt + "; Short: " + wSht + "; Integer: " + wInt);
		System.out.println("Long: " + wLng + "; Float: " + wFlt + "; Double: " + wDbl);
		System.out.println("Boolean: " + wBoo);
		System.out.println ("---------------------------------------------------------------------\n");
	}

	private void usingValueOf() {
		System.out.println("3. use valueof() methods, note flexibility of using radix:");
		Integer i4a = Integer.valueOf(1024+7);        // using primitive expression
		Integer i4b = Integer.valueOf("-2015");       // using string, no expression possible
		Integer i4c = Integer.valueOf("babe", 16);    // using string with a radix
		Integer i4d = Integer.valueOf("-1001000", 5);
		i4d = Integer.valueOf(0b1001000);
		// STUDENT EXERCISE: try with other radixes
		System.out.println("Primitive: " + i4a + "; String: " + i4b + "; Hex: " + i4c + "; Binary: " + i4d);
		System.out.println ("---------------------------------------------------------------------\n");
	}

	private void usingXxxValue() {
		Integer wInt = Integer.valueOf("Face", 16);    // using string with a redix
		Double wDbl = 3.1415927;
		Character wChr = 0b100_1000;
		Boolean wBoo = false;
		System.out.println("4. convert Wrappers to primitives using xxxValue");
		byte byt = wInt.byteValue();
//		byt = wDbl.byteValue();
		short shr = wInt.shortValue();
		int igr = wInt.intValue();
//		igr = wDbl.intValue();
		long lng = wDbl.longValue();
		float flt = wInt.floatValue();
		double dbl = wInt.doubleValue();
		boolean boo = wBoo.booleanValue();              // Only for Boolean class
		char chr = wChr.charValue();                    // Only for Character class
		System.out.println("byt: " + byt + ";  shr: " + shr + ";  igr: " + igr + ";  lng: " + lng);
		System.out.println("flt: " + flt + ";  dbl: " + dbl + "; boo: " + boo + "; chr: " + chr);
		System.out.println ("---------------------------------------------------------------------\n");
	}

	private void preJava5UsingWrappers() {
		System.out.println("7. Using Wrappers before Java 5:");
		Integer y = new Integer(567);
		int x = y.intValue();
		x++;
		y = new Integer(x);
		System.out.println("y = " + y);

		System.out.println ("---------------------------------------------------------------------\n");
	}

	private void autoboxing() {
		System.out.println("8. Autoboxing of primitives as of Java 5:");
		Byte wByt = -128;
		Short wSht = -32768;
		Integer wInt = 7 * 25 - 3;
		Long wLng = 0b11001100_11001100_11001100_11001100_11001100L;
		Float wFlt = 3.1416f + 0.352f;
		Double wDbl = 3.1415927;
		Boolean wBoo = true;                            // only keyword
		Character wChr = 0b100_1000;
		System.out.println("Byte: " + wByt + "; Short: " + wSht + "; Integer: " + wInt);
		System.out.println("Long: " + wLng + "; Float: " + wFlt + "; Double: " + wDbl);
		System.out.println("Boolean: " + wBoo + "; Character: " + wChr);
		System.out.println ("---------------------------------------------------------------------\n");
	}

	private void autoUnboxing() {
		// We need some wrapper objects to do this test
		Byte wByt = new Byte("127"); 
		Short wShr = new Short((short)(2015-15));
		Integer wInt = Integer.valueOf("Face", 16);    // using string with a radix
		Long wLng = new Long((long)3.14);            
		Double wDbl = 3.1415927;
		Character wChr = 0b100_1000;
		Boolean wBoo = true;

		System.out.println("9. Convert wrappers to primitives using auto-unboxing as of Java 5:");
		byte b6 = wByt;
		short s6 = wShr;
//		s6 = (short)wInt;                        // No auto unboxing
		int i6 = wInt;
		long L6 = wLng;
		float f6 = wLng;
		double d6 = wDbl;
		boolean boo6 = wBoo;
		char ch6 = wChr;
		System.out.println("b6: " + b6 + ";  s6: " + s6 + ";  i6: " + i6 + ";  L6: " + L6);
		System.out.println("f6: " + f6 + ";  d6: " + d6 + "; boo6: " + boo6 + "; ch6: " + ch6);
		System.out.println ("---------------------------------------------------------------------\n");
	}

	private void usingParseXxx() {
		System.out.println("5. Convert strings to primitives using parseXxx():");
		byte b7 = Byte.parseByte("127");
//		byte b7 = Byte.parseByte("128");
		int i7 = Integer.parseInt("dead", 16);        // using radix
//		int i7 = Integer.parseInt("-2014.6");
//		int i7 = Integer.parseInt("-1001001", 3);     // using radix
//		int i7 = Integer.parseInt("7up");
		double d7 = Double.parseDouble("3.1416");
		System.out.println("b7: " + b7 + "; i7 (base 16): " + i7 + "; d7: " + d7);
		System.out.println ("---------------------------------------------------------------------\n");
	}

	private void usingToString() {
		Integer i4c = Integer.valueOf("fade", 16);    // using string with a radix
		Double d3 = 3.1415927;
		Character c3 = 0b100_1000;
		System.out.println("6. Convert wrappers to strings using toString():");
		String c8 = c3.toString();
		String i8a = i4c.toString();
		String i8b = Integer.toHexString(i4c);
		String i8c = Integer.toBinaryString(i4c);
		String i8d = Integer.toOctalString(i4c);
		String d8a = d3.toString();
		System.out.println(c8 + "; " + i8a + "; " + i8b + "; " + i8c + "; " + i8d);
		System.out.println ("---------------------------------------------------------------------\n");
	}

	public void boxingAndEquality() {
		System.out.println("10. Boxing, == and .equals():");
		Integer i1 = 1000;		// Try 100, 127, 128
		Integer i2 = 1000;
		System.out.println("Normal wrapper equality using 1000");
		System.out.print("i1.equals(i2): " + i1.equals(i2));
		System.out.println("  i1 == i2: " + (i1 == 12));

		Byte b1 = 10;
		Byte b2 = 10;
		System.out.println("\nSpecial case wrappers for values from -128 to +127");
		System.out.print("b1.equals(b2): " + b1.equals(b2));
		System.out.println("  b1 == b2: " + (b1 == b2));
		System.out.println ("---------------------------------------------------------------------\n");
	}

	public void badFormatCode() {
		// can't use expressions with Strings: gives NumberFormatException
		Integer wInt = new Integer("1024+7");
		int i7 = Integer.parseInt("7up");
		Byte wByt = new Byte("128"); 			// 128 is out of range for a Byte
	}

	public static void main(String[] s) {
		Wrappers learnWrappers = new Wrappers();
		learnWrappers.inClassWork();
		
	}
}