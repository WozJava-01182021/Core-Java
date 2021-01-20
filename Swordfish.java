package robertd.core_java.common.animal.fish;

public class Swordfish extends Fish{
	//*********************************VARIABLES SECTION***************************	
	
	//*************************CONSTRUCTOR SECTION*********************************
	
	public Swordfish() {
		setType("swordfish");
	}
	
	public Swordfish (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}

	//****************************METHOD SECTION***********************************	
// Class Animal overrides
	@Override
	public void eat() {
		System.out.println(getType() + " eating minnows");
	}
@Override
public void move() {
	System.out.println(getType() + " stabbing sharks");
	
}
@Override
public void sleep() {
	System.out.println(getType() + " sleeping in circles");
}

}
