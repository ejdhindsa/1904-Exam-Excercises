import java.util.Scanner ;

public class Q2Source
{
    public static void main ( String [] args )
    {
        int total = 0;
        
        Scanner kb = new Scanner ( System .in);
        
        System . out. println (" enter a number : ");
        
        while (kb. hasNext ())
        {
            String number = kb. next ();
            
            // setting up a try clause
            int n = 0;
            
            try
            {
                n = Integer.parseInt ( number ); 
            }
            catch (NumberFormatException e)
            {
                System.out.println("Valid number not entered, please try again");
                number = kb.next();
            } // end of cactch
            
            total += n;
            System.out.println ("enter a number :");
            
        } // end of while
        
        // total of numbers
        System . out. println (" total of numbers is"+ total );
    }
}