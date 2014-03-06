//*****************************************************
// Evanna Wong A00807066 Set A 
//
// StringManips.java
// Test several methods for manipulating String objects
//*****************************************************

import java.util.Scanner;
public class StringManips
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String phrase = new String("This is a String test.");
        
        //variable declaration
        int phraseLength;
        int middleIndex;
        String firstHalf;
        String secondHalf;
        String middle3;
        String switchedPhrase; 
        String city;
        String state;
        
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2; 
        
        
        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(" ", "*");
              
        //print out information about the phrase
        System.out.println();
        System.out.println();
        System.out.println("Original phrase: " + phrase);
        System.out.println("Length of the phrase: " + phraseLength +
        " characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " +
        phrase.charAt(middleIndex));
        System.out.println("The middle three characters are: " + middle3);
        System.out.println("Switched phrase: " + switchedPhrase);
        System.out.println();
        
        // Asks for hometown
        System.out.println("Enter your city: ");
        city = scan.nextLine();       
        System.out.println("Enter your state: ");
        state = scan.nextLine();
        
        state = state.toUpperCase();
        city = city.toLowerCase(); 
        
        //prints out hometown
        System.out.println(state + city + state);
        
        scan.close();
    }
    
}