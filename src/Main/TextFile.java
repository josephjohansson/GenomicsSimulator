package Main;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
	
public class TextFile {
	public boolean Check(String fileName){
		boolean fileExists = false;
	    File fileObject = new File(fileName);
	    
	    if (!fileObject.exists()){
	    }
	    else if (!fileObject.canRead()){
	        System.out.println("That file is not readable");
	    }
	    else{
	        fileExists = true;
	    }
	    return fileExists;
	}
	    
	public void Create(String name){
	    PrintWriter outputStream = null;
	    String fileName = name+ ".txt";
	            
	    boolean validFile= Check(fileName);
	    if (!validFile){
	        try{
	        outputStream = new PrintWriter(fileName);
	        }
	        catch(FileNotFoundException e){
	        	System.out.println("Error opening file" + fileName);
	            System.exit(0);
	        }
	           
	        outputStream.println(name +"'s DNA Sequence: ");
	        
	        outputStream.close();
	        System.out.println(fileName +" was created");
	    }
	    else{
	        System.out.println("'" + fileName + "' already exists");
	    }
	}
	    
	    
	public void Reader(String name){
	    Scanner inputStream = null;

	    String fileName = name+ ".txt";
	        
	    boolean validFile= Check(fileName);
	    if (validFile){
	        try{
	        	inputStream = new Scanner(new File(fileName));
	        }
	            
	        catch(FileNotFoundException e){
	        	System.out.println("Error opening file " + fileName);
	            System.exit(0);
	        }
	            
	        while(inputStream.hasNextLine()){
	        	String line = inputStream.nextLine();
	            System.out.println(line);
	        }
	        inputStream.close();
	    }
	}

	public void Append(String name, String Gene){

	    PrintWriter outputStream = null;
	    String fileName = name +".txt";
	        
	    boolean validFile= Check(fileName);
	    if (validFile){
	    	try{
	            outputStream = new PrintWriter(new FileOutputStream(fileName, true));
	        }
            catch(FileNotFoundException e){
            	System.out.println("Error opening file" + fileName);
	            System.exit(0);
	        }
	        
	    	outputStream.print(Gene);
	            
	        outputStream.close();
	        System.out.println("They were written to " +fileName);
	    }
	    else{
	    	System.out.println("No such file exists");
	    }
	}
	
}
