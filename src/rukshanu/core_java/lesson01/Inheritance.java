package rukshanu.core_java.lesson01;


import rukshanu.core_java.lesson01.exercises.Cat;
import rukshanu.core_java.lesson01.exercises.Dog;

public class Inheritance {
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork");
		
		Dog myDog = new Dog();
		myDog.sleep();
		
		Cat myCat = new Cat();
		myCat.sleep();
		
		System.out.println();
	}

}

