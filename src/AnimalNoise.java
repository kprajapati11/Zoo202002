
//change in browser 
import model.*;

public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created
	
	// Test

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
		

	}

}
