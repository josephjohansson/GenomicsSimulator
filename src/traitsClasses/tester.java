package traitsClasses;
import java.util.Scanner;
public class tester{
	public static void main(String[]args){
		Person d = new Person();
		boolean happyWithChoice = false;
		Scanner keyboard = new Scanner(System.in);
		while(happyWithChoice == false){
			System.out.print("What eyes colour?");
			String eyeColourInput = keyboard.next();
			d.getUserInputOnTraits(eyeColourInput);
			System.out.print("happy?");
			String happyWithChoiceS = keyboard.nexbbt();
			if (happyWithChoiceS.equals("y")){
				happyWithChoice = true;
			}
			else{
				happyWithChoice = false;
			}
		}
	}
}