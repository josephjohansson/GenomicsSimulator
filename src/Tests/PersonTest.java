package Tests;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;

import traitsClasses.TraitsEnum;
import traitsClasses.Person;

public class PersonTest {
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
	String[] taritsAsStrings = new String[12];
	@Test
	public void PersonTest() {
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
		for (TraitsEnum currentTrait: allTraits){
			List<String> traitSet = currentTrait.getTraitSet();
			int traitNumber = new Random().nextInt(traitSet.size()-1);
			String currentTraitString = traitSet.get(traitNumber+1);
		}
		Person testPerson = new Person(allTraits);
		
		fail("Not yet implemented");
	}

}
