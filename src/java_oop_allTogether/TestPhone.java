package java_oop_allTogether;

public class TestPhone {
public static void main(String[] args) {
	Iphone1 ip1 = new Iphone1();
	ip1.setPrice(750);
	ip1.setInfo("2000");
	ip1.setGender('F');
	ip1.setMadeInUSA(false);

	System.out.println("The price was: " + ip1.getPrice() + "\nI bought this phone in:" + ip1.getInfo()
			+ "\nMy gender:" + ip1.getGender() + "\nthis phone madeInUSA:" + ip1.isMadeInUSA());

}
Iphone1 p01 = new Iphone1();
p01.regularCLassInfo();

//an abstract class can't be instantiated, it needs the help of a concrete class, here Iphone1 is a concrete class

AppleWatch ap = new Iphone1();
ap.appleWatchInfo();
ap.abstractClassInfo();

//	an abstract class can't be instantiated, it needs the help of a concrete class, here Ikphone1 is a concrete class
Phone ph = new Iphone1();
Ph.wireless();
ph.interfaceInfo();
ph.call();
ph.message();
ph.camera();

}
