public class DisplayMonthAndNumbers
{
    public static void main(String[] args)
    {
        String[] months = {"January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"};
        
        int[] days = {31, 38, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        System.out.println("Month \t \t Days");
        
        // using a for each loop to print all the values
        for (int i = 0; i < months.length; i++)
        {
            System.out.println(months[i] + " \t \t " + days[i]);
        } // end of for
        
    } // end of main
    
} // end of class