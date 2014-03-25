package Main;
import people.*;
import gui.GeoSimGui;

/**
 * The class below is the main class of the program, it initializes the gui. 
 */

public class Initializer {
	
	public static void main(String[]args) {
	/** @param defaultPerson Makes a default person so that the Gui can access the traits list */
		Person defaultPerson = new Person();
	/** @param gui Creates a new (the only) instance of the gui */	
		GeoSimGui gui = new GeoSimGui(defaultPerson);		
	}
}


