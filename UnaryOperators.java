/*
 * Unary operators operate on a single operand
 * Prefix operators: ++x, --x      // Change the value before being used
 * Postfix operators: x++, x--     // Change the value after being used
 * Increment operators: ++x, x++   // Increase the value by 1
 * Decrement operators: --x, x--   // Decrease the value by 1
 *
 * +	Unary plus operator; indicates positive value (numbers are positive without this, however)
 * -	Unary minus operator; negates an expression
 * !	Logical complement operator; inverts the value of a boolean
 * ~    Bitwise complement
 *
 * Unary operators have the highest precedence
 * 
 */
package robertd.core_java.lesson04;

public class UnaryOperators {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
	
		testUnaryOperators();
		
		System.out.println("-------------------------------------------------------\n\n");
	}
	
	private void testUnaryOperators() {
		System.out.println();
		System.out.println("Increment prefix operator: ++x");
		System.out.println();
		int x = 10;
		System.out.println(++x);
		System.out.println();
		
		System.out.println("Increment postfix operator: x++");
		System.out.println();
		x = 10;
		System.out.println(x++);
		System.out.println(x);
		System.out.println();
		
		System.out.println("Decrement prefix operator: --x");
		System.out.println();
		x = 10;
		System.out.println(--x);
		System.out.println();
		
		System.out.println("Prefix prefix operator: x--");
		System.out.println();
		x = 10;
		System.out.println(x--);
		System.out.println(x);
		
		System.out.println(" Prefix vs postfix from an interview question:");
		System.out.println();
		x = 10;
		int y = x++ * ++x;
		System.out.println("y = " + y + ", x = " + x);
		x = 2;
		y = x++ * x++ * x++;
		System.out.println("y = " + y + ", x = " + x);
		x = 2;
		y = ++x * ++x * ++x;
		System.out.println("y = " + y + ", x = " + x);
		System.out.println();
		
	}
}
