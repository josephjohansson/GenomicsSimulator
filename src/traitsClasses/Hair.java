package traitsClasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Hair{
	String currentGene;
	public String currentHairColour;
	public String currentHairAmmount;
	int currentDNALength;
	int geneNumber;
	public int hairColourChance;
	public int hairAmountChance;
	List<String> currentHairColourDNA = new ArrayList<String>();
	List<String> currentAmountOfHairDNA = new ArrayList<String>();
	final List<String> BLACK_HAIR_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
	final List<String> BROWN_HAIR_DNA = Arrays.asList("CA","CT","CC","GA","GC");
	final List<String> BLONDE_HAIR_DNA = Arrays.asList("GG","GT","TT");
	final List<String> RED_HAIR_DNA = Arrays.asList("CG");
	final List<String> HAIRY_HAIR_DNA = Arrays.asList("A");
	final List<String> AVERAGE_HAIR_DNA = Arrays.asList("T","C");
	final List<String> SMOOTH_HAIR_DNA = Arrays.asList("G");
//-----------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE OR GENE LIST
	//Determines DNA come from given hair colour
	public void getHairColour(String hairColour){
		if (hairColour.equals("brown")){
			currentHairColourDNA = BROWN_HAIR_DNA;
			currentHairColour = hairColour;
		}
		else if (hairColour.equals("black")){
			currentHairColourDNA = BLACK_HAIR_DNA;
			currentHairColour = hairColour;
		}
		else if (hairColour.equals("blonde")){
			currentHairColourDNA = BLONDE_HAIR_DNA;
			currentHairColour = hairColour;
		}
		else if (hairColour.equals("red")){
			currentHairColourDNA = RED_HAIR_DNA;
			currentHairColour = hairColour;
		}
		hairColourChance = currentHairColourDNA.size();
	}
	
	// Determines DNA code from given eye size -- to be randomized 
	void getSize(String amountHair){
		if (amountHair.equals("smooth")){
			currentAmountOfHairDNA = SMOOTH_HAIR_DNA;
			currentHairAmmount = amountHair;
		}
		else if (amountHair.equals("average")){
			currentAmountOfHairDNA = AVERAGE_HAIR_DNA;
			currentHairAmmount = amountHair;
		} 
		else if (amountHair.equals("hairy")){
			currentAmountOfHairDNA = HAIRY_HAIR_DNA;
			currentHairAmmount = amountHair;
		}
		hairAmountChance = currentHairColourDNA.size();
	}

	
	
	
	
//-----------------------------------------------------------------------------------------------------
//DNA INPUT PHENOTYPE OUTPUT
	// Determines hair colour phenotype from given hair colour gene	
	void printOutHairColour(String hairColourDNA){
		if (BROWN_HAIR_DNA.contains(hairColourDNA)){
			System.out.println("BROWN");
		}
		else if (BLACK_HAIR_DNA.contains(hairColourDNA)){
			System.out.println("BLACK");
		}
		else if (BLONDE_HAIR_DNA.contains(hairColourDNA)){
			System.out.println("BLONDE");
		}
		else if (RED_HAIR_DNA.contains(hairColourDNA)){
			System.out.println("RED");
		}
	}
	//Determines hair amount phenotype from given hair amount gene
	void printOutEyeSize(String amountHairDNA){
		if (SMOOTH_HAIR_DNA.contains(amountHairDNA)){
			System.out.println("SMOOTH");
		}
		else if (AVERAGE_HAIR_DNA.contains(amountHairDNA)){
			System.out.println("AVERAGE");
		}
		else if (HAIRY_HAIR_DNA.contains(amountHairDNA)){
			System.out.println("HAIRY");
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
