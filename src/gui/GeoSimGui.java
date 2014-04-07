package gui;

import javax.swing.*;

import Main.FileChooser;
import babyCreation.BabyRandomizer;
import people.*;
import traitsClasses.Traits;

import java.awt.*;
import java.awt.event.*;
	
/**basic GUI layout, no ActonListeners implemented
 *  buttons and dropdowns created, but not integrated with rest of program (they just look pretty)
 * @author Jessica
 */
@SuppressWarnings({"rawtypes","serial"})
public class GeoSimGui extends JFrame implements ActionListener{
	public Mother mother = new Mother();
	public Father father = new Father();
	
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
	JButton browser;
	
	int WINDOW_WIDTH = 800;
	int WINDOW_HEIGHT = 500;
	
	// Makes the comboBoxes for the father
	public static JComboBox eyeColourF;
	public static JComboBox eyeSizeF;
	public static JComboBox heightF;
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
	public GeoSimGui(){

		// Option arrays made for comboBoxes
		String[] eyeColourOptions = Traits.EYE_COLOUR.getTraitSet().toArray(new String[Traits.EYE_COLOUR.getTraitSet().size()]);
		String[] eyeSizeOptions = Traits.EYE_SIZE.getTraitSet().toArray(new String[Traits.EYE_SIZE.getTraitSet().size()]);
		String[] heightOptions = Traits.HEIGHT.getTraitSet().toArray(new String[Traits.HEIGHT.getTraitSet().size()]);
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
	    addComponent(title,0,0,3,1,1,1,20,0,20,0);
	    
/** West and East sections hold actions for Father and Mother respectively
 * 	buttons added, but do nothing (yet!)
 *  images will be placed in (0,2,1,1) and (2,2,1,1) respectively
 */
	//West 
	    JLabel fatherLabel = new JLabel("Father");
	    
	    JButton randomFather = new JButton("Randomize");
	    randomFather.addActionListener(this);
	    
	    JButton genFather = new JButton("Generate DNA");
	    genFather.addActionListener(this);
	    
	    addComponent(fatherLabel, 0,1,1,1,0.5,0.25,10,20,10,20);  
	    addComponent(fatherEyesImage, 0,2,1,1,0,0,0,0,0,0);
	    addComponent(fatherHairImage, 0,2,1,1,0,0,0,0,0,0);
	    addComponent(fatherBodyImage, 0,2,1,1,0,0,0,0,0,0);
	    addComponent(genFather, 0,5,1,1,0.5,0.25,10,10,5,10);
	    addComponent(randomFather, 0,4,1,1,0.5,0.25,5,10,10,10);
	//East 
	    JLabel motherLabel = new JLabel("Mother");

	    JButton randomMother = new JButton("Randomize");
	    randomMother.addActionListener(this);
	    
	    JButton genMother = new JButton("Generate DNA");
	    genMother.addActionListener(this);
	        
	    addComponent(motherLabel, 2,1,1,1,0.5,0.25,10,20,10,20);
	    addComponent(motherEyesImage, 2,2,1,1,0,0,0,0,0,0);
	    addComponent(motherHairImage, 2,2,1,1,0,0,0,0,0,0);
	    addComponent(motherBodyImage, 2,2,1,1,0,0,0,0,0,0);
	    addComponent(randomMother, 2,4,1,1,0.5,025,5,10,10,10);
	    addComponent(genMother, 2,5,1,1,0.5,0.25,10,10,5,10);
	    
/** Center section holds trait selection options
 * 	trait panel holds parent panels(traitmother and traitfather) for centralized selection
 * 	parent panels hold trait selection for their respective person 
 * ---labels start with descriptor, but will be on default trait when actually implemented---     
	GridLayout(1,2,40,5) = (number of row, number of column, horizontal spacing, vertical spacing  
*/
	    babyMake = new JButton("Make a baby");
	    babyMake.addActionListener(this);
	    
	    browser = new JButton("Import File");
	    browser.addActionListener(this);
	    
	    JPanel traits = new JPanel(new GridLayout(1,3,40,5));
	    
	    JPanel traitsfather = new JPanel(new GridLayout(13,1,5,2));
	    JLabel labelfather = new JLabel("Father's Traits:");
	    traitsfather.add(labelfather);
	    traitsfather.add(eyeColourF);
	    traitsfather.add(eyeSizeF);
	    traitsfather.add(heightF);
	    traitsfather.add(skinColourF);
	    traitsfather.add(noseSizeF);
	    traitsfather.add(earLobeF);
	    traitsfather.add(hairColourF);
	    traitsfather.add(hairAmountF);
	    traitsfather.add(outlookF);
	    traitsfather.add(intelligenceF);
	    traits.add(traitsfather);
	    
	    
	    JPanel traitLabels = new JPanel (new GridLayout(13,1,5,2));
	    JLabel traitSelect = new JLabel("Trait Selection");
	    JLabel eyeColourLabel = new JLabel("-Eye Colour");
	    JLabel eyeSizeLabel = new JLabel("-Eye Size-");
	    JLabel heightLabel = new JLabel("-Height-");
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
	    traitLabels.add(skinColourLabel);
	    traitLabels.add(noseSizeLabel);
	    traitLabels.add(earLobeLabel);
	    traitLabels.add(hairColourLabel);
	    traitLabels.add(hairAmountLabel);
	    traitLabels.add(outlookLabel);
	    traitLabels.add(IQLabel);
	    traits.add(traitLabels);
	    
	    JPanel traitsmother = new JPanel(new GridLayout(13, 1, 5, 2));
	    JLabel labelmother = new JLabel("Mother's Traits:");
	    traitsmother.add(labelmother);
	    traitsmother.add(eyeColourM);
	    traitsmother.add(eyeSizeM);
	    traitsmother.add(heightM);
	    traitsmother.add(skinColourM);
	    traitsmother.add(noseSizeM);
	    traitsmother.add(earLobeM);
	    traitsmother.add(hairColourM);
	    traitsmother.add(hairAmountM);
	    traitsmother.add(outlookM);
	    traitsmother.add(intelligenceM);
	    traits.add(traitsmother);
	    addComponent(traits, 1,2,1,1,0,0,10,10,10,10);
	    addComponent(babyMake, 1,4,1,1,0.5,0.25,10,10,5,10);
	    addComponent(browser, 1,5,1,1,0.5,0.25,5,10,10,10);
	    
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
 * @param weightx (weightx) - resizing horizontal parameter
 * @param weighty (weighty) - resizing vertical parameter
 * @param top @param left @param bottom @param right - parameters to set the insets for the components
 */
	private void addComponent(Component thing, int column, int row, int width, int height,
							double weightx, double weighty, int top, int left, int bottom, int right){
	      // set gridx and gridy 
	      constraints.gridx = column;
	      constraints.gridy = row;

	      // set gridwidth and gridheight
	      constraints.gridwidth = width;   
	      constraints.gridheight = height;
	      
	      // sets weightx and y for resizing
	      constraints.weightx = weightx;
	      constraints.weighty = weighty;
	      
	      // sets insets
	      constraints.insets = new Insets(top,left,bottom,right);

	      // places component depending on constraints
	      layout.setConstraints(thing, constraints);  
	      container.add(thing);      // add component 
    }
	
	public void actionPerformed(ActionEvent e){
	// If any of the comboBoxes are clicked, update the String[] of traits
	// for both mother and father
		if (e.getSource() == browser){
			FileChooser window = new FileChooser();
			window.setVisible(true);
				
			
			
		// THIS IS WHERE THE PANEL WITH THE IMAGES OF THE MOTHER AND FATHER SHOULD BE UPDATED	
		
		// Debugging s
			//System.out.println(ImageFinder.findBodyImageName(Person.FATHER.createStringTraitsArrayF()));
			//System.out.println(ImageFinder.findBodyImageName(Person.MOTHER.createStringTraitsArrayM()));
		}
	
	// If user chose to make baby, send traits to baby randomizer and display results	
		else if (e.getSource() == babyMake) {
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
			eyeColourF.setSelectedItem(randomFatherTraits[2]);
			eyeSizeF.setSelectedItem(randomFatherTraits[3]); 
			heightF.setSelectedItem(randomFatherTraits[4]);
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
			skinColourM.setSelectedItem(randomMotherTraits[6]); 
			noseSizeM.setSelectedItem(randomMotherTraits[7]);
			earLobeM.setSelectedItem(randomMotherTraits[8]); 
			hairColourM.setSelectedItem(randomMotherTraits[9]); 
			hairAmountM.setSelectedItem(randomMotherTraits[10]); 
			outlookM.setSelectedItem(randomMotherTraits[11]); 
			intelligenceM.setSelectedItem(randomMotherTraits[12]);
			updateLabels(father.fatherTraits, mother.randomizeStringTraitsArray());
		}	 

		// browser button selected, opens FileChooser
		else{
			// Updating traits array	
			father.createStringTraitsArray();
			mother.createStringTraitsArray();
			updateLabels(father.fatherTraits, mother.motherTraits);
		}
	}
	//protected void updatePicture(String )
	public void updateLabels(String[] fatherTraits, String[] motherTraits){
		fatherBodyImage.setIcon(ImageFinder.getBodyIcon(fatherTraits));
		System.out.println("ahie");
		fatherHairImage.setIcon(ImageFinder.getHairIcon(fatherTraits));
		fatherEyesImage.setIcon(ImageFinder.getEyesIcon(fatherTraits));
		motherBodyImage.setIcon(ImageFinder.getBodyIcon(motherTraits));
		motherHairImage.setIcon(ImageFinder.getHairIcon(motherTraits));
		motherEyesImage.setIcon(ImageFinder.getEyesIcon(motherTraits));
		
	}
}

