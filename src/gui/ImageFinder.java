package gui;
import java.lang.StringBuilder;



public class ImageFinder {

//The string list of traits should be passed in to the methods
	public static String findBodyImageName(String[] traits){
		

		StringBuilder imageBody = new StringBuilder();
		imageBody.append("GenomicsImages");
		imageBody.append(traits[1]);
		imageBody.append(traits[5]);
		imageBody.append(traits[6]);
		imageBody.append("Body");
		imageBody.append(".gif");
		
		return imageBody.toString();
	}

	public static String findHairImageName(String[] traits){
		StringBuilder imageHair = new StringBuilder();
		imageHair.append("GenomicsImages");
		imageHair.append(traits[1]);
		imageHair.append(traits[5]);
		imageHair.append(traits[6]);
		imageHair.append("Hair");
		imageHair.append(".gif");
		
		return imageHair.toString();
	}

	public static String findEyesImageName(String[] traits){
		StringBuilder imageEyes = new StringBuilder();
		imageEyes.append("GenomicsImages");
		imageEyes.append(traits[1]);
		imageEyes.append(traits[5]);
		imageEyes.append(traits[2]);
		imageEyes.append("Eyes");
		imageEyes.append(".gif");

		return imageEyes.toString();

	}
}