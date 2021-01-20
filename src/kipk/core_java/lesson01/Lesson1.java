package kipk.core_java.lesson01;

import kipk.core_java.lesson01.exercises.Dog;

public class Lesson1 { 
//curly-brackets starts the class body
//public means everyone can access this class
//class MUST be the same name as the file
	public static void main(String[] args) { 
//{} starts the method block
//static means you can run the method w/o creating an object in memory
//void return type doesn't return anything, but a return type is needed- can't compile w/o one
//method models behavior
//variables model state
//"main" is what the compiler is looking for to start running the program
		
		
		//Lesson 1 Getting Started with Java
		Definitions def = new Definitions();
		def.inClassWork();
		
		//Lesson 1 Comments and Statements
		Statements learnStatements = new Statements();
		learnStatements.inClassWork();
		
		//Lesson 1 Its All About Objects
		ClassesAndObjects learnClasses =new ClassesAndObjects();
		learnClasses.inClassWork();
		
		Inheritance studyInheritance = new Inheritance();
		studyInheritance.inClassWork();
		
		//Lesson 1 Data Types and Variables
		Identifiers revealIdentifiers = new Identifiers();
		revealIdentifiers.inClassWork();
		
		WorkingWithStrings studyStrings = new WorkingWithStrings();
		studyStrings.inClassWork();
		
		//Lesson 1 Primitives
		Primitives studyPrimitives = new Primitives();
		studyPrimitives.inClassWork();
		
		// Lesson 1 Reference Variables
		References studyReferences = new References();
		studyReferences.inClassWork();
		
		Arrays learnArrays = new Arrays();
		learnArrays.inClassWork();
	
		Initialization init = new Initialization();
		init.inClassWork();
		
		//Lesson 1 Modifiers
		System.out.println(Modifiers.classVar);
		Modifiers mods = new Modifiers();
		mods.inClassWork();

	} //closes method

}//closes class
