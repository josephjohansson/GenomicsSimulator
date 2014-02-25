package Tests;

import static org.junit.Assert.*;

import org.junit.Test;
import BabyCreation.BabyRandomizer;

public class babyTester {

	@Test
	public void testGenerateChildsTrait() {
		BabyRandomizer.generateChildsTrait(mothersTraitChance, fathersTraitChance, mothersTrait, fathersTrait)
	}

}
