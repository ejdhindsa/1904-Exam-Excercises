public class Person implements Passenger
{
    // fields
    private String name;
    private Bus bus;
    
    public Person(String name)
    {
        this.name = name;
    } // end of full arg
    
    public String getName()
    {
        return this.name;
    } // end of getName()
    
    public void setBus(Bus b)
    {
        this.bus = b;
    } // end of setBus()
    
} // end of person