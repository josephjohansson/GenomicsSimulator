package Main;

import traitsClasses.Traits;

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
	public static String[] importedTraits = new String[12];
	
	
	public static String[] getStringTraits(String DNAString){
		uploadDNASequence(DNAString);
		//if it is a male
		if (DNAGender.equals("AA")||DNAGender.equals("AC")||DNAGender.equals("AT")||DNAGender.equals("AG")||
				DNAGender.equals("GG")||DNAGender.equals("GA")||DNAGender.equals("GT")||DNAGender.equals("GC")){
			importedTraits[0] = "Father";
			importedTraits[1] = "Male";
			importedTraits[2] = Traits.EYE_COLOUR.determineCurrentTrait(DNAEyeColour);
			importedTraits[3] = Traits.EYE_SIZE.determineCurrentTrait(DNAEyeSize); 
			importedTraits[4] = Traits.HEIGHT.determineCurrentTrait(DNAHeight);
			importedTraits[5] = Traits.SKIN_COLOUR.determineCurrentTrait(DNASkinColour);
			importedTraits[6] = Traits.NOSE_SIZE.determineCurrentTrait(DNANoseSize); 
			importedTraits[7] = Traits.EARLOBE.determineCurrentTrait(DNAEarLobe); 
			importedTraits[8] = Traits.HAIR_COLOUR.determineCurrentTrait(DNAHairColour); 
			importedTraits[9] = Traits.HAIR_AMOUNT.determineCurrentTrait(DNAHairAmount);
			importedTraits[10] = Traits.OUTLOOK.determineCurrentTrait(DNAOutlook);
			importedTraits[11] = Traits.INTEL.determineCurrentTrait(DNAIntelligence);
			
		}
		//if it is a female
		else{
			importedTraits[0] = "Mother";
			importedTraits[1] = "Female";
			importedTraits[2] = Traits.EYE_COLOUR.determineCurrentTrait(DNAEyeColour);
			importedTraits[3] = Traits.EYE_SIZE.determineCurrentTrait(DNAEyeSize); 
			importedTraits[4] = Traits.HEIGHT.determineCurrentTrait(DNAHeight);
			importedTraits[5] = Traits.SKIN_COLOUR.determineCurrentTrait(DNASkinColour);
			importedTraits[6] = Traits.NOSE_SIZE.determineCurrentTrait(DNANoseSize); 
			importedTraits[7] = Traits.EARLOBE.determineCurrentTrait(DNAEarLobe); 
			importedTraits[8] = Traits.HAIR_COLOUR.determineCurrentTrait(DNAHairColour); 
			importedTraits[9] = Traits.HAIR_AMOUNT.determineCurrentTrait(DNAHairAmount);
			importedTraits[10] = Traits.OUTLOOK.determineCurrentTrait(DNAOutlook);
			importedTraits[11] = Traits.INTEL.determineCurrentTrait(DNAIntelligence);
			
			
		}
		return importedTraits;
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
