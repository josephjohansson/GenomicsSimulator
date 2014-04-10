package people;


public class Baby extends Person {
	
// Initialization of baby's array of traits in string form	
	private static String[] babyTraits = new String[13];

// Sets name for mother (this is needed for the text file)
	public Baby() {
		name = "Baby";
	}
	
// Sets baby traits (used by baby randomizer)
	public static void setBabyTraits(String[] babyTraitsInput){
		babyTraits = babyTraitsInput;
	}
	
// Returns baby traits to display (used by gui)
	public static String[] getBabyTraits() {
		return babyTraits;
	}

}
