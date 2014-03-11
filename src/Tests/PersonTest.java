package Tests;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;

import traitsClasses.TraitsEnum;
import traitsClasses.Person;

public class PersonTest {
	TraitsEnum[] allTraits = new TraitsEnum[13];
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
	String[] taritsAsStrings = new String[12];
	@Test
	public void PersonTest() {
		allTraits[0] = null;
		allTraits[1] = eyeColour;
		allTraits[2] = eyeSize;
		allTraits[3] = height;
		allTraits[4] = bodyType;
		allTraits[5] = skinColour;
		allTraits[6] = noseSize;
		allTraits[7] = earlobe;
		allTraits[8] = hairColour;
		allTraits[9] = hairAmount;
		allTraits[10] = outlook;
		allTraits[11] = intel;
		allTraits[12] = gender;
		String[] stringTraitList = new String[13];
		stringTraitList[0] = "testName";
		for (int index = 1; index<12; index++){
			TraitsEnum currentTrait= allTraits[index];
			List<String> traitSet = currentTrait.getTraitSet();
			int traitNumber = new Random().nextInt(traitSet.size()-1);
			String currentTraitString = traitSet.get(traitNumber+1);
			stringTraitList[index] = currentTraitString;
		}
		int index = 1;
		Person testPerson = new Person(stringTraitList);
		for(TraitsEnum traitunderTest: testPerson.getAllTraits()){
			assertEquals("the traits don't match",stringTraitList[index],traitunderTest.getCurrentTrait());
			index++;
		}
	}

}
