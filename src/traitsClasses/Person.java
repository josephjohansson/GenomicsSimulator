package traitsClasses;

public class Person {
	public void getUserInputOnTraits(String userInputEye, String userInputHair){
		Eyes e = new Eyes();
		Hair h = new Hair();
		e.getEyeColour(userInputEye);
		System.out.println(e.currentEyeColourDNA);
		e.getRandomGene(e.currentEyeColourDNA);
		System.out.println(e.currentGene);
		h.getEyeColour(userInputHair);
		System.out.println(h.currentHairColourDNA);
		h.getRandomGene(h.currentHairColourDNA);
		System.out.println(h.currentGene);
	}	
}
