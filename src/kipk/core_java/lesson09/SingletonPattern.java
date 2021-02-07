package kipk.core_java.lesson09;

import kipk.core_java.common.Light;

public class SingletonPattern {
	
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		//Can't use 'new' to instantiate the singleton
//		Light newLight = new Light();
		System.out.println("Before Light is loaded, Light count: " + Light.count);
		
		System.out.println("Calling Light.getLightInstance()");
		Light newLight = Light.getLightInstance();
		System.out.println("Light count: " + Light.count);
		
		System.out.println("Calling Light.getLightInstance() a second time:");
		Light light2 = Light.getLightInstance();
		System.out.println("Light count: " + Light.count);
		
		System.out.println("=======================================================================");
		}


}
