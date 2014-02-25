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
	public int geneNumber;
	public int eyeColourChance;
	public int eyeSizeChance;
	List<String> currentEyeColourDNA = new ArrayList<String>();
	List<String> currentEyeSizeDNA = new ArrayList<String>();
	public final List<String> BROWN_EYES_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
	public final List<String> BLUE_EYES_DNA = Arrays.asList("CA","CT","CC");
	public final List<String> GREEN_EYES_DNA = Arrays.asList("GA","GC");
	public final List<String> HAZEL_EYES_DNA = Arrays.asList("GG","GT");
	public final List<String> GREY_EYES_DNA = Arrays.asList("TT");
	public final List<String> PURPLE_EYES_DNA = Arrays.asList("CG");
	public final List<String> SMALL_EYES_DNA = Arrays.asList("A");
	public final List<String> MEDIUM_EYES_DNA = Arrays.asList("T","C");
	public final List<String> LARGE_EYES_DNA = Arrays.asList("G");
//----------------------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE LIST
	// Determines DNA code from given eye colour	
	public void getEyeColour(String eyesColour){
		if (eyesColour.equals("Brown")){
			currentEyeColourDNA = BROWN_EYES_DNA;
		}
		else if (eyesColour.equals("Blue")){
			currentEyeColourDNA = BLUE_EYES_DNA;
		}
		else if (eyesColour.equals("Green")){
			currentEyeColourDNA = GREEN_EYES_DNA;
		}
		else if (eyesColour.equals("Hazel")){
			currentEyeColourDNA = HAZEL_EYES_DNA;
		}
		else if (eyesColour.equals("Grey")){
			currentEyeColourDNA = GREY_EYES_DNA;
		}
		else if (eyesColour.equals("Purple")){
			currentEyeColourDNA = PURPLE_EYES_DNA;
		}
		eyeColourChance = currentEyeColourDNA.size();
		currentEyeColour = eyesColour;
	}
	
	// Determines DNA code from given eye size 
	public void getEyeSize(String eyesSize){
		if (eyesSize.equals("Small")){
			currentEyeSizeDNA = SMALL_EYES_DNA;
		}
		else if (eyesSize.equals("Medium")){
			currentEyeSizeDNA = MEDIUM_EYES_DNA;
		} 
		else if (eyesSize.equals("Large")){
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
	public String getRandomGene(List<String> DNAInputList){
		currentDNALength = DNAInputList.size();
		geneNumber = new Random().nextInt(currentDNALength);
		return(DNAInputList.get(geneNumber));
	}
}