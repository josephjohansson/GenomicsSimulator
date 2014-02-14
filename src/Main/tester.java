package Main;
import java.util.Scanner;
import traitsClasses.Person;
public class tester{
	public static void main(String[]args){
		Person testPerson = new Person();
		boolean happyWithChoice = false;
		Scanner keyboard = new Scanner(System.in);
		while(happyWithChoice == false){
			System.out.print("What eyes colour?");
			String eyeColourInput = keyboard.next();
			System.out.print("What hair colour?");
			String hairColourInput = keyboard.next();
			testPerson.getUserInputOnTraits(eyeColourInput, hairColourInput);
			System.out.print("happy?");
			String happyWithChoiceS = keyboard.next();
			if (happyWithChoiceS.equals("y")){
				happyWithChoice = true;
			}
			else{
				happyWithChoice = false;
			}
		}
		hello world
	}
}

