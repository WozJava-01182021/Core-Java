package robertd.core_java.common.animal;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

import robertd.core_java.common.ecosystem.Ecosystem;
import robertd.core_java.common.ecosystem.EcosystemType;

public class Animal extends Object implements Comparable<Animal>, Serializable {

//*********************************VARIABLES SECTION***************************	
/* 
 * Variables with getters and setters
 * Static variables first, others organized by chapter
 */

	private static final long serialVersionUID = 8735285657546490836L;
	
	// This is a static or class primitive variable
	private static int count = 0;

	public static int getCount() {
		return count;
	}

	// This is an instance reference variable
	private String type;

	public String getType() {
		String t = type;
		if (this.getAge() == 0) {
			t = "baby " + type;
		} else if (this.getAge() < MATURITY) {
			t = "juvenile " + type;
		} else if (this.getAge() > MAX_AGE)
			t = "dead" + type;
		
		return t;

	}
	

	final protected void setType(String t) {
		type = t;
	}

	private int age = 0;

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		if (a < 0) {
			age = 0;
			throw new AgeException(a, MAX_AGE, this.getClass());
		} else if (a > MAX_AGE) {
			age = a + 1;
			System.out.println(this.toString() + " has died");
			throw new AgeException(a, MAX_AGE, this.getClass());
		} else {
			age = a;
		}
	}

	protected int MATURITY;
	protected int MAX_AGE;
	protected int BIRTH_WEIGHT;
	protected int ADULT_FEMALE_MIN_WEIGHT;
	protected int ADULT_FEMALE_MAX_WEIGHT;
	protected int ADULT_MALE_MIN_WEIGHT;
	protected int ADULT_MALE_MAX_WEIGHT;

	public int getMAX_AGE() {
		return MAX_AGE;
	}

	public int getMAXAGE() {
		return MAX_AGE;
	}

	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int w) {
		if (w >= 0)
			weight = w;
	}

	private Sex sex = Sex.FEMALE;

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex s) {
		sex = s;
	}

	private byte health = 10;

	public byte getHealth() {
		return health;
	}
	
	public void setHealth(byte b) {
		if (b <= 10 && b >= -10) {
			health = b;
		} else {
			throw new IllegalArgumentException("Health must be between -10 and +10 inclusive");
		}
	}
	
	private transient boolean targeted = false;
	public boolean isTargeted() {
		return targeted;
	}
	public void setTargeted (boolean b) {
		targeted = b;
	}
	
	private EcosystemType ecosystem = EcosystemType.UNKNOWN;
	public void setEcosystem(EcosystemType est) { ecosystem = est; }
	public EcosystemType getEcosystem() { EcosystemType ecosystemType = null;
	return ecosystemType; }
	
	

//*************************CONSTRUCTOR SECTION*********************************	

	static {
		System.out.println("In Animal static initialization block");
	}

	{
//		System.out.println("In Animal initialization block");
		MATURITY = 12;
		MAX_AGE = 50;
		BIRTH_WEIGHT = 1;
		ADULT_FEMALE_MIN_WEIGHT = 10;
		ADULT_FEMALE_MAX_WEIGHT = 15;
		ADULT_MALE_MIN_WEIGHT = 12;
		ADULT_MALE_MAX_WEIGHT = 18;
		++count;
		type = "unknown animal";
	}

	public Animal() {
		System.out.println();
//		System.out.println("In Animal no-arg constructor");
	}

	// This is overloading the constructor
	public Animal(int a) {
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}

	public Animal(int a, Sex s) {
		this(a);
		setSex(s);
	}

//****************************METHOD SECTION***********************************	
	// Override Object methods
	@Override
	public String toString() {
		String result = type + "(" + age + "," + weight;
		result += ". " + getSex().toString().charAt(0) + ")";
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		boolean result = false;
		if (other.getClass() == this.getClass()) {
			Animal aRef = (Animal)other;
			result = this.type.equalsIgnoreCase(aRef.type) &&
					this.age == aRef.age &&
					this.weight == aRef.weight &&
					this.sex == aRef.sex; 
//					this.ecosystem == aRef.ecosystemType;
				
		}
		return result;
	}
	
	@Override
	public int hashCode() {
		int code = type.toLowerCase().hashCode();
		// ^= is the bitwise XOR assignment operator
		code ^= (age * 17);
		code ^= (weight * 31);
		code += sex.toString().hashCode();
//		code ^= ecosystemType.toString().hashCode();
		return code;
	}

	// Class Animal methods
	public void eat() {
		System.out.println(type + "eating");
	}

	public void move() {
		System.out.println(type + " moving");

	}
	
//	public abstract void move();

	public void sleep() {
		System.out.println(type + "sleeping");

	}

	public void setRandomWeightByAge() {
		setRandomWeightByAge(ADULT_FEMALE_MIN_WEIGHT, ADULT_FEMALE_MAX_WEIGHT, ADULT_MALE_MIN_WEIGHT,
				ADULT_MALE_MAX_WEIGHT, BIRTH_WEIGHT);
	}

	protected int setRandomWeightByAge(int a) {
		int result;
		if (a < 5) {
			result = a + 1;
		} else {
			result = ThreadLocalRandom.current().nextInt(12, 200);
		}
		return result;
	}

	public void setRandomWeightByAge(int femaleMinWeight, int femaleMaxWeight, int maleMinWeight, int maleMaxWeight,
			int birthWeight) {
		int adultMinWeight, adultMaxWeight;

		if (this.sex == Sex.FEMALE) {
			adultMinWeight = femaleMinWeight;
			adultMaxWeight = femaleMaxWeight;
		} else {
			adultMinWeight = maleMinWeight;
			adultMaxWeight = maleMaxWeight;
		}

		if (getAge() == 0) {
			setWeight(birthWeight);
		} else if (getAge() <= MATURITY) {
			double proportion = getAge() / (double) MATURITY;
			setWeight((int) (adultMinWeight * proportion));
		} else {
			setWeight(ThreadLocalRandom.current().nextInt(adultMinWeight, adultMaxWeight));
		}
	}

	public void grow() {
		setAge(age + 1);
		int oldWeight = weight;

		setRandomWeightByAge();
		if (weight < oldWeight) {
			weight = oldWeight;
		}
	}

	public Animal reproduce() {
		if (this.sex == Sex.MALE) {
			System.out.println("Male" + getType() + " looks for female " + getType());
			return null;
		}

		if (age > MATURITY) {
			return new Animal(0);
		} else {
			System.out.println("Female " + getType() + " is not old enough.");
			return null;
		}
	}
		
		public void changeHealth(int x) {
			int newHealth = health + x;
			if (newHealth > 10) {
				health = 10;
			}else if (newHealth < -10) {
				health = -10;
			}else {
				health = (byte)newHealth;
			}
		}
		
		// Implement Comparable interface
		@Override
		public int compareTo(Animal otherAnimal) {
			int result = 0;
			result = type.compareToIgnoreCase(otherAnimal.type);
			if (result == 0) {
				result += new Integer(age).compareTo(new Integer(otherAnimal.age));
				if (result == 0) {
					result += new Integer(weight).compareTo(new Integer(otherAnimal.weight));
					if (result == 0) {
						result += sex.compareTo(otherAnimal.sex);
					}

				}
			}
			return result;
		}
	}

