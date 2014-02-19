package Main;
import java.util.Scanner;

import traitsClasses.Person;
import BabyCreation.BabyRandomizer;
public class tester{
	public static void main(String[]args){
		String eyeColourInput= null;
		String eyeColourInputM = null;
		String hairColourInput = null;
		String hairColourInputM = null;
		boolean happyWithChoice = false;
		boolean makeBaby = false;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		while(happyWithChoice == false){
			System.out.print("What eyes colour?");
			eyeColourInput = keyboard.next();
			System.out.print("What hair colour?");
			hairColourInput = keyboard.next();
			System.out.print("What eyes colour?M");
			eyeColourInputM = keyboard.next();
			System.out.print("What hair colour?M");
			hairColourInputM = keyboard.next();
			//generateChildsTrait()
			System.out.print("happy?");
			String happyWithChoiceS = keyboard.next();
			if (happyWithChoiceS.equals("y")){
				happyWithChoice = true;
			}
			else{
				happyWithChoice = false;
			}
			System.out.println("Make baby");
			String makeBabyString = keyboard.next();
			if (makeBabyString.equals("t")){
				makeBaby = true;
			}
			else {
				makeBaby = false;
			}
			
		}
		Person dad = new Person(eyeColourInput, hairColourInput);
		Person mom = new Person(eyeColourInputM, hairColourInputM);
		if(makeBaby == true){
			String babyHairColour = BabyRandomizer.generateChildsTrait(mom.hair.hairColourChance, dad.hair.hairColourChance, dad.hair.currentHairColour, mom.hair.currentHairColour);
			String babyEyeColour = BabyRandomizer.generateChildsTrait(mom.eyes.eyeColourChance, dad.eyes.eyeColourChance, dad.eyes.currentEyeColour, mom.eyes.currentEyeColour);
			Person baby = new Person(babyEyeColour, babyHairColour);
			System.out.println(baby.hair.currentHairColour);
			System.out.println(baby.eyes.currentEyeColour);
		}
		else{
			System.out.println("no baby");
		}
	}
}

