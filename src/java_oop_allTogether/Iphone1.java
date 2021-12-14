package java_oop_allTogether;

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String Info;
	private char gender;
	private boolean madeInUSA;

	public Iphone1() { // default constructor
		super.abstractClassInfo();
	}
		
	public Iphone1(String info, int price, char user, boolean madeInUSA) {
		System.out.println("I bought this phone in 2000, the price is: " + price + "Gender is: ," + gender
				+ ", made in the USA: " + madeInUSA);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public char getUser() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println(
				"\tClass is a blueprint from which individual objects are created. It contains Only non-abstract methods which are implemented. Just like an abstract class a Regular Class can inherit either One Regular class or One Abstract class by using (extends) keyword. It can also inherit more than one interface by using (implements) keyword.");

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub
		
	}

	public char getGender() {
		// TODO Auto-generated method stub
		return 'F';
	}


}

	