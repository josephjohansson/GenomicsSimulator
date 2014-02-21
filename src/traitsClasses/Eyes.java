package traitsClasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Eyes {
	String currentGene;
	public String currentEyeColour;
	public String currentEyeSize;
	int currentDNALength;
	int geneNumber;
	public int eyeColourChance;
	public int eyeSizeChance;
	List<String> currentEyeColourDNA = new ArrayList<String>();
	List<String> currentEyeSizeDNA = new ArrayList<String>();
	final List<String> BROWN_EYES_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
	final List<String> BLUE_EYES_DNA = Arrays.asList("CA","CT","CC");
	final List<String> GREEN_EYES_DNA = Arrays.asList("GA","GC");
	final List<String> HAZEL_EYES_DNA = Arrays.asList("GG","GT");
	final List<String> GREY_EYES_DNA = Arrays.asList("TT");
	final List<String> PURPLE_EYES_DNA = Arrays.asList("CG");
	final List<String> SMALL_EYES_DNA = Arrays.asList("A");
	final List<String> MEDIUM_EYES_DNA = Arrays.asList("T","C");
	final List<String> LARGE_EYES_DNA = Arrays.asList("G");
//----------------------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE LIST
	// Determines DNA code from given eye colour	
	public void getEyeColour(String eyesColour){
		if (eyesColour.equals("brown")){
			currentEyeColourDNA = BROWN_EYES_DNA;
		}
		else if (eyesColour.equals("blue")){
			currentEyeColourDNA = BLUE_EYES_DNA;
		}
		else if (eyesColour.equals("green")){
			currentEyeColourDNA = GREEN_EYES_DNA;
		}
		else if (eyesColour.equals("hazel")){
			currentEyeColourDNA = HAZEL_EYES_DNA;
		}
		else if (eyesColour.equals("grey")){
			currentEyeColourDNA = GREY_EYES_DNA;
		}
		else if (eyesColour.equals("purple")){
			currentEyeColourDNA = PURPLE_EYES_DNA;
		}
		eyeColourChance = currentEyeColourDNA.size();
		currentEyeColour = eyesColour;
	}
	
	// Determines DNA code from given eye size 
	void getSize(String eyesSize){
		if (eyesSize.equals("small")){
			currentEyeSizeDNA = SMALL_EYES_DNA;
		}
		else if (eyesSize.equals("medium")){
			currentEyeSizeDNA = MEDIUM_EYES_DNA;
		} 
		else if (eyesSize.equals("large")){
			currentEyeSizeDNA = LARGE_EYES_DNA;
		}		
		eyeSizeChance = currentEyeSizeDNA.size();
		currentEyeSize = eyesSize;
	}

	
	
	
	
//-----------------------------------------------------------------------------------------------------
//DNA INPUT PHENOTYPE OUTPUT
	// Determines eye colour phenotype from given eye colour DNA gene	
	void printOutEyeColour(String eyeColourDNA){
		if (BROWN_EYES_DNA.contains(eyeColourDNA)){
			System.out.println("BROWN");
		}
		else if (BLUE_EYES_DNA.contains(eyeColourDNA)){
			System.out.println("BLUE");
		}
		else if (GREEN_EYES_DNA.contains(eyeColourDNA)){
			System.out.println("GREEN");
		}
		else if (HAZEL_EYES_DNA.contains(eyeColourDNA)){
			System.out.println("HAZEL");
		}
		else if (GREY_EYES_DNA.contains(eyeColourDNA)){
			System.out.println("GREY");
		}
		else if (PURPLE_EYES_DNA.contains(eyeColourDNA)){
			System.out.println("PURPLE");
		}
	}
	// Determines eye size phenotype from given eye size gene
	void printOutEyeSize(String eyeSizeDNA){
		if (SMALL_EYES_DNA.contains(eyeSizeDNA)){
			System.out.println("SMALL");
		}
		else if (MEDIUM_EYES_DNA.contains(eyeSizeDNA)){
			System.out.println("MEDIUM");
		}
		else if (LARGE_EYES_DNA.contains(eyeSizeDNA)){
			System.out.println("LARGE");
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