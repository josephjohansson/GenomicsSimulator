import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

// basic GUI layout, no ActonListeners implemented
public class GeoSimGui extends JFrame{
	    
	JLabel northLabel;
	JLabel centerLabel;
	JLabel eastLabel;
	JLabel westLabel;
	int WINDOW_WIDTH = 800;
	int WINDOW_HEIGHT = 500;
	    
	String[] hairC = {"Black","Brown","Blonde","Red"};
	String[] hairA = {"Hairy","Average","Smooth"};
	String[] eyeC = {"Brown","Blue","Green","Hazel"};
	String[] eyeS = {"Small","Medium","Large"};
	String[] noseS = {"Small","Medium","Large"};
	String[] earL = {"Attached","Detached"};
	String[] heightS = {"Tall","Average","Short"};
	String[] bodyT = {"Slim","Average","Large"};
	String[] skinC = {"Fair","Dark","Brown","Yellow"};
	String[] outlookS = {"Optimistic","Pessimistic","Realistic"};
	String[] IQA = {"High","Average","Low"};
	
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
	    
		container = getContentPane();
	    layout = new GridBagLayout();
	    container.setLayout(layout);
	    
	    constraints = new GridBagConstraints();
	    
	//North Panel
	    JPanel north = new JPanel();    
	    northLabel = new JLabel("Geonomic Simulator");
	    north.add(northLabel);
	    
	    addComponent(north, 0, 0, 3, 1);
	//West Panel
	    JPanel west = new JPanel();
	    westLabel = new JLabel("Father image");
	    west.add(westLabel);
	    addComponent(west, 0,1,1,1);
	       
	    JButton randomDad = new JButton("Randomize");
	    JButton genDad = new JButton("Generate DNA");
	        
	    addComponent(randomDad, 0,3,1,1);
	    addComponent(genDad, 0, 4, 1,1);
	        
	//Center Panel
	    JPanel center = new JPanel();
	    centerLabel = new JLabel("Trait Selection");
	    center.add(centerLabel);
	        
	    addComponent(center,1,1,1,1);
	    JPanel traits = new JPanel(new GridLayout(1,2,40,5));
	        
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
	                
	    addComponent(traits, 1, 2, 1,1);

	    JButton babyMake = new JButton("Make a baby");
	        
	    addComponent(babyMake, 1,4,1,1);

	//East Panel
	    JPanel east = new JPanel();
	    eastLabel = new JLabel("Mother image");
	        
	    JButton randomMom = new JButton("Randomize");        
	    JButton genMom = new JButton("Generate DNA");
	        
	    addComponent(eastLabel, 2, 1, 1, 1);
	    addComponent(randomMom, 2, 3, 1,1);
	    addComponent(genMom, 2,4, 1, 1);
	        
	        // sets up size and ability to be visible
	        //also allows program to close when exited
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
	    setVisible(true);
	    }    
	private void addComponent(Component thing, int column, int row, int width, int height){
	      // set gridx and gridy 
	      constraints.gridx = column;
	      constraints.gridy = row;

	      // set gridwidth and gridheight
	      constraints.gridwidth = width;   
	      constraints.gridheight = height;

	      // set constraints
	      layout.setConstraints(thing, constraints);  
	      container.add(thing);      // add component 
    }
	    
	    //main method that inititalizes the gui
	public static void main(String[]args){
	    GeoSimGui test = new GeoSimGui();
	}
}
