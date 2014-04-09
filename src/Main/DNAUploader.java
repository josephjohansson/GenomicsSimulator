package Main;
import gui.GeoSimGui;
import people.*;
import traitsClasses.Traits;
import java.awt.*;


public class DNAUploader {
	public static String DNAGender;
	public static String DNAEyeColour;
	public static String DNAEyeSize;
	public static String DNAHeight;
	public static String DNASkinColour;
	public static String DNANoseSize;
	public static String DNAEarLobe;
	public static String DNAHairColour;
	public static String DNAHairAmount;
	public static String DNAOutlook;
	public static String DNAIntelligence;
	
	public static void update(String DNAString, Father father, Mother mother, GeoSimGui gui){
		uploadDNASequence(DNAString);
		//if it is a male
		if (DNAGender.equals("AA")||DNAGender.equals("AC")||DNAGender.equals("AT")||DNAGender.equals("AG")||
				DNAGender.equals("GG")||DNAGender.equals("GA")||DNAGender.equals("GT")||DNAGender.equals("GC")){
			GeoSimGui.eyeColourF.setSelectedItem(Traits.EYE_COLOUR.determineCurrentTrait(DNAEyeColour));
			GeoSimGui.eyeSizeF.setSelectedItem(Traits.EYE_SIZE.determineCurrentTrait(DNAEyeSize)); 
			GeoSimGui.heightF.setSelectedItem(Traits.HEIGHT.determineCurrentTrait(DNAHeight));
			GeoSimGui.skinColourF.setSelectedItem(Traits.SKIN_COLOUR.determineCurrentTrait(DNASkinColour));
			GeoSimGui.noseSizeF.setSelectedItem(Traits.NOSE_SIZE.determineCurrentTrait(DNANoseSize)); 
			GeoSimGui.earLobeF.setSelectedItem(Traits.EARLOBE.determineCurrentTrait(DNAEarLobe)); 
			GeoSimGui.hairColourF.setSelectedItem(Traits.HAIR_COLOUR.determineCurrentTrait(DNAHairColour)); 
			GeoSimGui.hairAmountF.setSelectedItem(Traits.HAIR_AMOUNT.determineCurrentTrait(DNAHairAmount));
			GeoSimGui.outlookF.setSelectedItem(Traits.OUTLOOK.determineCurrentTrait(DNAOutlook));
			GeoSimGui.intelligenceF.setSelectedItem(Traits.INTEL.determineCurrentTrait(DNAIntelligence));
			
		}
		//if it is a female
		else{
			
			GeoSimGui.eyeColourM.setSelectedItem(Traits.EYE_COLOUR.determineCurrentTrait(DNAEyeColour));
			
			
			GeoSimGui.eyeSizeM.setSelectedItem(Traits.EYE_SIZE.determineCurrentTrait(DNAEyeSize)); 
			
			GeoSimGui.heightM.setSelectedItem(Traits.HEIGHT.determineCurrentTrait(DNAHeight));
			
			
			GeoSimGui.skinColourM.setSelectedItem(Traits.SKIN_COLOUR.determineCurrentTrait(DNASkinColour));
			
			GeoSimGui.noseSizeM.setSelectedItem(Traits.NOSE_SIZE.determineCurrentTrait(DNANoseSize)); 
			
			GeoSimGui.earLobeM.setSelectedItem(Traits.EARLOBE.determineCurrentTrait(DNAEarLobe)); 
			
			GeoSimGui.hairColourM.setSelectedItem(Traits.HAIR_COLOUR.determineCurrentTrait(DNAHairColour)); 
			//I dont know why, but when the f
			GeoSimGui.hairAmountM.setSelectedItem(Traits.HAIR_AMOUNT.determineCurrentTrait(DNAHairAmount));

			GeoSimGui.outlookM.setSelectedItem(Traits.OUTLOOK.determineCurrentTrait(DNAOutlook));

			GeoSimGui.intelligenceM.setSelectedItem(Traits.INTEL.determineCurrentTrait(DNAIntelligence));
			
			
		}
		}
	
	
	private static void uploadDNASequence(String DNAString){
		DNAGender= DNAString.substring(0,2);
		DNAEyeColour = DNAString.substring(2,4);
		DNAEyeSize = DNAString.substring(4,5);
		DNAHeight= DNAString.substring(5,7);
		DNASkinColour= DNAString.substring(7,9);
		DNANoseSize = DNAString.substring(9,10);
		DNAEarLobe = DNAString.substring(10,11);
		DNAHairColour = DNAString.substring(11,13);
		DNAHairAmount = DNAString.substring(13,14);
		DNAOutlook = DNAString.substring(14,15);
		DNAIntelligence = DNAString.substring(15,16);

	
	
	
}
}
/**
gender.chooseRandomGene()
+eyeColour.chooseRandomGene()
+eyeSize.chooseRandomGene()
+height.chooseRandomGene()
+skinColour.chooseRandomGene()
+noseSize.chooseRandomGene()
+earlobe.chooseRandomGene()
+hairColour.chooseRandomGene()
+hairAmount.chooseRandomGene()
+outlook.chooseRandomGene()
+intelligence.chooseRandomGene()
*/