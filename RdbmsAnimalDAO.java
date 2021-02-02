/*
 * DAO design pattern implementation classes should NOT be public. We hide the implementation details from
 * the user.
 */
package robertd.core_java.lesson09.dao;

import java.util.Collection;

import robertd.core_java.common.animal.Animal;
import robertd.core_java.common.animal.Sex;

class RdbmsAnimalDAO implements AnimalDAO {
	
	private boolean debug = false;
	@Override
	public void setDebug( boolean in) {debug = in; }

	@Override
	public void create(Animal a) {

	}

	@Override
	public Animal find(String type, int age, int weight, Sex sex) {
		return null;
	}

	@Override
	public Collection<Animal> findAll() {
		return null;
	}

	@Override
	public boolean update(Animal a) {
		return false;
	}

	@Override
	public void delete(Animal a) {

	}

	@Override
	public void close() {

	}

}
