package oldCode;
import gui.ImageFinder;

import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;
		
public class PicturePanel extends JPanel {
	
	BufferedImage body;
	BufferedImage hair;
	BufferedImage eyes;
	
/** Constructor that gets all the images from the string returned by ImageFinder	
 * @param allTraitsAsStrings = the list of string traits for the person in question 
 */
	public PicturePanel(String[] allTraitsAsStrings) {
		body = getImage(ImageFinder.findBodyImageName(allTraitsAsStrings));
		hair = getImage(ImageFinder.findHairImageName(allTraitsAsStrings));
		eyes = getImage(ImageFinder.findEyesImageName(allTraitsAsStrings));
		//set panel to the size of the image
		this.setPreferredSize(new Dimension(body.getWidth(), body.getHeight()));
	}			
	
/** Draws the images on the panel 
 */
	public void paintComponent(Graphics g) {		
		g.drawImage(body, 0, 0, null);
		g.drawImage(hair, 0, 0, null);
		g.drawImage(eyes, 0, 0, null);
	}			
	
/** Searches for the image that corresponds to the given filename
 *  @param filename = the name of the image that is trying to be found
 *  @return the image corresponding to the filename given
 */
	private BufferedImage getImage(String filename) {	
		//Using input stream to load the image
		try {		
			// Grab the InputStream for the image.
			InputStream in = getClass().getResourceAsStream(filename);	
			//then read it into the input.
			return ImageIO.read(in);
		} catch (IOException e) {
			System.out.println("the Image was not loaded");
			System.exit(1);	
		}
		return null;	
	}	
}
		

			


