package gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import people.Baby;
import java.awt.event.*;
import Main.*;

/**
 * makes popup window for birthed babe
 * uses two celled gridbag layout for picture and lables (gridlayout)
 * also able to generate baby DNA from button
 * @author Jessica
 *
 */
public class BabyPopUp extends JFrame implements ActionListener {
	int WINDOW_WIDTH = 400;
	int WINDOW_HEIGHT = 350;

	JButton genBaby = new JButton("Generate DNA");
	JLabel babyName = new JLabel("The baby has:");
	JLabel babyBodyPic = new JLabel();
	JLabel babyHairPic = new JLabel();
	JPanel traitsDisplay = new JPanel(new GridLayout(13,1,0,0));
	Baby baby = new Baby();
	String[] traits;
	
	private Container popup;
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	
	public BabyPopUp(String[] traits) {
		
		popup = getContentPane();
	    layout = new GridBagLayout();
	    popup.setLayout(layout);
	    
	    constraints = new GridBagConstraints();

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

		traitsDisplay.add(babyName);
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
		
		addComponent(traitsDisplay,1,0);

		babyBodyPic.setIcon(ImageFinder.getBabyBody(traits));
		babyHairPic.setIcon(ImageFinder.getBabyHairIcon(traits));

		addComponent(babyHairPic, 0,0);
		addComponent(babyBodyPic, 0,0);
		
	    setDefaultCloseOperation(HIDE_ON_CLOSE);
	    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	    setVisible(true);
	}
	
	public void addComponent(Component thing, int column, int row){
	      // set gridx and gridy 
	      constraints.gridx = column;
	      constraints.gridy = row;

	      // places component depending on constraints
	      layout.setConstraints(thing, constraints);  
	      popup.add(thing);      // add component
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