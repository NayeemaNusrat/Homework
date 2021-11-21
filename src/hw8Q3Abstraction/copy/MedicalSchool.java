package hw8Q3Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool implements  LawSchool {

	public abstract void anatomyLab(); //abstract method
	public void biochemistryLab() { //non abstract method
	
System.out.println("biochemistry Lab is non abstract method of Medical School");
}}

/*Ans: 1 keywords extends
 * yes,we use the ‘extends’ keyword for them and not implements keyword.
 * one interface is possible by an abstract class.
 */
 

//ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends or implements keyword? How many inheritances is possible by an Abstract Class? Use one of above Abstract Class (MedicalSchool extends NursingSchool implements LawSchool) and use the keywords to answer my questions