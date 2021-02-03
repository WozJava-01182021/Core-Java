package robertd.core_java.lesson03;

import robertd.core_java.common.animal.fish.Swordfish;

public class InitBlocks {

	public InitBlocks() {
	}
		public void inClassWork() {
			System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
	
			whenInitializationRuns();
			
			System.out.println("-------------------------------------------------------\n\n");
		}	
		
		private void whenInitializationRuns() {
			Swordfish sword = new Swordfish();
			
		}
}

