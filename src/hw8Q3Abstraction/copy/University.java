package hw8Q3Abstraction.copy;


public interface University extends College, Hospital {
	default void gymnasium() {
	}
	public static void library() {
	}
}



/*
 * 3-1) i) Total how many keywords are used for the inheritance in Interface, answer by Java comments? Ans: One,Extends keyword.
*Can an interface inherit other Interfaces, or a regular class or abstract class by extends or implements keyword? Ans:yes,interface can inherit other Interfaces but can't inherit regular class or abstract class.
* How many inheritance is possible? Ans: Multiple interface
*/