package traitsClasses;
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Eyes {
	String currentGene;
	int currentDNALength;
	int geneNumber;
	public int eyeColourChance;
	int eyeSizeChance;
	public String currentEyeColour;
	List<String> currentEyeColourDNA = new ArrayList<String>();
	List<String> currentEyeSizeDNA = new ArrayList<String>();
	List<String> BROWN_EYES_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
	final int BROWN_EYES_CHANCE = 10;
	List<String> BLUE_EYES_DNA = Arrays.asList("CA","CT","CC");
	final int BLUE_EYES_CHANCE = 3;
	List<String> GREEN_EYES_DNA = Arrays.asList("GA","GC");
	final int GREEN_EYES_CHANCE = 4;
	List<String> HAZEL_EYES_DNA = Arrays.asList("GG","GT");
	final int HAZEL_EYES_CHANCE = 4;
	List<String> GREY_EYES_DNA = Arrays.asList("TT");
	final int GREY_EYES_CHANCE = 1;
	List<String> PURPLE_EYES_DNA = Arrays.asList("CG");
	final int PURPLE_EYES_CHANCE = 1;
	List<String> SMALL_EYES_DNA = Arrays.asList("A");
	final int SMALL_EYES_CHANCE = 3;
	List<String> MEDIUM_EYES_DNA = Arrays.asList("T","C");
	final int MEDIUM_EYES_CHANCE = 7;
	List<String> LARGE_EYES_DNA = Arrays.asList("G");
	final int LARGE_EYES_CHANCE = 3;


	
	
//----------------------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE LIST
	// Determines DNA code from given eye colour	
	public void getEyeColour(String eyesColour){
		if (eyesColour.equals("brown")){
			currentEyeColourDNA = BROWN_EYES_DNA;
			eyeColourChance = BROWN_EYES_CHANCE;
			currentEyeColour = "brown";
		}
		else if (eyesColour.equals("blue")){
			currentEyeColourDNA = BLUE_EYES_DNA;
			eyeColourChance = BLUE_EYES_CHANCE;
			currentEyeColour = "blue";
		}
		else if (eyesColour.equals("green")){
			currentEyeColourDNA = GREEN_EYES_DNA;
			eyeColourChance = GREEN_EYES_CHANCE;
			currentEyeColour = "green";
		}
		else if (eyesColour.equals("hazel")){
			currentEyeColourDNA = HAZEL_EYES_DNA;
			eyeColourChance = HAZEL_EYES_CHANCE;
			currentEyeColour = "hazel";
		}
		else if (eyesColour.equals("grey")){
			currentEyeColourDNA = GREY_EYES_DNA;
			eyeColourChance = GREY_EYES_CHANCE;
			currentEyeColour = "grey";
		}
		else if (eyesColour.equals("purple")){
			currentEyeColourDNA = PURPLE_EYES_DNA;
			eyeColourChance = PURPLE_EYES_CHANCE;
			currentEyeColour = "purple";
		}
	}
	
	// Determines DNA code from given eye size -- to be randomized 
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