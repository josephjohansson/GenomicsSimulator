package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import traitsClasses.Eyes;

import java.util.List;
import java.util.Arrays;

public class traitsTest {

	@Test
	public void testGetEyeColour() {
		List<String> listOfTraits = Arrays.asList("brown","blue","green","purple","grey","hazel");
		int listSize = listOfTraits.size();
		for (int currentTrait = 1; currentTrait<listSize; currentTrait++){
			String expectedTrait = listOfTraits.get(currentTrait);
			Eyes testEyes = new Eyes();
			testEyes.getEyeColour(expectedTrait);
			assertEquals("Eyes not "+expectedTrait, expectedTrait, testEyes.currentEyeColour);
		}
	}

	@Test
	public void testGetEyeSize() {
		List<String> listOfTraits = Arrays.asList("large","medium","small");
		int listSize = listOfTraits.size();
		for (int currentTrait = 1; currentTrait<listSize; currentTrait++){
			String expectedTrait = listOfTraits.get(currentTrait);
			Eyes testEyes = new Eyes();
			testEyes.getEyeSize(expectedTrait);
			assertEquals("Eyes not "+expectedTrait, expectedTrait, testEyes.currentEyeSize);
		}
	}

	//@Test
	//public void testPrintOutEyeColour() {
		//for (int currentTrait = 1; currentGene<)
		//fail("Not yet implemented");
	//}

	//@Test
	//public void testPrintOutEyeSize() {
		//fail("Not yet implemented");
	//}

	@Test
	public void testGetRandomGene() {
		Eyes testEyes = new Eyes();
		List<List<String>> listOfDNALists = Arrays.asList(testEyes.BROWN_EYES_DNA, testEyes.BLUE_EYES_DNA,testEyes.GREEN_EYES_DNA,testEyes.HAZEL_EYES_DNA,testEyes.GREY_EYES_DNA,testEyes.PURPLE_EYES_DNA);
		int listSize = listOfDNALists.size();
		for (int currentDNA = 1; currentDNA<listSize; currentDNA++){
			 
			List<String> DNAList = listOfDNALists.get(currentDNA);
			int DNAListSize = DNAList.size();
			for (int currentTrait = 1; currentTrait<DNAListSize; currentTrait++){
				String actualGene = testEyes.getRandomGene(DNAList);
				String expectedGene = DNAList.get(testEyes.geneNumber);
				assertEquals("The Genes are not equal",expectedGene, actualGene);
			}
		}
	}

}
