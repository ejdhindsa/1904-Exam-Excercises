public class MonthDriver
{
    public static void main(String[] args)
    {
        // creating an array of months
        Month[] months = Month.values();
        
        // creating a for loop to print each values
        System.out.println("Days of the Month:");
        for (Month m : months)
        {
            // printing the months
            System.out.println(m);
        } // end of for
        
    } // end of main
    
} // end of class