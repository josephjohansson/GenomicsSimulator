package Tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.junit.Test;

import BabyCreation.BabyRandomizer;

public class babyTester {

	@Test
	public void testGenerateChildsTrait() {
		Random generator = new Random();
		boolean correctValue;
		for (int stringOneRuns = 1; stringOneRuns<10; stringOneRuns++){
			String inputOne = UUID.randomUUID().toString();
			for(int stringTwoRuns = 1; stringTwoRuns<10; stringTwoRuns++){
				String inputTwo = UUID.randomUUID().toString();
				for (int intOneRuns = 1; intOneRuns<10; intOneRuns++){
					int intInputOne = generator.nextInt(11);
					for (int intTwoRuns = 1; intTwoRuns<10; intTwoRuns++){
						int intInputTwo = generator.nextInt(11);
						String actualTrait = BabyRandomizer.generateChildsTrait(intInputOne, intInputTwo, inputOne, inputTwo);
						List<String> possibleOutComes = Arrays.asList(inputOne,inputTwo);
						if (possibleOutComes.contains(actualTrait)){
							correctValue = true;
						}
						else{
							correctValue = false;
						}
						assertTrue("The gene does not match", correctValue);
					}
				}
			}
		}
		
	}

}
