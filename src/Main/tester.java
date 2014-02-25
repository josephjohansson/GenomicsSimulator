package Main;
import javax.swing.JOptionPane;
import traitsClasses.Person;
import BabyCreation.BabyRandomizer;

/* MAIN CLASS: 
 * The following class takes input for the mother's and 
 * father's traits from the user and displays the traits
 * of the baby.
 */

public class tester {
	public static void main(String[]args){
	// Declaration of variables for mother's and father's traits	
		String hairColourInputF = null;
		String hairColourInputM = null;
		String hairAmountInputF = null;
		String hairAmountInputM = null;
		String eyeColourInputF = null;
		String eyeColourInputM = null;
		String eyeSizeInputF = null;
		String eyeSizeInputM = null;
		String noseSizeInputF = null;
		String noseSizeInputM = null;
		String earLobeInputF = null;
		String earLobeInputM = null;
		String heightInputF = null;
		String heightInputM = null;
		String bodyTypeInputF = null;
		String bodyTypeInputM = null;
		String skinColourInputF = null;
		String skinColourInputM = null;
		String outlookInputF = null;
		String outlookInputM = null;
		String intelligenceInputF = null;
		String intelligenceInputM = null;
		String genderInputF = "Male";
		String genderInputM = "Female";
	// The following loop collects inputs for each trait of the mother and father in pop up windows, 
	// the loop ends when the user has selected traits that they are happy with 
		boolean happyWithChoice = false;
		while(!happyWithChoice) {
			// hair colour
			Object[] possibleHairColour = {"Black","Brown","Blonde","Red"};
			hairColourInputF = (String)JOptionPane.showInputDialog(null,
					"What hair colour for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleHairColour, possibleHairColour[0]);
			hairColourInputM = (String)JOptionPane.showInputDialog(null,
					"What hair colour for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleHairColour, possibleHairColour[0]);
			// hair amount
			Object[] possibleHairAmount = {"Hairy","Average","Smooth"};
			hairAmountInputF = (String)JOptionPane.showInputDialog(null,
					"What hair amount for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleHairAmount, possibleHairAmount[0]);
			hairAmountInputM = (String)JOptionPane.showInputDialog(null,
					"What hair amount for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleHairAmount, possibleHairAmount[0]);
			// eye colour
			Object[] possibleEyeColour = {"Brown","Blue","Green","Hazel"};
			eyeColourInputF = (String)JOptionPane.showInputDialog(null,
					"What eye colour for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleEyeColour, possibleEyeColour[0]);
			eyeColourInputM = (String)JOptionPane.showInputDialog(null,
					"What eye colour for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleEyeColour, possibleEyeColour[0]);
			// eye size
			Object[] possibleEyeSize = {"Small","Medium","Large"};
			eyeSizeInputF = (String)JOptionPane.showInputDialog(null,
					"What eye size for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleEyeSize, possibleEyeSize[0]);
			eyeSizeInputM = (String)JOptionPane.showInputDialog(null,
					"What eye size for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleEyeSize, possibleEyeSize[0]);
			// nose size
			Object[] possibleNoseSize = {"Small","Medium","Large"};
			noseSizeInputF = (String)JOptionPane.showInputDialog(null,
					"What nose size for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleNoseSize, possibleNoseSize[0]);
			noseSizeInputM = (String)JOptionPane.showInputDialog(null,
					"What nose size for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleNoseSize, possibleNoseSize[0]);
			// ear lobe
			Object[] possibleEarLobe = {"Attached","Detached"};
			earLobeInputF = (String)JOptionPane.showInputDialog(null,
					"What ear lobe for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleEarLobe, possibleEarLobe[0]);
			earLobeInputM = (String)JOptionPane.showInputDialog(null,
					"What ear lobe for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleEarLobe, possibleEarLobe[0]);
			// height
			Object[] possibleHeight = {"Tall","Average","Short"};
			heightInputF = (String)JOptionPane.showInputDialog(null,
					"What height for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleHeight, possibleHeight[0]);
			heightInputM = (String)JOptionPane.showInputDialog(null,
					"What height for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleHeight, possibleHeight[0]);
			// body type
			Object[] possibleBodyType = {"Slim","Average","Large"};
			bodyTypeInputF = (String)JOptionPane.showInputDialog(null,
					"What body type for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleBodyType, possibleBodyType[0]);
			bodyTypeInputM = (String)JOptionPane.showInputDialog(null,
					"What body type for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleBodyType, possibleBodyType[0]);
			// skin colour
			Object[] possibleSkinColour = {"Fair","Dark","Brown","Yellow"};
			skinColourInputF = (String)JOptionPane.showInputDialog(null,
					"What skin colour for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleSkinColour, possibleSkinColour[0]);
			skinColourInputM = (String)JOptionPane.showInputDialog(null,
					"What skin colour for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleSkinColour, possibleSkinColour[0]);
			// outlook
			Object[] possibleOutlook = {"Optimistic","Pessimistic","Realistic"};
			outlookInputF = (String)JOptionPane.showInputDialog(null,
					"What outlook for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleOutlook, possibleOutlook[0]);
			outlookInputM = (String)JOptionPane.showInputDialog(null,
					"What outlook for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleOutlook, possibleOutlook[0]);
			// intelligence
			Object[] possibleIntelligence = {"High","Average","Low"};
			intelligenceInputF = (String)JOptionPane.showInputDialog(null,
					"What intelligence for the father?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleIntelligence, possibleIntelligence[0]);
			intelligenceInputM = (String)JOptionPane.showInputDialog(null,
					"What intelligence for the mother?", "Input",
					JOptionPane.INFORMATION_MESSAGE, null,
					possibleIntelligence, possibleIntelligence[0]);
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
			else{
				happyWithChoice = false;
			}
		// End of while loop	
		}
		
	// Creates two instances of the person class using the traits selected by the user
		Person dad = new Person(hairColourInputF, hairAmountInputF, 
				eyeColourInputF, eyeSizeInputF, 
				noseSizeInputF, earLobeInputF, 
				heightInputF, bodyTypeInputF, 
				skinColourInputF, outlookInputF,
				intelligenceInputF, genderInputF);
		Person mom = new Person(hairColourInputM, hairAmountInputM,
				eyeColourInputM, eyeSizeInputM,
				noseSizeInputM, earLobeInputM,
				heightInputM, bodyTypeInputM,
				skinColourInputM, outlookInputM, 
				intelligenceInputM, genderInputM);
		
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
				String babyHairColour = BabyRandomizer.generateChildsTrait(
						mom.hair.hairColourChance, dad.hair.hairColourChance,
						dad.hair.currentHairColour, mom.hair.currentHairColour);
				String babyEyeColour = BabyRandomizer.generateChildsTrait(
						mom.eyes.eyeColourChance, dad.eyes.eyeColourChance,
						dad.eyes.currentEyeColour, mom.eyes.currentEyeColour);
				String babyHairAmount = BabyRandomizer.generateChildsTrait(
						mom.hair.hairAmountChance, dad.hair.hairAmountChance,
						dad.hair.currentHairAmount, mom.hair.currentHairAmount);
				String babyEyeSize = BabyRandomizer.generateChildsTrait(
						mom.eyes.eyeSizeChance, dad.eyes.eyeSizeChance,
						dad.eyes.currentEyeSize, mom.eyes.currentEyeSize);
				String babyNoseSize = BabyRandomizer.generateChildsTrait(
						mom.face.noseSizeChance, dad.face.noseSizeChance,
						dad.face.currentNoseSize, mom.face.currentNoseSize);
				String babyEarLobe = BabyRandomizer.generateChildsTrait(
						mom.face.earLobeChance, dad.face.earLobeChance,
						dad.face.currentEarLobe, mom.face.currentEarLobe);
				String babyHeight = BabyRandomizer.generateChildsTrait(
						mom.body.heightChance, dad.body.heightChance,
						dad.body.currentHeight, mom.body.currentHeight);
				String babyBodyType = BabyRandomizer.generateChildsTrait(
						mom.body.bodyTypeChance, dad.body.bodyTypeChance,
						dad.body.currentBodyType, mom.body.currentBodyType);
				String babySkinColour = BabyRandomizer.generateChildsTrait(
						mom.body.skinColourChance, dad.body.skinColourChance,
						dad.body.currentSkinColour, mom.body.currentSkinColour);
				String babyOutlook = BabyRandomizer.generateChildsTrait(
						mom.personality.outlookChance, dad.personality.outlookChance,
						dad.personality.currentOutlook, mom.personality.currentOutlook);
				String babyIntelligence = BabyRandomizer.generateChildsTrait(
						mom.personality.intelligenceChance, dad.personality.intelligenceChance,
						dad.personality.currentIntelligence, mom.personality.currentIntelligence);
				String babyGender = BabyRandomizer.generateChildsTrait(
						mom.gender.genderChance, dad.gender.genderChance,
						dad.gender.currentGender, mom.gender.currentGender);
			// Creates an instance of the person class called baby using the traits selected above	
				Person baby = new Person(babyHairColour,
						babyHairAmount,babyEyeColour, babyEyeSize,
						babyNoseSize, babyEarLobe, babyHeight,
						babyBodyType, babySkinColour, babyOutlook,
						babyIntelligence, babyGender);
			// Displays these traits in a pop up window	
				JOptionPane.showMessageDialog(null, 
						"baby's hair colour is: "+baby.hair.currentHairColour+
						"\nbaby's hair amount is: "+baby.hair.currentHairAmount+
						"\nbaby's eye colour is: "+baby.eyes.currentEyeColour+
						"\nbaby's eye size is: "+baby.eyes.currentEyeSize+
						"\nbaby's nose size is: "+baby.face.currentNoseSize+
						"\nbaby's ear lobe is: "+baby.face.currentEarLobe+
						"\nbaby's height is: "+baby.body.currentHeight+
						"\nbaby's body type is: "+baby.body.currentBodyType+
						"\nbaby's skin colour is: "+baby.body.currentSkinColour+
						"\nbaby's outlook is: "+baby.personality.currentOutlook+
						"\nbaby's intelligence is: "+baby.personality.currentIntelligence+
						"\nbaby's gender is: "+baby.gender.currentGender);
			}
			// If user chose no, end program	
			else {
				JOptionPane.showMessageDialog(null, "Done");
				makeAnotherBaby = false;
			}
		// End of while loop	
		}	
	}
}

