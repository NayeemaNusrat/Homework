package hw6Q2Inheritance;

public class TestAnimal {
	public static void main(String[] args) {
		System.out.println("***calling the animal class***");
		Animal animal = new Animal();
		animal.animalInfo();

		// Single Inheritance
		System.out.println("***calling the mammal class***");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		// Single Inheritance
		System.out.println("***calling the reptile class***");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		// Single Inheritance
		System.out.println("***calling the birds class***");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		// Multilevel inheritance
		System.out.println("**calling the dog class**");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		// Multilevel inheritance
		System.out.println("**calling the dog class**");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		// Single inheritance
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();

		// Multilevel inheritance
		BullDog bulldog = new BullDog();
		bulldog.bulldogInfo();
		bulldog.dogInfo();
		bulldog.mammalInfo();
		bulldog.animalInfo();

		// Multilevel inheritance
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}
}
