package robertd.core_java.common.animal.birds;

import java.util.ArrayList;
import java.util.List;

import robertd.core_java.common.animal.Animal;

public abstract class Bird extends Animal {

	protected BirdFood birdfood;

	public String getFood() {
		return birdfood.toString().toLowerCase();
	}

	public Bird() {
		setType("unknown bird");
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

	public void eat() {
		System.out.println(getType() + " eats insects");
	}

	@Override
	public void move() {
		if (canFly()) {
			System.out.println(getType() + " flying!");
		} else if (canRun()) {
			System.out.println(getType() + " running!");
		} else if (canSwim()) {
			System.out.println(getType() + " swimming!");
		} else {
			throw new RuntimeException("Bird can't fly, run or swim: implement the correct behavior in your class");
		}

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

	// Bird methods
	public boolean canFly() {
		return false;
	}

	public boolean canRun() {
		return true;
	}

	public boolean canSwim() {
		return false;
	}
}
