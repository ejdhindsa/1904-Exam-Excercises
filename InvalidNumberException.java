public class InvalidNumberException extends Exception
{
    // fields
    private String number;
    
    public InvalidNumberException(String number)
    {
        this.number = number;
    } // end of constructor
    
    public String getNumber()
    {
        return this.number;
    } // end of getNumber
    
} // end of class