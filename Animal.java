package robertd.core_java.common.animal;

import java.util.concurrent.ThreadLocalRandom;

public class Animal extends Object {
//*********************************VARIABLES SECTION***************************	
// Variables with getters and setters
	// Static variables first,

	// This is a static or class primitive variable
	private static int count = 0;

	public static int getCount() {
		return count;
	}

	// This is an instance reference variable
	private String type;

	public String getType() {
		return type;
	}

	final protected void setType(String t) {
		type = t;
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int w) {
		weight = w;
	}

//*************************CONSTRUCTOR SECTION*********************************	

	public Animal() {
		++count;
		type = "unknown animal";
	}

	// This is overloading the constructor
	public Animal(int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}

//****************************METHOD SECTION***********************************	
	// Override Object methods
	@Override
	public String toString() {
		String result = type + "(" + age + "," + weight + ")";
		return result;
	}

	// Class Animal methods
	public void eat() {
		System.out.println(type + "eating");
	}

	public void move() {
		System.out.println(type + " moving");

	}

	public void sleep() {
		System.out.println(type + "sleeping");

	}

	protected int setRandomWeightByAge(int a) {
		int result;
		if (a < 5) {
			result = a + 1;
		} else {
			result = ThreadLocalRandom.current().nextInt(5, 20);
		}
		return result;
	}
}
