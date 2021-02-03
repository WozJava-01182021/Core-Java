package robertd.core_java.lesson04;

public class LogicOperators {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		testAnd();
		testOr();
		System.out.println("-------------------------------------------------------\n\n");
	}
	
	private void testAnd() {
		System.out.println("1. AND results: ");
		boolean result;
		
		result = (5 > 3) && (9 > 6);
		System.out.println(result);
		
		result = (5 > 3) && (9 < 6);
		System.out.println(result);
		
		result = (5 < 3) && (9 > 6);
		System.out.println(result);
		
		result = (5 < 3) && (9 < 6);
		System.out.println(result);
		
		System.out.println();
		
		
	}
	
	private void testOr() {
		System.out.println("2. OR results: ");
		boolean result;
		
		result = (5 > 3) || (9 > 6);
		System.out.println(result);
		
		result = (5 > 3) || (9 < 6);
		System.out.println(result);
		
		result = (5 < 3) || (9 > 6);
		System.out.println(result);
		
		result = (5 < 3) || (9 < 6);
		System.out.println(result);
		
		System.out.println();
		
		
	}

}
