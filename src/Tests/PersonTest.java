package Tests;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import people.Father;
import people.Person;
import traitsClasses.Traits;

public class PersonTest {
	@Test
	public void getNameTest() {
		Person testPerson = new Person();
		assertEquals("the names don't match", "Person", testPerson.getName());
	}
	@Test
	public void getAllTraitsTest(){
		Traits gender = Traits.GENDER;
		Traits eyeColour = Traits.EYE_COLOUR;
		Traits eyeSize = Traits.EYE_SIZE;
		Traits height = Traits.HEIGHT;
		Traits skinColour = Traits.SKIN_COLOUR;
		Traits noseSize = Traits.NOSE_SIZE;
		Traits earlobe = Traits.EARLOBE;
		Traits hairColour = Traits.HAIR_COLOUR;
		Traits hairAmount = Traits.HAIR_AMOUNT;
		Traits outlook = Traits.OUTLOOK;
		Traits intelligence = Traits.INTEL;
		Traits[] allTraits = {null,
					gender,
					eyeColour,
					eyeSize,
					height,
					skinColour,
					noseSize,
					earlobe,
					hairColour,
					hairAmount,
					outlook,
					intelligence};
		Person testPerson = new Person();
		assertEquals("the traits arrya don't match", allTraits, testPerson.getAllTraits());
	}
}
