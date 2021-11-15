package hw6Q3Abstraction;

public interface Hospital {
	 public void emergencyRoom();
	 public void surgeryRoom();
	 public void cafeteria();

}
//No I cannot have a constructor in an interface because all data members in interfaces are public static final by     default, they are constants
