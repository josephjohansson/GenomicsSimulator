package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import gui.ImageFinder;

import java.util.UUID;

public class ImageFinderTest {
	
	String randomString1 = UUID.randomUUID().toString();
	String randomString2 = UUID.randomUUID().toString();
	String randomString3 = UUID.randomUUID().toString();
	String[] testArray = new String[13];
	
	@Test
	public void findEyesImageNameTest() {
		testArray[1] = randomString1;
		testArray[5] = randomString2;
		testArray[2] = randomString3;
		String expectedURL = "GenomicsImages/"+testArray[1]+testArray[5]+testArray[2]+"Eyes.gif";
		String actualURL = ImageFinder.findEyesImageName(testArray);
		assertTrue("The URL's are not the same", expectedURL.equals(actualURL));
	}
	@Test
	public void findBodyImageNameTest(){
		testArray[1] = randomString1;
		testArray[5] = randomString2;
		testArray[6] = randomString3;
		String expectedURL = "GenomicsImages/"+testArray[1]+testArray[5]+testArray[6]+"Body.gif";
		String actualURL = ImageFinder.findBodyImageName(testArray);
		assertTrue("The URL's are not the same"+expectedURL+"does not equal"+actualURL, expectedURL.equals(actualURL));
	}
	@Test
	public void findHiarImageNameTest(){
		testArray[1] = randomString1;
		testArray[5] = randomString2;
		testArray[9] = randomString3;
		String expectedURL = "GenomicsImages/"+testArray[1]+testArray[5]+testArray[9]+"Hair.gif";
		String actualURL = ImageFinder.findHairImageName(testArray);
		assertTrue("The URL's are not the same", expectedURL.equals(actualURL));
	}
}
