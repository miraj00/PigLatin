package piglatin.tdd;

//import java.util.*;
import java.util.Scanner;

public class PigLatin {

	
   // public static String modifiedString;
	
	
	public static void translate (String userInput) {
		

		 String incomingString = userInput.toLowerCase();
		 
	//	 System.out.println(incomingString);	
		 
		 
		 if ((incomingString.charAt(0) == 'a' || incomingString.charAt(0) == 'e' || incomingString.charAt(0) == 'i' || incomingString.charAt(0) == 'o' || incomingString.charAt(0) == 'u') && (incomingString.charAt(1) == 'a' || incomingString.charAt(1) == 'e' || incomingString.charAt(1) == 'i' || incomingString.charAt(1) == 'o' || incomingString.charAt(1) == 'u') ) {
			
			 String newString =  incomingString.substring(2);
	 			
     	 	 newString += "" + incomingString.charAt(0) + incomingString.charAt(1) ;
			 
			 String modifiedString = newString.concat("way"); 
			 
			 System.out.println("The Pig Latin for word starting with first two letter of Vowels is :" + modifiedString);

			 
			 
			 
		 } else if (incomingString.charAt(0) == 'a' || incomingString.charAt(0) == 'e' || incomingString.charAt(0) == 'i' || incomingString.charAt(0) == 'o' || incomingString.charAt(0) == 'u')  {
			 
			 String newString =  incomingString.substring(1);
					 			
     	 	 newString += "" + incomingString.charAt(0);
			 
			 String modifiedString = newString.concat("way"); 
			 
			 System.out.println("The Pig Latin for word starting with Vowel is :" + modifiedString);
						 
		 } 
		 
 
		 
		 else {
			 String modifiedString =  incomingString.concat("way");
			 System.out.println("The Pig Latin for word starting with constant is :" + modifiedString);
			 			 
		 }
	 // return modifiedString;	 

	}
		
	
	public static void main(String[] args) {
		 
			 
			Scanner scnr = new Scanner(System.in);	
			
			System.out.println("Please Enter word to convert to Pig Latin: ");
			String word = scnr.nextLine();
			
			translate(word);
						
			scnr.close(); 
		 }
			
}

















