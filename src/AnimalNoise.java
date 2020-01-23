import model.*;

public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
    
		Donkey joe = new Donkey("Joe", "Brown", 4);
		System.out.println(joe.speak());

		Pig mrCuddles = new Pig("Mr. Cuddles", "pink", 4);
		System.out.println(mrCuddles.speak());
		
		Lion simba = new Lion(false, 2, "Simba");
		System.out.println(simba.speak());
    
		Rabbit MrNibbles = new Rabbit();
		System.out.println(MrNibbles.speak());
		
		Dog pepper = new Dog("Pepper", "Brown", 5);
		System.out.println(pepper.speak());
		
		Sheep arthur = new Sheep("Arthur", "white", 9);
		System.out.println(arthur.speak());
		
		Horse seabiscuit = new Horse("Seabiscuit", 13, "Thoroughbred");
		System.out.println(seabiscuit.speak());
		
		Mouse jerry = new Mouse("Jerry", "Brown", 2);
		System.out.println(jerry.speak());
    
    Parrot polly = new Parrot(false, false, new String[]{"polly wanna cracker"});
		System.out.println(polly.speak());
		
		Frog kermit = new Frog("Kermit", "Green", 64);
		System.out.println(kermit.speak());

	}

}