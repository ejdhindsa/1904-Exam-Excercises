import java.io.Serializable;

public class Person implements Passenger, Serializable
{
    // fields
    private String name;
    private int yearBorn;
    private Bus bus;
    
    public Person()
    {
        this.name = "unknown";
        this.yearBorn = 0;
    }
    
    public Person(String name, int yearBorn)
    {
        this.name = name;
        this.yearBorn = yearBorn;
    } // end of full arg
    
    public String getName()
    {
        return this.name;
    } // end of getName()
    
    public int getYearBorn()
    {
        return this.yearBorn;
    } // end of getName()
    
    public Bus getBus()
    {
        return this.bus;
    } // end of getName()
    
    public void setBus(Bus b)
    {
        this.bus = b;
    } // end of setBus()
    
    public void setYearBorn(int yearBorn)
    {
        this.yearBorn = yearBorn;
    } // end of setyearBorn()
    
    public void setName(String name)
    {
        this.name = name;
    } // end of setName()
    
    @Override
    public String toString()
    {
        return this.name + ", Year: " + this.yearBorn;
    } // end of toString
    
} // end of person