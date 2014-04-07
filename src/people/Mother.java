package people;

import traitsClasses.Traits;
import gui.GeoSimGui;

public class Mother extends Person implements GetTraits {
	
/** @param motherTraits = mother's array of traits in string form */
	public String[] motherTraits = new String[13];
	
/** Default constructor that sets name for mother (this is needed for the text file)	
 */
	public Mother() {
		name = "Mother";
	}
	
/** Gets input from all comboBoxes and puts them into an array of all the mother's 
 *  traits (initialized above)	
 *  @return Mother's array of traits, where the first two elements are set by default
 */
	public String[] createStringTraitsArray(){
		motherTraits[0] = "Mother";
		motherTraits[1] = "Female";
		motherTraits[2] = GeoSimGui.eyeColourM.getSelectedItem().toString();	
		motherTraits[3] = GeoSimGui.eyeSizeM.getSelectedItem().toString();
		motherTraits[4] = GeoSimGui.heightM.getSelectedItem().toString();
		motherTraits[5] = GeoSimGui.bodyTypeM.getSelectedItem().toString();
		motherTraits[6] = GeoSimGui.skinColourM.getSelectedItem().toString();
		motherTraits[7] = GeoSimGui.noseSizeM.getSelectedItem().toString();
		motherTraits[8] = GeoSimGui.earLobeM.getSelectedItem().toString();
		motherTraits[9] = GeoSimGui.hairColourM.getSelectedItem().toString();
		motherTraits[10] = GeoSimGui.hairAmountM.getSelectedItem().toString();
		motherTraits[11] = GeoSimGui.outlookM.getSelectedItem().toString();
		motherTraits[12] = GeoSimGui.intelligenceM.getSelectedItem().toString();
		return motherTraits;
	}

/** Randomly selects traits for the mother 
 *  @return Mother's array of traits, where the first two elements are set by default
 */
	public String[] randomizeStringTraitsArray(){
		motherTraits[0] = "Mother";
		motherTraits[1] = "Female";
		motherTraits[2] = Traits.EYE_COLOUR.chooseRandomTrait();	
		motherTraits[3] = Traits.EYE_SIZE.chooseRandomTrait();
		motherTraits[4] = Traits.HEIGHT.chooseRandomTrait();
		motherTraits[5] = Traits.BODY_TYPE.chooseRandomTrait();
		motherTraits[6] = Traits.SKIN_COLOUR.chooseRandomTrait();
		motherTraits[7] = Traits.NOSE_SIZE.chooseRandomTrait();
		motherTraits[8] = Traits.EARLOBE.chooseRandomTrait();
		motherTraits[9] = Traits.HAIR_COLOUR.chooseRandomTrait();
		motherTraits[10] = Traits.HAIR_AMOUNT.chooseRandomTrait();
		motherTraits[11] = Traits.OUTLOOK.chooseRandomTrait();
		motherTraits[12] = Traits.INTEL.chooseRandomTrait();
		return motherTraits;
	}
	
}
 