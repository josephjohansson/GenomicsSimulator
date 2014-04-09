package babyCreation;
import java.util.Random;

import people.*;
import traitsClasses.Traits;

public class BabyRandomizer{
	
/** Randomly selects whether the mother's or father's trait will be passed on based 
 *  on the given chances.  
 *  This method is static because it is used as a process that is just executed 
 *  over and over not a process that changes an object inside our main class.
 *  @param mothersTraitChance = the chance that the mother's trait will be passed on
 *  @param fathersTraitChance = the chance that the father's trait will be passed on
 *  @param mothersTrait = the trait in question in string form for mother (ex. Brown)
 *  @param fathersTrait = the trait in question in string form for father (ex. Blue)
 *  @return passingTrait = the trait that will be passed on (either mothersTrait or fathersTrait)
 */
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
	
/** Makes the string array of traits for the baby and passes them to the Baby class		
 *  @param father = an instance of type Father that is used to determine traitString 
 *  and traitChance
 *  @param mother = an instance of type Mother that is used to determine traitString 
 *  and traitChance
 */
	public static void makeBabyTraitStringArray(Father father, Mother mother){
		
		String[] babyTraits = new String[13];
		babyTraits[0] = "Baby";
	// For each possible category
		
		for (int index = 1; index < 12; index++) {
		// Gets mother's and father's trait for that category
			String motherTraitString = mother.motherTraits[index];
			System.out.println(motherTraitString);
			String fatherTraitString = father.fatherTraits[index];
			System.out.println(fatherTraitString);
		// Gets the length of the DNA list for those traits for use in the randomizer	
			Traits motherTrait = mother.convertStringsToTraits(mother.motherTraits)[index];
			System.out.println("done mother");
			Traits fatherTrait = father.convertStringsToTraits(father.fatherTraits)[index];
			System.out.println("done father");
		// Sends these to the randomizer
			String babyTrait = generateChildsTrait(
					motherTrait.determineCurrentDNA(motherTraitString).size(),
					fatherTrait.determineCurrentDNA(fatherTraitString).size(),
					motherTraitString,
					fatherTraitString);
		// Adds the selected trait to the baby's array of traits 	
			babyTraits[index] = babyTrait;
		}
	// Passes the array to the baby class
		Baby.setBabyTraits(babyTraits);
	}
	
}	