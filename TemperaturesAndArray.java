import java.util.Scanner;

public class TemperaturesAndArray
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner ( System .in);
        double [] temperature = new double [7];
        System . out. println (" Enter 7 temperatures :");
        
        for ( int i=0; i <7; i++)
            temperature [i] = kb. nextDouble ();
            
        kb.close();
        double sum = 0.0;

        for ( double t: temperature )
            sum +=t;
    
        System . out. println (" average = "+sum /7.0) ;

        // finding the min and max temperatures
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // starting a for loop to find the smallest value
        for(int i = 0; i < temperature.length; i++)
        {
            min = (int) Math.min(min, temperature[i]);
            max = (int) Math.max(max, temperature[i]);
        } // end of for

        System.out.println("Max: " + max + ", Min: " + min);

    } // end of main

} // end of class