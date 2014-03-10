package BabyCreation;
import java.util.Random;

public class BabyRandomizer{
	//this is assuming that the baby, mother, and father "Person"s have been made
	//This class is static because it is used as a process that is just executed over and over not
	//a process that changes an object inside our main calss.
	
	public static String generateChildsTrait(
			int mothersTraitChance,
			int fathersTraitChance,
			String mothersTrait,
			String fathersTrait) {
		String passingTrait;
		Random generator= new Random();
		//Randomly takes a number between 1 and the sum of the parent's trait chance number
		int chance = generator.nextInt(mothersTraitChance+fathersTraitChance)+1;
		if (chance >= mothersTraitChance){
			passingTrait = mothersTrait;
		}
		else {
			passingTrait = fathersTrait;
		}
		return passingTrait;
	}
}