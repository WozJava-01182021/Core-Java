package kipk.core_java.common.animal;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

import kipk.core_java.common.ecosystem.EcosystemType;

public class Animal extends Object implements Comparable<Animal>, Serializable { //extends Object automatically
//************************VARIABLES SECTION *****************************
// Variables with getters and setters
// Static Variables first, others organized by chapter
	
	private static final long serialVersionUID = 1L;
	
	//This is a static or class primitive variable
	private static int count = 0;
	public static int getCount() { return count; }
	
	// This is an instance reference variable
	private String type;
	public String getType() {
				return type;}
	final protected void setType (String t) { type = t; }
	
	private int age;
	public int getAge() { return age; }
	public void setAge(int a) {
		if (a < 0) {
			age = 0;
		}else if (a > MAX_AGE) {
			age = a + 1;
			System.out.println(this.toString() + " has died");
		}else {
			age = a;
		}
	}
	
	protected int MATURITY = 12;
	protected int MAX_AGE = 50;
	protected int BIRTH_WEIGHT = 10;
	protected int ADULT_FEMALE_MIN_WEIGHT = 100;
	protected int ADULT_FEMALE_MAX_WEIGHT = 150;
	protected int ADULT_MALE_MIN_WEIGHT = 120;
	protected int ADULT_MALE_MAX_WEIGHT = 180;
	public int getMaxAge() { return MAX_AGE; }
	
	private int weight;
	public int getWeight() { return weight; }
	public void setWeight(int w) {
		if (w>=0) weight = w;
	}
	
	private Sex sex = Sex.FEMALE;
	public Sex getSex() { return sex; }
	public void setSex(Sex s) { sex = s; }
	
	private byte health = 10;
	public byte getHealth() { return health; }
	public void setHealth(byte b) {
		if(b <= 10 && b >=-10) {
			health = b;
		}else {
			throw new IllegalArgumentException("Health must be between -10 and +1- inclusive");
		}
	}
	
	private boolean targeted = false;
	public boolean isTargeted() { return targeted; }
	public void setTargeted (boolean b) { targeted = b; }
	
	private EcosystemType ecosystemType = EcosystemType.UNKNOWN;
	public void setEcosystem(EcosystemType est) { ecosystemType = est; }
	public EcosystemType getEcosystem() { return ecosystemType; }
	
//************************CONSTRUCTORS SECTION *****************************	
	
	//constructors are automatically made, until you insert your own, similar to how everything extends object initially
	//Constructors and init blocks
	//static init blocks first, regular second
	//not arg constructor third, other constructors next
	static {
//		System.out.println("In Animal Static Init Block");
	}
	
	{
//		System.out.println("In Animal Init Block");
		MATURITY = 12;
		MAX_AGE = 50;
		++count;
		type = "unkown animal";
	}
	
	public Animal () { //open and close parenthesis are called "No Arg Constructor
		System.out.println("In Animal No Arg COnstructor");
		++count; //same as count = count + 1
		type = "unknown animal";
	}
	
	// This is overloading the constructor
	public Animal (int a) {
		this();
		setAge(a);
		setWeight(setRandomWeightByAge(a));
	}
	
	public Animal (int a, Sex s) {
		this(a);
		setSex(s);
	}
//************************METHOD SECTION *****************************
	//Override Object methods
	@Override
	public String toString() {
		String result = type + "(" + age + ", " + weight;
		result += ", " + getSex().toString().charAt(0) + ")";
		return result;
	}
	
	//Class Animal methods
	public void eat() {
		System.out.println(type + " eating");
	}
	public void move() {
		System.out.println(type + " moving");
	}
	public void sleep() {
		System.out.println(type + " sleeping");
	}
	
	public void setRandomWeightByAge() {
		setRandomWeightByAge(ADULT_FEMALE_MIN_WEIGHT, ADULT_FEMALE_MAX_WEIGHT, ADULT_MALE_MIN_WEIGHT, ADULT_MALE_MAX_WEIGHT, BIRTH_WEIGHT);
	}
	
	protected int setRandomWeightByAge(int a) {
		int result;
		if (a < 5) {
			result = a + 1;
		} else {
			result = ThreadLocalRandom.current().nextInt(5,20);
		}
		return result;
	}
	
	//This is Overloading because we are using the same name and changing the argument list
	protected void setRandomWeightByAge(int femaleMinWeight, int femaleMaxWeight, int maleMinWeight, int maleMaxWeight, int birthWeight) {
		
		int adultMinWeight, adultMaxWeight;
		
		if (this.sex == Sex.FEMALE) {
			adultMinWeight = femaleMinWeight;
			adultMaxWeight = femaleMaxWeight;
		}else {
			adultMinWeight = maleMinWeight;
			adultMaxWeight = maleMaxWeight;
		}
		
		if (getAge() == 0) {
			setWeight(birthWeight);
		}else if (getAge() <= MATURITY) {
			double proportion = getAge()/(double)MATURITY;
			setWeight((int)(adultMinWeight * proportion));
		}else {
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
		if (sex == Sex.MALE) {
			System.out.println("Male "
					+ "" + getType() + " looks for female" + getType());
			return null;
		}
		
		if (age > MATURITY) {
			return new Animal(0);
		} else {
			System.out.println("Female " + getType() + " is not old enough.");
			return null;
		}
	}
	
	//Implement Comparable Interface
	@Override
	public int compareTo(Animal otherAnimal) {
		int result = 0;
		result = type.compareToIgnoreCase(otherAnimal.type);
		if (result == 0) {
			result += new Integer(age).compareTo(new Integer(otherAnimal.age));
			if (result ==0) {
				result += new Integer(weight).compareTo(new Integer(otherAnimal.weight));
				if (result == 0) {
					result += sex.compareTo(otherAnimal.sex);
				}
			}
		}
		return result;
	}
}
