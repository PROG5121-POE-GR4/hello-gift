
package poepart1;

import java.util.Scanner;

public class POEPart1 {

  
    public static void main(String[] args)
    {
       String firstName, lastName, userName;
       //Below I am declaring my constants
       final int NUM_UPPERCASE_LETTER = 1; // We need one uppercase letter
       final int NUM_LOWERCASE_LETTER = 5; // Three lowercase letters are needed
       final int NUM_DIGIT = 1; // One digit included
       final int SPECIAL_CHARACTER = 1;
       final int LETTER_COUNT = 8;
       // Then we declare variables that will keep track of the upper count, lower count, digit count and letter count.
       int upperCount = 0;
       int lowerCount = 0;
       int digitCount = 0;
       int letterCount = 0;
       int specialCharacter = 0;
       Scanner inputDevice = new Scanner(System.in);
       System.out.print("Enter your first name: ");
       firstName = inputDevice.nextLine(); // This allows the user to enter an input of the first name 
       System.out.print("Enter your last name: ");
       lastName = inputDevice.nextLine(); // This allows the user to enter an input of the last name
       System.out.print("Enter your user name: ");
       userName = inputDevice.nextLine(); //This allows the user to enter an input of the user name
       if (userName.length()<=5 && userName.contains("_"))
           System.out.println("Succefully captured the username");
       else
       {
           System.out.println("Username is not corectly formated, please check whether the username includes an underscore and should be no more than 5 characters long");
       }
       Scanner in = new Scanner(System.in); // Scanner object accepts input from the user
       System.out.print("Please enter your password: "); //Prompting the user to enter the password
       String input = in.nextLine();
       int inputLen = input.length(); // This will give us the complete lengh of the input string
       //Character:
       for(int i=0;i<inputLen;i++)
       {
           char ch = input.charAt(i);//We are declaring a character variable which will go to the input string and will grab one letter at the time 
           if (Character.isUpperCase(ch))
               upperCount++; // if the character is uppercase increement the upperCount by one 
           else if (Character.isLowerCase(ch))
               lowerCount++; // if the the character is lowercase increement the lowerCount by one
           else if (Character.isDigit(ch))
               digitCount++; // if the character is a digit increement the digitCount by one
           else if (!Character.isLetterOrDigit(ch))
               specialCharacter++; // increement the special character if the password doesnt contain a letter or digit
           
               
           
       }
           if(upperCount == NUM_UPPERCASE_LETTER && lowerCount >= NUM_LOWERCASE_LETTER && digitCount == NUM_DIGIT && specialCharacter == SPECIAL_CHARACTER)
               System.out.println("Password successfully captured"); // if the password entered by the user matches the if statement above the output will be successful
           else
           {
               // if the case is not true then an error message will occur to show the problem of the password
               System.out.println("Password did not have enough of the following: ");
               if (upperCount != NUM_UPPERCASE_LETTER)
                   System.out.println("Uppercase letter");//the output will indicate when the user did not include a Capital letter
               if (lowerCount < NUM_LOWERCASE_LETTER)
                   System.out.println("Lowercase letters");//the output will indicate when the user did not include enough lowercase letters
               if (digitCount != NUM_DIGIT)
                   System.out.println("Digit");//the output will indicate when the user did not include a digit
               if (specialCharacter != SPECIAL_CHARACTER)
                   System.out.println("Special character");//the output will indicate whether the user did not include a special character
           }
           if(upperCount == NUM_UPPERCASE_LETTER && lowerCount == NUM_LOWERCASE_LETTER && digitCount == NUM_DIGIT && specialCharacter == SPECIAL_CHARACTER && userName.length()<=5 && userName.contains("_") )
               System.out.println("Welcome "+ firstName + " "+ lastName + " it is great to see you again");//the output message that will display if the username and password are typed correctly
           else
           {
               System.out.println("Username or password incorrect, please try again.");//the output message that will display if the username or password is incorrect.
           }
    }
    
}
