public class HighestAmountOfSnow
{
    public static void main(String[] args)
    {
        // creating an array that will hold the values of the
        // snowfall in the city of denver
        double[][] snowFallInInches = {
            {6.2 ,1.8 ,11.3 ,4.6 ,0 ,0 ,0 ,0 ,0.2 ,0 ,7.6 ,5.6},
            {8.7 ,10.6 ,6.7 ,11.7 ,7.2 ,0 ,0 ,0 ,0 ,1 ,4.2 ,2.9} ,
            {6.1 ,2.8 ,12.5 ,0 ,0.7 ,0 ,0 ,0 ,0 ,4.8 ,3.9 ,0.0} ,
            {0 ,7.5 ,35.2 ,3.4 ,7 ,0 ,0 ,0 ,0 ,0 ,2.9 ,4.5} ,
            {4.6 ,8.9 ,1.8 ,15.3 ,0 ,0 ,0 ,0 ,0 ,1.4 ,10 ,2.6} ,
            {7.4 ,0.5 ,4.6 ,11.4 ,1.4 ,0 ,0 ,0 ,0 ,9.6 ,1 ,4.1} ,
            {3.6 ,3 ,8.6 ,0.3 ,0.2 ,0 ,0 ,0 ,0 ,9.8 ,4.4 ,29.4} ,
            {15.9 ,5.5 ,6.7 ,0.9 ,0 ,0 ,0 ,0 ,0 ,3 ,2.5 ,20.9} ,
            {3.1 ,5.1 ,5.4 ,2.9 ,3.4 ,0 ,0 ,0 ,0 ,0 ,1.7 ,10.3} ,
            {4.9 ,0 ,13.8 ,7.4 ,0 ,0 ,0 ,0 ,0 ,17.2 ,9.3 ,11.1} ,
            {2.6 ,5.8 ,12.8 ,0.5 ,1.3 ,0 ,0 ,0 ,0 ,0 ,1.5 ,3.3} ,
            {8 ,5.3 ,2.5 ,1.2 ,1 ,0 ,0 ,0 ,0 ,8.5 ,4.5 ,16.5} ,
            {4.9 ,20.2 ,0 ,1 ,0 ,0 ,0 ,0 ,0 ,5.5 ,1.7 ,5.2} ,
            {4.6 ,14.1 ,23.5 ,20.4 ,3.4 ,0 ,0 ,0 ,0 ,1.4 ,2 ,4.7} ,
            {14.3 ,3.3 ,6 ,5.6 ,1.1 ,0 ,0 ,0 ,0 ,0 ,4 ,12} ,
        };
        
        // array of years
        int[] years = {2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014};

        // array of months
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"} ;

        // creating a variable to settle the highest inches value
        double max = (double) Integer.MIN_VALUE;
        int year = 0;
        String month = null;

        // starting a for loop that will keep in check the highest highest
        // snowfall inches in denver
        for (int i = 0; i < snowFallInInches.length; i++)
        {
            for (int j = 0; j < snowFallInInches[i].length; j++)
            {
                // starting an if clause to also check for the year as well as
                // the month with highest amount of snowfall
                if (snowFallInInches[i][j] > max)
                {
                    year = years[i];
                    month = months[j];

                } // end of conditional if

                // using math.max to check for the highest values between the two
                // passed arguments
                max = Math.max(snowFallInInches[i][j], max);
                
            } // end of outer for loop

        } // end of outer for loop

        System.out.println("Highest Snowfall ever recorded: " + max + " inches in " + month + " " + year);
    } // end of class

} // end of main