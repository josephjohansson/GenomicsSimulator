package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import people.Person;

public class PersonTest {

	@Test
	public void getNameTest() {
		Person testPerson = new Person();
		assertEquals("the names don't match", "Person", testPerson.getName());
	}

}
