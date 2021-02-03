package robertd.core_java.lesson09;

import robertd.core_java.common.Light;

public class Singleton {
	
	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();
		
		// Can't use 'new' to instantiate the singleton
//		Light newLight = new Light();
		System.out.println("Light count: " + Light.count);
		System.out.println();
		Light newLight = Light.getLightInstance();

		System.out.println("===================================================================\n\n");
	}

}
