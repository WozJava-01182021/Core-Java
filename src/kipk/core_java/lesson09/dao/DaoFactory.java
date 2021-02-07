package kipk.core_java.lesson09.dao;

public abstract class DaoFactory {
	public abstract AnimalDAO getDao(String type) throws DataStoreNotFoundException;

}
