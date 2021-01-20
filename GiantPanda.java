package robertd.core_java.common.animal.mammals;

import robertd.core_java.common.animal.Animal;

public class GiantPanda extends Mammal {
	//*********************************VARIABLES SECTION***************************	
	//*************************CONSTRUCTOR SECTION*********************************
	
	public GiantPanda() {
		setType("giant panda");
	}
	public GiantPanda (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
		//****************************METHOD SECTION***********************************	
	@Override
	public void eat() {
		System.out.println(getType() + " chomping on bamboo");
	}
@Override
public void move() {
	System.out.println(getType() + " rolling around in circles");
	
}
@Override
public void sleep() {
	System.out.println(getType() + " sleeping on its back");
}

}
