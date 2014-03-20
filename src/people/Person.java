package people;

import traitsClasses.Traits;

public class Person { 
	String name = "Person";
	private static Traits gender = Traits.GENDER;
	private static Traits eyeColour = Traits.EYE_COLOUR;
	private static Traits eyeSize = Traits.EYE_SIZE;
	private static Traits height = Traits.HEIGHT;
	private static Traits bodyType = Traits.BODY_TYPE;
	private static Traits skinColour = Traits.SKIN_COLOUR;
	private static Traits noseSize = Traits.NOSE_SIZE;
	private static Traits earlobe = Traits.EARLOBE;
	private static Traits hairColour = Traits.HAIR_COLOUR;
	private static Traits hairAmount = Traits.HAIR_AMOUNT;
	private static Traits outlook = Traits.OUTLOOK;
	private static Traits intelligence = Traits.INTEL;
	private static Traits[] allTraits = {null,
				gender,
				eyeColour,
				eyeSize,
				height,
				bodyType,
				skinColour,
				noseSize,
				earlobe,
				hairColour,
				hairAmount,
				outlook,
				intelligence};

// Completely unnecessary constructor	
	public Person() {}
		
// Returns the name of the person, this method is also overridden by all subclasses
// Needed for the text file maker
	public String getName() {
		return name;
	}
	
// Returns all traits in Trait form (not string form). This is used in the gui to 
// get trait lists for the default person
	public Traits[] getAllTraits(){
		return allTraits;
	}
	
// Converts a string array to an array of type Trait, where each trait is set to the 
// trait specified in the string list
// For example: if allTraitsAsStrings[2] = "brown", this method will set allTraits[2]
// to eyeColour and change currentTrait within eyeColour to "brown".
	public static Traits[] convertStringsToTraits(String[] allTraitsAsStrings) {
		// Set gender	
			gender.setCurrentTrait(allTraitsAsStrings[1]);
			allTraits[1] = gender;
		// Set eyeColour
			eyeColour.setCurrentTrait(allTraitsAsStrings[2]);
			allTraits[2] = eyeColour;
		// Set eyeSize
			eyeSize.setCurrentTrait(allTraitsAsStrings[3]);
			allTraits[3] = eyeSize;
		// Set height
			height.setCurrentTrait(allTraitsAsStrings[4]);
			allTraits[4] = height;
		// Set bodyType	
			bodyType.setCurrentTrait(allTraitsAsStrings[5]);
			allTraits[5] = bodyType;
		// Set skinColour	
			skinColour.setCurrentTrait(allTraitsAsStrings[6]);
			allTraits[6] = skinColour;
		// Set noseSize
			noseSize.setCurrentTrait(allTraitsAsStrings[7]);
			allTraits[7] = noseSize;
		// Set earlobe	
			earlobe.setCurrentTrait(allTraitsAsStrings[8]);
			allTraits[8] = earlobe;
		// Set hairColour
			hairColour.setCurrentTrait(allTraitsAsStrings[9]);
			allTraits[9] = hairColour;
		// Set hairAmount
			hairAmount.setCurrentTrait(allTraitsAsStrings[10]);
			allTraits[10] = hairAmount;
		// Set outlook
			outlook.setCurrentTrait(allTraitsAsStrings[11]);
			allTraits[11] = outlook;
		// Set intelligence	
			intelligence.setCurrentTrait(allTraitsAsStrings[12]);
			allTraits[12] = intelligence;
		// Return traits array
			return allTraits;
	}
	
// Chooses a random gene for each specified trait, concatenates them to 
// make a large string (used in the text file maker)
	public String getGeneticMaterial(){
		return (gender.chooseRandomGene()
				+eyeColour.chooseRandomGene()
				+eyeSize.chooseRandomGene()
				+height.chooseRandomGene()
				+bodyType.chooseRandomGene()
				+skinColour.chooseRandomGene()
				+noseSize.chooseRandomGene()
				+earlobe.chooseRandomGene()
				+hairColour.chooseRandomGene()
				+hairAmount.chooseRandomGene()
				+outlook.chooseRandomGene()
				+intelligence.chooseRandomGene()
				);
	}
}

