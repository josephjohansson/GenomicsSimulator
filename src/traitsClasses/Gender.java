package traitsClasses;
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Gender {
	String currentGene;
	int currentDNALength;
	int geneNumber;
	List<String> currentGenderDNA = new ArrayList<String>();
	List<String> MALE_DNA= Arrays.asList("AA", "AG", "AC", "AG", "GA", "GC", "GT");
	List<String> FEMALE_DNA = Arrays.asList("CA", "CT", "CG", "TT", "TC", "TG", "TA");
	List<String> HERMAPHRODITE_DNA = Arrays.asList("GG","CC");



	
	
//----------------------------------------------------------------------------------------------------
//PHENOTYPE INPUT GETS POSSIBLE GENE LIST
	// Determines DNA code from given gender	
	public void getEyeColour(String gender){
		if (gender.equals("male")){
			currentGenderDNA = MALE_DNA;
		}
		else if (gender.equals("female")){
			currentGenderDNA = FEMALE_DNA;
		}
		else if (gender.equals("hermaphrodite")){
			currentGenderDNA = HERMAPHRODITE_DNA;
		}
	}
	
//-----------------------------------------------------------------------------------------------------
//DNA INPUT PHENOTYPE OUTPUT
	// Determines eye colour phenotype from given eye colour DNA gene	
	void printOutGender(String genderDNA){
		if (MALE_DNA.contains(genderDNA)){
			System.out.println("male");
		}
		else if (FEMALE_DNA.contains(genderDNA)){
			System.out.println("female");
		}
		else if (HERMAPHRODITE_DNA.contains(genderDNA)){
			System.out.println("hermaphrodite");
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
