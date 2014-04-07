package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import babyCreation.BabyRandomizer;

import java.util.UUID;
import java.util.Random;


public class BabyRandomizerTest {

	@Test
	public void BabyRandmizerTest() {
		Random randomGenerator = new Random();
		String randomString1 = UUID.randomUUID().toString();
		String randomString2 = UUID.randomUUID().toString();
		String babyTrait = BabyRandomizer.generateChildsTrait(randomGenerator.nextInt(), randomGenerator.nextInt(), randomString1, randomString2);
		assertTrue("The Traits generated don't match the traits outputted",
					 randomString1.equals(babyTrait)
					 ||
					 randomString2.equals(babyTrait)
					 );
	}
}
