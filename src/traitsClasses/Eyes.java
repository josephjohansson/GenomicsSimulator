package traitsClasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Eyes {
	String colour;
	String size;
	String currentGene;
	int currentDNALength;
	int geneNumber;
	List<String> currentDNA = new ArrayList<String>();
	List<String> BROWN_EYES_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
	List<String> BLUE_EYES_DNA = Arrays.asList("CA","CT","CC");
	List<String> GREEN_EYES_DNA = Arrays.asList("GA","GC");
	List<String> HAZEL_EYES_DNA = Arrays.asList("GG","GT");
	List<String> GREY_EYES_DNA = Arrays.asList("TT");
	List<String> PURPLE_EYES_DNA = Arrays.asList("CG");
	List<String> SMALL_EYES_DNA = Arrays.asList("A");
	List<String> MEDIUM_EYES_DNA = Arrays.asList("T","C");
	List<String> LARGE_EYES_DNA = Arrays.asList("G");
	
// Determines DNA code from given eye colour	
	void getColour(String eyesColour){
		colour = eyesColour;
		if (colour == "brown"){
			currentDNA = BROWN_EYES_DNA;
		}
		else if (colour == "blue"){
			currentDNA = BLUE_EYES_DNA;
		}
		else if (colour == "green"){
			currentDNA = GREEN_EYES_DNA;
		}
		else if (colour == "hazel"){
			currentDNA = HAZEL_EYES_DNA;
		}
		else if (colour == "grey"){
			currentDNA = GREY_EYES_DNA;
		}
		else if (colour == "purple"){
			currentDNA = PURPLE_EYES_DNA;
		}
		
		currentDNALength = currentDNA.size();
		geneNumber = new Random().nextInt(currentDNALength);
		currentGene = currentDNA.get(geneNumber);
		
		System.out.println(currentDNALength);
		System.out.println(geneNumber);
		System.out.println(currentGene);
		System.out.println(currentDNA);
		System.out.println(colour);
	
	}

// Determines DNA code from given eye size -- to be randomized 
	void getSize(String eyesSize){
		size = eyesSize;
		if (size == "small"){
			currentDNA = SMALL_EYES_DNA;
		}
		else if (size == "medium"){
			currentDNA = MEDIUM_EYES_DNA;
		} 
		else if (size == "large"){
			currentDNA = LARGE_EYES_DNA;
		}		
		System.out.println(size);
		System.out.println(currentDNA);
	}

// Determines eye colour from given DNA code	
	void getEyeColourDNA(String eyeDNA){
		if (BROWN_EYES_DNA.contains(eyeDNA)){
			System.out.println("BROWN");
		}
		else if (BLUE_EYES_DNA.contains(eyeDNA)){
			System.out.println("BLUE");
		}
		else if (GREEN_EYES_DNA.contains(eyeDNA)){
			System.out.println("GREEN");
		}
		else if (HAZEL_EYES_DNA.contains(eyeDNA)){
			System.out.println("HAZEL");
		}
		else if (GREY_EYES_DNA.contains(eyeDNA)){
			System.out.println("GREY");
		}
		else if (PURPLE_EYES_DNA.contains(eyeDNA)){
			System.out.println("PURPLE");
		}
	}
}