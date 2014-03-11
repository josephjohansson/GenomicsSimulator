package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import traitsClasses.TraitsEnum;
import java.util.List;

public class TraitsEnumTest {
	TraitsEnum[] allTraits = new TraitsEnum[12];
	TraitsEnum eyeColour = TraitsEnum.EYE_COLOUR;
	TraitsEnum eyeSize = TraitsEnum.EYE_SIZE;
	TraitsEnum height = TraitsEnum.HEIGHT;
	TraitsEnum bodyType = TraitsEnum.BODY_TYPE;
	TraitsEnum skinColour = TraitsEnum.SKIN_COLOUR;
	TraitsEnum noseSize = TraitsEnum.NOSE_SIZE;
	TraitsEnum earlobe = TraitsEnum.EARLOBE;
	TraitsEnum hairColour = TraitsEnum.HAIR_COLOUR;
	TraitsEnum hairAmount = TraitsEnum.HAIR_AMOUNT;
	TraitsEnum outlook = TraitsEnum.OUTLOOK;
	TraitsEnum intel = TraitsEnum.INTEL;
	TraitsEnum gender = TraitsEnum.GENDER;
	
	@Test
	public void setCurrentTraitTest() {
		allTraits[0] = eyeColour;
		allTraits[1] = eyeSize;
		allTraits[2] = height;
		allTraits[3] = bodyType;
		allTraits[4] = skinColour;
		allTraits[5] = noseSize;
		allTraits[6] = earlobe;
		allTraits[7] = hairColour;
		allTraits[8] = hairAmount;
		allTraits[9] = outlook;
		allTraits[10] = intel;
		allTraits[11] = gender;
		for (TraitsEnum actualTrait: allTraits){
			List<String> listOfPossibleTraits = actualTrait.getTraitSet();
			for(String possibleTrait: listOfPossibleTraits){
				actualTrait.setCurrentTrait(possibleTrait);
				assertEquals("The traits did not match", possibleTrait, actualTrait.getCurrentTrait());				
			}
		}
	}
	@Test
	public void chooseRandomGeneTest(){
		allTraits[0] = eyeColour;
		allTraits[1] = eyeSize;
		allTraits[2] = height;
		allTraits[3] = bodyType;
		allTraits[4] = skinColour;
		allTraits[5] = noseSize;
		allTraits[6] = earlobe;
		allTraits[7] = hairColour;
		allTraits[8] = hairAmount;
		allTraits[9] = outlook;
		allTraits[10] = intel;
		allTraits[11] = gender;
		for (TraitsEnum actualTrait: allTraits){
			List<String> listOfPossibleTraits = actualTrait.getTraitSet();
			for(String possibleTrait: listOfPossibleTraits){
				actualTrait.setCurrentTrait(possibleTrait);
				List<String> ActualDNA = actualTrait.determineCurrentDNA(possibleTrait);
				assertTrue("The Genes did not match", ActualDNA.contains(actualTrait.chooseRandomGene()));				
			}
		}
	}
	@Test
	public void determineCurrentTraitTest(){
		allTraits[0] = eyeColour;
		allTraits[1] = eyeSize;
		allTraits[2] = height;
		allTraits[3] = bodyType;
		allTraits[4] = skinColour;
		allTraits[5] = noseSize;
		allTraits[6] = earlobe;
		allTraits[7] = hairColour;
		allTraits[8] = hairAmount;
		allTraits[9] = outlook;
		allTraits[10] = intel;
		allTraits[11] = gender;
		for (TraitsEnum actualTrait: allTraits){
			List<String> listOfPossibleTraits = actualTrait.getTraitSet();
			for(String possibleTrait: listOfPossibleTraits){
				actualTrait.setCurrentTrait(possibleTrait);
				List<String> currentDNA = actualTrait.determineCurrentDNA(possibleTrait);
				String actualGene = actualTrait.determineCurrentTrait(currentDNA);
				assertTrue("The Genes did not match", currentDNA.contains(actualGene));				
			}
		}
	}
}
