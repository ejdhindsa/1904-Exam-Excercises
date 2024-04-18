public class MobileSim
{
    // fields
    private String number;
    private String companyName;
    
    // constructor
    public MobileSim(String number, String companyName) throws InvalidNumberException
    {
        if(!validate(number)) throw new InvalidNumberException(number);
        
        this.number = number;
        this.companyName = companyName;
    }

    public String getNumber()
    {
        return this.number;
    } //end method getNumber

    public void setNumber(String number)
    {
        this.number = number;
    }//end method setNumber

    public String getCompanyName()
    {
        return this.companyName;
    }//end method getCompanyName

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }//end method setCompanyName

    // UTILITY Methods
    public boolean validate(String number)
    {
        if (number == null || number.length() != 10)
        {
            return false;
        } // end of if
        
        char numberArray[] = number.toCharArray();
        
        // starting a for loop to check if all letters are digits
        for (int i = 0; i < numberArray.length; i++)
        {
            if (!Character.isDigit(numberArray[i]))
            {
                return false;
            } // end of if
        } // end of for
        
        return true;
    } // end validate()


}//End class