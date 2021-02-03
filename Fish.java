package robertd.core_java.common.animal.fish;

import java.util.ArrayList;
import java.util.List;

import robertd.core_java.common.animal.*;

public abstract class Fish extends Animal implements Carnivore {
// *********************************VARIABLES SECTION***************************

	public Fish() {
		setType("unknown fish");
	}

	protected List<String> prey = new ArrayList<>();
	protected String preyFound = null;
	protected String preyCaught = null;

	private int maxRunningSpeed = 1;

	protected void setMaxRunningSpeed(int speed) {
		if (speed > 1) {
			maxRunningSpeed = speed;
		}
	}
	// *************************CONSTRUCTOR SECTION*********************************

	

	// ****************************METHOD SECTION***********************************

	public int getRunningSpeed() {
		int speed = maxRunningSpeed;
		if (getHealth() > 4)
			speed = maxRunningSpeed;
		else if (getHealth() > 3)
			speed = (int) (maxRunningSpeed * 0.9);
		else if (getHealth() > 1)
			speed = (int) (maxRunningSpeed * 0.8);
		else if (getHealth() > -1)
			speed = (int) (maxRunningSpeed * 0.7);
		else if (getHealth() > -2)
			speed = (int) (maxRunningSpeed * 0.6);
		else if (getHealth() > -4)
			speed = (int) (maxRunningSpeed * 0.5);
		else if (getHealth() > -6)
			speed = (int) (maxRunningSpeed * 0.2);
		else if (getHealth() > -8)
			speed = (int) (maxRunningSpeed * 0.1);
		else
			speed = 1;
		return speed;
	}

// ****************************METHOD SECTION***********************************
	public void eat() {
		System.out.println(getType() + " eats pelk");
	}

	public void move() {
		System.out.println(getType() + " swimming in circles");

	}

	public void sleep() {
		System.out.println(getType() + " sleeping with eyes open");
	}

	public void hunt() {

	}

	
	public String findPrey() {
		return null;
	}

	
	public boolean catchPrey(Animal target) {
		return false;
	}

}