package Images;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisplayImagesTest {

	@Test
	public void test() {
		
		String[] traits = new String[13];
		traits[0]= "Thomas";
		traits[1]= "Male";
		traits[2]= "Green";
		traits[3]= "Average";
		traits[4]= "Small";
		traits[5]= "Average";
		traits[6]= "Fair";
		traits[7]= "Small";
		traits[8]= "Detached";
		traits[9]= "Blonde";
		traits[10]= "Hairy";
		traits[11]= "Positive";
		traits[12]= "Intelligent";
		
		new DisplayImages(traits);
	}

}
