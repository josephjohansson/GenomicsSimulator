package traitsClasses;

public class Person {
	public int traitChance = 0;
	public Eyes eyes = new Eyes();
	public Hair hair = new Hair();
	public Person(String userInputEye, String userInputHair){
		eyes.getEyeColour(userInputEye);
		//System.out.println(eyes.currentEyeColourDNA);
		eyes.getRandomGene(eyes.currentEyeColourDNA);
		//System.out.println(eyes.currentGene);
		hair.getHairColour(userInputHair);
		//System.out.println(hair.currentHairColourDNA);
		hair.getRandomGene(hair.currentHairColourDNA);
		//System.out.println(hair.currentGene);
	}
}
