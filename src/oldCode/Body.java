package oldCode;
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Body {
	String currentGene;
	public String currentHeight;
	public String currentBodyType;
	public String currentSkinColour;
	int currentDNALength;
	int geneNumber;
	public int heightChance;
	public int bodyTypeChance;
	public int skinColourChance;
	List<String> currentHeightDNA = new ArrayList<String>();
	List<String> currentBodyTypeDNA = new ArrayList<String>();
	List<String> currentSkinColourDNA = new ArrayList<String>();
	final List<String> TALL_HEIGHT_DNA = Arrays.asList("CA","CT","CC","GA");
	final List<String> AVERAGE_HEIGHT_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC");
	final List<String> SHORT_HEIGHT_DNA = Arrays.asList("GG","GT","TT","TG");
	final List<String> DWARF_HEIGHT_DNA = Arrays.asList("GC");
	final List<String> GIANT_HEIGHT_DNA = Arrays.asList("CG");
	final List<String> SLIM_BODY_DNA = Arrays.asList("CA","CT","CC","GA");
	final List<String> AVERAGE_BODY_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC");
	final List<String> LARGE_BODY_DNA = Arrays.asList("GG","GT","TT","TG");
	final List<String> OBESE_BODY_DNA = Arrays.asList("GC");
	final List<String> ANOREXIC_BODY_DNA = Arrays.asList("CG");
	final List<String> FAIR_SKIN_DNA = Arrays.asList("CT","CC","GA");
	final List<String> DARK_SKIN_DNA = Arrays.asList("AA","AT","AC","AG","TA");
	final List<String> YELLOW_SKIN_DNA = Arrays.asList("GG","GT","TT");
	final List<String> BROWN_SKIN_DNA = Arrays.asList("GC","CA","TC","TG");
	final List<String> ALBINO_SKIN_DNA = Arrays.asList("CG");
	
//----------------------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE LIST
	// Determines DNA code from given height	
	public void getHeight(String height){
		if (height.equals("Tall")){
			currentHeightDNA = TALL_HEIGHT_DNA;
		}
		else if (height.equals("Average")){
			currentHeightDNA = AVERAGE_HEIGHT_DNA;
		}
		else if (height.equals("Short")){
			currentHeightDNA = SHORT_HEIGHT_DNA;
		}
		else if (height.equals("Dwarf")){
			currentHeightDNA = DWARF_HEIGHT_DNA;
		}
		else if (height.equals("Giant")){
			currentHeightDNA = GIANT_HEIGHT_DNA;
		}
		heightChance = currentHeightDNA.size();
		currentHeight = height; 
	}
	
	// Determines DNA code from given body type 
	void getBodyType(String bodyType){
		if (bodyType.equals("Slim")){
			currentBodyTypeDNA = SLIM_BODY_DNA;
		}
		else if (bodyType.equals("Average")){
			currentBodyTypeDNA = AVERAGE_BODY_DNA;
		} 
		else if (bodyType.equals("Large")){
			currentBodyTypeDNA = LARGE_BODY_DNA;
		}
		else if (bodyType.equals("Obese")){
			currentBodyTypeDNA = OBESE_BODY_DNA;
		}
		else if (bodyType.equals("Anorexic")){
			currentBodyTypeDNA = ANOREXIC_BODY_DNA;
		}
		bodyTypeChance = currentBodyTypeDNA.size();
		currentBodyType = bodyType;
	}

	// Determines DNA code from given skin colour	
	public void getSkinColour(String skinColour){
		if (skinColour.equals("Fair")){
			currentSkinColourDNA = FAIR_SKIN_DNA;
		}
		else if (skinColour.equals("Dark")){
			currentSkinColourDNA = DARK_SKIN_DNA;
		}
		else if (skinColour.equals("Yellow")){
			currentSkinColourDNA = YELLOW_SKIN_DNA;
		}
		else if (skinColour.equals("Brown")){
			currentSkinColourDNA = BROWN_SKIN_DNA;
		}
		else if (skinColour.equals("Albino")){
			currentSkinColourDNA = ALBINO_SKIN_DNA;
		}
		skinColourChance = currentSkinColourDNA.size();
		currentSkinColour = skinColour;
	}	
	
//-----------------------------------------------------------------------------------------------------
//DNA INPUT PHENOTYPE OUTPUT
	// Determines height phenotype from given height DNA gene	
	void printOutHeight(String heightDNA){
		if (TALL_HEIGHT_DNA.contains(heightDNA)){
			System.out.println("TALL");
		}
		else if (AVERAGE_HEIGHT_DNA.contains(heightDNA)){
			System.out.println("AVERAGE");
		}
		else if (SHORT_HEIGHT_DNA.contains(heightDNA)){
			System.out.println("SHORT");
		}
		else if (DWARF_HEIGHT_DNA.contains(heightDNA)){
			System.out.println("DWARF");
		}
		else if (GIANT_HEIGHT_DNA.contains(heightDNA)){
			System.out.println("GIANT");
		}
	}
	// Determines body type from given body type DNA gene
	void printOutBodyType(String bodyTypeDNA){
		if (SLIM_BODY_DNA.contains(bodyTypeDNA)){
			System.out.println("SLIM");
		}
		else if (AVERAGE_BODY_DNA.contains(bodyTypeDNA)){
			System.out.println("AVERAGE");
		}
		else if (LARGE_BODY_DNA.contains(bodyTypeDNA)){
			System.out.println("LARGE");
		}
		else if (OBESE_BODY_DNA.contains(bodyTypeDNA)){
			System.out.println("OBESE");
		}
		else if (ANOREXIC_BODY_DNA.contains(bodyTypeDNA)){
			System.out.println("ANOREXIC");
		}
	}
	// Determines skin colour from given skin colour DNA gene
	void printOutSkinColour(String skinColourDNA){
		if (FAIR_SKIN_DNA.contains(skinColourDNA)){
			System.out.println("FAIR");
		}
		else if (DARK_SKIN_DNA.contains(skinColourDNA)){
			System.out.println("DARK");
		}
		else if (YELLOW_SKIN_DNA.contains(skinColourDNA)){
			System.out.println("YELLOW");
		}
		else if (BROWN_SKIN_DNA.contains(skinColourDNA)){
			System.out.println("BROWN");
		}
		else if (ALBINO_SKIN_DNA.contains(skinColourDNA)){
			System.out.println("ALBINO");
		}
	}
	
	
	
//-------------------------------------------------------------------------------------------------------
//RANDOMISER
	//Gets a DNA list and chooses a random gene
	String getRandomGene(List<String> DNAInputList){
		currentDNALength = DNAInputList.size();
		geneNumber = new Random().nextInt(currentDNALength);
		return(DNAInputList.get(geneNumber));
	}
}