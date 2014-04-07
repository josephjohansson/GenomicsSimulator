package people;

import traitsClasses.Traits;

public class Person { 
/** @param name = The name of this person, which is by default set to "person" */
	String name = "Person";
/** The following variables of type Trait have been set to the appropriate 
 *  instance of the traits enumeration */	
	private Traits gender = Traits.GENDER;
	private Traits eyeColour = Traits.EYE_COLOUR;
	private Traits eyeSize = Traits.EYE_SIZE;
	private Traits height = Traits.HEIGHT;
	private Traits bodyType = Traits.BODY_TYPE;
	private Traits skinColour = Traits.SKIN_COLOUR;
	private Traits noseSize = Traits.NOSE_SIZE;
	private Traits earlobe = Traits.EARLOBE;
	private Traits hairColour = Traits.HAIR_COLOUR;
	private Traits hairAmount = Traits.HAIR_AMOUNT;
	private Traits outlook = Traits.OUTLOOK;
	private Traits intelligence = Traits.INTEL;
/** @param allTraits = An array of type Trait that contains each of the above 
 *  variables in a predetermined order. Eventually the variable 'currentTrait'
 *  within each of these traits will be set appropriately. Index 0 of this 
 *  array is left empty because the corresponding array of strings has the 
 *  name of the person at index 0, and there is no corresponding Trait for this
 */
	private Traits[] allTraits = {null,
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

/** Default constructor */	
	public Person() {}
		
/** Returns the name of the person, this method is also overridden by all subclasses
 *  Needed for the text file maker */
	public String getName() {
		return name;
	}
	
/** Returns all traits in Trait form (not string form). This is used in the gui to 
 *  get trait lists for the default person
 *  @return the array of traits (type Trait) for this specific person
 */
	public Traits[] getAllTraits(){
		return allTraits;
	}
	
/** Converts a string array to an array of type Trait, where each trait is set to the 
 *  trait specified in the string list
 *  For example: if allTraitsAsStrings[2] = "brown", this method will set allTraits[2]
 *  to eyeColour and change currentTrait within eyeColour to "brown". 
 *  @return the array of traits (type Trait) where each Trait has been set appropriately
 */
	public Traits[] convertStringsToTraits(String[] allTraitsAsStrings) {
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
	
/** Chooses a random gene for each specified trait, concatenates them to 
 * make a large string (used in the text file maker)
 * @return a string of DNA where each letter is representative of a trait
 */
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

