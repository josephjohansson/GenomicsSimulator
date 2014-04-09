package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BabyPopUp extends JPanel{
	int WINDOW_WIDTH = 400;
	int WINDOWS_HEIGHT = 300;
	JButton genBaby;
	JLabel BabyName = new JLabel("Baby:");
	JLabel poop = new JLabel("poop");
	JLabel babyBodyPic;
	JLabel babyHairPic;
	JFrame test;
	JPanel pictures;
	JPanel stuff;
	public BabyPopUp(String[] traits) {
		test.add(BabyName,BorderLayout.NORTH);
		test.add(poop,BorderLayout.CENTER);
		//traitBox.add(BabyName);
		System.out.println("POOOP");
	}	
}
