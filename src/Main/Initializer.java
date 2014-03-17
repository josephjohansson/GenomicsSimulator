package Main;
import javax.swing.JOptionPane;
import traitsClasses.Person;
import traitsClasses.TraitsEnum;
import BabyCreation.BabyRandomizer;

/* MAIN CLASS: 
 * The following class takes input for the mother's and 
 * father's traits from the user and displays the traits
 * of the baby.
 */

public class Initializer {
	public static void main(String[]args){
	// Makes a default person so that the Gui can access the traits list
		Person defaultPerson = new Person("default");
		GeoSimGui gui = new GeoSimGui(defaultPerson);		
	}
}


