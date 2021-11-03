package hw5Q2JavaConditionalStatement;

//Alex and Jenifer are twins and they were born in 1999. Declare their age as - int ageOfAlex = 21; int ageOfJenifer = 21. Use if, else if and else to execute different conditions. Use below sysout in condition - 1) System.out.println(“Alex is ” +ageOfAlex+”, which is an even number and he is younger than Jenifer. ” + ageOfJenifer+ “, the age of Jenifer.”). For other sysout syntax is not presenting like above, rather what would be the outcome. 2) Alex is 21, which is an even number and he is older than Jenifer. 21, the age of Jenifer. 3) Alex is 21, which is an odd number and he is younger than Jenifer. 21, the age of Jenifer. 4) Alex is 21, which is an odd number and he is older than Jenifer. 21, the age of Jenifer. 5) Alex is 21, which is an even number and they are not same age. 21, the age of Jenifer. 6) Alex is 21, which is an even number and they are the same age. 21, the age of Jenifer. 7) Alex is 21, which is an odd number and they are not the same age. 21, the age of Jenifer. 8) [use logical not operator !, for this] Alex is 21, which is not an even number and they are not the same age. 21, the age of Jenifer. 9) Alex is 21, which is an even number and they are the same age or (Alex may be older). 21, the age of Jenifer. 10) Alex is 21, which is an even number and they are the same age or (Alex may be younger). 21, the age of Jenifer. 11) Alex is 21, which is an odd number and they are the same age. 21, the age of Jenifer. Organize the code, paste the code below if your hw folder is not connected to github. If connected, share the package link (url) below.

public class CompareAge {

	public static void main(String[] args) {
	
			 int ageOfAlex = 21;
			 int ageOfJenifer = 21;
			 
			 
			 if(ageOfAlex%2==0 && (ageOfAlex<ageOfJenifer)) {
				 System.out.println("Alex is " +ageOfAlex+", which is an even number and he is younger than Jenifer. " + ageOfJenifer+ ", the age of Jenifer.");
			 } else if(ageOfAlex%2==0 && (ageOfAlex>ageOfJenifer)) {
				 System.out.println("Alex is " +ageOfAlex+", which is an even number and he is older than Jenifer. " + ageOfJenifer+ ", the age of Jenifer.");
			 }
	}

}
