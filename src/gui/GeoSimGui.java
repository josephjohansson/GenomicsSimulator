package gui;

import javax.imageio.ImageIO;
import javax.swing.*;

import people.*;
import traitsClasses.Traits;
import babyCreation.BabyRandomizer;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
	
public class GeoSimGui extends JFrame implements ActionListener{
	public Mother mother = new Mother();
	public Father father = new Father();
	private BufferedImage fatherBody;
	private BufferedImage fatherHair;
	private BufferedImage fatherEyes;
	private BufferedImage motherHair;
	private BufferedImage motherEyes;
	private BufferedImage motherBody;
	
    JLabel fatherBodyImage = new JLabel ();
    JLabel fatherEyesImage = new JLabel ();
    JLabel fatherHairImage = new JLabel ();
    JLabel motherBodyImage = new JLabel ();
    JLabel motherHairImage = new JLabel ();
    JLabel motherEyesImage = new JLabel ();
    
	Traits[] allTraits;
	
	JButton babyMake;
	JButton randomFather;
	JButton randomMother;
	JButton genFather;
	JButton genMother;
	
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
	
	public GeoSimGui(){

	// Option arrays made for comboBoxes
		String[] eyeColourOptions = Traits.EYE_COLOUR.getTraitSet().toArray(new String[Traits.EYE_COLOUR.getTraitSet().size()]);
		String[] eyeSizeOptions = Traits.EYE_SIZE.getTraitSet().toArray(new String[Traits.EYE_SIZE.getTraitSet().size()]);
		String[] heightOptions = Traits.HEIGHT.getTraitSet().toArray(new String[Traits.HEIGHT.getTraitSet().size()]);
		String[] bodyTypeOptions = Traits.BODY_TYPE.getTraitSet().toArray(new String[Traits.BODY_TYPE.getTraitSet().size()]);
		String[] skinColourOptions = Traits.SKIN_COLOUR.getTraitSet().toArray(new String[Traits.SKIN_COLOUR.getTraitSet().size()]);
		String[] noseSizeOptions = Traits.NOSE_SIZE.getTraitSet().toArray(new String[Traits.NOSE_SIZE.getTraitSet().size()]);
		String[] earLobeOptions = Traits.EARLOBE.getTraitSet().toArray(new String[Traits.EARLOBE.getTraitSet().size()]);
		String[] hairColourOptions = Traits.HAIR_COLOUR.getTraitSet().toArray(new String[Traits.HAIR_COLOUR.getTraitSet().size()]);
		String[] hairAmountOptions = Traits.HAIR_AMOUNT.getTraitSet().toArray(new String[Traits.HAIR_AMOUNT.getTraitSet().size()]);
		String[] outlookOptions = Traits.OUTLOOK.getTraitSet().toArray(new String[Traits.OUTLOOK.getTraitSet().size()]);
		String[] intelligenceOptions = Traits.INTEL.getTraitSet().toArray(new String[Traits.INTEL.getTraitSet().size()]);
		
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
 */
	//West 
	    JLabel fatherLabel = new JLabel("Father");
	  
	    randomFather = new JButton("Randomize");
	    randomFather.addActionListener(this);
	    
	    genFather = new JButton("Generate DNA");
	    genFather.addActionListener(this);
	    
	    addComponent(fatherLabel, 0,1,1,1);  
	    addComponent(fatherEyesImage, 0,2,1,1);
	    addComponent(fatherHairImage, 0,2,1,1);
	    addComponent(randomFather, 0,4,1,1);
	    addComponent(fatherBodyImage, 0,2,1,1);
	    addComponent(genFather, 0,5,1,1);
	    
	//East 
	    JLabel motherLabel = new JLabel("Mother");

	    randomMother = new JButton("Randomize");        
	    randomMother.addActionListener(this);
	    
	    genMother = new JButton("Generate DNA");
	    genMother.addActionListener(this);
	    
	    addComponent(motherLabel, 2,1,1,1);
	    addComponent(motherEyesImage, 2,2,1,1);
	    addComponent(motherHairImage, 2,2,1,1);
	    addComponent(motherBodyImage, 2,2,1,1);
	    addComponent(randomMother, 2,4,1,1);
	    addComponent(genMother, 2,5,1,1);
	    
/** Center section holds trait selection options
 * 	trait panel holds parent panels(traitMom and traitDad) for centralized selection
 * 	parent panels hold trait selection for their respective person 
 * ---labels start with descriptor, but will be on default trait when actually implemented---     
	GridLayout(1,2,40,5) = (number of row, number of column, horizontal spacing, vertical spacing  
*/
	    babyMake = new JButton("Make a baby");
	    babyMake.addActionListener(this);
	    
	    JPanel traits = new JPanel(new GridLayout(1,3,40,5));
	    
	    JPanel traitsFather = new JPanel(new GridLayout(13,1,5,2));
	    JLabel labelFather = new JLabel("Father's Traits:");
	    traitsFather.add(labelFather);
	    traitsFather.add(eyeColourF);
	    traitsFather.add(eyeSizeF);
	    traitsFather.add(heightF);
	    traitsFather.add(bodyTypeF);
	    traitsFather.add(skinColourF);
	    traitsFather.add(noseSizeF);
	    traitsFather.add(earLobeF);
	    traitsFather.add(hairColourF);
	    traitsFather.add(hairAmountF);
	    traitsFather.add(outlookF);
	    traitsFather.add(intelligenceF);
	    traits.add(traitsFather);
	    
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
	    
	    JPanel traitsMother = new JPanel(new GridLayout(13, 1, 5, 2));
	    JLabel labelMother = new JLabel("Mother's Traits:");
	    traitsMother.add(labelMother);
	    traitsMother.add(eyeColourM);
	    traitsMother.add(eyeSizeM);
	    traitsMother.add(heightM);
	    traitsMother.add(bodyTypeM);
	    traitsMother.add(skinColourM);
	    traitsMother.add(noseSizeM);
	    traitsMother.add(earLobeM);
	    traitsMother.add(hairColourM);
	    traitsMother.add(hairAmountM);
	    traitsMother.add(outlookM);
	    traitsMother.add(intelligenceM);
	    traits.add(traitsMother);
	    addComponent(traits, 1,2,1,1);
	    addComponent(babyMake, 1,4,1,1);
	    
	    father.createStringTraitsArray();
		mother.createStringTraitsArray();
		updateLabels(father.fatherTraits, mother.motherTraits);

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
			father.createStringTraitsArray();
			mother.createStringTraitsArray();
			updateLabels(father.fatherTraits, mother.motherTraits);
				
		}
	
	// If user chose to make baby, send traits to baby randomizer and display results	
		else if (e.getSource() == babyMake){
		// Initializes the baby randomizer
			BabyRandomizer.makeBabyTraitStringArray(father, mother);
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
		
		else if (e.getSource() == randomFather){
			String[] randomFatherTraits = father.randomizeStringTraitsArray();
			for (String trait: randomFatherTraits){
				System.out.println(trait);
			} 
			eyeColourF.setSelectedItem(randomFatherTraits[2]);
			eyeSizeF.setSelectedItem(randomFatherTraits[3]);
			heightF.setSelectedItem(randomFatherTraits[4]);
			bodyTypeF.setSelectedItem(randomFatherTraits[5]);
			skinColourF.setSelectedItem(randomFatherTraits[6]);
			noseSizeF.setSelectedItem(randomFatherTraits[7]);
			earLobeF.setSelectedItem(randomFatherTraits[8]);
			hairColourF.setSelectedItem(randomFatherTraits[9]);
			hairAmountF.setSelectedItem(randomFatherTraits[10]);
			outlookF.setSelectedItem(randomFatherTraits[11]);
			intelligenceF.setSelectedItem(randomFatherTraits[12]);
			updateLabels(father.randomizeStringTraitsArray(), mother.motherTraits); 
		}
		
		else if (e.getSource() == randomMother){
			String[] randomMotherTraits = mother.randomizeStringTraitsArray();
			eyeColourM.setSelectedItem(randomMotherTraits[2]);
			eyeSizeM.setSelectedItem(randomMotherTraits[3]);
			heightM.setSelectedItem(randomMotherTraits[4]);
			bodyTypeM.setSelectedItem(randomMotherTraits[5]);
			skinColourM.setSelectedItem(randomMotherTraits[6]);
			noseSizeM.setSelectedItem(randomMotherTraits[7]);
			earLobeM.setSelectedItem(randomMotherTraits[8]);
			hairColourM.setSelectedItem(randomMotherTraits[9]);
			hairAmountM.setSelectedItem(randomMotherTraits[10]);
			outlookM.setSelectedItem(randomMotherTraits[11]);
			intelligenceM.setSelectedItem(randomMotherTraits[12]);
			updateLabels(father.fatherTraits, mother.randomizeStringTraitsArray());
		}
		
		else if (e.getSource() == genFather){
			// make father's dna string file
		}
		
		else if (e.getSource()== genMother){
			// make mother's dna string file
		}
	}
	//protected void updatePicture(String )
	public void updateLabels(String[] fatherTraits, String[] motherTraits) {
		
		String fatherBodyURL = ImageFinder.findBodyImageName(fatherTraits);
		String fatherEyesURL = ImageFinder.findEyesImageName(fatherTraits);
		String fatherHairURL = ImageFinder.findHairImageName(fatherTraits);
		String motherBodyURL = ImageFinder.findBodyImageName(motherTraits);
		String motherEyesURL = ImageFinder.findEyesImageName(motherTraits);
		String motherHairURL = ImageFinder.findHairImageName(motherTraits);
		
		try {
			fatherBody = ImageIO.read(new File(fatherBodyURL));
			fatherHair = ImageIO.read(new File(fatherHairURL));
			fatherEyes = ImageIO.read(new File(fatherEyesURL));
			motherBody = ImageIO.read(new File(motherBodyURL));
			motherHair = ImageIO.read(new File(motherHairURL));
			motherEyes = ImageIO.read(new File(motherEyesURL));
		}
		
		catch (IOException ex) {
			System.out.println("file not found. updateLabels");
		}
		
		ImageIcon dadBodyIcon = new ImageIcon(fatherBody);
		ImageIcon dadHairIcon = new ImageIcon(fatherHair);
		ImageIcon dadEyesIcon = new ImageIcon(fatherEyes);
		ImageIcon momBodyIcon = new ImageIcon(motherBody);
		ImageIcon momHairIcon = new ImageIcon(motherHair);
		ImageIcon momEyesIcon = new ImageIcon(motherEyes);
		fatherBodyImage.setIcon(dadBodyIcon);
		fatherHairImage.setIcon(dadHairIcon);
		fatherEyesImage.setIcon(dadEyesIcon);
		motherBodyImage.setIcon(momBodyIcon);
		motherHairImage.setIcon(momHairIcon);
		motherEyesImage.setIcon(momEyesIcon);
	}
}

