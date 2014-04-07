package people;


public class Baby extends Person {
	
/** @param babyTraits = baby's array of traits in string form */
	private static String[] babyTraits = new String[13];

/** Default constructor that sets name for baby (this is needed for the text file)	
 */
	public Baby() {
		name = "Baby";
	}
	
/** Sets baby traits (used by baby randomizer)
 *  @param babyTraitsInput array of baby's traits in string form as selected by the 
 *  baby randomizer
 */
	public static void setBabyTraits(String[] babyTraitsInput){
		babyTraits = babyTraitsInput;
	}
	
/** @return Baby traits in string form to display (used by gui)
 */
	public static String[] getBabyTraits() {
		return babyTraits;
	}

}
