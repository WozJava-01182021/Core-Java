package robertd.core_java.common.animal.mammals;

import robertd.core_java.common.animal.Animal;

public class Tiger extends Mammal {
	//*********************************VARIABLES SECTION***************************	
	//*************************CONSTRUCTOR SECTION*********************************
	
	public Tiger() {
		setType("tiger");
	}
	
	public Tiger (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
	//****************************METHOD SECTION***********************************	
	@Override
	public void eat() {
		System.out.println(getType() + " chomping on a dead samber deer");
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
