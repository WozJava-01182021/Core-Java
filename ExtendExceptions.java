package robertd.core_java.lesson06;

import robertd.core_java.common.animal.AgeException;
import robertd.core_java.common.animal.Animal;
import robertd.core_java.common.animal.Sex;
import robertd.core_java.common.animal.mammals.Elephant;
import robertd.core_java.common.animal.mammals.Lion;

public class ExtendExceptions {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		System.out.println();

		testAgeException();

		System.out.println("===================================================================\n\n");

	}
	
	private void testAgeException() {
		try {
			Animal a = new Animal(50, Sex.FEMALE);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
	
	
	try {
		Lion leo = new Lion(0, 300, Sex.FEMALE);
	} catch (AgeException e) {
		System.out.println(e.getMessage());
		System.out.println();
	}

}
	
}