package traitsClasses;

public class Person {
	public void getUserInputOnTraits(String userInput){
		Eyes e = new Eyes();
		Hair h = new Hair();
		e.getColour(userInput);
		System.out.println(e.currentEyeColourDNA);
		e.getRandomGene(e.currentEyeColourDNA);
		System.out.println(e.currentGene);
		hello
	}	
}
