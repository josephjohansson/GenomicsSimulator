package gui;

import javax.imageio.ImageIO;
import javax.swing.*;

import traitsClasses.TraitsEnum;
import traitsClasses.Person;
import BabyCreation.BabyRandomizer;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
	
/**basic GUI layout, no ActonListeners implemented
 *  buttons and dropdowns created, but not integrated with rest of program (they just look pretty)
 * @author Jessica
 */
public class GeoSimGui extends JFrame implements ActionListener{
	
	private BufferedImage dadBody;
	private BufferedImage dadHair;
	private BufferedImage dadEyes;
	private BufferedImage momHair;
	private BufferedImage momEyes;
	private BufferedImage momBody;
	
	
	TraitsEnum[] allTraits;
	
	JButton babyMake;
	
	int WINDOW_WIDTH = 800;
	int WINDOW_HEIGHT = 500;
	
	// Makes the comboBoxes for the father
	JComboBox eyeColourF;
	JComboBox eyeSizeF;
	JComboBox heightF;
	JComboBox bodyTypeF;
	JComboBox skinColourF;
	JComboBox noseSizeF;
	JComboBox earLobeF;
	JComboBox hairColourF;
	JComboBox hairAmountF;
	JComboBox outlookF;
	JComboBox intelligenceF;

	// Makes the comboBoxes for the mother
	JComboBox eyeColourM;
	JComboBox eyeSizeM;
	JComboBox heightM;
	JComboBox bodyTypeM;
	JComboBox skinColourM;
	JComboBox noseSizeM;
	JComboBox earLobeM;
	JComboBox hairColourM;
	JComboBox hairAmountM;
	JComboBox outlookM;
	JComboBox intelligenceM;
	
	// Makes an array that will be filled in by the traits chosen by the user
	String[] fatherTraits = new String[13];
	String[] motherTraits = new String[13];
	
	private Container container;
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	 
	
	public GeoSimGui(Person defaultPerson){
		try{
			dadBody = ImageIO.read(new File("GenomicsImages/MaleAverageFairBody.gif"));
			dadEyes = ImageIO.read(new File("GenomicsImages/MaleAverageBlueEyes.gif"));
			dadHair = ImageIO.read(new File("GenomicsImages/MaleAverageBrownHair.gif"));
			momHair = ImageIO.read(new File("GenomicsImages/FemaleAverageBlondeHair.gif"));
			momBody = ImageIO.read(new File("GenomicsImages/FemaleAverageFairBody.gif"));
			momEyes = ImageIO.read(new File("GenomicsImages/FemaleAverageBlueEyes.gif"));
		}
		catch (IOException ex){
			System.out.println("file not found");
		}
			
		allTraits = defaultPerson.getAllTraits();

	// Option arrays made for comboBoxes
		String[] eyeColourOptions = allTraits[2].getTraitSet().toArray(new String[allTraits[2].getTraitSet().size()]);
		String[] eyeSizeOptions = allTraits[3].getTraitSet().toArray(new String[allTraits[3].getTraitSet().size()]);
		String[] heightOptions = allTraits[4].getTraitSet().toArray(new String[allTraits[4].getTraitSet().size()]);
		String[] bodyTypeOptions = allTraits[5].getTraitSet().toArray(new String[allTraits[5].getTraitSet().size()]);
		String[] skinColourOptions = allTraits[6].getTraitSet().toArray(new String[allTraits[6].getTraitSet().size()]);
		String[] noseSizeOptions = allTraits[7].getTraitSet().toArray(new String[allTraits[7].getTraitSet().size()]);
		String[] earLobeOptions = allTraits[8].getTraitSet().toArray(new String[allTraits[8].getTraitSet().size()]);
		String[] hairColourOptions = allTraits[9].getTraitSet().toArray(new String[allTraits[9].getTraitSet().size()]);
		String[] hairAmountOptions = allTraits[10].getTraitSet().toArray(new String[allTraits[10].getTraitSet().size()]);
		String[] outlookOptions = allTraits[11].getTraitSet().toArray(new String[allTraits[11].getTraitSet().size()]);
		String[] intelligenceOptions = allTraits[12].getTraitSet().toArray(new String[allTraits[12].getTraitSet().size()]);
		
	// Fills in the comboBoxes for the father
		eyeColourF = new JComboBox(eyeColourOptions);
		eyeSizeF = new JComboBox(eyeSizeOptions);
		heightF = new JComboBox(heightOptions);
		bodyTypeF = new JComboBox(bodyTypeOptions);
		skinColourF = new JComboBox(skinColourOptions);
		noseSizeF = new JComboBox(noseSizeOptions);
		earLobeF = new JComboBox(earLobeOptions);
		hairColourF = new JComboBox(hairColourOptions);
		hairAmountF = new JComboBox(hairAmountOptions);
		outlookF = new JComboBox(outlookOptions);
		intelligenceF = new JComboBox(intelligenceOptions);
		
	// Fills in the comboBoxes for the mother
		eyeColourM = new JComboBox(eyeColourOptions);
		eyeSizeM = new JComboBox(eyeSizeOptions);
		heightM = new JComboBox(heightOptions);
		bodyTypeM = new JComboBox(bodyTypeOptions);
		skinColourM = new JComboBox(skinColourOptions);
		noseSizeM = new JComboBox(noseSizeOptions);
		earLobeM = new JComboBox(earLobeOptions);
		hairColourM = new JComboBox(hairColourOptions);
		hairAmountM = new JComboBox(hairAmountOptions);
		outlookM = new JComboBox(outlookOptions);
		intelligenceM = new JComboBox(intelligenceOptions);
		
/** @param container = general window 
 *  @param layout = basic layout used (GridBag)
 * 	@param constraints = parameters that give component's placement and size
 */
		container = getContentPane();
	    layout = new GridBagLayout();
	    container.setLayout(layout);
	    
	    constraints = new GridBagConstraints();
	    
/** North section holds title lable
 * other descriptors can be added if necessary later
 * calls addComponent and sends in constraints 
 	*(northlabel,0,0,3,1) = (component, gridx, gridy, gridwidth, gridheight)
 	*-----------refer to addComponent method for further description----------- 	    
 */
	    JLabel title = new JLabel("Genomic Simulator");
	    addComponent(title, 0,0,3,1);
	    
/** West and East sections hold actions for Father and Mother respectively
 * 	buttons added, but do nothing (yet!)
 *  images will be placed in (0,2,1,1) and (2,2,1,1) respectively
 */
	//West 
	    JLabel fatherLabel = new JLabel("Father");
	    JButton randomDad = new JButton("Randomize");
	    JButton genDad = new JButton("Generate DNA");
	    JLabel fatherBodyImage = new JLabel (new ImageIcon(dadBody));
	    JLabel fatherEyesImage = new JLabel (new ImageIcon(dadEyes));
	    JLabel fatherHairImage = new JLabel (new ImageIcon(dadHair));
	    
	    addComponent(fatherLabel, 0,1,1,1);  
	    addComponent(fatherEyesImage, 0,2,1,1);
	    addComponent(fatherHairImage, 0,2,1,1);
	    addComponent(randomDad, 0,4,1,1);
	    addComponent(fatherBodyImage, 0,2,1,1);
	    addComponent(genDad, 0,5,1,1);
	    
	//East 
	    JLabel motherLabel = new JLabel("Mother");
	    JLabel motherBodyImage = new JLabel(new ImageIcon(momBody));
	    JLabel motherEyesImage = new JLabel(new ImageIcon(momEyes));
	    JLabel motherHairImage = new JLabel(new ImageIcon(momHair));
	    JButton randomMom = new JButton("Randomize");        
	    JButton genMom = new JButton("Generate DNA");
	        
	    addComponent(motherLabel, 2,1,1,1);
	    addComponent(motherEyesImage, 2,2,1,1);
	    addComponent(motherHairImage, 2,2,1,1);
	    addComponent(motherBodyImage, 2,2,1,1);
	    addComponent(randomMom, 2,4,1,1);
	    addComponent(genMom, 2,5,1,1);
	    
/** Center section holds trait selection options
 * 	trait panel holds parent panels(traitMom and traitDad) for centralized selection
 * 	parent panels hold trait selection for their respective person 
 * ---labels start with descriptor, but will be on default trait when actually implemented---     
	GridLayout(1,2,40,5) = (number of row, number of column, horizontal spacing, vertical spacing  
*/
	    babyMake = new JButton("Make a baby");
	    babyMake.addActionListener(this);
	    
	    JPanel traits = new JPanel(new GridLayout(1,3,40,5));
	    
	    JPanel traitsDad = new JPanel(new GridLayout(13,1,5,2));
	    JLabel labelDad = new JLabel("Father's Traits:");
	    traitsDad.add(labelDad);
	    traitsDad.add(eyeColourF);
	    traitsDad.add(eyeSizeF);
	    traitsDad.add(heightF);
	    traitsDad.add(bodyTypeF);
	    traitsDad.add(skinColourF);
	    traitsDad.add(noseSizeF);
	    traitsDad.add(earLobeF);
	    traitsDad.add(hairColourF);
	    traitsDad.add(hairAmountF);
	    traitsDad.add(outlookF);
	    traitsDad.add(intelligenceF);
	    traits.add(traitsDad);
	        
	    
	    JPanel traitLabels = new JPanel (new GridLayout(13,1,5,2));
	    JLabel traitSelect = new JLabel("Trait Selection");
	    JLabel eyeColourLabel = new JLabel("-Eye Colour");
	    JLabel eyeSizeLabel = new JLabel("-Eye Size-");
	    JLabel heightLabel = new JLabel("-Height-");
	    JLabel bodyTypeLabel = new JLabel("-Body Type-");
	    JLabel skinColourLabel = new JLabel("-Skin Colour-");
	    JLabel noseSizeLabel = new JLabel("-Nose Size-");
	    JLabel earLobeLabel = new JLabel("-Ear Lobe-");
	    JLabel hairColourLabel = new JLabel("-Hair Colour-");
	    JLabel hairAmountLabel = new JLabel("-Hair Amount-");
	    JLabel outlookLabel = new JLabel("-Outlook-");
	    JLabel IQLabel = new JLabel("-Intellegence-");
	    traitLabels.add(traitSelect);
	    traitLabels.add(eyeColourLabel);
	    traitLabels.add(eyeSizeLabel);
	    traitLabels.add(heightLabel);
	    traitLabels.add(bodyTypeLabel);
	    traitLabels.add(skinColourLabel);
	    traitLabels.add(noseSizeLabel);
	    traitLabels.add(earLobeLabel);
	    traitLabels.add(hairColourLabel);
	    traitLabels.add(hairAmountLabel);
	    traitLabels.add(outlookLabel);
	    traitLabels.add(IQLabel);
	    traits.add(traitLabels);
	    
	    JPanel traitsMom = new JPanel(new GridLayout(13, 1, 5, 2));
	    JLabel labelMom = new JLabel("Mother's Traits:");
	    traitsMom.add(labelMom);
	    traitsMom.add(eyeColourM);
	    traitsMom.add(eyeSizeM);
	    traitsMom.add(heightM);
	    traitsMom.add(bodyTypeM);
	    traitsMom.add(skinColourM);
	    traitsMom.add(noseSizeM);
	    traitsMom.add(earLobeM);
	    traitsMom.add(hairColourM);
	    traitsMom.add(hairAmountM);
	    traitsMom.add(outlookM);
	    traitsMom.add(intelligenceM);
	    traits.add(traitsMom);
	    addComponent(traits, 1,2,1,1);
	    addComponent(babyMake, 1,4,1,1);

/** sets up default size of window
 * 	components aren't anchored or padded to adjust for resizing (yet!)
 * 	allows window to be visible, and close when exited        
 */
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    //pack();
	    setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
	    setVisible(true);
			
	    }    
	
/** method places the components appropriately in grid depending on constraints entered 
 * Grid created is implicitly made and sized depending on components entered (5x3)	
 * constraint are the parameters used to placed the object
 * @param thing component being placed in the grid; each have their own set of constraints
 * @param column (gridx)- column top left corner of component is placed in grid
 * @param row (gridy) - row top left corner of component is placed in grid
 * @param width (gridwidth) - how many columns the component expands
 * @param height (gridheight) - how many rows the component expands
 */
	private void addComponent(Component thing, int column, int row, int width, int height){
	      // set gridx and gridy 
	      constraints.gridx = column;
	      constraints.gridy = row;

	      // set gridwidth and gridheight
	      constraints.gridwidth = width;   
	      constraints.gridheight = height;

	      // places component depending on constraints
	      layout.setConstraints(thing, constraints);  
	      container.add(thing);      // add component 
    }
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == babyMake) {	
		
		/* 
		 * I think this code should be somewhere else so that the
		 * logic is separated from the gui, but I havn't figured
		 * that out yet so I'm just leaving it here for now 
		 * -Areesha
		*/   
			
		// Gets input from all comboBoxes and puts them into an array
		// of all the father's traits	
			fatherTraits[0] = "father";
			fatherTraits[1] = "Male";
			fatherTraits[2] = eyeColourF.getSelectedItem().toString();
			fatherTraits[3] = eyeSizeF.getSelectedItem().toString();
			fatherTraits[4] = heightF.getSelectedItem().toString();
			fatherTraits[5] = bodyTypeF.getSelectedItem().toString();
			fatherTraits[6] = skinColourF.getSelectedItem().toString();
			fatherTraits[7] = noseSizeF.getSelectedItem().toString();
			fatherTraits[8] = earLobeF.getSelectedItem().toString();
			fatherTraits[9] = hairColourF.getSelectedItem().toString();
			fatherTraits[10] = hairAmountF.getSelectedItem().toString();
			fatherTraits[11] = outlookF.getSelectedItem().toString();
			fatherTraits[12] = intelligenceF.getSelectedItem().toString();
		// Gets input from all comboBoxes and puts them into an array
		// of all the mother's traits	
			motherTraits[0] = "Mother";
			motherTraits[1] = "Female";
			motherTraits[2] = eyeColourM.getSelectedItem().toString();	
			motherTraits[3] = eyeSizeM.getSelectedItem().toString();
			motherTraits[4] = heightM.getSelectedItem().toString();
			motherTraits[5] = bodyTypeM.getSelectedItem().toString();
			motherTraits[6] = skinColourM.getSelectedItem().toString();
			motherTraits[7] = noseSizeM.getSelectedItem().toString();
			motherTraits[8] = earLobeM.getSelectedItem().toString();
			motherTraits[9] = hairColourM.getSelectedItem().toString();
			motherTraits[10] = hairAmountM.getSelectedItem().toString();
			motherTraits[11] = outlookM.getSelectedItem().toString();
			motherTraits[12] = intelligenceM.getSelectedItem().toString();			
		// Makes two new instances of person using the selected traits
			Person father = new Person(fatherTraits);
			Person mother = new Person(motherTraits);
			System.out.println(ImageFinder.findBodyImageName(fatherTraits));
			String[] babyTraits = new String[13];
			babyTraits[0] = "Baby";
			for (int index = 1; index < 13; index++) {
				String momTraitString = motherTraits[index];
				String dadTraitString = fatherTraits[index];
				TraitsEnum momTrait = mother.getAllTraits()[index];
				TraitsEnum dadTrait = father.getAllTraits()[index];
				String babyTrait = BabyRandomizer.generateChildsTrait(
						momTrait.determineCurrentDNA(momTraitString).size(),
						dadTrait.determineCurrentDNA(dadTraitString).size(),
						momTraitString,
						dadTraitString);
				babyTraits[index] = babyTrait;
			}
		// Makes a new person from the randomly selected traits	
			Person baby = new Person(babyTraits);	
		// Displays these traits in a pop up window	
			JOptionPane.showMessageDialog(null, 
				"baby's gender is: "+babyTraits[1]+
				"\nbaby's eye colour is: "+babyTraits[2]+
				"\nbaby's eye size is: "+babyTraits[3]+
				"\nbaby's height is: "+babyTraits[4]+
				"\nbaby's body type is: "+babyTraits[5]+
				"\nbaby's skin colour is: "+babyTraits[6]+
				"\nbaby's nose size is: "+babyTraits[7]+
				"\nbaby's ear lobe is: "+babyTraits[8]+
				"\nbaby's hair colour type is: "+babyTraits[9]+
				"\nbaby's hair amount is: "+babyTraits[10]+
				"\nbaby's outlook is: "+babyTraits[11]+
				"\nbaby's intelligence is: "+babyTraits[12]);
			}
		}
	//protected void updatePicture(String )
}
