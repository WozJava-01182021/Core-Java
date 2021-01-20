package robertd.core_java.common.animal.mammals;

import robertd.core_java.common.animal.Animal;

public class Elephant extends Mammal {
	//*********************************VARIABLES SECTION***************************	
	
	//*************************CONSTRUCTOR SECTION*********************************
	
	public Elephant() {
		setType("elephant");
	}
	
	public Elephant (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}

	//****************************METHOD SECTION***********************************	
// Class Animal overrides
	@Override
	public void eat() {
		System.out.println(getType() + " chomping on long grass");
	}
@Override
public void move() {
	System.out.println(getType() + " swimming in the water");
	
}
@Override
public void sleep() {
	System.out.println(getType() + " sleeping on its side");
}
}
