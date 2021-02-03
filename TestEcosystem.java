package robertd.core_java.common.ecosystem;

public class TestEcosystem {

	public static void main(String[] args) {

		Ecosystem savannah = new Savannah();
		savannah.listPopulation();
		System.out.println("\n---------------------------------------------------\n\n");
		
		Ecosystem tundra = new AntarcticTundra();
		tundra.listPopulation();
	
	}

}
