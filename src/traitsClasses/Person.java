package traitsClasses;

public class Person {
	public Eyes eyes = new Eyes();
	public Hair hair = new Hair();
	public Face face = new Face();
	public Body body = new Body();
	public Personality personality = new Personality();
	public Gender gender = new Gender();
	public Person(String hairColourInput, String hairAmountInput, String eyeColourInput, String eyeSizeInput, String noseSizeInput, String earLobeInput, String heightInput, String bodyTypeInput, String skinColourInput, String outlookInput, String intelligenceInput, String genderInput) {
		hair.getHairColour(hairColourInput);
		hair.getHairAmount(hairAmountInput);
		//hair.getRandomGene(hair.currentHairColourDNA);
		eyes.getEyeColour(eyeColourInput);
		eyes.getEyeSize(eyeSizeInput);
		//eyes.getRandomGene(eyes.currentEyeColourDNA);
		face.getNoseSize(noseSizeInput);
		face.getEarLobe(earLobeInput);
		body.getHeight(heightInput);
		body.getBodyType(bodyTypeInput);
		body.getSkinColour(skinColourInput);
		personality.getOutlook(outlookInput);
		personality.getIntelligence(intelligenceInput);
		gender.getGender(genderInput);
	}	
}
