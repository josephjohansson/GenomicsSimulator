package people;

import javax.swing.JComboBox;

import traitsClasses.Traits;


public class Mother extends Person {
	
/** @param motherTraits = mother's array of traits in string form */
	public String[] motherTraits = new String[12];
	
/** Default constructor that sets name for mother (this is needed for the text file)	
 */
	public Mother() {
		name = "Mother";
	}
	
/** Gets input from all comboBoxes and puts them into an array of all the mother's 
 *  traits (initialized above)	
 *  @return Mother's array of strings, where the first two elements are set by default
 */
	@SuppressWarnings("rawtypes")
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
		motherTraits[5] = skinColourM.getSelectedItem().toString();
		motherTraits[6] = noseSizeM.getSelectedItem().toString();
		motherTraits[7] = earLobeM.getSelectedItem().toString();
		motherTraits[8] = hairColourM.getSelectedItem().toString();
		motherTraits[9] =hairAmountM.getSelectedItem().toString();
		motherTraits[10] =outlookM.getSelectedItem().toString();
		motherTraits[11] =intelligenceM.getSelectedItem().toString();
		return motherTraits;
	}

	public void randomizeStringTraitsArray(){
		motherTraits[0] = "Mother";
		motherTraits[1] = "Female";
		motherTraits[2] = Traits.EYE_COLOUR.chooseRandomTrait();	
		motherTraits[3] = Traits.EYE_SIZE.chooseRandomTrait();
		motherTraits[4] = Traits.HEIGHT.chooseRandomTrait();
		motherTraits[5] = Traits.SKIN_COLOUR.chooseRandomTrait();
		motherTraits[6] = Traits.NOSE_SIZE.chooseRandomTrait();
		motherTraits[7] = Traits.EARLOBE.chooseRandomTrait();
		motherTraits[8] = Traits.HAIR_COLOUR.chooseRandomTrait();
		motherTraits[9] = Traits.HAIR_AMOUNT.chooseRandomTrait();
		motherTraits[10] = Traits.OUTLOOK.chooseRandomTrait();
		motherTraits[11] = Traits.INTEL.chooseRandomTrait();
	}
	public void setTraits(String[] Traits){
		motherTraits[0] = Traits[0];
		motherTraits[1] = Traits[1];
		motherTraits[2] = Traits[2];
		motherTraits[3] = Traits[3];
		motherTraits[4] = Traits[4];
		motherTraits[5] = Traits[5];
		motherTraits[6] = Traits[6];
		motherTraits[7] = Traits[7];
		motherTraits[8] = Traits[8];
		motherTraits[9] = Traits[9];
		motherTraits[10] = Traits[10];
		motherTraits[11] = Traits[11];
	}
	
}
 