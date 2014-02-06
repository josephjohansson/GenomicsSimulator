public Class Randomizer{
	//this is assuming that the baby, mother, and father "Person"s have been made
	public String generateChildsDNA(int mothersTraitChance fathersTraitChance){
		Random generator= new Random();
		//Randomly takes a number between 1 and the sum of the parent's trait chance number
		int chance=generator.nextInt(1;(mothersTraitChance+fathersTraitChance));
		if (chance >= mothersTraitChance){
			String passingTrait = "mother";
		else {
			passingTrait = "father";
		}
		return passingTrait;
		
	}
	
	
	
	

}