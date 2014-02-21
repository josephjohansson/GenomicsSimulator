package traitsClasses;

import Main.TextFile;

public class Person {
	public void getUserInputOnTraits(String nameInput, String eyeInput, String hairInput){
		String name = nameInput;
		TextFile DNA = new TextFile();
		Eyes eyes = new Eyes();
		Hair hair = new Hair();
		eyes.getEyeColour(eyeInput);
		System.out.println(eyes.currentEyeColourDNA);
		eyes.getRandomGene(eyes.currentEyeColourDNA);
		System.out.println(eyes.currentGene);
		hair.getHairColour(hairInput);
		System.out.println(hair.currentHairColourDNA);
		hair.getRandomGene(hair.currentHairColourDNA);
		System.out.println(hair.currentGene);
		
		DNA.Create(name);
		DNA.Append(name,eyes.currentGene);
		DNA.Append(name,hair.currentGene);
		
		DNA.Reader(name);
	}	
}
