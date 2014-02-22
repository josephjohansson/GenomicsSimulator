package Main;
import java.util.Scanner;
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
		String genderInputF = "male";
		String genderInputM = "female";
		while(happyWithChoice == false) {
			System.out.print("What hair colour for the father?");
			hairColourInputF = keyboard.next();
			System.out.print("What hair colour for the mother?");
			hairColourInputM = keyboard.next();
			System.out.print("What hair amount for the father?");
			hairAmountInputF = keyboard.next();
			System.out.print("What hair amount for the mother?");
			hairAmountInputM = keyboard.next();
			System.out.print("What eye colour for the father?");
			eyeColourInputF = keyboard.next();
			System.out.print("What eye colour for the mother?");
			eyeColourInputM = keyboard.next();
			System.out.print("What eye size for the father?");
			eyeSizeInputF = keyboard.next();
			System.out.print("What eye size for the mother?");
			eyeSizeInputM = keyboard.next();
			System.out.print("What nose size for the father?");
			noseSizeInputF = keyboard.next();
			System.out.print("What nose size for the mother?");
			noseSizeInputM = keyboard.next();
			System.out.print("What ear lobe for the father?");
			earLobeInputF = keyboard.next();
			System.out.print("What ear lobe for the mother?");
			earLobeInputM = keyboard.next();
			System.out.print("What height for the father?");
			heightInputF = keyboard.next();
			System.out.print("What height for the mother?");
			heightInputM = keyboard.next();
			System.out.print("What body type for the father?");
			bodyTypeInputF = keyboard.next();
			System.out.print("What body type for the mother?");
			bodyTypeInputM = keyboard.next();
			System.out.print("What skin colour for the father?");
			skinColourInputF = keyboard.next();
			System.out.print("What skin colour for the mother?");
			skinColourInputM = keyboard.next();
			System.out.print("What outlook for the father?");
			outlookInputF = keyboard.next();
			System.out.print("What outlook for the mother?");
			outlookInputM = keyboard.next();
			System.out.print("What intelligence for the father?");
			intelligenceInputF = keyboard.next();
			System.out.print("What intelligence for the mother?");
			intelligenceInputM = keyboard.next();
			System.out.print("happy?");
			String happyWithChoiceS = keyboard.next();
			if (happyWithChoiceS.equals("y")){
				happyWithChoice = true;
			}
			else{
				happyWithChoice = false;
			}
		}
		Person dad = new Person(hairColourInputF, hairAmountInputF, eyeColourInputF, eyeSizeInputF, noseSizeInputF, earLobeInputF, heightInputF, bodyTypeInputF, skinColourInputF, outlookInputF, intelligenceInputF, genderInputF);
		Person mom = new Person(hairColourInputM, hairAmountInputM, eyeColourInputM, eyeSizeInputM, noseSizeInputM, earLobeInputM, heightInputM, bodyTypeInputM, skinColourInputM, outlookInputM, intelligenceInputM, genderInputM);
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
	}
}

