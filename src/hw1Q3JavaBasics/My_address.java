package hw1Q3JavaBasics;

public class My_address {

			public static String MyName = "Nayeema Nusrat";
			public static int houseNumber = 15;
			public static char houseLocation = 'W';
			public static int streetNumber = 26;
			public static String streetType = "th st";
			public static String state = "PA";
			public static int zipCode = 16508;
			public static boolean inUSA = true;
		
	public static void my_address (){
				
		System.out.println(MyName+"\n"+houseNumber+"\n"+houseLocation+"\n"+streetNumber+"\n"+streetType+"\n"+state+"\n"+zipCode);
		System.out.println("is the address inUsa? Ans: inUSA" );
							
	}
	public static void main(String[] args) {
		my_address();
	}}


