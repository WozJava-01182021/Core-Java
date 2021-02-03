package robertd.core_java.lesson01;

public class Statements {

		public void inClassWork() {
			System.out.println(this.getClass().getSimpleName() + ".inClassWork()");

		    // Declaration statements
			int x;          //This is a primitive declaration
			String s1;      //This is a reference variable declaration
			double d2;
			
			// Assignment statements
			x = 25;             // Integer literals are 32 bit
			s1 = "Rocks!";
			d2 = 3.1415;        // Floating point literals are 64 bit
			
			// Combination of declaration and assignment
			String s2 = "Java ";
			double d = Math.random();
			
			// This is an expression - a combination of variables, operators, method calls and literals
			d2 = x * d;
			d2 = x + 5 * d;
			// A literal is a value that you write out.
			
			x++; // this is an expression that is also a statement
			
			System.out.println (s2 + s1);
			System.out.println();
	}

}
