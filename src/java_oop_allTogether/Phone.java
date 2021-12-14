package java_oop_allTogether;
//Phone is an interface that has four abstract method interfaceInfo, call, message, camera and 2 non-abstract method - battery and wireless which are implemented. from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."]. When you get a chance to implement interfaceInfo, print out answers for the following questions: [What are the features of Interface you know? Can we create a constructor inside an interface? Can we write variables inside Interface? Don't copy-paste, write how much you can remember, use newline (\n), tab(\t)], for other abstract methods which will be implemented, also print whatever you like. Do you think we can extends or implements Interface? Single or multiple? Create two interface Pager and Wakitaki (Phone interface inherit them) and One regular class name LandPhone and one abstract class SatelitePhone. make a relation of this 4, with Phone if possible//


public interface Phone {

	public abstract void interfaceInfo();

	public abstract void call();

	public abstract void message();

	public abstract void camera();

//// An abstract method can not be implemented within an interface.

	//public static void battery() {
	//	System.out.println("battery is a default Method which is implemented");
	//}
	//public static void wireless() {
	//	System.out.println("This is a static method which is implemened");
	//}
		public static void main(String[] args) {
		System.out.println("\nInterface is the \"BluePrint\" of class. Method can only be declared here. Interface can not be instantiated.\tIt contains default and Static methods which are non abstract method. Interface contains only abstract method.Constructor can not be created inside it. We can not write variables inside it.\n");
	}
}

/*
 * What are the features of Interface you know? 
 * Ans: An Interface is a Blueprint of class. An Interface cannot be instantiated 
 * which means it cannot create objects. In an Interface methods can be Both 
 * (declared and implemented). The only way methods are implemented in Interface 
 * is by using default and static methods.Interface cannot inherit a regular
 * class or an abstract class. However, it can inherit more than one Interface
 * by using the (extends) keyword. 
 * 
 * Can we create a constructor inside an interface? 
 * Ans: No, we cannot create a constructor inside an Interface.
 * 
 * Can we write variables inside Interface?
 * Ans: No, we cannot write variables inside an Interface.
 * 
 * Do you think we can extends or implements Interface? Single or multiple?
 * Ans: Interface can only use the (extends) keyword. The (extends) keyword 
 * allows the interface to inherit multiple other Interfaces.
 * 
 * Create two interface Pager and Wakitaki (Phone interface inherit
 * them) and One regular class name LandPhone and one abstract class
 * SatelitePhone. make a relation of this 4, with Phone if possible. 
 * Ans: We can only make a relation of interface phone with the two newly
 * interfaces namely: Pager and Wakitaki.we cannot make a
 * relation of phone with LandPhone and SatelitePhone because an Interface
 * cannot inherit a regular class or abstract class.
 */

