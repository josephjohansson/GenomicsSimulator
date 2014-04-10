package gui;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.StringBuilder;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



public class ImageFinder {

//The string list of traits should be passed in to the methods
	public static String findBodyImageName(String[] traits){
		

		StringBuilder imageBody = new StringBuilder();
		imageBody.append("GenomicsImages/");
		imageBody.append(traits[1]);
		imageBody.append(traits[4]);
		imageBody.append(traits[5]);
		imageBody.append("Body");
		imageBody.append(".gif");
		
		return imageBody.toString();
	}

	public static String findHairImageName(String[] traits){
		StringBuilder imageHair = new StringBuilder();
		imageHair.append("GenomicsImages/");
		imageHair.append(traits[1]);
		imageHair.append(traits[4]);
		imageHair.append(traits[8]);
		imageHair.append("Hair");
		imageHair.append(".gif");
		
		return imageHair.toString();
	}

	public static String findEyesImageName(String[] traits){
		StringBuilder imageEyes = new StringBuilder();
		imageEyes.append("GenomicsImages/");
		imageEyes.append(traits[1]);
		imageEyes.append(traits[4]);
		imageEyes.append(traits[2]);
		imageEyes.append("Eyes");
		imageEyes.append(".gif");

		return imageEyes.toString();

	}
	public static String findBabySkinColourName(String[] traits){
		StringBuilder skinColour = new StringBuilder();
		skinColour.append("GenomicsImages/");
		skinColour.append(traits[0]);
		skinColour.append(traits[5]);
		skinColour.append("Skin");
		skinColour.append(".gif");
		
		return skinColour.toString();
	}
	public static String findBabyHairColourName (String[] traits){
		StringBuilder hairColour = new StringBuilder();
		hairColour.append("GenomicsImages/");
		hairColour.append(traits[0]);
		hairColour.append(traits[8]);
		hairColour.append("Hair");
		hairColour.append(".gif");
		
		return hairColour.toString();
	}
	public static ImageIcon getBodyIcon(String[] traits){
		BufferedImage bodyImage = null;
		String bodyURL = ImageFinder.findBodyImageName(traits);
		try{
			bodyImage = ImageIO.read(new File(bodyURL));
		}
		catch (IOException ex){
			System.out.println("file not found. getBodyIcon"+bodyURL);
		}
		
		ImageIcon bodyIcon = new ImageIcon(bodyImage);
		
		return bodyIcon;
	}
	public static ImageIcon getHairIcon(String[] traits){
		BufferedImage hairImage = null;
		String hairURL = ImageFinder.findHairImageName(traits);
		try{
			hairImage = ImageIO.read(new File(hairURL));
		}
		catch (IOException ex){
			System.out.println("file not found. getHairIcon"+hairURL);
		}
		
		ImageIcon hairIcon = new ImageIcon(hairImage);
		
		return hairIcon;
	}
	public static ImageIcon getEyesIcon(String[] traits){
		BufferedImage eyesImage = null;
		String eyesURL = ImageFinder.findEyesImageName(traits);
		try{
			eyesImage = ImageIO.read(new File(eyesURL));
		}
		catch (IOException ex){
			System.out.println("file not found. getEyesIcon"+eyesURL);
		}
		
		ImageIcon eyesIcon = new ImageIcon(eyesImage);
		
		return eyesIcon;
	}
	public static ImageIcon getBabyBody(String[] traits){
		BufferedImage bodyImage = null;
		String bodyURL = ImageFinder.findBabySkinColourName(traits);
		try{
			bodyImage = ImageIO.read(new File(bodyURL));
		}
		catch (IOException ex){
			System.out.println("file not found. getEyesIcon"+bodyURL);
		}
		
		ImageIcon bodyIcon = new ImageIcon(bodyImage);
		
		return bodyIcon;
	}
	public static ImageIcon getBabyHairIcon(String[] traits){
		BufferedImage hairImage = null;
		String hairURL = ImageFinder.findBabyHairColourName(traits);
		try{
			hairImage = ImageIO.read(new File(hairURL));
		}
		catch (IOException ex){
			System.out.println("file not found. getHairIcon"+hairURL);
		}
		
		ImageIcon hairIcon = new ImageIcon(hairImage);
		
		return hairIcon;
	}
}