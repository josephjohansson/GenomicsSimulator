package gui;

import javax.imageio.ImageIO;
import javax.swing.*;

import babyCreation.BabyRandomizer;
import people.*;
import traitsClasses.Traits;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
	
/**basic GUI layout, no ActonListeners implemented
 *  buttons and dropdowns created, but not integrated with rest of program (they just look pretty)
 * @author Jessica
 */
@SuppressWarnings({"rawtypes","serial"})
public class GeoSimGui extends JFrame implements ActionListener{
	public Mother mom = new Mother();
	public Father dad = new Father();
	private BufferedImage dadBody;
	private BufferedImage dadHair;
	private BufferedImage dadEyes;
	private BufferedImage momHair;
	private BufferedImage momEyes;
	private BufferedImage momBody;
	
    JLabel fatherBodyImage = new JLabel ();
    JLabel fatherEyesImage = new JLabel ();
    JLabel fatherHairImage = new JLabel ();
    JLabel motherBodyImage = new JLabel ();
    JLabel motherHairImage = new JLabel ();
    JLabel motherEyesImage = new JLabel ();
    
	
	Traits[] allTraits;
	
	JButton babyMake;
	
	int WINDOW_WIDTH = 800;
	int WINDOW_HEIGHT = 500;
	
	// Makes the comboBoxes for the father
	public static JComboBox eyeColourF;
	public static JComboBox eyeSizeF;
	public static JComboBox heightF;
	public static JComboBox bodyTypeF;
	public static JComboBox skinColourF;
	public static JComboBox noseSizeF;
	public static JComboBox earLobeF;
	public static JComboBox hairColourF;
	public static JComboBox hairAmountF;
	public static JComboBox outlookF;
	public static JComboBox intelligenceF;

	// Makes the comboBoxes for the mother
	public static JComboBox eyeColourM;
	public static JComboBox eyeSizeM;
	public static JComboBox heightM;
	public static JComboBox bodyTypeM;
	public static JComboBox skinColourM;
	public static JComboBox noseSizeM;
	public static JComboBox earLobeM;
	public static JComboBox hairColourM;
	public static JComboBox hairAmountM;
	public static JComboBox outlookM;
	public static JComboBox intelligenceM;
	
	private Container container;
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	 
	
	@SuppressWarnings({ "unchecked" })
	public GeoSimGui(Person defaultPerson){

		
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
		
	// Adds action listeners to the comboBoxes for the father
		eyeColourF.addActionListener(this);
		eyeSizeF.addActionListener(this);
		heightF.addActionListener(this);
		bodyTypeF.addActionListener(this);
		skinColourF.addActionListener(this);
		noseSizeF.addActionListener(this);
		earLobeF.addActionListener(this);
		hairColourF.addActionListener(this);
		hairAmountF.addActionListener(this);
		outlookF.addActionListener(this);
		intelligenceF.addActionListener(this);
		
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

	// Adds action listeners to the comboBoxes for the mother
		eyeColourM.addActionListener(this);
		eyeSizeM.addActionListener(this);
		heightM.addActionListener(this);
		bodyTypeM.addActionListener(this);
		skinColourM.addActionListener(this);
		noseSizeM.addActionListener(this);
		earLobeM.addActionListener(this);
		hairColourM.addActionListener(this);
		hairAmountM.addActionListener(this);
		outlookM.addActionListener(this);
		intelligenceM.addActionListener(this);	
		
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
	//West 
	    JLabel fatherLabel = new JLabel("Father");
	    JButton randomDad = new JButton("Randomize");
	    JButton genDad = new JButton("Generate DNA");

	    
	    addComponent(fatherLabel, 0,1,1,1);  
	    addComponent(fatherEyesImage, 0,2,1,1);
	    addComponent(fatherHairImage, 0,2,1,1);
	    addComponent(randomDad, 0,4,1,1);
	    addComponent(fatherBodyImage, 0,2,1,1);
	    addComponent(genDad, 0,5,1,1);
	    
	//East 
	    JLabel motherLabel = new JLabel("Mother");

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
	    
		/**try{
			dadBody = ImageIO.read(new File("GenomicsImages/MaleAverageFairBody.gif"));
			dadEyes = ImageIO.read(new File("GenomicsImages/MaleAverageBlueEyes.gif"));
			dadHair = ImageIO.read(new File("GenomicsImages/MaleAverageBrownHair.gif"));
			momHair = ImageIO.read(new File("GenomicsImages/FemaleAverageBlondeHair.gif"));
			momBody = ImageIO.read(new File("GenomicsImages/FemaleAverageFairBody.gif"));
			momEyes = ImageIO.read(new File("GenomicsImages/FemaleAverageBlueEyes.gif"));
		}
		catch (IOException ex){
			System.out.println("file not found. Constructor");
		}
	    */
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
	// If any of the comboBoxes are clicked, update the String[] of traits
	// for both mother and father
		if ((e.getSource() == eyeColourF) || (e.getSource() == eyeSizeF) ||
				(e.getSource() == heightF) || (e.getSource() == bodyTypeF) ||
				(e.getSource() == skinColourF) || (e.getSource() == noseSizeF) ||
				(e.getSource() == earLobeF) || (e.getSource() == hairColourF) ||
				(e.getSource() == hairAmountF) || (e.getSource() == outlookF) ||
				(e.getSource() == intelligenceF) || (e.getSource() == eyeColourM) || 
				(e.getSource() == eyeSizeM) || (e.getSource() == heightM) ||
				(e.getSource() == bodyTypeM) || (e.getSource() == skinColourM) ||
				(e.getSource() == noseSizeM) || (e.getSource() == earLobeM) ||
				(e.getSource() == hairColourM) || (e.getSource() == hairAmountM) ||
				(e.getSource() == outlookM) || (e.getSource() == intelligenceM)) {
		// Updating traits array	
			dad.createStringTraitsArray();
			mom.createStringTraitsArray();
			updateLabels(dad.fatherTraits, mom.motherTraits);
				
				
			
			
			
			
			
		// THIS IS WHERE THE PANEL WITH THE IMAGES OF THE MOTHER AND FATHER SHOULD BE UPDATED	
		
		// Debugging s
			//System.out.println(ImageFinder.findBodyImageName(Person.FATHER.createStringTraitsArrayF()));
			//System.out.println(ImageFinder.findBodyImageName(Person.MOTHER.createStringTraitsArrayM()));
		}
	
	// If user chose to make baby, send traits to baby randomizer and display results	
		else if (e.getSource() == babyMake) {
		// Initializes the baby randomizer
			BabyRandomizer.makeBabyTraitStringArray(dad, mom);
		// Gets the set of traits in string form from the person class	
			String[] babyTraits = Baby.getBabyTraits();
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
	public void updateLabels(String[] fatherTraits, String[] motherTraits){

		fatherBodyImage.setIcon(ImageFinder.getBodyIcon(fatherTraits));
		fatherHairImage.setIcon(ImageFinder.getHairIcon(fatherTraits));
		fatherEyesImage.setIcon(ImageFinder.getEyesIcon(fatherTraits));
		motherBodyImage.setIcon(ImageFinder.getBodyIcon(motherTraits));
		motherHairImage.setIcon(ImageFinder.getHairIcon(motherTraits));
		motherEyesImage.setIcon(ImageFinder.getEyesIcon(motherTraits));
		
	}
}

