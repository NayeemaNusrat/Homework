package hw2Q2JavaVariables;

public class AboutUs {
	public String Myname = "Nayeema";
	public byte myAge = 28;
	public short myHouseRent = 25000;
	public int mySalary = 9999;
	public long bankBalance = 123456789l;
	public char mySex = 'F';
	public float myHeight = 5.2f;
	public double myGrade = 3.5666;
	public boolean usCitizen = false;
	
			
 //The constructor declared
public AboutUs() {
System.out.println("This is all about me");
}
		
//The method implemented here
public void aboutUs( ) {
    System.out.println("My name is: "+Myname+"\nMy age: "+myAge+"\nMy House Rent:"+myHouseRent+"\nYearly Salary:"+mySalary+"\nMy Bank Balance:"+bankBalance+"\nMy Sex:"+mySex+"\nMy Height:"+myHeight+"\nMy Grade:"+myGrade+"\nAm I Us Citizen?:"+usCitizen);	
}
}


