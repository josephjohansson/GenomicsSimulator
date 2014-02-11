package traitsClasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Hair{
	String currentGene;
	int currentDNALength;
	int geneNumber;
	List<String> currentHairColourDNA = new ArrayList<String>();
	List<String> currentAmmountOfHairDNA = new ArrayList<String>();
	List<String> BLACK_HAIR_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
	List<String> BROWN_HAIR_DNA = Arrays.asList("CA","CT","CC","GA","GC");
	List<String> BLONDE_HAIR_DNA = Arrays.asList("GG","GT","TT");
	List<String> RED_HAIR_DNA = Arrays.asList("CG");
	List<String> HAIRY_HAIR_DNA = Arrays.asList("A");
	List<String> AVERAGE_HAIR_DNA = Arrays.asList("T","C");
	List<String> SMOOTH_HAIR_DNA = Arrays.asList("G");
//-----------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE OR GENE LIST
	//Determines DNA come from given hair colour
	public void getHairColour(String hairColour){
		if (hairColour.equals("brown")){
			currentHairColourDNA = BROWN_HAIR_DNA;
		}
		else if (hairColour.equals("black")){
			currentHairColourDNA = BLACK_HAIR_DNA;
		}
		else if (hairColour.equals("blonde")){
			currentHairColourDNA = BLONDE_HAIR_DNA;
		}
		else if (hairColour.equals("red")){
			currentHairColourDNA = RED_HAIR_DNA;
		}
	}
	
	// Determines DNA code from given eye size -- to be randomized 
	void getSize(String ammountHair){
		if (ammountHair.equals("smooth")){
			currentAmmountOfHairDNA = SMOOTH_HAIR_DNA;
		}
		else if (ammountHair.equals("average")){
			currentAmmountOfHairDNA = AVERAGE_HAIR_DNA;
		} 
		else if (ammountHair.equals("hairy")){
			currentAmmountOfHairDNA = HAIRY_HAIR_DNA;
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
