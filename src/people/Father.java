package people;

import javax.swing.JComboBox;

import traitsClasses.Traits;

public class Father extends Person {
	
/** @param fatherTraits = fathers array of traits in string form */
	public String[] fatherTraits = new String[12];
	
/** Default constructor that sets name for father (this is needed for the text file)	
 */
	public Father() {
		name = "Father";
	}
	
/** Gets input from all comboBoxes and puts them into an array of all the father's 
 *  traits (initialized above)	
 *  @return Father's array of strings, where the first two elements are set by default
 */
	@SuppressWarnings("rawtypes")
	public String[] createStringTraitsArray(JComboBox eyeColourF, 
											JComboBox eyeSizeF,
											JComboBox heightF,
											JComboBox skinColourF,
											JComboBox noseSizeF,
											JComboBox earLobeF,
											JComboBox hairColourF,
											JComboBox hairAmountF,
											JComboBox outlookF,
											JComboBox intelligenceF){
		fatherTraits[0] = "Father";
		fatherTraits[1] = "Male";
		fatherTraits[2] = eyeColourF.getSelectedItem().toString();
		fatherTraits[3] = eyeSizeF.getSelectedItem().toString();
		fatherTraits[4] = heightF.getSelectedItem().toString();
		fatherTraits[5] = skinColourF.getSelectedItem().toString();
		fatherTraits[6] = noseSizeF.getSelectedItem().toString();
		fatherTraits[7] = earLobeF.getSelectedItem().toString();
		fatherTraits[8] = hairColourF.getSelectedItem().toString();
		fatherTraits[9] =hairAmountF.getSelectedItem().toString();
		fatherTraits[10] =outlookF.getSelectedItem().toString();
		fatherTraits[11] =intelligenceF.getSelectedItem().toString();
		return fatherTraits;
	}
	
	public void randomizeStringTraitsArray(){
		fatherTraits[0] = "Father";
		fatherTraits[1] = "Male";
		fatherTraits[2] = Traits.EYE_COLOUR.chooseRandomTrait();
		fatherTraits[3] = Traits.EYE_SIZE.chooseRandomTrait();
		fatherTraits[4] = Traits.HEIGHT.chooseRandomTrait();
		fatherTraits[5] = Traits.SKIN_COLOUR.chooseRandomTrait();
		fatherTraits[6] = Traits.NOSE_SIZE.chooseRandomTrait();
		fatherTraits[7] = Traits.EARLOBE.chooseRandomTrait();
		fatherTraits[8] = Traits.HAIR_COLOUR.chooseRandomTrait();
		fatherTraits[9] = Traits.HAIR_AMOUNT.chooseRandomTrait();
		fatherTraits[10] = Traits.OUTLOOK.chooseRandomTrait();
		fatherTraits[11] = Traits.INTEL.chooseRandomTrait();
	}
	public void setTraits(String[] Traits){
		fatherTraits[0] = Traits[0];
		fatherTraits[1] = Traits[1];
		fatherTraits[2] = Traits[2];
		fatherTraits[3] = Traits[3];
		fatherTraits[4] = Traits[4];
		fatherTraits[5] = Traits[5];
		fatherTraits[6] = Traits[6];
		fatherTraits[7] = Traits[7];
		fatherTraits[8] = Traits[8];
		fatherTraits[9] = Traits[9];
		fatherTraits[10] = Traits[10];
		fatherTraits[11] = Traits[11];
	}
}
