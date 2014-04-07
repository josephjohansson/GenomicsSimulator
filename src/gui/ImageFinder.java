package gui;
import java.lang.StringBuilder;



public class ImageFinder {

/** Method to find the body image that goes with the selected traits for this person.
 *  @param allTraitsAsStrings = the set of string traits for this person
 *  @return the name of the body image
 */
	public static String findBodyImageName(String[] allTraitsAsStrings){

		StringBuilder imageBody = new StringBuilder();
		imageBody.append("GenomicsImages/");
		imageBody.append(allTraitsAsStrings[1]);
		imageBody.append(allTraitsAsStrings[5]);
		imageBody.append(allTraitsAsStrings[6]);
		imageBody.append("Body");
		imageBody.append(".gif");
		
		return imageBody.toString();
	}

/** Method to find the hair image that goes with the selected traits for this person.
 *  @param allTraitsAsStrings = the set of string traits for this person
 *  @return the name of the hair image
 */
	public static String findHairImageName(String[] allTraitsAsStrings){
		
		StringBuilder imageHair = new StringBuilder();
		imageHair.append("GenomicsImages/");
		imageHair.append(allTraitsAsStrings[1]);
		imageHair.append(allTraitsAsStrings[5]);
		imageHair.append(allTraitsAsStrings[9]);
		imageHair.append("Hair");
		imageHair.append(".gif");
		
		return imageHair.toString();
	}

/** Method to find the eyes image that goes with the selected traits for this person.
 *  @param allTraitsAsStrings = the set of string traits for this person
 *  @return the name of the eyes image
 */	
	public static String findEyesImageName(String[] allTraitsAsStrings){
		StringBuilder imageEyes = new StringBuilder();
		imageEyes.append("GenomicsImages/");
		imageEyes.append(allTraitsAsStrings[1]);
		imageEyes.append(allTraitsAsStrings[5]);
		imageEyes.append(allTraitsAsStrings[2]);
		imageEyes.append("Eyes");
		imageEyes.append(".gif");

		return imageEyes.toString();
	}
}