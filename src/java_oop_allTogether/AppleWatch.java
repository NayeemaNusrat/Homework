package java_oop_allTogether;

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DIgitalWatch {
	public void abstractClassInfo() {
		System.out.println(
				"\nAn Abstract class have abstract and non abstract both method where a class can have only non abstract method and inteface can have only abstract method. Abstract and an Interface class can not be instanciated, where a class can be instanciated.\tIn Abstract class abstract method is declared and non abstract method is implemented, where in interface class abstract method is only implemented and in regular class metho can only be implemented\n");
	}

	public abstract void appleWatchInfo(); // Abstract method

//Yes we can create a constructor inside abstract class.

	public AppleWatch() {
	}
}