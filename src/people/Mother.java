package people;

import javax.swing.JComboBox;

import Main.Initializer;
import traitsClasses.Traits;
import gui.GeoSimGui;

public class Mother extends Person {
	
/** @param motherTraits = mother's array of traits in string form */
	public String[] motherTraits = new String[13];
	

// Makes the comboBoxes for the mother
	public JComboBox eyeColourM;
	public JComboBox eyeSizeM;
	public JComboBox heightM;
	public JComboBox skinColourM;
	public JComboBox noseSizeM;
	public JComboBox earLobeM;
	public JComboBox hairColourM;
	public JComboBox hairAmountM;
	public JComboBox outlookM;
	public JComboBox intelligenceM;
	
/** Default constructor that sets name for mother (this is needed for the text file)	
 */
	public Mother() {
	// Sets mother's name (needed for text file)	
		name = "Mother";
		
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
		eyeColourM = new JComboBox(eyeColourOptions);
		eyeSizeM = new JComboBox(eyeSizeOptions);
		heightM = new JComboBox(heightOptions);
		skinColourM = new JComboBox(skinColourOptions);
		noseSizeM = new JComboBox(noseSizeOptions);
		earLobeM = new JComboBox(earLobeOptions);
		hairColourM = new JComboBox(hairColourOptions);
		hairAmountM = new JComboBox(hairAmountOptions);
		outlookM = new JComboBox(outlookOptions);
		intelligenceM = new JComboBox(intelligenceOptions);
	}
	
/** Gets input from all comboBoxes and puts them into an array of all the mother's 
 *  traits (initialized above)	
 *  @return Mother's array of strings, where the first two elements are set by default
 */
	public String[] createStringTraitsArray(){
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
		motherTraits[10] = hairAmountM.getSelectedItem().toString();
		motherTraits[11] = outlookM.getSelectedItem().toString();
		motherTraits[12] = intelligenceM.getSelectedItem().toString();
		return motherTraits;
	}

	public String[] randomizeStringTraitsArray(){
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
		
		for (String traits: motherTraits) System.out.println(traits);
		
		eyeColourM.setSelectedItem(motherTraits[2]); 
		eyeSizeM.setSelectedItem(motherTraits[3]); 
		heightM.setSelectedItem(motherTraits[4]);
		skinColourM.setSelectedItem(motherTraits[6]); 
		noseSizeM.setSelectedItem(motherTraits[7]);
		earLobeM.setSelectedItem(motherTraits[8]); 
		hairColourM.setSelectedItem(motherTraits[9]); 
		hairAmountM.setSelectedItem(motherTraits[10]); 
		outlookM.setSelectedItem(motherTraits[11]); 
		intelligenceM.setSelectedItem(motherTraits[12]);
		
		for (String traits: motherTraits) System.out.println(traits);
		
		return motherTraits;
	}
	
}
 