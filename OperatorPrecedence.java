/*
 * Operator precedence determines the order in which operators are evaluated.
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 *
 * OPERATOR PRECEDENCE TABLE (highest to lowest)
 *		unary			++ -- + - ~ !
 *		multiplicative	* / %
 *		additive		+ -
 *		shift			<< >> >>>
 *		relational		< > <= >= instanceof
 *		equality		== !=
 *		bitwise logic	& ^ |
 *		logical AND     &&
 *		logical OR      ||
 *		ternary         ? :
 *		assignment      = += -= *= /= %= &= ^= |= <<= >>= >>>=
 *
 * Operators of equal precedence are evaluated from left to right except for
 * assignment operators which are evaluated right to left
 *
 */

package robertd.core_java.lesson04;

public class OperatorPrecedence {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		System.out.println();

		testOperatorPrecedence();
		
		System.out.println("-------------------------------------------------------\n\n");
	}
	
	private void testOperatorPrecedence() {
		int test1 = 3 + 4 * 5 + 2;
		System.out.println(test1);
		
		boolean test2 = 3 + 4 * 5 - 2 > (3+4) * (5-2) || 7 > 3;
		System.out.println(test2);
		
	
	}
	
	
}
