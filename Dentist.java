public class Dentist extends Practitioner
{
    // fields
    private int experience;
    
    public Dentist()
    {
        this.experience = 0;
        
    } // end of no-arg dentist
    
    public Dentist(String firstName, String lastName, String sign, int experience)
    {
        super(firstName, lastName, sign);
        this.experience = experience;
        
    } // end of full-arg constructor
    
    public void setExperiennce(int experience)
    {
        this.experience = experience;
    } // end of setExperience
    
    public int getExperience()
    {
        return this.experience;
    } // end of getExperience();
    
    @Override
    public String getName()
    {
        return getLastName() + ", " + getFirstName() + " : Experience " + this.experience;
    } // end of getName()
    
} // end of class