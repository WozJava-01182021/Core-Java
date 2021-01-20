package kipk.core_java.lesson01.exercises;

public class Dog extends Animal {
	
	public String name;
	public int weight;
	
	public Dog() {
		type = "dog";
	}
	
	public void bark() {
		String bark = name + " says ";
		
		if (weight > 60) {
			bark += " Woof! Woof!";
		} else if (weight > 14) {
			bark += "Ruff! Ruff!";
		} else {
			bark += "Yip! Yip!";
		}
		
		System.out.println(bark);
	}

}
