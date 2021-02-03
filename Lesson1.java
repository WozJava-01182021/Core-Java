package robertd.core_java.lesson01;

public class Lesson1 {

	public static void main(String[] args) {
		
		// Lesson 1 Getting Started with Java
		Definitions def = new Definitions();
		def.inClassWork();
		
		// Lesson 1 Its All About Objects
		Statements learnStatements = new Statements();
		learnStatements.inClassWork();
		
		// Lesson 1 Data Types and Variables
		ClassesAndObjects learnClasses = new ClassesAndObjects();
		learnClasses.inClassWork();	
		
		Inheritance studyInheritance = new Inheritance();
		studyInheritance.inClassWork();
		
		// Lesson 1 Data Types and Variables
		Identifiers learnidentifierRules = new Identifiers();
		learnidentifierRules.inClassWork();	
		
		WorkingWithStrings studyStrings = new WorkingWithStrings();
		studyStrings.inClassWork();
		
		// Lesson 1 Primitives		
		Primitives studyPrimitives = new Primitives();
		studyPrimitives.inClassWork();
		
		// Lesson 1 Reference Variables		
		References studyReferences = new References();
		studyReferences.inClassWork();
		
		Arrays learnArrays = new Arrays();
		learnArrays.inClassWork();
		
		Initialization init = new Initialization();
		init.inClassWork();
		
		// Lesson 1 Modifiers
		System.out.println(Modifiers.classVar);
		Modifiers mods = new Modifiers();
		mods.inClassWork();

	}

}
