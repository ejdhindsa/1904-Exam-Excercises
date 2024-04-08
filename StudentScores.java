import java.util.Scanner;

public class StudentScores
{
    public static void main(String[] args)
    {
        // creating arrays for correct and student answers
        char[] correctAnswers = {'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd'};

        // creating a scanner that will take user input
        Scanner kb = new Scanner(System.in);

        // now starting a for loop that will go through the array
        // and appends the counter adding to the correct answer
        int correctAnswerCount = 0;

        for (int i = 0; i < correctAnswers.length; i++)
        {
            char c = kb.next().charAt(0);;
            if (c == correctAnswers[i])
            {
                correctAnswerCount++;
            } // end of if

        } // end of for loop

        kb.close();

        // print out the final answer
        System.out.println("You have done " + correctAnswerCount + " answers coorectly!");

    } // end of main

} // end of class
