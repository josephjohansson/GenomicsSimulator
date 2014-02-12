package traitsClasses;
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Face {
	String currentGene;
	int currentDNALength;
	int geneNumber;
	List<String> currentNoseSizeDNA = new ArrayList<String>();
	List<String> currentEarLobeDNA = new ArrayList<String>();
	List<String> SMALL_NOSE_DNA = Arrays.asList("A");
	List<String> MEDIUM_NOSE_DNA = Arrays.asList("G","C");
	List<String> LARGE_NOSE_DNA = Arrays.asList("T");
	List<String> ATTACHED_EAR_LOBE_DNA = Arrays.asList("A", "G");
	List<String> DETACHED_EAR_LOBE_DNA = Arrays.asList("C", "T");


	
	
//----------------------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE LIST
	// Determines DNA code from given nose size	
	public void getNoseSize(String noseSize){
		if (noseSize.equals("small")){
			currentNoseSizeDNA = SMALL_NOSE_DNA;
		}
		else if (noseSize.equals("medium")){
			currentNoseSizeDNA = MEDIUM_NOSE_DNA;
		}
		else if (noseSize.equals("large")){
			currentNoseSizeDNA = LARGE_NOSE_DNA;
		}
	}
	
	// Determines DNA code from given ear lobe 
	void getEarLobe(String earLobe){
		if (earLobe.equals("attached")){
			currentEarLobeDNA = ATTACHED_EAR_LOBE_DNA;
		}
		else if (earLobe.equals("detached")){
			currentEarLobeDNA = DETACHED_EAR_LOBE_DNA;
		} 		
	}

	
	
	
	
//-----------------------------------------------------------------------------------------------------
//DNA INPUT PHENOTYPE OUTPUT
	// Determines nose size phenotype from given nose size DNA gene	
	void printOutEyeColour(String noseSizeDNA){
		if (SMALL_NOSE_DNA.contains(noseSizeDNA)){
			System.out.println("SMALL");
		}
		else if (MEDIUM_NOSE_DNA.contains(noseSizeDNA)){
			System.out.println("MEDIUM");
		}
		else if (LARGE_NOSE_DNA.contains(noseSizeDNA)){
			System.out.println("LARGE");
		}
	}
	void printOutEarLobe(String earLobeDNA){
		if (ATTACHED_EAR_LOBE_DNA.contains(earLobeDNA)){
			System.out.println("ATTACHED");
		}
		else if (DETACHED_EAR_LOBE_DNA.contains(earLobeDNA)){
			System.out.println("DETACHED");
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