public class TotalKilometerDriven
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
        

        // using for loop to add the total values and then print
        System.out.println("Total distance travelled by the bikers: ");
        for (int i = 0; i < trips.length; i++)
        {
            int totalTravelled = 0;

            for (int j = 0; j < trips[i].length; j++)
            {
                totalTravelled += trips[i][j];
            } // end of inner for loop

            System.out.println(i + 1 + ". " + names[i] + ": " + totalTravelled + " kilometers");
        } // end of outer for loop
            
    } // end of main

} // end of class
