package kipk.core_java.lesson09.dao;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.Sex;

class FileAnimalDAO implements AnimalDAO {
	
	private static final Path daoDir = Paths.get("C:", "Users", "jacob", "CoreJava", "Animal Files");
	private boolean debug = false;
	@Override
	public void setDebug(boolean in) {
		debug = in;
	}
	
	public void FileAnimalDAO() {
		if (Files.notExists(daoDir)) {
			System.out.println("Could not find " + daoDir.toString());
		} else if (Files.isDirectory(daoDir)) {
			System.out.println(daoDir.toString() + " is not a valid directory");
		} else {
			System.out.println("using directory " + daoDir);
		}
	}


	@Override
	public void create(Animal a) {
		//Create a filename based on the animal's type age weight and sex
		String filename = a.getType() + "_a" + a.getAge() + "_w" + a.getWeight();
		filename += a.getSex().toString().charAt(0) + ".data";
		
		Path pathName = Paths.get(daoDir.toString(), filename);
	}

	@Override
	public Animal find(String type, int age, int weight, Sex sex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Animal> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(Animal a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
