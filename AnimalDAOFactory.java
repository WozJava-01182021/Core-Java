package robertd.core_java.lesson09.dao;

public class AnimalDAOFactory extends DaoFactory {

	@Override
	public AnimalDAO getDao(String type) throws DataStoreNotFoundException {
		type = type.toLowerCase();
		switch (type ) {
		case "memory": return new MemoryCacheAnimalDAO();
		case "files" : return new FileAnimalDAO();
		case "rdbms" : return new RdbmsAnimalDAO();
		}
		throw new DataStoreNotFoundException("Could not find " + type + " data store");
	}

}
