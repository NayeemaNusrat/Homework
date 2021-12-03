package hw10Q2Polymorphism;




/*
 *  Method overloading is When different methods exist with the same method name but with different parameters or signature
 */

// Return type parameterized method implemented -01
public class Sister {
public int sister(int age1, int age2, int age3) {
	int total1 = age1 + age2 + age3 ;
	System.out.println("Total area from sister: " + total1);
	return total1;
	}


//// Return type parameterized method implemented -02
//but here one of the signature/parameter is String Type

public int sister(int age3, String age4) {
	int total2 = age3 + Integer.parseInt(age4);
	System.out.println("Total area from sister: "+total2);
	return total2;
}

//Return type parameterized method which is final implemented -03
	// Also called final method, final method can't be changed
	// Final type of method can be overloaded 

public final int sister(int age1, int age2, int age3, int age5) {
	int total3 = age1 + age2 + age3 + age5;
	System.out.println("Total area from sister: "+ total3);
return total3;
}

//Static type Method implemented-04
	// Static method can be overloaded
	public static int sister(int age1, int age2, int age3, String age4, int age5) {
		int total4 = age1 + age2 + age3 + Integer.parseInt(age4)+ age5;
		System.out.println("Total area from sister: " + total4);
		return total4;
	}
	
	// void type parameterized method implemented-05
//	public void sister(int age1, int age2, int age5) {
//		int total5 = age1 + age2 + age5;
//		System.out.println("Total area from sister: "+total5);
//		 
//}
	//void type method is implemented-06
	public void sister() {
		System.out.println("This is from void type method from Sister");
	}
}