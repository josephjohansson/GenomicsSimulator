package Main;
import java.io.*;
import java.util.Scanner;

import traitsClasses.Person;
	
public class TextFile {
	public static boolean Check(String fileName){
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
	    
	public static void Create(Person human){
	    PrintWriter outputStream = null;
	    
	    String fileName = human.name+ ".txt";
	            
	    boolean validFile= Check(fileName);
	    if (!validFile){
	        try{
	        outputStream = new PrintWriter(fileName);
	        }
	        catch(FileNotFoundException e){
	        	System.out.println("Error opening file" + fileName);
	            System.exit(0);
	        }
	           
	        outputStream.println(human.name +"'s DNA Sequence: ");
	        
	        outputStream.close();
	        System.out.println(fileName +" was created");
	    }
	    else{
	        System.out.println("'" + fileName + "' already exists");
	    }
	}
	    
	    
	public static void Reader(Person human){
	    Scanner inputStream = null;

	    String fileName = human.name+ ".txt";
	        
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

	public static void Append(Person human){

	    PrintWriter outputStream = null;
	    String fileName = human.name +".txt";
	        
	    boolean validFile= Check(fileName);
	    if (validFile){
	    	try{
	            outputStream = new PrintWriter(new FileOutputStream(fileName, true));
	        }
            catch(FileNotFoundException e){
            	System.out.println("Error opening file" + fileName);
	            System.exit(0);
	        }
	        
	    	outputStream.print(human.getGeneticMaterial());
	            
	        outputStream.close();
	        System.out.println("Writing to " +fileName +" is complete");
	    }
	}
}
	
