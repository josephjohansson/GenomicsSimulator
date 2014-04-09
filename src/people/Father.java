package people;

import javax.swing.JComboBox;

import traitsClasses.Traits;
import gui.GeoSimGui;
import Main.*;

public class Father extends Person {
	
/** @param fatherTraits = fathers array of traits in string form */
	public String[] fatherTraits = new String[13];

// Makes the comboBoxes for the father
	public JComboBox eyeColourF;
	public JComboBox eyeSizeF;
	public JComboBox heightF;
	public JComboBox skinColourF;
	public JComboBox noseSizeF;
	public JComboBox earLobeF;
	public JComboBox hairColourF;
	public JComboBox hairAmountF;
	public JComboBox outlookF;
	public JComboBox intelligenceF;
	
/** Default constructor that sets name for father (this is needed for the text file)	
 */
	public Father() {
	// Sets father's name (needed for text file)	
		name = "Father";
		
	// Option arrays made for comboBoxes
		String[] eyeColourOptions = Traits.EYE_COLOUR.getTraitSet().toArray(new String[Traits.EYE_COLOUR.getTraitSet().size()]);
		String[] eyeSizeOptions = Traits.EYE_SIZE.getTraitSet().toArray(new String[Traits.EYE_SIZE.getTraitSet().size()]);
		String[] heightOptions = Traits.HEIGHT.getTraitSet().toArray(new String[Traits.HEIGHT.getTraitSet().size()]);
		String[] skinColourOptions = Traits.SKIN_COLOUR.getTraitSet().toArray(new String[Traits.SKIN_COLOUR.getTraitSet().size()]);
		String[] noseSizeOptions = Traits.NOSE_SIZE.getTraitSet().toArray(new String[Traits.NOSE_SIZE.getTraitSet().size()]);
		String[] earLobeOptions = Traits.EARLOBE.getTraitSet().toArray(new String[Traits.EARLOBE.getTraitSet().size()]);
		String[] hairColourOptions = Traits.HAIR_COLOUR.getTraitSet().toArray(new String[Traits.HAIR_COLOUR.getTraitSet().size()]);
		String[] hairAmountOptions = Traits.HAIR_AMOUNT.getTraitSet().toArray(new String[Traits.HAIR_AMOUNT.getTraitSet().size()]);
		String[] outlookOptions = Traits.OUTLOOK.getTraitSet().toArray(new String[Traits.OUTLOOK.getTraitSet().size()]);
		String[] intelligenceOptions = Traits.INTEL.getTraitSet().toArray(new String[Traits.INTEL.getTraitSet().size()]);
		
	// Fills in the comboBoxes for the father
		eyeColourF = new JComboBox(eyeColourOptions);
		eyeSizeF = new JComboBox(eyeSizeOptions);
		heightF = new JComboBox(heightOptions);
		skinColourF = new JComboBox(skinColourOptions);
		noseSizeF = new JComboBox(noseSizeOptions);
		earLobeF = new JComboBox(earLobeOptions);
		hairColourF = new JComboBox(hairColourOptions);
		hairAmountF = new JComboBox(hairAmountOptions);
		outlookF = new JComboBox(outlookOptions);
		intelligenceF = new JComboBox(intelligenceOptions);
	}
	
/** Gets input from all comboBoxes and puts them into an array of all the father's 
 *  traits (initialized above)	
 *  @return Father's array of strings, where the first two elements are set by default
 */
	public String[] createStringTraitsArray(){
		fatherTraits[0] = "Father";
		fatherTraits[1] = "Male";
		fatherTraits[2] = eyeColourF.getSelectedItem().toString();
		fatherTraits[3] = eyeSizeF.getSelectedItem().toString();
		fatherTraits[4] = heightF.getSelectedItem().toString();
		fatherTraits[5] = " ";
		fatherTraits[6] = skinColourF.getSelectedItem().toString();
		fatherTraits[7] = noseSizeF.getSelectedItem().toString();
		fatherTraits[8] = earLobeF.getSelectedItem().toString();
		fatherTraits[9] = hairColourF.getSelectedItem().toString();
		fatherTraits[10] = hairAmountF.getSelectedItem().toString();
		fatherTraits[11] = outlookF.getSelectedItem().toString();
		fatherTraits[12] = intelligenceF.getSelectedItem().toString();
		return fatherTraits;
	}
	
	public String[] randomizeStringTraitsArray(){
		
		fatherTraits[0] = "Father";
		fatherTraits[1] = "Male";
		fatherTraits[2] = Traits.EYE_COLOUR.chooseRandomTrait();	
		fatherTraits[3] = Traits.EYE_SIZE.chooseRandomTrait();
		fatherTraits[4] = Traits.HEIGHT.chooseRandomTrait();
		fatherTraits[5] = " ";
		fatherTraits[6] = Traits.SKIN_COLOUR.chooseRandomTrait();
		fatherTraits[7] = Traits.NOSE_SIZE.chooseRandomTrait();
		fatherTraits[8] = Traits.EARLOBE.chooseRandomTrait();
		fatherTraits[9] = Traits.HAIR_COLOUR.chooseRandomTrait();
		fatherTraits[10] = Traits.HAIR_AMOUNT.chooseRandomTrait();
		fatherTraits[11] = Traits.OUTLOOK.chooseRandomTrait();
		fatherTraits[12] = Traits.INTEL.chooseRandomTrait();
		
		eyeColourF.setSelectedItem(fatherTraits[2]);
		eyeSizeF.setSelectedItem(fatherTraits[3]); 
		heightF.setSelectedItem(fatherTraits[4]);
		skinColourF.setSelectedItem(fatherTraits[6]);
		noseSizeF.setSelectedItem(fatherTraits[7]); 
		earLobeF.setSelectedItem(fatherTraits[8]); 
		hairColourF.setSelectedItem(fatherTraits[9]); 
		hairAmountF.setSelectedItem(fatherTraits[10]);
		outlookF.setSelectedItem(fatherTraits[11]);
		intelligenceF.setSelectedItem(fatherTraits[12]);
		
		return fatherTraits;
	}
}
