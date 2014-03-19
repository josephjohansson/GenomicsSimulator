package Main;

import javax.swing.*;

import traitsClasses.TraitsEnum;

import java.awt.*;
import java.awt.event.*;
	
/**basic GUI layout, no ActonListeners implemented
 *  buttons and dropdowns created, but not integrated with rest of program (they just look pretty)
 * @author Jessica
 */
public class GeoSimGui extends JFrame{

	int WINDOW_WIDTH = 800;
	int WINDOW_HEIGHT = 500;
	    
// options made for dropdowns- place holders as not integrated with rest of program yet
	String[] hairC = {"Hair Colour","Black","Brown","Blonde","Red"};
	String[] hairA = {"Hair Amount","Hairy","Average","Smooth"};
	String[] eyeC = {"Eye Colour","Brown","Blue","Green","Hazel"};
	String[] eyeS = {"Eye Size", "Small","Medium","Large"};
	String[] noseS = {"Nose Size", "Small","Medium","Large"};
	String[] earL = {"Ear Lobe","Attached","Detached"};
	String[] heightS = {"Height","Tall","Average","Short"};
	String[] bodyT = {"Body Type","Slim","Average","Large"};
	String[] skinC = {"Skin Colour","Fair","Dark","Brown","Yellow"};
	String[] outlookS = {"Outlook", "Optimistic","Pessimistic","Realistic"};
	String[] IQA = {"Intelligence","High","Average","Low"};
	
	//Mother traits
	JComboBox hairColourM = new JComboBox(hairC);
	JComboBox hairAmountM = new JComboBox(hairA);
	JComboBox eyeColourM = new JComboBox(eyeC);
	JComboBox eyeSizeM = new JComboBox(eyeS);
	JComboBox noseSizeM = new JComboBox(noseS);
	JComboBox earLobeM = new JComboBox(earL);
	JComboBox heightM = new JComboBox(heightS);
	JComboBox bodyTypeM = new JComboBox(bodyT);
	JComboBox skinColourM = new JComboBox(skinC);
	JComboBox outlookM = new JComboBox(outlookS);
	JComboBox IQM = new JComboBox(IQA);
	//Father traits    
	JComboBox hairColourF = new JComboBox(hairC);
	JComboBox hairAmountF = new JComboBox(hairA);
	JComboBox eyeColourF = new JComboBox(eyeC);
	JComboBox eyeSizeF = new JComboBox(eyeS);
	JComboBox noseSizeF = new JComboBox(noseS);
	JComboBox earLobeF = new JComboBox(earL);
	JComboBox heightF = new JComboBox(heightS);
	JComboBox bodyTypeF = new JComboBox(bodyT);
	JComboBox skinColourF = new JComboBox(skinC);
	JComboBox outlookF = new JComboBox(outlookS);
	JComboBox IQF = new JComboBox(IQA);
	    
	private Container container;
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	 
	
	public GeoSimGui(){
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
	    addComponent(title, 0, 0, 3, 1);
	    
/** West and East sections hold actions for Father and Mother respectively
 * 	buttons added, but do nothing (yet!)
 * images will be placed in (0,2,1,1) and (2,2,1,1,) respectively
 */
	//West 
	    JLabel fatherLabel = new JLabel("Father");
	    JButton randomDad = new JButton("Randomize");
	    JButton genDad = new JButton("Generate DNA");
	    JLabel fatherImage = new JLabel ("This is where Dad will go");
	    
	    addComponent(fatherLabel, 0,1,1,1);  
	    addComponent(fatherImage, 0,2,1,1);
	    addComponent(randomDad, 0,4,1,1);
	    addComponent(genDad, 0, 5, 1,1);
	    
	//East 
	    JLabel motherLabel = new JLabel("Mother");
	    JLabel motherImage = new JLabel("This is where Mom will go");
	    JButton randomMom = new JButton("Randomize");        
	    JButton genMom = new JButton("Generate DNA");
	        
	    addComponent(motherLabel, 2, 1, 1, 1);
	    addComponent(motherImage,2,2,1,1);
	    addComponent(randomMom, 2, 4, 1,1);
	    addComponent(genMom, 2,5, 1, 1);
	    
/** Center section holds trait selection options
 * 	trait panel holds parent panels(traitMom and traitDad) for centralized selection
 * 	parent panels hold trait selection for their respective person 
 * ---labels start with descriptor, but will be on default trait when actually implemented---     
	GridLayout(1,2,40,5) = (number of row, number of column, horizontal spacing, vertical spacing  
*/
	    JButton babyMake = new JButton("Make a baby");
	    
	    JPanel traits = new JPanel(new GridLayout(1,3,40,5));
	    
	    JPanel traitsDad = new JPanel(new GridLayout(13,1,5,2));
	    JLabel labelDad = new JLabel("Father's Traits:");
	    traitsDad.add(labelDad);
	    traitsDad.add(hairColourF);
	    traitsDad.add(hairAmountF);
	    traitsDad.add(eyeColourF);
	    traitsDad.add(eyeSizeF);
	    traitsDad.add(noseSizeF);
	    traitsDad.add(earLobeF);
	    traitsDad.add(heightF);
	    traitsDad.add(bodyTypeF);
	    traitsDad.add(skinColourF);
	    traitsDad.add(outlookF);
	    traitsDad.add(IQF);
	    traits.add(traitsDad);
	        
	    
	    JPanel traitLabels = new JPanel (new GridLayout(13,1,5,2));
	    JLabel traitSelect = new JLabel("Trait Selection");
	    JLabel hairColour = new JLabel("-Hair Colour-");
	    JLabel hairAmount = new JLabel("-Hair Amount-");
	    JLabel eyeColour = new JLabel("-Eye Colour-");
	    JLabel eyeSize = new JLabel("-Eye Size-");
	    JLabel noseSize = new JLabel("-Nose Size-");
	    JLabel earLobe = new JLabel("-Ear Lobe-");
	    JLabel height = new JLabel("-Height-");
	    JLabel bodyType = new JLabel("-Body Type-");
	    JLabel skinColour = new JLabel("-Skin Colour-");
	    JLabel outlook = new JLabel("-Outlook-");
	    JLabel IQ = new JLabel("-Intellegence-");
	    traitLabels.add(traitSelect);
	    traitLabels.add(hairColour);
	    traitLabels.add(hairAmount);
	    traitLabels.add(eyeColour);
	    traitLabels.add(eyeSize);
	    traitLabels.add(noseSize);
	    traitLabels.add(earLobe);
	    traitLabels.add(height);
	    traitLabels.add(bodyType);
	    traitLabels.add(skinColour);
	    traitLabels.add(outlook);
	    traitLabels.add(IQ);
	    traits.add(traitLabels);
	    
	    JPanel traitsMom = new JPanel(new GridLayout(13, 1, 5, 2));
	    JLabel labelMom = new JLabel("Mother's Traits:");
	    traitsMom.add(labelMom);
	    traitsMom.add(hairColourM);
	    traitsMom.add(hairAmountM);
	    traitsMom.add(eyeColourM);
	    traitsMom.add(eyeSizeM);
	    traitsMom.add(noseSizeM);
	    traitsMom.add(earLobeM);
	    traitsMom.add(heightM);
	    traitsMom.add(bodyTypeM);
	    traitsMom.add(skinColourM);
	    traitsMom.add(outlookM);
	    traitsMom.add(IQM);
	    traits.add(traitsMom);
	    addComponent(traits, 1, 2,1,1);
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
	    
//main method that inititalizes the gui
	public static void main(String[]args){
	    GeoSimGui test = new GeoSimGui();
	}
}
