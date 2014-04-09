package people;

import javax.swing.JComboBox;

import traitsClasses.Traits;
import gui.GeoSimGui;

public class Father extends Person {
	
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
		fatherTraits[5] = "";
		fatherTraits[6] = skinColourF.getSelectedItem().toString();
		fatherTraits[7] = noseSizeF.getSelectedItem().toString();
		fatherTraits[8] = earLobeF.getSelectedItem().toString();
		fatherTraits[9] = hairColourF.getSelectedItem().toString();
		fatherTraits[10] =hairAmountF.getSelectedItem().toString();
		fatherTraits[11] =outlookF.getSelectedItem().toString();
		fatherTraits[12] =intelligenceF.getSelectedItem().toString();
		return fatherTraits;
	}
	
	public void randomizeStringTraitsArray(){
		fatherTraits[0] = "Father";
		fatherTraits[1] = "Male";
		fatherTraits[2] = Traits.EYE_COLOUR.chooseRandomTrait();
		fatherTraits[3] = Traits.EYE_SIZE.chooseRandomTrait();
		fatherTraits[4] = Traits.HEIGHT.chooseRandomTrait();
		fatherTraits[5] = "";
		fatherTraits[6] = Traits.SKIN_COLOUR.chooseRandomTrait();
		fatherTraits[7] = Traits.NOSE_SIZE.chooseRandomTrait();
		fatherTraits[8] = Traits.EARLOBE.chooseRandomTrait();
		fatherTraits[9] = Traits.HAIR_COLOUR.chooseRandomTrait();
		fatherTraits[10] = Traits.HAIR_AMOUNT.chooseRandomTrait();
		fatherTraits[11] = Traits.OUTLOOK.chooseRandomTrait();
		fatherTraits[12] = Traits.INTEL.chooseRandomTrait();
	}
	public void setTraits(String[] randomizedTraits){
		fatherTraits[0] = randomizedTraits[0];
		fatherTraits[1] = randomizedTraits[1];
		fatherTraits[2] = randomizedTraits[2];
		fatherTraits[3] = randomizedTraits[3];
		fatherTraits[4] = randomizedTraits[4];
		fatherTraits[5] = "";
		fatherTraits[6] = randomizedTraits[6];
		fatherTraits[7] = randomizedTraits[7];
		fatherTraits[8] = randomizedTraits[8];
		fatherTraits[9] = randomizedTraits[9];
		fatherTraits[10] = randomizedTraits[10];
		fatherTraits[11] = randomizedTraits[11];
		fatherTraits[12] = randomizedTraits[12];
	}
}
