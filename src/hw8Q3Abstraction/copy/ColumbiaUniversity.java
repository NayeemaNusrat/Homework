package hw8Q3Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	//public void chemistry() {
		// abstract method is not allowed in regular class
	//}

	public void biology() {
		// non abstract method
		System.out.println("biology is non abstract method of Columbia University");
	}

	// Default Constructor

	public ColumbiaUniversity() {
		System.out.println("This constructor is from Columbia University");
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

