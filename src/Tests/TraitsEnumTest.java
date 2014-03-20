package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import traitsClasses.Traits;
import java.util.List;

public class TraitsEnumTest {
	Traits[] allTraits = new Traits[12];
	Traits eyeColour = Traits.EYE_COLOUR;
	Traits eyeSize = Traits.EYE_SIZE;
	Traits height = Traits.HEIGHT;
	Traits bodyType = Traits.BODY_TYPE;
	Traits skinColour = Traits.SKIN_COLOUR;
	Traits noseSize = Traits.NOSE_SIZE;
	Traits earlobe = Traits.EARLOBE;
	Traits hairColour = Traits.HAIR_COLOUR;
	Traits hairAmount = Traits.HAIR_AMOUNT;
	Traits outlook = Traits.OUTLOOK;
	Traits intel = Traits.INTEL;
	Traits gender = Traits.GENDER;
	
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
		for (Traits actualTrait: allTraits){
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
		for (Traits actualTrait: allTraits){
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
		for (Traits actualTrait: allTraits){
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
