package rukshanu.core_java.lesson02;

import rukshanu.core_java.common.animal.*;
import rukshanu.core_java.common.animal.fish.Tuna;
import rukshanu.core_java.common.animal.mammals.*;

public class Classes {
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		allClassesExtendObject();
		
		System.out.println();
	}
	private void allClassesExtendObject() {
		System.out.println("1. All classes extend Object and inherit Object methods");
		Object obj = new Animal();
		Object obj2 = obj;
		Object obj3 = new Animal();
		Animal animal = new Animal();
		animal.setAge(12);
		animal.setWeight(50);
		obj2 = animal;
		
		// Object methods:
		System.out.println("obj.toString(): " + obj.toString());
		System.out.println("obj.getClass(): " + obj.getClass());
		System.out.println("obj.hashCode(): " + obj.hashCode());
		System.out.println("obj2.toString(): " + obj2.toString());
		System.out.println("obj3.toString(): " + obj3.toString());
		System.out.println("obj.equals(obj2): " + obj.equals(obj2));
		System.out.println("obj.equals(obj3): " + obj.equals(obj3));
	}
	private void creatingAnimals() {
		System.out.println("2. Creating more Animal classes.");
		System.out.println("Animal count = " + Animal.getCount());
		Animal unknownAnimal = new Animal();
		System.out.println("Animal count = " + unknownAnimal.getCount());
		Elephant dumbo = new Elephant();
		System.out.println("Animal count = " + Elephant.getCount());
		Monkey george = new Monkey();
		System.out.println("Animal count = " + Monkey.getCount());

		Tuna charlie = new Tuna();
		System.out.println("Animal count = " + Tuna.getCount());
		Horse misterEd = new Horse();
		System.out.println("Animal count = " + Horse.getCount());
		
		Animal[] zoo = new Animal[6];
		zoo[0] = dumbo;
		zoo[1] = george;
		// z; create one
		zoo[3] = charlie;
		zoo[4] = new Lion();
		zoo[5] = misterEd;
		for (int i=0; i<zoo.length; i++) {
			// System.out.println uses the 'toString' method for objects
			System.out.println(zoo[i]);
			zoo[i].eat();
			zoo[i].move();
			zoo[i].sleep();
			System.out.println();
		}
	}

}
