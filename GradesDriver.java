public class GradesDriver
{
    public static void main (String[] args)
    {
        // setting values of all the months
        Grades[] grades = Grades.values();
        
        // using a for loop to print months and days
        for (Grades e : grades)
        {
            System.out.println(e + ": " + e.getGrade());
        } // end of for-each
        
    } // end of main
    
} // end of class