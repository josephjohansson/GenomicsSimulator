package Main;
import javax.swing.UIManager;

import gui.GeoSimGui;

public class Initializer {
	
	public static void main(String[]args){
	// Makes a default person so that the Gui can access the traits list
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception exeption) { // ignore exceptions and continue
		}
		GeoSimGui gui = new GeoSimGui();		
	}
}


