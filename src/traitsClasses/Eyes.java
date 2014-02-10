package traitsClasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Eyes {
	String size;
	String currentGene;
	int currentDNALength;
	int geneNumber;
	List<String> currentEyeColourDNA = new ArrayList<String>();
	List<String> currentEyeSizeDNA = new ArrayList<String>();
	List<String> BROWN_EYES_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
	List<String> BLUE_EYES_DNA = Arrays.asList("CA","CT","CC");
	List<String> GREEN_EYES_DNA = Arrays.asList("GA","GC");
	List<String> HAZEL_EYES_DNA = Arrays.asList("GG","GT");
	List<String> GREY_EYES_DNA = Arrays.asList("TT");
	List<String> PURPLE_EYES_DNA = Arrays.asList("CG");
	List<String> SMALL_EYES_DNA = Arrays.asList("A");
	List<String> MEDIUM_EYES_DNA = Arrays.asList("T","C");
	List<String> LARGE_EYES_DNA = Arrays.asList("G");


	
	
//----------------------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE LIST
	// Determines DNA code from given eye colour	
	public void getColour(String eyesColour){
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
	}
	
	// Determines DNA code from given eye size -- to be randomized 
	void getSize(String eyesSize){
		size = eyesSize;
		if (size == "small"){
			currentEyeSizeDNA = SMALL_EYES_DNA;
		}
		else if (size == "medium"){
			currentEyeSizeDNA = MEDIUM_EYES_DNA;
		} 
		else if (size == "large"){
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
			System.out.println("BROWN");
		}
		else if (MEDIUM_EYES_DNA.contains(eyeSizeDNA)){
			System.out.println("BLUE");
		}
		else if (LARGE_EYES_DNA.contains(eyeSizeDNA)){
			System.out.println("GREEN");
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