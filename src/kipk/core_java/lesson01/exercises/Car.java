package kipk.core_java.lesson01.exercises;

public class Car {
	public String make = "Ford";
	public String color = "green";
	
	public void drive() {
		String s = color; //s is a local variable
		s += " " + make;
		s += " rattling down the road";
		System.out.println(s);
	}

}
