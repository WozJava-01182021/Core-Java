package kipk.core_java.common.ecosystem;

//TODO: Add list of requirements for the project

public class TestEcosystem {

	public static void main(String[] args) {

		Ecosystem savannah = new Savannah();
		savannah.listPopulation();

		System.out.println("\n--------------------------------------------------------\n\n");

		Ecosystem amazon = new AmazonRainForest();
		amazon.listPopulation();
	}

}