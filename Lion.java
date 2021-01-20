package robertd.core_java.common.animal.mammals;

import robertd.core_java.common.animal.Animal;

public class Lion extends Mammal {
	//*********************************VARIABLES SECTION***************************	
	//*************************CONSTRUCTOR SECTION*********************************
	
	public Lion() {
		setType("lion");
	}
	
	public Lion (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
	//****************************METHOD SECTION***********************************	
	@Override
	public void eat() {
		System.out.println(getType() + " chomping on a dead bird");
	}
@Override
public void move() {
	System.out.println(getType() + " stalking its prey");
	
}
@Override
public void sleep() {
	System.out.println(getType() + " sleeping on its belly");
}

}
