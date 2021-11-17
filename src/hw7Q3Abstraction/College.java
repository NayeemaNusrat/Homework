package hw7Q3Abstraction;

public interface College {

	default void dorm(){
	}
	public static void studyroom() {
	}
	
}


//interface can not have constructor
//interface can not be instantiated, cannot create object