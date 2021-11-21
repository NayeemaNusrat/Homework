package hw8Q2UseOfSuperInChildClass;

public class TestFamilyClass {
public static void main(String[] args) {
	System.out.println("--This is the default constructor---");
	
Daughter daughter01 = new Daughter();
System.out.println("\n---parameterized constructor initialized for daughter Class ---");

Daughter daughter02 = new Daughter("November", 29);
System.out.println("\n---void type method initialized for daughter Class ---");

daughter01.daughter();
System.out.println("\n--- parameterized method initialized for daughter Class ---");

daughter01.daughterInfo("November", 29);
System.out.println("\n--- default constructor initialized for father Class ---");

Father father01 = new Father();
System.out.println("\n--- parameterized constructor initialized for father Class ---");

Father father02 = new Father("Halim", 65, 'M', false);
System.out.println("\n--- parameterized method initialized for father Class ---");

}

}
