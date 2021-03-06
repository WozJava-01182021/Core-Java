package robertd.core_java.common.animal.mammals;

import java.util.ArrayList;
import java.util.List;

import robertd.core_java.common.animal.*;

public abstract class Mammal extends Animal {
	// *********************************VARIABLES SECTION***************************
	private transient boolean running = false;

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean r) {
		running = r;
	}

	public Mammal() {
		setType("unknown mammal");
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

	public void eat() {
		System.out.println(getType() + " eats its prey");
	}

	public void move() {
		System.out.println(getType() + " stalks its prey");

	}

	public void sleep() {
		System.out.println(getType() + " sleeps in intermediate times");
	}

	@Override
	public boolean equals(Object other) {
		if (this == other)
			return true;
		boolean result = false;
		if (other instanceof Mammal) {
			result = super.equals(other) 
					&& maxRunningSpeed == ((Mammal) other).maxRunningSpeed;
		}
		return result;
	}
	
	@Override
	public int hashCode() {
		int code = super.hashCode();
		code ^= prey.hashCode();
		return code;
	}
}