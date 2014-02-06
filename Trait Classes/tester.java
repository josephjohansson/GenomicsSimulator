public class tester{
	public static void main(String[]args){
		Eyes e = new Eyes();
		e.getColour("brown");
		e.getEyeColourDNA(e.currentDNA);
		e.getSize("large");
		Hair h = new Hair();
		h.getHairColourDNA("GG");
		h.getHairColour("brown");
		h.getAmmount("large");

	}
}