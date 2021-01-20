package robertd.core_java.common.animal.fish;

import robertd.core_java.common.animal.Animal;

public abstract class Fish extends Animal {
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
