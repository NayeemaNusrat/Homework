package hw8Q2UseOfSuperInChildClass;


//Create a class name 'Daughter', declare variable birthMonth, age. Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it), and implement a regular method daughter() and declare a sysout. Create a parameterized method daughterInfo() which contains 2 of its variables as local variable. declare a sysout (you can copy from parameterized constructor) . Daughter extends Father (super class). Use super method, super keyword and show all of their use in child class. and initialize in a TestFamily Class.

public class Daughter extends Father {
	public String birthMonth;
	public int age;

//default constructor declared

	public Daughter() {
		super("Halim", 65, 'M', false); // super method can call either default or parameterized constructor.
		super.father(); // super keyword can call the parameterized method from the parent class.
		super.fatherInfo("Halim", 65, 'M', false); // super class can initialize variable from parent class.

		super.familyName = "Sarkar";
		super.name = "Halim";
		super.age = 65;
		super.sex = 'M';
		super.usCitizen = false;

		System.out.println("Family name is:" + familyName);
		System.out.println("This is a default constructor for Daughter class");
	}

//parameterized constructor declared
	public Daughter(String birthMonth, int age) {
		super ("Nayeema", 28, 'F', true); // super method can call either default or parameterized.
		super.fatherInfo("Nusrat", 25, 'F', false);

		super.familyName = "Sarker";
		super.name = "Halim";
		super.age = 65;
		super.sex = 'M';
		super.usCitizen = false;
		
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + "\nage: " + age);
	}

//regular daughter method implement
	public void daughter() {
		super.fatherInfo("Nusrat", 25, 'F', false);
		super.familyName = "Sarker"; // super method can initialize from the parent class.
		super.name = "Halim";
		super.age = 65;
		super.sex = 'F';
		super.usCitizen = false;
		System.out.println("Family Name is:" + familyName);
		System.out.println("This is a void method from Daughter class");
	}

//parameterized method daughterInfo created

	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Nusrat", 25, 'F', false);
		super.familyName = "Sarker";
		super.name = "Halim";
		super.age = 65;
		super.sex = 'M';
		super.usCitizen = false;
		System.out.println("Family Name is:" + familyName);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + "\nage: " + age);
	}

}
