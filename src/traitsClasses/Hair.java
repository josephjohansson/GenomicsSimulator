package traitsClasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Hair{
	String hairColour;
	String hairAmmount;
	List<String> BLACK_HAIR_DNA = Arrays.asList("AA","AT","AC","AG","TA","TC","TG");
	List<String> BROWN_HAIR_DNA = Arrays.asList("CA","CT","CC","GA","GC");
	List<String> BLONDE_HAIR_DNA = Arrays.asList("GG","GT","TT");
	List<String> RED_HAIR_DNA = Arrays.asList("CG");
	List<String> HAIRY_HAIR_DNA = Arrays.asList("A");
	List<String> AVERAGE_HAIR_DNA = Arrays.asList("T","C");
	List<String> SMOOTH_HAIR_DNA = Arrays.asList("G");
	void getHairColour(String hairColourInput){
		hairColour = hairColourInput;
		System.out.println(hairColour);
	}
	void getAmmount(String hairAmmountInput){
		hairAmmount = hairAmmountInput;
		System.out.println(hairAmmount);
	}
	void getHairColourDNA(String hairDNA){
		if (BLACK_HAIR_DNA.contains(hairDNA)){
			System.out.println("BLACK");
			hairColour="BLACK";
		}
		else if (BROWN_HAIR_DNA.contains(hairDNA)){
			System.out.println("BROWN");
			hairColour="BROWN";
		}
		else if (BLONDE_HAIR_DNA.contains(hairDNA)){
			System.out.println("BLONDE");
			hairColour="BLONDE";
		}
		else if (RED_HAIR_DNA.contains(hairDNA)){
			System.out.println("RED");
			hairColour="RED";
		}
	}
	//void getHairAmmountDNA(String hair)
}