/*
 * The DAO design pattern specifies the use of an interface to hide implementations.
 */

package kipk.core_java.lesson09.dao;

import java.util.Collection;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.Sex;

public interface AnimalDAO {
	public abstract void create(Animal a);
	public abstract Animal find(String type, int age, int weight, Sex sex);
	public abstract Collection<Animal> findAll();
	public abstract boolean update(Animal a);
	public abstract void delete(Animal a);
	public abstract void close();
	public abstract void setDebug(boolean in);

}
