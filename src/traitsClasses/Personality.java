package traitsClasses;
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Personality {
	String currentGene;
	public String currentOutlook;
	public String currentIntelligence;
	int currentDNALength;
	int geneNumber;
	public int outlookChance;
	public int intelligenceChance;
	List<String> currentOutlookDNA = new ArrayList<String>();
	List<String> currentIntelligenceDNA = new ArrayList<String>();
	List<String> OPTIMISTIC_OUTLOOK_DNA = Arrays.asList("A");
	List<String> PESSIMISTIC_OUTLOOK_DNA = Arrays.asList("G");
	List<String> REALISTIC_OUTLOOK_DNA = Arrays.asList("T","C");
	List<String> HIGH_INTEL_DNA = Arrays.asList("A");
	List<String> AVERAGE_INTEL_DNA = Arrays.asList("G","C");
	List<String> LOW_INTEL_DNA = Arrays.asList("T");


	
	
//----------------------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE LIST
	// Determines DNA code from given outlook	
	public void getOutlook(String outlook){
		if (outlook.equals("Optimistic")){
			currentOutlookDNA = OPTIMISTIC_OUTLOOK_DNA;
		}
		else if (outlook.equals("Pessimistic")){
			currentOutlookDNA = PESSIMISTIC_OUTLOOK_DNA;
		}
		else if (outlook.equals("Realistic")){
			currentOutlookDNA = REALISTIC_OUTLOOK_DNA;
		}
		currentOutlook = outlook;
		outlookChance = currentOutlookDNA.size();
	}
	
	// Determines DNA code from given intelligence 
	void getIntelligence(String intelligence){
		if (intelligence.equals("High")){
			currentIntelligenceDNA = HIGH_INTEL_DNA;
		}
		else if (intelligence.equals("Average")){
			currentIntelligenceDNA = AVERAGE_INTEL_DNA;
		} 
		else if (intelligence.equals("Low")){
			currentIntelligenceDNA = LOW_INTEL_DNA;
		}
		currentIntelligence = intelligence;
		intelligenceChance = currentIntelligenceDNA.size();
	}

	
	
	
	
//-----------------------------------------------------------------------------------------------------
//DNA INPUT PHENOTYPE OUTPUT
	// Determines eye colour phenotype from given eye colour DNA gene	
	void printOutOutlook(String outlookDNA){
		if (OPTIMISTIC_OUTLOOK_DNA.contains(outlookDNA)){
			System.out.println("OPTIMISTIC");
		}
		else if (PESSIMISTIC_OUTLOOK_DNA.contains(outlookDNA)){
			System.out.println("PESSIMISTIC");
		}
		else if (REALISTIC_OUTLOOK_DNA.contains(outlookDNA)){
			System.out.println("REALISTIC");
		}
	}
	void printOutIntelligenceLevel(String intelligenceDNA){
		if (HIGH_INTEL_DNA.contains(intelligenceDNA)){
			System.out.println("SMALL");
		}
		else if (AVERAGE_INTEL_DNA.contains(intelligenceDNA)){
			System.out.println("AVERAGE");
		}
		else if (LOW_INTEL_DNA.contains(intelligenceDNA)){
			System.out.println("LOW");
		}
	}

	
	
	
	
	
//-------------------------------------------------------------------------------------------------------
//RANDOMISER
	//Gets a DNA list and chooses a random gene
	void getRandomGene(List<String> DNAInputList){
		currentDNALength = DNAInputList.size();
		geneNumber = new Random().nextInt(currentDNALength);
		currentGene = DNAInputList.get(geneNumber);
	}
}