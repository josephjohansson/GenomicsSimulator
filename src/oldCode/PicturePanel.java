package oldCode;
import gui.ImageFinder;

import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;
		
public class PicturePanel extends JPanel{
	BufferedImage body;
	BufferedImage hair;
	BufferedImage eyes;
	public PicturePanel(String[] traits){
		body = getImage(ImageFinder.findBodyImageName(traits));
		hair = getImage(ImageFinder.findHairImageName(traits));
		eyes = getImage(ImageFinder.findEyesImageName(traits));
		//set panel to the size of the image
		this.setPreferredSize(new Dimension(body.getWidth(), body.getHeight()));
	}			
	public void paintComponent(Graphics g){		
		//Draw the images on the panel
		g.drawImage(body, 0, 0, null);
		g.drawImage(hair, 0, 0, null);
		g.drawImage(eyes, 0, 0, null);
	}			
	private BufferedImage getImage(String filename){	
		//Using input stream to load the image
		try{		
			// Grab the InputStream for the image.
			InputStream in = getClass().getResourceAsStream(filename);	
			//then read it into the input.
			return ImageIO.read(in);
		}
		catch (IOException e){
			System.out.println("the Image was not loaded");
			System.exit(1);	
		}
		return null;
		
	}	
}
		

			


