package robertd.core_java.common.animal.mammals;

import robertd.core_java.common.animal.Animal;

public abstract class Mammal extends Animal {
	//*********************************VARIABLES SECTION***************************	
	//*************************CONSTRUCTOR SECTION*********************************
	//****************************METHOD SECTION***********************************	
	@Override
	public void eat() {
		System.out.println(getType() + " eating savagely");
	}
@Override
public void move() {
	System.out.println(getType() + " creeping around");
	
}
@Override
public void sleep() {
	System.out.println(getType() + " sleeping with eyes open");
}
}
