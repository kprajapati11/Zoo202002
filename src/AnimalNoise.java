
//change in browser 
import model.*;

public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		Donkey joe = new Donkey();
		Donkey jenny = new Donkey();
		Donkey jack = new Donkey();

		System.out.println(joe.speak());
		System.out.println(jenny.speak());
		System.out.println(jack.speak());

	}

}
