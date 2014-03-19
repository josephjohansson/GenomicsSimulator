
package oldCode;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Traits {

// RANDOMIZER VARIABLES	
	public String currentGene;
	public int currentDNALength;
	public int geneNumber;
	
// EYE COLOUR
	// TRAITS
		final List<String> EYE_COLOURS = Arrays.asList("Brown","Blue","Green","Hazel");
	// DNA
		final List<String> BROWN_EYES_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
		final List<String> BLUE_EYES_DNA = Arrays.asList("CA","CT","CC");
		final List<String> GREEN_EYES_DNA = Arrays.asList("GA","GC");
		final List<String> HAZEL_EYES_DNA = Arrays.asList("GG","GT");
		final List<String> GREY_EYES_DNA = Arrays.asList("TT");
		final List<String> PURPLE_EYES_DNA = Arrays.asList("CG");
	
// EYE SIZE 
	// TRAITS
		final List<String> EYE_SIZES = Arrays.asList("Small","Medium","Large");
	// DNA	
		final List<String> SMALL_EYES_DNA = Arrays.asList("A");
		final List<String> MEDIUM_EYES_DNA = Arrays.asList("T","C");
		final List<String> LARGE_EYES_DNA = Arrays.asList("G");	
	
// HEIGHT 
	// TRAITS 
		final List<String> HEIGHTS = Arrays.asList("Tall","Average","Short"); 
	// DNA
		final List<String> TALL_HEIGHT_DNA = Arrays.asList("CA","CT","CC","GA");
		final List<String> AVERAGE_HEIGHT_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC");
		final List<String> SHORT_HEIGHT_DNA = Arrays.asList("GG","GT","TT","TG");
		final List<String> DWARF_HEIGHT_DNA = Arrays.asList("GC");
		final List<String> GIANT_HEIGHT_DNA = Arrays.asList("CG");
	
// 	BODY TYPE 
	// TRAITS
		final List<String> BODY_TYPES = Arrays.asList("Slim","Average","Large"); 
	// DNA
		final List<String> SLIM_BODY_DNA = Arrays.asList("CA","CT","CC","GA");
		final List<String> AVERAGE_BODY_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC");
		final List<String> LARGE_BODY_DNA = Arrays.asList("GG","GT","TT","TG");
		final List<String> OBESE_BODY_DNA = Arrays.asList("GC");
		final List<String> ANOREXIC_BODY_DNA = Arrays.asList("CG");
	
//	SKIN COLOUR 
	// TRAITS
		final List<String> SKIN_COLOURS = Arrays.asList("Fair","Dark","Yellow","Brown");
	// DNA
		final List<String> FAIR_SKIN_DNA = Arrays.asList("CT","CC","GA");
		final List<String> DARK_SKIN_DNA = Arrays.asList("AA","AT","AC","AG","TA");
		final List<String> YELLOW_SKIN_DNA = Arrays.asList("GG","GT","TT");
		final List<String> BROWN_SKIN_DNA = Arrays.asList("GC","CA","TC","TG");
		final List<String> ALBINO_SKIN_DNA = Arrays.asList("CG");

// NOSE SIZE 
	// TRAITS
		final List<String> NOSE_SIZES = Arrays.asList("Small","Medium","Large"); 
	// DNA
		final List<String> SMALL_NOSE_DNA = Arrays.asList("A");
		final List<String> MEDIUM_NOSE_DNA = Arrays.asList("G","C");
		final List<String> LARGE_NOSE_DNA = Arrays.asList("T");
	
// EARLOBE
	// TRAITS
		final List<String> EAR_LOBES = Arrays.asList("Attached","Detached");
	// DNA	
		final List<String> ATTACHED_EAR_LOBE_DNA = Arrays.asList("A", "G");
		final List<String> DETACHED_EAR_LOBE_DNA = Arrays.asList("C", "T");

// HAIR COLOUR
	// TRAITS
		final List<String> HAIR_COLOUR = Arrays.asList("Black","Brown","Blonde","Red");
	// DNA
		final List<String> BLACK_HAIR_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
		final List<String> BROWN_HAIR_DNA = Arrays.asList("CA","CT","CC","GA","GC");
		final List<String> BLONDE_HAIR_DNA = Arrays.asList("GG","GT","TT");
		final List<String> RED_HAIR_DNA = Arrays.asList("CG");
	
// HAIR AMOUNT
	// TRAITS
		final List<String> HAIR_AMOUNTS = Arrays.asList("Hairy","Average","Smooth");
	// DNA	
		final List<String> HAIRY_HAIR_DNA = Arrays.asList("A");
		final List<String> AVERAGE_HAIR_DNA = Arrays.asList("T","C");
		final List<String> SMOOTH_HAIR_DNA = Arrays.asList("G");
	
// OUTLOOK
	// TRAITS
		final List<String> OUTLOOKS = Arrays.asList("Optimistic","Pessimistic","Realistic");
	// DNA
		final List<String> OPTIMISTIC_OUTLOOK_DNA = Arrays.asList("A");
		final List<String> PESSIMISTIC_OUTLOOK_DNA = Arrays.asList("G");
		final List<String> REALISTIC_OUTLOOK_DNA = Arrays.asList("T","C");
	
// INTEL
	// TRAITS
		final List<String> TRAITS = Arrays.asList("High","Average","Low");
	// DNA
		final List<String> HIGH_INTEL_DNA = Arrays.asList("A");
		final List<String> AVERAGE_INTEL_DNA = Arrays.asList("G","C");
		final List<String> LOW_INTEL_DNA = Arrays.asList("T");
	
// GENDER
	// TRAITS
		final List<String> GENDERS = Arrays.asList("Male","Female");
	// DNA
		final List<String> MALE_DNA= Arrays.asList("AA", "AG", "AC", "AG", "GA", "GC", "GT");
		final List<String> FEMALE_DNA = Arrays.asList("CA", "CT", "CG", "TT", "TC", "TG", "TA");
		final List<String> HERMAPHRODITE_DNA = Arrays.asList("GG","CC");

	
		
	//-------------------------------------------------------------------------------------------------------
	//RANDOMISER
		//Gets a DNA list and chooses a random gene
		public String getRandomGene(List<String> DNAInputList){
			currentDNALength = DNAInputList.size();
			geneNumber = new Random().nextInt(currentDNALength);
			return(DNAInputList.get(geneNumber));
		}
		
}
