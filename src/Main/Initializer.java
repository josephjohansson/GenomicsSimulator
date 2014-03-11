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
		//makes two arrays of 13 elements one for each one of 
		String[] fatherTraits = new String[13];
		String[] motherTraits = new String[13];
	// The following loop collects inputs for each trait of the mother and father in pop up windows, 
	// the loop ends when the user has selected traits that they are happy with 
		boolean happyWithChoice = false;
		while(!happyWithChoice) {
			//set name for father
			fatherTraits[0] = "Father";
			//set sex for father
			fatherTraits[1] = "Male";
			//set name for mother
			motherTraits[0] = "Mother";
			//set sex for mother
			motherTraits[1] = "Female";
			//since we have already inputed the name and sex we will start right after
			int index = 2;
			//for every single trait in the enum 
			for (TraitsEnum trait : TraitsEnum.values()){
				if (index <= 12) {
					//pop up the joptionpane possibleTraits is from traits class
					Object[] possibleTraits = new Object[trait.getTraitSet().size()];
					//possible trait gets the trait in question which is outputs the traitset using a method from the enum
					//then it converts it to an array
					possibleTraits = trait.getTraitSet().toArray(possibleTraits);
					
					String traitInputF = (String)JOptionPane.showInputDialog(null,
						"What " + trait.toString() + " for the father?", "Input",
						JOptionPane.INFORMATION_MESSAGE, null,
						possibleTraits, possibleTraits[0]
					);
					fatherTraits[index] = traitInputF;
					String traitInputM = (String)JOptionPane.showInputDialog(null,
						"What " + trait.toString() + " for the mother?", "Input",
						JOptionPane.INFORMATION_MESSAGE, null,
						possibleTraits, possibleTraits[0]);
					motherTraits[index] = traitInputM;
				}	
				index++;
			}
		// Another pop up checks to see if user is happy with the input entered
			Object[] happyWithChoiceAnswer = {"Yes","No"};
			String happyWithChoiceS = (String)JOptionPane.showInputDialog(null,
					"Are you happy with these choices?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					happyWithChoiceAnswer, happyWithChoiceAnswer[0]);
		// If the user is happy with the traits selected, continue, if not repeat the loop until the user is happy with the traits	
			if (happyWithChoiceS.equals("Yes")){
				happyWithChoice = true;
			}
		// End of while loop	
		}
		
	// Creates two instances of the person class using the traits selected by the user
		Person dad = new Person(fatherTraits);
		Person mom = new Person(motherTraits);
		
	// The following loop chooses the baby's traits using the traits for mother and father chosen by the user
		boolean makeAnotherBaby = true;
		while (makeAnotherBaby) {
		// Asks the user if they want to make another baby (using the same input) or not
			Object[] newBabyAnswer = {"Yes","No"};
			String makeBabyString = (String)JOptionPane.showInputDialog(null,
					"Make baby?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					newBabyAnswer, newBabyAnswer[0]);
		// If user chose yes, send traits to baby randomizer 	
			if (makeBabyString.equals("Yes")){
				String[] babyTraits = new String[13];
				babyTraits[0] = "Baby";
				for (int index = 1; index < 13; index++) {
					String momTraitString = motherTraits[index];
					String dadTraitString = fatherTraits[index];
					TraitsEnum momTrait = mom.getAllTraits()[index];
					TraitsEnum dadTrait = dad.getAllTraits()[index];
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
			// If user chose no, end program	
			else {
				JOptionPane.showMessageDialog(null, "Done");
				makeAnotherBaby = false;
			}
		// End of while loop	
		}
		GeoSimGui gui = new GeoSimGui();
		
		
	/*System.out.print("Would you like to make a text file?");
	
	String makeFile = keyboard.next();
	System.out.print("For the mom or dad?");
	String textName = keyboard.next();
	
	if (makeFile.equals("y")){
		if (textName.equals("mom")){
			TextFile.Create(mom);
			TextFile.Append(mom);
			TextFile.Reader(mom);
		}
		
		else if (textName.equals("dad")){
			TextFile.Create(dad);
			TextFile.Append(dad);
			TextFile.Reader(dad);
		}
		else{
			System.out.print("done");
		}
	}*/
	}
}


