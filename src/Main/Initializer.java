package Main;
import people.*;
import gui.GeoSimGui;

public class Initializer {
	
	public static void main(String[]args){
	// Makes a default person so that the Gui can access the traits list
		Person defaultPerson = new Person();
		@SuppressWarnings("unused")
		GeoSimGui gui = new GeoSimGui(defaultPerson);		
	}
}


