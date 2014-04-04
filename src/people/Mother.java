package people;

import gui.GeoSimGui;

public class Mother extends Person {
	
// Initialization of mother's array of traits in string form
	public String[] motherTraits = new String[13];
	
// Sets name for mother (this is needed for the text file)	
	public Mother() {
		name = "Mother";
	}
	
// Gets input from all comboBoxes and puts them into an array
// of all the mother's traits (initialized above)	
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

}
