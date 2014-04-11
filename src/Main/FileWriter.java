package Main;
import javax.swing.filechooser.*;
import javax.swing.*;
import java.io.*;
import people.*;
public class FileWriter {
   /**
	 * use a dialog box to select a text file (.txt)
	 * @return a PrintStream for the selected file, or null if cancel selected
	 */
	public static PrintStream selectTextFile() {
		do {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Text files", "txt");
			chooser.setFileFilter(filter);
			int returnVal = chooser.showSaveDialog(null);
			try {
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					return new PrintStream(chooser.getSelectedFile());
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
   public static void writeFile(Person personToSave) {
	   PrintStream outputStream = FileWriter.selectTextFile();
	   if (outputStream!=null) {
		   outputStream.println(personToSave.getGeneticMaterial());
		   outputStream.close();
	   }
   }
}