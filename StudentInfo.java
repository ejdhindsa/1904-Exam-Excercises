import java . util . Scanner ;

public class StudentInfo
{
    public static void main ( String [] args )
    {
        String [] name = {" Joe"," Linda "," Mary "," Peter ","Lee"};
        int [] number = {123 , 222 , 345 , 567 , 890};
        Scanner kb = new Scanner ( System .in);
        System.out.println ("Enter student number :");

        int toFind = kb. nextInt ();
        kb.close();     // closing the keyboard

        for ( int i=0; i< number.length ; i++)
        {
            if ( toFind == number [i])
            {
                System . out. println ( name [i]);
                i = number.length;
            } // end of if

        } // end of for-each

    } // end of main

} // end of class