package kipk.core_java.common;

public class Light {
	// A Singleton is used when you want one, and only one, instance 
	//	of an object on the heap
	
	public static int count = 0;
	
	// We need a static reference variable to hold the address of the one and only Singleton
	// This creates a 'lazy singleton' which does not instantiate the object until needed.
	private static volatile Light lightInstance = null;

	// This creates an 'eager singleton'
//	private static volatile Light lightInstance = new Light();

	
	// We need a private constructor so the compiler will not add a default constructor
	// This will prevent users from using the 'new' keyword to instantiate an object
	private Light() {
		count++;
	}
	
	// We need a static method to retrieve the single instance of this class
	// It needs to be synchronized to prevent more than one thread from accessing it
	// at any given time.
	public static synchronized Light getLightInstance() {
		// This test not needed for eager singleton
		if (lightInstance == null) {
			lightInstance = new Light();
		}
		return lightInstance;
		
	}

}
