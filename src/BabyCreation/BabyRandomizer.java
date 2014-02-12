package BabyCreation;
import java.util.Random;

public class BabyRandomizer{
	//this is assuming that the baby, mother, and father "Person"s have been made
	public String generateChildsDNA(int mothersTraitChance, int fathersTraitChance){
		String passingTrait;
		Random generator= new Random();
		//Randomly takes a number between 1 and the sum of the parent's trait chance number
		int chance=generator.nextInt(mothersTraitChance+fathersTraitChance)+1;
		if (chance >= mothersTraitChance){
			passingTrait = "mother";
		}
		else {
			passingTrait = "father";
		}
		return passingTrait;
	}
}