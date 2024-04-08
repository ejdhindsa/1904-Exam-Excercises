import java.util.Scanner;
import java.lang .IllegalArgumentException ;

public class NumnberInStringChecker
{
    public static void main (String[] args) throws IllegalArgumentException
    {
        // asking for a userInput through a scanner
        Scanner kb = new Scanner(System.in);

        // accepting the userInput in a String and then passing it through the required method
        String userInput = kb.next();
        kb.close();
        
        // calling the method
        int numberOfIntegers = countDigits(userInput);

        System.out.println("There are " + numberOfIntegers + " in the provided string.");
    } // end of main

    public static int countDigits(String line) throws IllegalArgumentException
    {
        // claiming an insert statement that the user provided string is not null
        assert line == null : "The string input is null";

        // creating the program in such a manner that it will count the numbers
        // and if the number of integers is 0; it will throw an IllegalArgumentException
        char[] characters = line.toCharArray();
        int numbers = 0;

        // starting a for loop to go through each character in the array
        for (int i = 0; i < characters.length; i ++)
        {
            if (Character.isDigit(i))
            {
                numbers++;
            } // end of if conditions
            System.out.println(numbers);

        } // end of for loop

        if (numbers <= 0)
        {
            throw new IllegalArgumentException("There are no numbers in the provided string.");
        } // end of if

        return numbers;
    } // end of countDigits

} // end of class