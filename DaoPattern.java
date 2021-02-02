package robertd.core_java.lesson09;

import java.util.List;

import robertd.core_java.common.animal.Animal;
import robertd.core_java.common.animal.RandomAnimalBuilder;
import robertd.core_java.common.animal.mammals.Lion;
import robertd.core_java.lesson09.dao.AnimalDAO;
import robertd.core_java.lesson09.dao.AnimalDAOFactory;
import robertd.core_java.lesson09.dao.DaoFactory;
import robertd.core_java.lesson09.dao.DataStoreNotFoundException;

public class DaoPattern {

	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();

		useMemoryDAO();
		useFileDAO();

		System.out.println("===================================================================\n\n");
	}

	private void useMemoryDAO() {
		// MemoryCacheAnimalDAO is package level access and is not visible
//		AnimalDAO dao = new MemoryCacheAnimalDAO();
		DaoFactory factory = new AnimalDAOFactory();
		AnimalDAO dao = null;
		try {
			dao = factory.getDao("memory");
		} catch (DataStoreNotFoundException e) {
			System.out.println(e);
			return;
		}

		// Create a list of animals to use with the dao:
		List<Animal> lionPride = (List<Animal>) new RandomAnimalBuilder(Lion.class).build(7);
		dao.setDebug(true);
		for (Animal lion : lionPride) {
			dao.create(lion);
		}

		System.out.println("---------------------------------------------\n");

		// Retrieve the lions from the dao:
		for (Animal lion : dao.findAll()) {
			System.out.println(lion);
		}
		
		System.out.println("-----------------------------------------------\n");

	}

	private void useFileDAO() {
		DaoFactory factory = new AnimalDAOFactory();
		AnimalDAO dao = null;
		try {
			dao = factory.getDao("files");
		} catch (DataStoreNotFoundException e) {
			System.out.println(e);
			return;
		}
		
		// Create a list of animals to use with the dao:
		List<Animal> lionPride = (List<Animal>) new RandomAnimalBuilder(Lion.class).build(7);
		dao.setDebug(true);
//		for (Animal lion : lionPride) {
//			dao.create(lion);
//		}

		System.out.println("---------------------------------------------\n");

		// Retrieve the lions from the dao:
		for (Animal lion : dao.findAll()) {
			System.out.println(lion);
		}
		
//		// Delete all the files
//		for (Animal lion : dao.findAll()) {
//			dao.delete(lion);
//		}
	}

}
