package oldCode;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum TraitsEnum {
	EYE_COLOUR(Arrays.asList("Brown","Blue","Green","Hazel"),
			Arrays.asList(Arrays.asList("Brown","AA","AT","AC","AG","TA","TC","TG"),
						Arrays.asList("Blue","CA","CT","CC"),
						Arrays.asList("Green","GA","GC"),
						Arrays.asList("Hazel","GG","GT"),
						Arrays.asList("Grey","TT"),
						Arrays.asList("Purple","CG"))),
	EYE_SIZE(Arrays.asList("Small","Medium","Large"),
			Arrays.asList(Arrays.asList("Small","A"),
						Arrays.asList("Medium","T","C"),
						Arrays.asList("Large","G"))),	
	HEIGHT(Arrays.asList("Tall","Average","Short"),
			Arrays.asList(Arrays.asList("Tall","CA","CT","CC","GA"),
						Arrays.asList("Average","AA","AT","AC","AG","TA","TC"),
						Arrays.asList("Short","GG","GT","TT","TG"),
						Arrays.asList("Dwarf","GC"),
						Arrays.asList("Giant","CG"))),
	BODY_TYPE(Arrays.asList("Slim","Average","Large"),
			Arrays.asList(Arrays.asList("Slim","CA","CT","CC","GA"),
						Arrays.asList("Average","AA","AT","AC","AG","TA","TC"),
						Arrays.asList("Large","GG","GT","TT","TG"),
						Arrays.asList("Obese","GC"),
						Arrays.asList("Anorexic","CG"))),
	SKIN_COLOUR(Arrays.asList("Fair","Dark","Yellow","Brown"),
			Arrays.asList(Arrays.asList("Fair","CT","CC","GA"),
						Arrays.asList("Dark","AA","AT","AC","AG","TA"),
						Arrays.asList("Yellow","GG","GT","TT"),
						Arrays.asList("Brown","GC","CA","TC","TG"),
						Arrays.asList("Albino","CG"))),
	NOSE_SIZE(Arrays.asList("Small","Medium","Large"),
			Arrays.asList(Arrays.asList("Small","A"),
						Arrays.asList("Medium","G","C"),
						Arrays.asList("Large","T"))),
	EARLOBE(Arrays.asList("Attached","Detached"),
			Arrays.asList(Arrays.asList("Attached","A", "G"),
						Arrays.asList("Detached","C", "T"))),
	HAIR_COLOUR(Arrays.asList("Black","Brown","Blonde","Red"),
			Arrays.asList(Arrays.asList("Black","AA","AT","AC","AG","TA","TC","TG"),
						Arrays.asList("Brown","CA","CT","CC","GA","GC"),
						Arrays.asList("Blonde","GG","GT","TT"),
						Arrays.asList("Red","CG"))),
	HAIR_AMOUNT(Arrays.asList("Hairy","Average","Smooth"),
			Arrays.asList(Arrays.asList("Hairy","A"),
						Arrays.asList("Avearge","T","C"),
						Arrays.asList("Smooth","G"))),
	OUTLOOK(Arrays.asList("Optimistic","Pessimistic","Realistic"),
			Arrays.asList(Arrays.asList("Optimistic","A"),
						Arrays.asList("Pessimistic","G"),
						Arrays.asList("Realistic","T","C"))),
	INTEL(Arrays.asList("High","Average","Low"),
			Arrays.asList(Arrays.asList("High","A"),
						Arrays.asList("Average","G","C"),
						Arrays.asList("Low","T"))), 
	GENDER(Arrays.asList("Male","Female"),
			Arrays.asList(Arrays.asList("Male","AA", "AG", "AC", "AG", "GA", "GC", "GT"),
						Arrays.asList("Female","CA", "CT", "CG", "TT", "TC", "TG", "TA"),
						Arrays.asList("GG","CC")));

	private List<String> traitsSet = null; // The set of traits for current category
	private List<List<String>> DNASet = null; // The set of DNA lists for the current category
	private String currentTrait; // Name of trait, ex. "Brown"
	private List<String> currentDNA; // DNA list corresponding to trait, ex. ("AG", "AT", "AA")
	private int currentDNALength; // Length of DNA list
	private String currentGene; // An element of DNA list, ex. "AA"
	private int geneNumber; // The index of currentGene on currentDNA
	
	TraitsEnum(List<String> traitsSetInput, List<List<String>> DNASetInput) {
		traitsSet = traitsSetInput;
		DNASet = DNASetInput;
	}

	public List<String> getTraitSet() {
		return traitsSet;
	}
	
	public List<List<String>> getDNASet() {
		return DNASet;
	}
	public String getCurrentTrait(){
		return currentTrait;
	}
	public void setCurrentTrait(String traitInput){
		currentTrait = traitInput;
	}
	
	public String determineCurrentTrait(List<String> geneInput) {
		for (List<String> DNA: DNASet) {
			for (String gene: DNA) {
		    	if (gene.equals(geneInput)) {
		    		currentDNA = DNA;
		    	}
		    }
		}    
		currentTrait = currentDNA.get(0);
		return currentTrait;
	}
	
	public List<String> determineCurrentDNA(String TraitInput) {
		for (List<String> DNA: DNASet) {
			if (DNA.get(0).equals(TraitInput)){
				currentDNA = DNA;
			}
		}
		currentDNALength = currentDNA.size();
		return currentDNA;
	}

	public String chooseRandomGene() {
		geneNumber = new Random().nextInt(currentDNALength-1);
		currentGene = currentDNA.get(geneNumber+1);
		return currentGene;
	}
	
}

