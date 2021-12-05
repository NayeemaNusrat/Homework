package hw8Q3Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	
	public ColumbiaUniversity() {
	
		//public void chemistry() {abstract method is not allowed in regular class
	//}
	}
	public void biology() {
		// non abstract method
		System.out.println("biology is non abstract method of Columbia University");
	} 
	////In a regular class we can only implement non-abstract methods.
	
	@Override
	public void biochemistryLab() {
		// TODO Auto-generated method stub
	}

	@Override
	public void caring() {
		// TODO Auto-generated method stub
	}
	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
	}

// iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
// RockefellerUniversity. how many keywords are used for the inheritance in Java
// for a regular Class? Can a regular Class inherit other Abstract Class or a
// regular class or interface by extends or implements keyword? How many
// inheritances is possible by a regular Class? Use one of above regular Classes
// (ColumbiaUniversity extends MedicalSchool implements University,
// VocationalSchool) and use the keywords to answer my questions.

/*
 * Ans: 1 keywords extends. yes,we can use the ‘extends’ keyword for them. one
 * regular/abstract class using extends keywords and using implements Multiple
 * inheritance
 */

