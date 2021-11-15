package hw6Q3Abstraction;


public interface University {
	public void classSize();
	public void playGround();
public void teacher();
}

//No I cannot have a constructor in an interface because all data members in interfaces are public static final by     default, they are constants