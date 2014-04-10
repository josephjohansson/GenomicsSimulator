package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import people.Baby;

import java.awt.*;
import java.awt.event.*;

import Main.*;

/*
 *  window for the birthed babe
 * Pictures do not show up yet
 * generate DNA does not work either
 */
public class BabyPopUp extends JFrame implements ActionListener {
	int WINDOW_WIDTH = 400;
	int WINDOW_HEIGHT = 300;
	JButton genBaby = new JButton("Generate DNA");
	JLabel BabyName = new JLabel("The baby has:");
	JLabel poop = new JLabel("poop");
	JPanel babyImage = new JPanel();
	JLabel babyBodyPic = new JLabel();
	JLabel babyHairPic = new JLabel();
	JFrame popup = new JFrame();
	JPanel pictures = new JPanel();
	JPanel traitsDisplay = new JPanel(new GridLayout(12,1,5,2));
	Baby baby;
	

	public BabyPopUp(String[] traits) {
		JLabel gender = new JLabel("Gender: "+traits[1]);
		JLabel eyeColour = new JLabel("Eye Colour: "+ traits[2]);
		JLabel eyeSize = new JLabel("Eye Size: " + traits[3]);
		JLabel height = new JLabel("Height: "+ traits[4]);
		JLabel skinColour = new JLabel("SkinColour: "+ traits[5]);
		JLabel noseSize = new JLabel("Nose Size: "+ traits[6]);
		JLabel earLobe = new JLabel("Ear Lobes: "+traits[7]);
		JLabel hairColour = new JLabel("Hair Colour: "+traits[8]);
		JLabel hairAmount = new JLabel("HairAmount: "+traits[9]);
		JLabel outlook = new JLabel("Outlook: "+traits[10]);
		JLabel intel= new JLabel("Intellegence: "+traits[11]);

		traitsDisplay.add(gender);
		traitsDisplay.add(eyeColour);
		traitsDisplay.add(eyeSize);
		traitsDisplay.add(height);
		traitsDisplay.add(skinColour);
		traitsDisplay.add(noseSize);
		traitsDisplay.add(earLobe);
		traitsDisplay.add(hairColour);
		traitsDisplay.add(hairAmount);
		traitsDisplay.add(outlook);
		traitsDisplay.add(intel);
		traitsDisplay.add(genBaby);
		genBaby.addActionListener(this);
		
		popup.add(BabyName,BorderLayout.NORTH);
		
		popup.add(traitsDisplay,BorderLayout.EAST);
		popup.add(babyImage);
		babyBodyPic.setIcon(ImageFinder.getBabyBody(traits));
		babyHairPic.setIcon(ImageFinder.getBabyHairIcon(traits));
		
		babyImage.add(babyBodyPic,BorderLayout.WEST);
		babyImage.add(babyHairPic,BorderLayout.WEST);

		
	    popup.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    popup.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	    popup.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == genBaby) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}
			catch (Exception exeption) { // ignore exceptions and continue
			}
			FileWriter.writeFile(baby);
		}
	}
	
}

;