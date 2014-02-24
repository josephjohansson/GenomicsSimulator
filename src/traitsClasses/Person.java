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
		eyes.getEyeColour(eyeColourInput);
		eyes.getEyeSize(eyeSizeInput);
		face.getNoseSize(noseSizeInput);
		face.getEarLobe(earLobeInput);
		body.getHeight(heightInput);
		body.getBodyType(bodyTypeInput);
		body.getSkinColour(skinColourInput);
		personality.getOutlook(outlookInput);
		personality.getIntelligence(intelligenceInput);
		gender.getGender(genderInput);
	}
	public String getGeneticMaterial(){
		return (eyes.getRandomGene(eyes.currentEyeColourDNA)
				+eyes.getRandomGene(eyes.currentEyeSizeDNA)
				+hair.getRandomGene(hair.currentHairColourDNA)
				+hair.getRandomGene(hair.currentAmountOfHairDNA)
				+face.getRandomGene(face.currentNoseSizeDNA)
				+face.getRandomGene(face.currentEarLobeDNA)
				+body.getRandomGene(body.currentHeightDNA)
				+body.getRandomGene(body.currentBodyTypeDNA)
				+body.getRandomGene(body.currentSkinColourDNA)
				+personality.getRandomGene(personality.currentOutlookDNA)
				+personality.getRandomGene(personality.currentIntelligenceDNA)
				+gender.getRandomGene(gender.currentGenderDNA)
				);
	}
}
