/*
 *  Definitions.java Copyright 2015, 2020 Steve Montgomery, All rights reserved
 *  1.  Source - the code you write saved in a file with a .java extension
 *  2.  Compiler - a tool (javac) that turns the source code into bytecode and saves it in
 *      a file with the .class extension
 *  3.  Bytecode - compiled code that can be run by any JVM
 *  4.  JVM - Java Virtual Machine, a program that runs your application on a computer or device.
 *  5.  Source file - the file you save when writing Java (this one is named ADefinitions.java
 *  6.  Class - a template that describes the state and behavior of objects
 *  7.  Keyword - a restricted word in java that means something special to the compiler. 
 *      In Eclipse, they are colored purple (by default)
 *  8.  Whitespace - spaces, carriage returns, tabs. They mean nothing to the compiler
 *      
 *  Everything in these first 16 lines is a multi-line or block comment
 *  
 */

// Everything following the // is a single line comment

// This is called the package declaration. It is similar to the directory that this java file is 
// located in. If present, it must be the very first line of code (excluding whitespace and comments)
package rukshanu.core_java.lesson01;

/*
 * This is a class declaration. Everything after the curly brace is the definition of the 
 * class and includes code that models state and behavior. Behavior is modeled in Java by
 * methods. State is modeled by variables.
 * The name of this class is the same as the name of the file.
 * 
 * public means everyone can access it
 * class means you are declaring a class definition
 */
public class Definitions 
{  /* This is an opening curly brace { and indicates the start of a code block that defines the class
    * We say that a code block is delineated by curly braces
    * This is a method. It models behavior in a class definition and consists of a series of
    * statements. Each statement ends in a semicolon ;
	* The main method is a very special method that the JVM looks for in order to start running
	* your code. It must look just like this.
	*/
	public void inClassWork () { // This curly brace indicates the beginning of the block of code that defines the method.
		System.out.println(this.getClass().getSimpleName() + ".inClassWork");
	    // methods are made up of statements. We will learn different types of statements
	    // in another exercise. Statements end in a semicolon ;
	    
	    // These are variables. There are two types: primitives and reference.
		int x;     // This is a primitive variable and uses keywords (in purple)
		boolean b;   // Another primitive that can be either true or false
		String s1;   // This is a reference variable and is defined by a class String

        s1 = "Java Rocks!"; // "Java Rocks" is a String literal
		
        // Statement to print something out in the console window. i
        System.out.println(s1);
	} // This is a closing curly brace and indicates the end of a block of code
	  // This one is for the end of the main method. How do you know this?

} // This curly brace indicates the end of the block of code that defines the class. 

