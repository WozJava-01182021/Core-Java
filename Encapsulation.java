package robertd.core_java.lesson02;

import robertd.core_java.common.animal.mammals.Elephant;
import robertd.core_java.common.animal.mammals.Lion;

public class Encapsulation {

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
		
		Lion mufasa = new Lion();
		mufasa.setAge(-1);
		System.out.println(mufasa);
		
		mufasa.setAge(15);
		System.out.println(mufasa);
		
		mufasa.setAge(0);
		System.out.println(mufasa);
		
		mufasa.grow();
		mufasa.grow();
		mufasa.grow();
		mufasa.grow();
		System.out.println(mufasa);
}
}