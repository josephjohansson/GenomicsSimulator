package Main;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class FileChooser{
	public static Scanner selectTextFile() {
	   do {
	      JFileChooser chooser = new JFileChooser();
      FileNameExtensionFilter filter = new FileNameExtensionFilter(
         "Text/Java files", "txt");
      chooser.setFileFilter(filter);
      int returnVal = chooser.showOpenDialog(null);
			try {
         if(returnVal == JFileChooser.APPROVE_OPTION) {
		         return new Scanner(chooser.getSelectedFile());
         } 
		   else {
		         return null;
			   }
			}
			catch (FileNotFoundException e) {
			   JOptionPane.showMessageDialog(null, "Invalid file!",
				   "error", JOptionPane.ERROR_MESSAGE); 
			}
		} while (true);
	}
	public static String changeComboBoxes(){
		Scanner lineScanner = FileChooser.selectTextFile();
		String DNA = lineScanner.nextLine();
		return DNA;
	}

}