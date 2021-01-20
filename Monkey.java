package robertd.core_java.common.animal.mammals;

import robertd.core_java.common.animal.Animal;

public class Monkey extends Mammal {
	//*********************************VARIABLES SECTION***************************	
	//*************************CONSTRUCTOR SECTION*********************************
	
	public Monkey() {
		setType("monkey");
	}
	
	public Monkey (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
	//****************************METHOD SECTION***********************************	
	@Override
	public void eat() {
		System.out.println(getType() + " chomping bananas");
	}
@Override
public void move() {
	System.out.println(getType() + " swinging on a branch");
	
}
@Override
public void sleep() {
	System.out.println(getType() + " sleeping on branch");
}

}
