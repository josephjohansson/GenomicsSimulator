package people;

import javax.swing.JComboBox;

import traitsClasses.Traits;
import gui.GeoSimGui;

public class Mother extends Person {
	
/** @param motherTraits = mother's array of traits in string form */
	public String[] motherTraits = new String[13];
	
/** Default constructor that sets name for mother (this is needed for the text file)	
 */
	public Mother() {
		name = "Mother";
	}
	
/** Gets input from all comboBoxes and puts them into an array of all the mother's 
 *  traits (initialized above)	
 *  @return Mother's array of strings, where the first two elements are set by default
 */
	public String[] createStringTraitsArray(JComboBox eyeColourM, 
			JComboBox eyeSizeM,
			JComboBox heightM,
			JComboBox skinColourM,
			JComboBox noseSizeM,
			JComboBox earLobeM,
			JComboBox hairColourM,
			JComboBox hairAmountM,
			JComboBox outlookM,
			JComboBox intelligenceM){
		motherTraits[0] = "Mother";
		motherTraits[1] = "Female";
		motherTraits[2] = eyeColourM.getSelectedItem().toString();	
		motherTraits[3] = eyeSizeM.getSelectedItem().toString();
		motherTraits[4] = heightM.getSelectedItem().toString();
		motherTraits[5] = "";
		motherTraits[6] = skinColourM.getSelectedItem().toString();
		motherTraits[7] = noseSizeM.getSelectedItem().toString();
		motherTraits[8] = earLobeM.getSelectedItem().toString();
		motherTraits[9] = hairColourM.getSelectedItem().toString();
		motherTraits[10] =hairAmountM.getSelectedItem().toString();
		motherTraits[11] =outlookM.getSelectedItem().toString();
		motherTraits[12] =intelligenceM.getSelectedItem().toString();
		return motherTraits;
	}

	public void randomizeStringTraitsArray(){
		motherTraits[0] = "Mother";
		motherTraits[1] = "Female";
		motherTraits[2] = Traits.EYE_COLOUR.chooseRandomTrait();	
		motherTraits[3] = Traits.EYE_SIZE.chooseRandomTrait();
		motherTraits[4] = Traits.HEIGHT.chooseRandomTrait();
		motherTraits[5] = "";
		motherTraits[6] = Traits.SKIN_COLOUR.chooseRandomTrait();
		motherTraits[7] = Traits.NOSE_SIZE.chooseRandomTrait();
		motherTraits[8] = Traits.EARLOBE.chooseRandomTrait();
		motherTraits[9] = Traits.HAIR_COLOUR.chooseRandomTrait();
		motherTraits[10] = Traits.HAIR_AMOUNT.chooseRandomTrait();
		motherTraits[11] = Traits.OUTLOOK.chooseRandomTrait();
		motherTraits[12] = Traits.INTEL.chooseRandomTrait();
	}
	
}
 