package Main;
import java.util.Scanner;
import traitsClasses.Person;
import BabyCreation.BabyRandomizer;
public class tester{
	private static Scanner keyboard;
	public static void main(String[]args){
		boolean happyWithChoice = false;
		keyboard = new Scanner(System.in);
		String eyeColourInputF = null;
		String eyeColourInputM = null;
		String hairColourInputF = null;
		String hairColourInputM = null;
		while(happyWithChoice == false){
			System.out.print("What eyes colour?F");
			eyeColourInputF = keyboard.next();
			System.out.print("What hair colour?F");
			hairColourInputF = keyboard.next();
			System.out.print("What eyes colour?M");
			eyeColourInputM = keyboard.next();
			System.out.print("What hair colour?M");
			hairColourInputM = keyboard.next();
			System.out.print("happy?");
			String happyWithChoiceS = keyboard.next();
			if (happyWithChoiceS.equals("y")){
				happyWithChoice = true;
			}
			else{
				happyWithChoice = false;
			}
		}
		Person dad = new Person(eyeColourInputF, hairColourInputF);
		Person mom = new Person(eyeColourInputM, hairColourInputM);
		System.out.print("Make baby?");
		String makeBabyString = keyboard.next();
		if (makeBabyString.equals("t")){
			String babyHairColour = BabyRandomizer.generateChildsTrait(mom.hair.hairColourChance, dad.hair.hairColourChance, dad.hair.currentHairColour, mom.hair.currentHairColour);
			String babyEyeColour = BabyRandomizer.generateChildsTrait(mom.eyes.eyeColourChance, dad.eyes.eyeColourChance, dad.eyes.currentEyeColour, mom.eyes.currentEyeColour);
			Person baby = new Person(babyEyeColour, babyHairColour);
			System.out.println("baby's hair is: "+baby.hair.currentHairColour);
			System.out.println("baby's eyes are: "+baby.eyes.currentEyeColour);
		}
		else{
			System.out.println("No Baby");
		}
	}
}

