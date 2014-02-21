package Main;
import java.util.Scanner;
import traitsClasses.Person;

public class Test {

	public static void main(String[]args){
		Person test = new Person();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name? ");
		String nameInput = keyboard.next();
		System.out.print("Your eye colour? ");
		String eyeInput = keyboard.next();
		System.out.print("Your hair colour? ");
		String hairInput = keyboard.next();
		
		test.getUserInputOnTraits (nameInput,eyeInput, hairInput);
	}
}
