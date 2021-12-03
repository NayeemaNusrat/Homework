package hw10Q2Polymorphism;

public class TestFamily {
public static void main(String[] args) {
		
		System.out.println("\n-------- Sister --------");
		Sister sis = new Sister();
		sis.sister(27, 65, 74); // return type parameterized method -01 initialized
		sis.sister(33, "65"); // return type parameterized method -02 initialized
		sis.sister(63, 75, 87, 45); // final method -03 initialized
		Sister.sister(63, 65, 87, "45", 11); // static method -04 initialized
		sis.sister(99, 34, 45); // void type parameterized method -05 initialized
		sis.sister(); // void type method -06 initialized
		
		
		System.out.println("\n-------- Niece --------");
		Niece nc = new Niece();
		nc.sister(27, 65, 74); // return type parameterized method -01 initialized
		nc.sister(33, "65"); // return type parameterized method -02 initialized
		nc.sister(99, 34, 45); // void type parameterized method -05 initialized
		nc.sister(); // void type method -06 initialized

	}
}
