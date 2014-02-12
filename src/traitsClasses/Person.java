package traitsClasses;

public class Person {
	public void getUserInputOnTraits(String userInputEye, String userInputHair){
		Eyes eyes = new Eyes();
		Hair hair = new Hair();
		eyes.getEyeColour(userInputEye);
		System.out.println(eyes.currentEyeColourDNA);
		eyes.getRandomGene(eyes.currentEyeColourDNA);
		System.out.println(eyes.currentGene);
		hair.getHairColour(userInputHair);
		System.out.println(hair.currentHairColourDNA);
		hair.getRandomGene(hair.currentHairColourDNA);
		System.out.println(hair.currentGene);
	}	
}
