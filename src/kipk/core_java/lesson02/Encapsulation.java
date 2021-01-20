
package kipk.core_java.lesson02;

import kipk.core_java.common.animal.mammals.Elephant;
import kipk.core_java.common.animal.mammals.Lion;

public class Encapsulation {

	public Encapsulation() {
		
	}

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		Elephant ellie = new Elephant();
		ellie.setAge(-1);
		System.out.println(ellie);
		
		ellie.setAge(71);
		System.out.println(ellie);
		
		ellie.setAge(0);
		System.out.println(ellie);
		
		ellie.grow();
		System.out.println(ellie);
		
		Lion simba = new Lion();
		simba.setAge(-1);
		System.out.println(simba);
		
		simba.setAge(15);
		System.out.println(simba);
		
		simba.setAge(0);
		System.out.println(simba);
		
		simba.grow();
		simba.grow();
		simba.grow();
		simba.grow();
		simba.grow();
		System.out.println(simba);
			
	}
}

