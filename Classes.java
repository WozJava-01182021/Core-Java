/*
 * Top level classes can only have public or default level of access
 * 
 * The only non-access modifiers you can use on top level classes are:
 * final - class can't be extended (like the string class)
 * abstract - class MUST be extended in order to be used
 * strictfp - follows IEEE 754 for floating point
 * 
 */
package robertd.core_java.lesson02;

import robertd.core_java.common.animal.*;
import robertd.core_java.common.animal.domestic.Horse;
import robertd.core_java.common.animal.fish.*;
import robertd.core_java.common.animal.mammals.*;

public class Classes {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");

//		allClassesExtendObject();
		creatingAnimals();

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
		System.out.println();
		System.out.println("2. Creating more Animal classes.");
		System.out.println();
		System.out.println("Animal count = " + Animal.getCount());

		Animal unknownAnimal = new Animal();
		System.out.println("Animal count = " + unknownAnimal.getCount());

		Elephant dumbo = new Elephant();
		System.out.println("Animal count = " + Elephant.getCount());

		GiantPanda taishan = new GiantPanda();
		System.out.println("Animal count = " + GiantPanda.getCount());

		Lion mufasa = new Lion();
		System.out.println("Animal count = " + Lion.getCount());

		Horse misterEd = new Horse();
		System.out.println("Animal count = " + Horse.getCount());

		Tiger smokeyriverStayPuft = new Tiger();
		System.out.println("Animal count = " + Tiger.getCount());
		
		Tuna trinity = new Tuna();
		System.out.println("Animal count = " + Tuna.getCount());

		Swordfish espadon = new Swordfish();
		System.out.println("Animal count = " + Swordfish.getCount());

		System.out.println();

		Animal[] zoo = new Animal[7];
		zoo[0] = dumbo;
		zoo[1] = taishan;
		zoo[2] = mufasa;
		zoo[3] = misterEd;
		zoo[4] = smokeyriverStayPuft;
		zoo[5] = trinity;
		zoo[6] = espadon;

		for (int i = 0; i < zoo.length; i++) {
			// System.out.println uses the "toString" method for objects
			System.out.println(zoo[i]);
			zoo[i].eat();
			zoo[i].move();
			zoo[i].sleep();
			System.out.println();
		}

	}
}
