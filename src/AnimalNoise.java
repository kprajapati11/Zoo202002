
//change in browser 
import model.*;

public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		Donkey joe = new Donkey("Joe", "Brown", 4);
		Donkey jenny = new Donkey("Jenny", "Grey", 4);
		Donkey jack = new Donkey("Jack", "Grey", 4);

		System.out.println(joe.speak());
		System.out.println(jenny.speak());
		System.out.println(jack.speak());
		System.out.println(joe.display());
		System.out.println(jenny.display());
		System.out.println(jack.display());
		

		Pig mrCuddles = new Pig("Mr. Cuddles", "pink", 4);
		mrCuddles.playInMud();
		System.out.println(mrCuddles.speak());
		mrCuddles.bathe();
		System.out.println(mrCuddles.speak());
	}

}
