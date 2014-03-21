package people;

import gui.GeoSimGui;

public class Father extends Person {
	
// Initialization of father's array of traits in string form
	public static String[] fatherTraits = new String[13];
	
// Sets name for father (this is needed for the text file)	
	public Father() {
		name = "Father";
	}
	
// Gets input from all comboBoxes and puts them into an array
// of all the father's traits (initialized above)	
	public static String[] createStringTraitsArray(){
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
}
