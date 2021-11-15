package hw6Q3Abstraction;

public interface College {

	public void commonRoom();
	public void laboratary();
	public void languageClub();
	
}
//No I cannot have a constructor in an interface because all data members in interfaces are public static final by        default, they are constants