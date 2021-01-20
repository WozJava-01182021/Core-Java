/*
 * Top level classes can only have public or default level of access
 * 
 * The only non-access modifiers you can use on top level classes are:
 * final - class can't be extended (like String)
 * abstract - class MUST be extended in order to be used
 * strictfp - follows IEEE 754 for floating a point
 * 
 */

package kipk.core_java.lesson02;

import kipk.core_java.common.animal.*;
import kipk.core_java.common.animal.fish.*;
import kipk.core_java.common.animal.mammals.*;

public class Classes {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		
		//allClassesExtendObject();
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
		
		//Object methods:
		System.out.println("obj.toString(); " + obj.toString());
		
		System.out.println("obj.getClass(); " + obj.getClass());
		System.out.println("obj.hashCode(); " + obj.hashCode());
		
		System.out.println("obj.toString(); " + obj2.toString());
		System.out.println("obj.toString(); " + obj3.toString());
		
		System.out.println("obj.toString(); " + obj.equals(obj2));
		System.out.println("obj.toString(); " + obj.equals(obj3));
		
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
		
		Lion leo = new Lion();
		System.out.println("Animal count = " + Lion.getCount());
		
		Tuna charlie = new Tuna();
		System.out.println("Animal count = " + Tuna.getCount());
		
		Whale blue = new Whale();
		System.out.println("Animal count = " + Whale.getCount());
		
		Horse misterEd = new Horse();
		System.out.println("Animal count = " + Horse.getCount());
	
		Animal[] zoo = new Animal[6];
		zoo[0] = dumbo;
		zoo[1] = george;
		zoo[2] = leo;
		zoo[3] = charlie;
		zoo[4] = blue;
		zoo[5] = misterEd;
		
		for (int i=0; i<zoo.length; i++) {
			//Sysytem.out.println uses the 'toString' method for objects
			System.out.println(zoo[i]);
			zoo[i].eat();
			zoo[i].move();
			zoo[i].sleep();
			System.out.println();
		}
		
		}

}
