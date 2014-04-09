package Main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

@SuppressWarnings("serial")
public class FileChooser extends JFrame{
	public File fileToRead(){
		
		
		

	     JFileChooser chooser = new JFileChooser();
	     int option = chooser.showOpenDialog(FileChooser.this);
	     try{
		     if (option == JFileChooser.APPROVE_OPTION) {
		    	 File readFile = chooser.getSelectedFile();
		    	 return readFile;
		     }
		     else{
		    	 return null;
		     }
	     }
	     catch(FileNotFoundException e){
	    	 System.out.println("Error opening file");
	    	 
	     }
	}
	
    public void readFile(File file) throws FileNotFoundException{
	    if(file.isFile()){
	    		Scanner fileScanner = new Scanner(file);
	    		
	    		
	    	
	    
	    	
	    }
	    
	    		 
	    		 
	}
	
}