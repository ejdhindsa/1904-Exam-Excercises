import java.util.Arrays;
import java.util.Scanner;

public class SortingStrings
{
    public static void main(String[] args)
    {
        System.out.println("Write 5 strings:");

        // making a scanner
        Scanner kb = new Scanner(System.in);

        // declaring an array
        String[] strings = new String[5];

        for (int i = 0; i < 5; i++)
        {
            strings[i] = kb.next();
        } // end of for

        kb.close();

        // sow sorting the array
        Arrays.sort(strings);

        for (String string : strings) {
            System.out.println(string);
        } // end of enhanced for
        
    } // end of main

} // end class