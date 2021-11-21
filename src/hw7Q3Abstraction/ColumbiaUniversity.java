package hw7Q3Abstraction;
 
	public class ColumbiaUniversity {
		public void chemistry() {
			// abstract method is not allowed in regular class
		}

		public void biology() {
			// non abstract method
			System.out.println("biology is non abstract method of Columbia University");
		}
	
	//Default Constructor
	
	public ColumbiaUniversity() {
		System.out.println("This constructor is from Columbia University");
	}
	}