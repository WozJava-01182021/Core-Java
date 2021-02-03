package robertd.core_java.lesson09;

public class Light {
	
	public static int count = 0;
	
	// We need a private constructor so the compiler will not add a default constructor
	private Light() {
		count++;
	}
	
	public static synchronized Light getLightSingleton() {
		return null;
		
	}

}
