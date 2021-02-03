package robertd.core_java.lesson04;

import robertd.core_java.common.animal.Sex;
import robertd.core_java.common.animal.birds.BirdFood;
import robertd.core_java.common.animal.mammals.Elephant;

public class Equality {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		primitiveEquality();
		enumEquality();
		referenceEquality();
		System.out.println("-------------------------------------------------------\n\n");
	}

	private void primitiveEquality() {
		int x = 7;
		int y = 7;
		// Test for equality is the double equal
		System.out.println(x == y);
		// Test for inequality is the bang equal
		System.out.println(x != y);

		// Primitives support equality of all numeric types
		double dy = 7.0;
		System.out.println(x == dy);
		System.out.println(x != dy);
		
		float fy = 7.0F;
		System.out.println(x == fy);
		System.out.println(x != fy);
		System.out.println();
	}

	private void referenceEquality() {
		System.out.println("3. Reference equality");
		Elephant e1 = new Elephant();
//		e1.setAge(5);
//		e1.setWeight(500);
//		e1.setSex(Sex.MALE);
		Elephant e2 = new Elephant();
//		e2 = null;
		System.out.println(e1 == e2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));

	}

	private void enumEquality() {
		System.out.println("2. Enum equality");
		BirdFood foodType = BirdFood.UNKNOWN;
		System.out.println(foodType == BirdFood.FRUIT);
		System.out.println(foodType == BirdFood.UNKNOWN);
		System.out.println();
	}

}