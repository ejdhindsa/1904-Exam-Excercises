public class TotalKilometerDrivenTotal
{
    public static void main (String[] args)
    {
        int [][] trips = {
            {25 , 29 , 30 , 40} ,
            {44 , 25} ,
            {22 , 27 , 55 , 33 , 80} ,
            {55 , 57 , 45} ,
            {31 , 42 , 49 , 46}
        };  // end of array creation

        // creating a list of names
        String[] names = {"Bruce", "Alfred", "Clark", "Dick", "Harley"};
        int totalTravelled = 0;

        // using for loop to add the total values and then print
        for (int i = 0; i < trips.length; i++)
        {
            for (int j = 0; j < trips[i].length; j++)
            {
                totalTravelled += trips[i][j];
            } // end of inner for loop
        } // end of outer for loop

        System.out.println("Toal Kilometers Driven: " + totalTravelled);
            
    } // end of main

} // end of class
