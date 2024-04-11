public class EnhancedMonthDriver
{
    public static void main (String[] args)
    {
        // setting values of all the months
        EnhancedMonth[] months = EnhancedMonth.values();
        
        // using a for loop to print months and days
        for (EnhancedMonth e : months)
        {
            System.out.println(e + ": " + e.getDays());
        } // end of for-each
        
    } // end of main
    
} // end of class