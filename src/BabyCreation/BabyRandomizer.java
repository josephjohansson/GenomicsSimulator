package BabyCreation;
import java.util.Random;

import people.*;
import traitsClasses.Traits;

public class BabyRandomizer{
	Mother mom = new Mother();
	
// This is assuming that the baby, mother, and father "Person"s have been made
// This class is static because it is used as a process that is just executed over and over not
// a process that changes an object inside our main class.

// Randomly selects whether mother's or father's trait will be passed on based on the given chances 	
	public static String generateChildsTrait(
			int mothersTraitChance,
			int fathersTraitChance,
			String mothersTrait,
			String fathersTrait) {
		String passingTrait;
		Random generator= new Random();
		// Randomly takes a number between 1 and the sum of the parent's trait chance number
		int chance = generator.nextInt(mothersTraitChance+fathersTraitChance)+1;
		if (chance >= mothersTraitChance){
			passingTrait = mothersTrait;
		}
		else {
			passingTrait = fathersTrait;
		}
		return passingTrait;
	}
	
// Makes the string array of traits for the baby and passes them to the Baby class		
	public static void makeBabyTraitStringArray(Father dad, Mother mom){
		String[] babyTraits = new String[13];
		babyTraits[0] = "Baby";
	// For each possible category
		for (int index = 1; index < 13; index++) {
		// Gets mother's and father's trait for that category
			String momTraitString = mom.createStringTraitsArray()[index];
			String dadTraitString = dad.createStringTraitsArray()[index];
		// Gets the length of the DNA list for those traits for use in the randomizer	
			Traits momTrait = mom.convertStringsToTraits(mom.createStringTraitsArray())[index];
			Traits dadTrait = dad.convertStringsToTraits(dad.createStringTraitsArray())[index];
		// Sends these to the randomizer	
			String babyTrait = generateChildsTrait(
					momTrait.determineCurrentDNA(momTraitString).size(),
					dadTrait.determineCurrentDNA(dadTraitString).size(),
					momTraitString,
					dadTraitString);
		// Adds the selected trait to the baby's array of traits 	
			babyTraits[index] = babyTrait;
		}
	// Passes the array to the baby class
		Baby.setBabyTraits(babyTraits);
	}
	
}	