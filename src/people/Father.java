package people;

import traitsClasses.Traits;
import gui.GeoSimGui;

public class Father extends Person implements GetTraits {
	
/** @param fatherTraits = fathers array of traits in string form */
	public String[] fatherTraits = new String[13];
	
/** Default constructor that sets name for father (this is needed for the text file)	
 */
	public Father() {
		name = "Father";
	}
	
/** Gets input from all comboBoxes and puts them into an array of all the father's 
 *  traits (initialized above)	
 *  @return Father's array of strings, where the first two elements are set by default
 */
	public String[] createStringTraitsArray(){
		fatherTraits[0] = "Father";
		fatherTraits[1] = "Male";
		fatherTraits[2] = GeoSimGui.eyeColourF.getSelectedItem().toString();
		fatherTraits[3] = GeoSimGui.eyeSizeF.getSelectedItem().toString();
		fatherTraits[4] = GeoSimGui.heightF.getSelectedItem().toString();
		fatherTraits[5] = GeoSimGui.bodyTypeF.getSelectedItem().toString();
		fatherTraits[6] = GeoSimGui.skinColourF.getSelectedItem().toString();
		fatherTraits[7] = GeoSimGui.noseSizeF.getSelectedItem().toString();
		fatherTraits[8] = GeoSimGui.earLobeF.getSelectedItem().toString();
		fatherTraits[9] = GeoSimGui.hairColourF.getSelectedItem().toString();
		fatherTraits[10] = GeoSimGui.hairAmountF.getSelectedItem().toString();
		fatherTraits[11] = GeoSimGui.outlookF.getSelectedItem().toString();
		fatherTraits[12] = GeoSimGui.intelligenceF.getSelectedItem().toString();
		return fatherTraits;
	}
	
/** Gets input from all comboBoxes and puts them into an array of all the mother's 
 *  traits (initialized above)	
 *  @return Mother's array of traits, where the first two elements are set by default
 */	
	public String[] randomizeStringTraitsArray(){
		fatherTraits[0] = "Father";
		fatherTraits[1] = "Male";
		fatherTraits[2] = Traits.EYE_COLOUR.chooseRandomTrait();	
		fatherTraits[3] = Traits.EYE_SIZE.chooseRandomTrait();
		fatherTraits[4] = Traits.HEIGHT.chooseRandomTrait();
		fatherTraits[5] = Traits.BODY_TYPE.chooseRandomTrait();
		fatherTraits[6] = Traits.SKIN_COLOUR.chooseRandomTrait();
		fatherTraits[7] = Traits.NOSE_SIZE.chooseRandomTrait();
		fatherTraits[8] = Traits.EARLOBE.chooseRandomTrait();
		fatherTraits[9] = Traits.HAIR_COLOUR.chooseRandomTrait();
		fatherTraits[10] = Traits.HAIR_AMOUNT.chooseRandomTrait();
		fatherTraits[11] = Traits.OUTLOOK.chooseRandomTrait();
		fatherTraits[12] = Traits.INTEL.chooseRandomTrait();
		return fatherTraits;
	}
}
