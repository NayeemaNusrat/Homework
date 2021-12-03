package hw10Q2Polymorphism;

//Create another class Niece and inherit (extends) Sister. Override all the possible methods by changing logic. If some methods are not possible to override, please explain why by the multiple line comments comments. Tell me what is the Method overriding by multiple line comments. Initialize all the methods of Niece class in TestFamily class.

public class Niece extends Sister {
	// method 01
	@Override
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3 - 5;
		System.out.println("Total area from sister: " + total1);
		return total1;
	}

	// method -02
	@Override
	public int sister(int age3, String age4) {
		int total2 = age3 + Integer.parseInt(age4) * 2;
		System.out.println("Total area from sister: " + total2);
		return total2;
	}
	// method -03
	// Final type method cannot be Overriden
	// Cannot override the final method from Sister

	/*
	 * @Override public final int sister(int age1, int age2, int age3, int age5) {
	 * int total3 = a + b + c + d; System.out.println("Total area from sister: " +
	 * total3); return total3; }
	 */
	// method -04
	// The method sister can't override or implemented
	// because static is a local method of a class
	// So, static method can't be override,if we override it
	/*@Override
	public static int sister(int age1, int age2, int age3, String age4, int age5) {
		int total4 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("Total area from sister: " + total4);
		return total4;
	}*/
	
	// method -05
	/*@Override
	 * public void sister(int age1, int age2, int age5) {
		*int total5 = age1 / 33 + age2 + age5 / 15;
	*	System.out.println("Total area from sister: " + total5);
	}*/

	// method -06
	@Override
	public void sister() {
		System.out.println("This is from void type method from Sister");
	}

}
