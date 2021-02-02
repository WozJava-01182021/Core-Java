/*
 * DAO design pattern implementation classes should NOT be public. We hide the implementation details from
 * the user.
 */
package robertd.core_java.lesson09.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import robertd.core_java.common.animal.Animal;
import robertd.core_java.common.animal.Sex;

class FileAnimalDAO implements AnimalDAO {
	
	private static final Path daoDir = Paths.get("C:","Users","robdel9677","eclipse-workspace","Core Java","Animal Files");
	
	private boolean debug = false;
	@Override
	public void setDebug( boolean in) {debug = in; }

	
	public FileAnimalDAO() {
		if (Files.notExists(daoDir)) {
			System.out.println(" Could not find " + daoDir.toString());
		} else if (!Files.isDirectory(daoDir)) {
			System.out.println(daoDir.toString() + " is not a valid directory");
		} else {
			System.out.println("Using directory " + daoDir);
		}
	}
	

	@Override
	public void create(Animal a) {
		// Create a filename based on the animal's type, age, weight and sex
		String filename = a.getType() + "_a" + a.getAge() + "_w" + a.getWeight();
		filename += a.getSex().toString().charAt(0) + ".data";
		
		Path pathName = Paths.get(daoDir.toString(), filename);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathName.toFile()))) {
			if (debug) System.out.println("Saving " + a + " to file " + pathName.toString());
			oos.writeObject(a);
			oos.flush();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Override
	public Animal find(String type, int age, int weight, Sex sex) {
		return null;
	}

	@Override
	public Collection<Animal> findAll() {
		File directory = new File(daoDir.toString());
		List<Animal> animalList = new ArrayList<>();
		for (String fileName : directory.list()) {
			Path pathname = Paths.get(directory.toString(), fileName);
			Animal a = getAnimalFile(pathname.toString());
			if (a != null) animalList.add(a);
		}
		return animalList;
	}

	@Override
	public boolean update(Animal a) {
		return false;
	}

	@Override
	public void delete(Animal a) {
		File directory = new File(daoDir.toString());
		List<Animal> animalList = new ArrayList<>();
		for (String fileName : directory.list()) {
			Path pathName = Paths.get(directory.toString(), fileName);
			Animal animalFile = getAnimalFile(pathName.toString());
			if (animalFile.equals(a))  {
				File fileToDelete = new File(pathName.toString());
				fileToDelete.delete();
			}
		}
		
	}

	@Override
	public void close() {

	}
	
	private Animal getAnimalFile(String fileName) {
		if (debug) System.out.println("Reading file " + fileName);
		Animal result = null;
		
		try (ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream(fileName))) {
			result = (Animal) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
