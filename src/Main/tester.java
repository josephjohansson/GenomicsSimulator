package Main;
import java.util.Scanner;
import javax.swing.JOptionPane;
import traitsClasses.Person;
import BabyCreation.BabyRandomizer;
public class tester {
	private static Scanner keyboard;
	public static void main(String[]args){
		boolean happyWithChoice = false;
		boolean makeAnotherBaby = true;
		keyboard = new Scanner(System.in);
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
		while(happyWithChoice == false) {
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
			System.out.print("happy?");
			String happyWithChoiceS = keyboard.next();
			if (happyWithChoiceS.equals("y")){
				happyWithChoice = true;
			}
			else{
				happyWithChoice = false;
			}
		}
		Person dad = new Person("dad",hairColourInputF, hairAmountInputF, eyeColourInputF, eyeSizeInputF, noseSizeInputF, earLobeInputF, heightInputF, bodyTypeInputF, skinColourInputF, outlookInputF, intelligenceInputF, genderInputF);
		Person mom = new Person("mom",hairColourInputM, hairAmountInputM, eyeColourInputM, eyeSizeInputM, noseSizeInputM, earLobeInputM, heightInputM, bodyTypeInputM, skinColourInputM, outlookInputM, intelligenceInputM, genderInputM);
		while (makeAnotherBaby) {
			System.out.print("Make baby?");
			String makeBabyString = keyboard.next();
			if (makeBabyString.equals("t")){
				String babyHairColour = BabyRandomizer.generateChildsTrait(mom.hair.hairColourChance, dad.hair.hairColourChance, dad.hair.currentHairColour, mom.hair.currentHairColour);
				String babyEyeColour = BabyRandomizer.generateChildsTrait(mom.eyes.eyeColourChance, dad.eyes.eyeColourChance, dad.eyes.currentEyeColour, mom.eyes.currentEyeColour);
				String babyHairAmount = BabyRandomizer.generateChildsTrait(mom.hair.hairAmountChance, dad.hair.hairAmountChance, dad.hair.currentHairAmount, mom.hair.currentHairAmount);
				String babyEyeSize = BabyRandomizer.generateChildsTrait(mom.eyes.eyeSizeChance, dad.eyes.eyeSizeChance, dad.eyes.currentEyeSize, mom.eyes.currentEyeSize);
				String babyNoseSize = BabyRandomizer.generateChildsTrait(mom.face.noseSizeChance, dad.face.noseSizeChance, dad.face.currentNoseSize, mom.face.currentNoseSize);
				String babyEarLobe = BabyRandomizer.generateChildsTrait(mom.face.earLobeChance, dad.face.earLobeChance, dad.face.currentEarLobe, mom.face.currentEarLobe);
				String babyHeight = BabyRandomizer.generateChildsTrait(mom.body.heightChance, dad.body.heightChance, dad.body.currentHeight, mom.body.currentHeight);
				String babyBodyType = BabyRandomizer.generateChildsTrait(mom.body.bodyTypeChance, dad.body.bodyTypeChance, dad.body.currentBodyType, mom.body.currentBodyType);
				String babySkinColour = BabyRandomizer.generateChildsTrait(mom.body.skinColourChance, dad.body.skinColourChance, dad.body.currentSkinColour, mom.body.currentSkinColour);
				String babyOutlook = BabyRandomizer.generateChildsTrait(mom.personality.outlookChance, dad.personality.outlookChance, dad.personality.currentOutlook, mom.personality.currentOutlook);
				String babyIntelligence = BabyRandomizer.generateChildsTrait(mom.personality.intelligenceChance, dad.personality.intelligenceChance, dad.personality.currentIntelligence, mom.personality.currentIntelligence);
				String babyGender = BabyRandomizer.generateChildsTrait(mom.gender.genderChance, dad.gender.genderChance, dad.gender.currentGender, mom.gender.currentGender);						
				Person baby = new Person(babyHairColour, babyHairAmount, babyEyeColour, babyEyeSize, babyNoseSize, babyEarLobe, babyHeight, babyBodyType, babySkinColour, babyOutlook, babyIntelligence, babyGender);
				System.out.println("baby's hair colour is: "+baby.hair.currentHairColour);
				System.out.println("baby's hair amount is: "+baby.hair.currentHairAmount);
				System.out.println("baby's eye colour is: "+baby.eyes.currentEyeColour);
				System.out.println("baby's eye size is: "+baby.eyes.currentEyeSize);
				System.out.println("baby's nose size is: "+baby.face.currentNoseSize);
				System.out.println("baby's ear lobe is: "+baby.face.currentEarLobe);
				System.out.println("baby's height is: "+baby.body.currentHeight);
				System.out.println("baby's body type is: "+baby.body.currentBodyType);
				System.out.println("baby's skin colour is: "+baby.body.currentSkinColour);
				System.out.println("baby's outlook is: "+baby.personality.currentOutlook);
				System.out.println("baby's intelligence is: "+baby.personality.currentIntelligence);
				System.out.println("baby's gender is: "+baby.gender.currentGender);
			}
			else {
				System.out.println("Done");
				makeAnotherBaby = false;
			}
		}
			System.out.print("Would you like to make a text file?");
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
	}
	}
}

