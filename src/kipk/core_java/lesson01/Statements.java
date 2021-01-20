package kipk.core_java.lesson01;

public class Statements {
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork");
		//Declaration statements use a data type and name you give it
		int x;
		//32 bit primitive that does not have a decimal
		
		String s1;
		//data type based on a class(not a primitive), but is a reference variable
		
		double d2;
		//64bit primitive that is floating point (with a decimal)
		
		//Assignment Statements
		x = 25; //integer literals are 32 bit
		s1 = "Rocks!";
		d2 = 3.1415; //floating point literals are 64 bit
		// assignment variable, "=" 
		// "Rocks!" is made a place in memory, and assigned "s1" as it's address
		
		//Combination of declaration and assignment
		String s2 = "Java ";
		double d = Math.random();
		
		//This is an expression - a combination of variables, operators, method calls and literals
		d2 = x * d; // * is an operator
		d2 = x + 5 * d; // 5 is a literal, it is a value that you write out
		
		x++; //This is an expression that is also an assignment statement
		
		System.out.println (s2 + s1);// "+" concatenation operator
	}

}
