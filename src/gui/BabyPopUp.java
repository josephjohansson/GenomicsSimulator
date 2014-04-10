package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.*;
import java.awt.event.*;

import Main.FileWriter;

/*
 * Popup window for the birthed babe
 * Pictures do not show up yet
 * generate DNA does not work either
 */
public class BabyPopUp extends JFrame{
	int WINDOW_WIDTH = 400;
	int WINDOW_HEIGHT = 300;
	JButton genBaby = new JButton("Generate DNA");
	JLabel BabyName = new JLabel("The baby has:");
	JLabel poop = new JLabel("poop");
	JLabel babyBodyPic;
	JLabel babyHairPic;
	JFrame test = new JFrame();
	JPanel pictures = new JPanel();
	JPanel stuff = new JPanel(new GridLayout(12,1,5,2));
	

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

		stuff.add(gender);
		stuff.add(eyeColour);
		stuff.add(eyeSize);
		stuff.add(height);
		stuff.add(skinColour);
		stuff.add(noseSize);
		stuff.add(earLobe);
		stuff.add(hairColour);
		stuff.add(hairAmount);
		stuff.add(outlook);
		stuff.add(intel);
		stuff.add(genBaby);
		
		test.add(BabyName,BorderLayout.NORTH);
		test.add(poop,BorderLayout.WEST);
		test.add(stuff,BorderLayout.EAST);

		
	    test.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    test.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	    test.setVisible(true);
	}	
	
}

