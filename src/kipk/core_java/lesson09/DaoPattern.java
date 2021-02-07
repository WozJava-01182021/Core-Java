
package kipk.core_java.lesson09;

import java.util.List;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.RandomAnimalBuilder;
import kipk.core_java.common.animal.mammals.Lion;
import kipk.core_java.lesson09.dao.AnimalDAO;
import kipk.core_java.lesson09.dao.AnimalDaoFactory;
import kipk.core_java.lesson09.dao.DaoFactory;
import kipk.core_java.lesson09.dao.DataStoreNotFoundException;

public class DaoPattern {
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		useMemoryDAO();
		
		System.out.println("================================================");
	}
	
	private void useMemoryDAO() {
		// MemoryCacheAnimal DAO is package level access and is not visible
//		AnimalDaO dao = new MemoryCacheAnimalDAO();
		DaoFactory factory = new AnimalDaoFactory();
		AnimalDAO dao = null;
		try {
			dao = factory.getDao("memory");
		} catch (DataStoreNotFoundException e) {
			System.out.println(e);
			return;
		}
		
		//Create a list of animals to use with the dao:
		List<Animal> lionPride = (List<Animal>) new RandomAnimalBuilder(Lion.class).build(7);
		for (Animal lion : lionPride) {
			dao.create(lion);
		}
		System.out.println("--------------------------\n");
		
		//Retrieve the lions from the dao:
		for (Animal lion : dao.findAll()) {
			System.out.println(lion);
		}
	}
		
		private void useFileDAO() {
			DaoFactory factory = new AnimalDaoFactory();
			AnimalDAO dao = null;
			try {
				dao = factory.getDao("files");
			} catch (DataStoreNotFoundException e) {
				
		}
	}
}
