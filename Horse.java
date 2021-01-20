package robertd.core_java.common.animal.mammals;

import robertd.core_java.common.animal.Animal;

public class Horse extends Mammal {
	//*********************************VARIABLES SECTION***************************	
	//*************************CONSTRUCTOR SECTION*********************************
	
	public Horse() {
		setType("horse");
	}
	public Horse (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
	//****************************METHOD SECTION***********************************	
	@Override
	public void eat() {
		System.out.println(getType() + " chomping grass");
	}
@Override
public void move() {
	System.out.println(getType() + " galavanting gracefully");
	
}
@Override
public void sleep() {
	System.out.println(getType() + " sleeping on its feet");
}

}
