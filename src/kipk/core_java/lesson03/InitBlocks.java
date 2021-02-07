package kipk.core_java.lesson03;

import kipk.core_java.common.animal.fish.Swordfish;

public class InitBlocks {	
	

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork");
		System.out.println("=====================================================================\n\n");
		whenInitializationRuns();

	}

	private void whenInitializationRuns() {
		Swordfish sword = new Swordfish();
	}
}
