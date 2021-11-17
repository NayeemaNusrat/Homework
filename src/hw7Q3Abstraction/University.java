package hw7Q3Abstraction;


public interface University extends College, Hospital {
	default void gymnasium() {
	}
	public static void library() {
	}
}



/* Answer of 3-2) i)
*extends keyword is used for the inheritance in interface.
*an interface cannot inherit a regular class or abstract class.but it can inherit more than one interface.
*can inherit more than one interface
*/