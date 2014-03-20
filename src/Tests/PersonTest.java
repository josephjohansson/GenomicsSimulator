package Tests;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;

import people.Person;
import traitsClasses.Traits;

public class PersonTest {
	Traits[] allTraits = new Traits[13];
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
	String[] taritsAsStrings = new String[12];
	@Test
	public void PersonTester() {
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
			Traits currentTrait= allTraits[index];
			List<String> traitSet = currentTrait.getTraitSet();
			int traitNumber = new Random().nextInt(traitSet.size()-1);
			String currentTraitString = traitSet.get(traitNumber+1);
			stringTraitList[index] = currentTraitString;
		}
		int index = 1;
		Person testPerson = new Person();
		testPerson.convertStringsToTraits(stringTraitList);
		
		/*for(TraitsEnum traitunderTest: testPerson.getAllTraits()){
			System.out.println(stringTraitList[index]);
			System.out.println(traitunderTest.getCurrentTrait());
			assertEquals("the traits don't match",stringTraitList[index],traitunderTest.getCurrentTrait());
			index++;
		}
		*/
	}

}
