package kipk.core_java.common.ecosystem;

import java.util.ArrayList;
import java.util.List;

import kipk.core_java.common.animal.*;
import kipk.core_java.common.animal.mammals.*;
import kipk.core_java.lesson09.dao.AnimalDAO;
import kipk.core_java.lesson09.dao.AnimalDaoFactory;
import kipk.core_java.lesson09.dao.DaoFactory;
import kipk.core_java.lesson09.dao.DataStoreNotFoundException;

public class Savannah extends Ecosystem{
	
	//******************************Variables Section*************************************
	List<Lion> lionPride = new ArrayList<>();   //(List<Lion>) new RandomAnimalBuilder(Lion.class).build(6);
	//List<Cheetah> cheetah = (List<Cheetah>) new RandomAnimalBuilder(Cheetah.clas).build(2);
	
	//*****************************Constructor Section************************************
	
	public Savannah() {
		
		setEcosystem(EcosystemType.SAVANNAH);
		useFileDAO();
		
	}
	
	//********************************Method Section**************************************
	
	@Override
	public void listPopulation() {
		System.out.println(lionPride);
	//	System.out.println(cheetah);
		
	}
	//TODO: Create a simulation of a pride of lions hunting
	
			//TODO: Create a simulation of a cheetah hunting
			
			//TODO: Create a simulation of gazelles finding a herd of larger animals to trample tall grass
			// so they can eat short grass
			
			//TODO: A second cheetah is nearby, what happens?
	
	private void useFileDAO() {
		DaoFactory factory = new AnimalDaoFactory();
		AnimalDAO dao = null;
		try {
			dao = factory.getDao("files");
		} catch (DataStoreNotFoundException e) {
			System.out.println(e);
			return;
		}
		
		dao.setDebug(false);
//		for (Animal lion : lionPride) {
//		dao.create(lion);
//	}
		System.out.println("---------------------------------------------\n");
		
		//Retrieve the lions from the dao:
		for (Animal lion :dao.findAll()) {
			lionPride.add((Lion)lion);
			System.out.println(lion);
		}
		
		//Delete all the files
		for (Animal lion : dao.findAll()) {
			dao.delete(lion);
		}
	}
	
	@Override
	public void findNearbyAnimals() {
		// TODO Auto-generated method stub
		
	}

}
