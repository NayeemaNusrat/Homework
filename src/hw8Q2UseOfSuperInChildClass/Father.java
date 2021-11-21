package hw8Q2UseOfSuperInChildClass;
/*
 *  a) Create a class name Father. declare 5 variable like Name, age, sex, usCitizen, FamilyName. Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it) from the first 4 variables. Use 'FamilyName' variable to initialize by super keyword in child class. Create a regular void type method name father() which is implemented, declare a sysout inside it. Create a parameterized method fatherInfo() which also contain it's 4 variables, declare a sysout (you can copy from parameterized constructor)
 */


public class Father {
 public String name;
 public int age;
 public char sex;
 public boolean usCitizen;
 public String familyName;
 
//default constructor
	public Father() {
		System.out.println("This is a default constructor from Father class");
}

//parameterized constructor
public Father(String name,int age, char sex, boolean usCitizen) {
	this.name = name;
	this.age =age;
	this.sex = sex;
	this.usCitizen = usCitizen;
	
	System.out.println("Name: "+name+ "\nAge: "+age+"\nSex: "+sex+"\nUs Citizen: "+usCitizen);
}

//void type method
	public void father() {
		System.out.println("This method is from Father class");
	}
	
	// parameterized method
		public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
			this.name = name;
			this.age =age;
			this.sex = sex;
			this.usCitizen = usCitizen;
			
			System.out.println("Name: "+name+ "\nAge: "+age+"\nSex: "+sex+"\nUs Citizen: "+usCitizen);
		}
		}
