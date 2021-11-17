package hw7Q3Abstraction;
 
	public class ColumbiaUniversity {
		public void chemistry() {
			// abstract method is not allowed in regular class
		}

		public void biology() {
			// non abstarct method
			System.out.println("biology is my favourite subject");
		}
	
	//Default Constructor
	
	public ColumbiaUniversity() {
		System.out.println("This constructor is from Columbia University");
	}
	}