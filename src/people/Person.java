package people;

import traitsClasses.Traits;

public class Person { 
	String name = "Person";
	private Traits gender = Traits.GENDER;
	private Traits eyeColour = Traits.EYE_COLOUR;
	private Traits eyeSize = Traits.EYE_SIZE;
	private Traits height = Traits.HEIGHT;
	private Traits skinColour = Traits.SKIN_COLOUR;
	private Traits noseSize = Traits.NOSE_SIZE;
	private Traits earlobe = Traits.EARLOBE;
	private Traits hairColour = Traits.HAIR_COLOUR;
	private Traits hairAmount = Traits.HAIR_AMOUNT;
	private Traits outlook = Traits.OUTLOOK;
	private Traits intelligence = Traits.INTEL;
	private Traits[] allTraits = {null,
				gender,
				eyeColour,
				eyeSize,
				height,
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
	public Traits[] convertStringsToTraits(String[] allTraitsAsStrings) {
		// Set gender	
			gender.setCurrentTrait(allTraitsAsStrings[1]);
			allTraits[1] = gender;
			System.out.println("the sex is set to: "+gender.getCurrentTrait());
		// Set eyeColour
			eyeColour.setCurrentTrait(allTraitsAsStrings[2]);
			allTraits[2] = eyeColour;
			System.out.println("the eyecolour is set"+eyeColour.getCurrentTrait());
		// Set eyeSize
			eyeSize.setCurrentTrait(allTraitsAsStrings[3]);
			allTraits[3] = eyeSize;
			System.out.println("the eyesize is set"+eyeSize.getCurrentTrait());
		// Set height
			height.setCurrentTrait(allTraitsAsStrings[4]);
			allTraits[4] = height;
			System.out.println("the height is set"+height.getCurrentTrait());
		// Set skinColour	
			skinColour.setCurrentTrait(allTraitsAsStrings[5]);
			allTraits[5] = skinColour;
			System.out.println("the skincolour is set"+skinColour.getCurrentTrait());
		// Set noseSize
			noseSize.setCurrentTrait(allTraitsAsStrings[6]);
			allTraits[6] = noseSize;
			System.out.println("the nosesize is set"+noseSize.getCurrentTrait());
		// Set earlobe	
			earlobe.setCurrentTrait(allTraitsAsStrings[7]);
			allTraits[7] = earlobe;
			System.out.println("the earlobe is set"+earlobe.getCurrentTrait());
		// Set hairColour
			hairColour.setCurrentTrait(allTraitsAsStrings[8]);
			allTraits[8] = hairColour;
			System.out.println("the haircolour is set"+hairColour.getCurrentTrait());
		// Set hairAmount
			hairAmount.setCurrentTrait(allTraitsAsStrings[9]);
			allTraits[9] = hairAmount;
			System.out.println("the hairamount is set"+hairAmount.getCurrentTrait());
		// Set outlook
			outlook.setCurrentTrait(allTraitsAsStrings[10]);
			allTraits[10] = outlook;
			System.out.println("the oulook is set"+outlook.getCurrentTrait());
		// Set intelligence	
			intelligence.setCurrentTrait(allTraitsAsStrings[11]);
			allTraits[11] = intelligence;
			System.out.println("the intelligence is set"+intelligence.getCurrentTrait());
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

