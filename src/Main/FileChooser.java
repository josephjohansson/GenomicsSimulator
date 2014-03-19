package Main;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FileChooser extends JFrame{
	 public FileChooser(){
	 super("File Chooser");

	 JPanel buttonPanel = new JPanel();
	 JButton openButton = new JButton("Open");
	 JButton saveButton = new JButton("Save");
	 final JTextArea actionLog = new JTextArea(5,20);
	 	actionLog.setEditable(false);
	 	actionLog.setMargin(new Insets (5,5,5,5));
	 	
	 // file chooser opens as Open dialog
	 openButton.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent openFile) {
	     JFileChooser chooser = new JFileChooser();
	     int option = chooser.showOpenDialog(FileChooser.this);
	     if (option == JFileChooser.APPROVE_OPTION) {
	       File[] selectedFile = chooser.getSelectedFiles();
	       String filelist = " ";
	       if (selectedFile.length > 0) filelist = selectedFile[0].getName();
	       for (int i = 1; i < selectedFile.length; i++) {
	         filelist += ", " + selectedFile[i].getName();
	       }
	     }
	     else if(option == JFileChooser.CANCEL_OPTION) {
	       actionLog.append("Action canceled \n");
	     }
	     else{
	    	 actionLog.append("Error opening file \n");
	     }
	   }
	 });

	 // file chooser opens as Save dialog
	 saveButton.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent saveFile) {
	     JFileChooser chooser = new JFileChooser();
	     int option = chooser.showSaveDialog(FileChooser.this);
	     if (option == JFileChooser.APPROVE_OPTION) {
	       actionLog.append(((chooser.getSelectedFile()!=null)?
	                         chooser.getSelectedFile().getName():"nothing \n"));
	     }
	     else if (option==JFileChooser.CANCEL_OPTION) {
	       actionLog.append("Action canceled\n");
	     }
	     else{
	    	 actionLog.append("Error saving file \n");
	     }
	   }
	 });

	 
// adds components to layout
	 buttonPanel.add(openButton);
	 buttonPanel.add(saveButton);
	 add(buttonPanel, BorderLayout.NORTH);
	 add(actionLog, BorderLayout.CENTER);
	 
	 pack();
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

// initializes filechooser called test
	 //public static void main(String args[]) {
	 //FileChooser test = new FileChooser();
	 //test.setVisible(true);
	//}
}