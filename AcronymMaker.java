// import statements
import java.util.Scanner;

public class AcronymMaker
{
    public static void main(String[] args)
    {
        // taking userInput to create an acronym
        Scanner kb = new Scanner(System.in);
        
        // now setting the user input as the next line so that it takes the
        // whole line as teh string
        System.out.println("Enter the words to be Acronymed: ");
        String userInput = kb.nextLine();
        
        // now that we have the userInput, we will split it from spaces and then
        // add it to an array
        String[] splitUserInput = userInput.split("[ ]+");
        
        // creating arrary to hold uppercase values
        String[] acronymHolder = new String[splitUserInput.length];
        
        // now that the string is split, we will capitalise the first letter
        for (int i = 0; i < splitUserInput.length; i++)
        {
            String stringLetters[] = splitUserInput[i].split("");
            
            acronymHolder[i] = stringLetters[0].toUpperCase();
            
        } // end of for
        
        // using for-each loop to print everything
        for (String s : acronymHolder)
        {
            System.out.print(s);
        } // end of for-each
        
    } // end of main
    
} // end of class