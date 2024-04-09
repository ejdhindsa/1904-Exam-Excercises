// import statements
import java.util.Scanner;

public class UniversityCodeChecker
{
    public static void main (String[] args)
    {
        // creating a scanner and taking user input
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your Course Code: ");
        String userInput = kb.next();

        // checking the string using a method
        StringChecker(userInput);

        System.out.println("The course code is in the correct format.");

    } // end of main

    // custom method to check if the string is valid
    public static void StringChecker(String userInput)
    {
        // checking if the string is not null
        assert userInput != null : "The provided input is null";

        // now checking other criterias of the input
        // converting the userInput to a char array
        char[] userInputArray = userInput.toCharArray();

        // firstly checking for the first course name
        for (int i = 0; i < 3; i++)
        {
            if(!Character.isLetter(i))
            {
                throw new IllegalArgumentException("Course Name is not in the correct format");
            } // end of if

        } // end of for loop

        for (int i = 4; i < 8; i++)
        {
            if(!Character.isDigit(i))
            {
                throw new IllegalArgumentException("Course Code is not in the correct format");
            } // end of if

        } // end of for loop

        for (int i = 9; i < 12; i++)
        {
            if(!Character.isDigit(i))
            {
                throw new IllegalArgumentException("Course Section is not in the correct format");
            } // end of if

        } // end of for loop

        // checking for dashes
        if (userInputArray[3] != '-' || userInputArray[8] != '-')
        {
            throw new IllegalArgumentException("Dashes are not in the correect places");
        } // end of if

    } // end of StringChecker()
    
} // end of class
