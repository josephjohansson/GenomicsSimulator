package Tests;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.UUID;

import org.junit.Test;

import BabyCreation.BabyRandomizer;

public class babyTester {

	@Test
	public void testGenerateChildsTrait() {
		Random generator = new Random();
		for (int stringOneRuns = 1; stringOneRuns<10; stringOneRuns++){
			String inputOne = UUID.randomUUID().toString();
			for(int stringTwoRuns = 1; stringTwoRuns<10; stringTwoRuns++){
				String inputTwo = UUID.randomUUID().toString();
				for (int intOneRuns = 1; intOneRuns<10; intOneRuns++){
					int intInputOne = generator.nextInt();
					for (int intTwoRuns = 1; intTwoRuns<10; intTwoRuns++){
						int intInputTwo = generator.nextInt();
						String actualTrait = BabyRandomizer.generateChildsTrait(intInputOne, intInputTwo, inputOne, inputTwo);
						String expectedTraits
					}
				}
			}
		}
		
	}

}
