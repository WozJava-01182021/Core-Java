package robertd.core_java.lesson09;

import robertd.core_java.common.Light;

public class SingletonPattern {
	
	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();
		
		// Can't use 'new' to instantiate the singleton
//		Light newLight = new Light();
		System.out.println("Before Light is loaded, Light count: " + Light.count);
		System.out.println();
		
		System.out.println("Call Light.getInstance()");
		System.out.println();
		Light newLight = Light.getLightInstance();
		System.out.println("Light count:" + Light.count);
		System.out.println();	
		System.out.println("Calling Light.getLightInstance() a second time:");
		System.out.println();
		Light newLight2 = Light.getLightInstance();
		System.out.println("Light count: " + Light.count);
		System.out.println();

		
		

		System.out.println("===================================================================\n\n");
	}

}
