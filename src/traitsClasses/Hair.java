package traitsClasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Hair{
	String currentGene;
	int currentDNALength;
	int geneNumber;
	int hairColourChance;
	int hairAmountChance;
	List<String> currentHairColourDNA = new ArrayList<String>();
	List<String> currentAmountOfHairDNA = new ArrayList<String>();
	final List<String> BLACK_HAIR_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
	final int BLACK_HAIR_CHANCE = 8;
	final List<String> BROWN_HAIR_DNA = Arrays.asList("CA","CT","CC","GA","GC");
	final int BROWN_HAIR_CHANCE = 8;
	final List<String> BLONDE_HAIR_DNA = Arrays.asList("GG","GT","TT");
	final int BLONDE_HAIR_CHANCE= 5;
	final List<String> RED_HAIR_DNA = Arrays.asList("CG");
	final int RED_HAIR_CHANCE = 3;
	final List<String> HAIRY_HAIR_DNA = Arrays.asList("A");
	final int HAIRY_HAIR_CHANCE= 5;
	final List<String> AVERAGE_HAIR_DNA = Arrays.asList("T","C");
	final int AVERAGE_HAIR_CHANCE = 7;
	final List<String> SMOOTH_HAIR_DNA = Arrays.asList("G");
	final int SMOOTH_HAIR_CHANCE= 5;
//-----------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE OR GENE LIST
	//Determines DNA come from given hair colour
	public void getHairColour(String hairColour){
		if (hairColour.equals("brown")){
			currentHairColourDNA = BROWN_HAIR_DNA;
			hairColourChance = BROWN_HAIR_CHANCE;
		}
		else if (hairColour.equals("black")){
			currentHairColourDNA = BLACK_HAIR_DNA;
			hairColourChance= BLACK_HAIR_CHANCE;
		}
		else if (hairColour.equals("blonde")){
			currentHairColourDNA = BLONDE_HAIR_DNA;
			hairColourChance= BLONDE_HAIR_CHANCE;
		}
		else if (hairColour.equals("red")){
			currentHairColourDNA = RED_HAIR_DNA;
			hairColourChance= RED_HAIR_CHANCE;
		}
	}
	
	// Determines DNA code from given eye size -- to be randomized 
	void getSize(String ammountHair){
		if (ammountHair.equals("smooth")){
			currentAmmountOfHairDNA = SMOOTH_HAIR_DNA;
			hairAmountChance = SMOOTH_HAIR_CHANCE;
		}
		else if (ammountHair.equals("average")){
			currentAmmountOfHairDNA = AVERAGE_HAIR_DNA;
			hairAmountChance = AVERAGE_HAIR_CHANCE;
		} 
		else if (ammountHair.equals("hairy")){
			currentAmmountOfHairDNA = HAIRY_HAIR_DNA;
			hairAmountChance = HAIRY_HAIR_CHANCE;
		}		
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
	//Determines hair ammount phenotype from given hair ammout gene
	void printOutEyeSize(String ammountHairDNA){
		if (SMOOTH_HAIR_DNA.contains(ammountHairDNA)){
			System.out.println("SMOOTH");
		}
		else if (AVERAGE_HAIR_DNA.contains(ammountHairDNA)){
			System.out.println("AVERAGE");
		}
		else if (HAIRY_HAIR_DNA.contains(ammountHairDNA)){
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
