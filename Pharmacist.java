/**
 * The Pharmacist class
 * - a subclass of Practitioner
 * - a pharmacist "is a" practitioner
 */
public class Pharmacist extends Practitioner{
    // fields specific to this class
    private String location;
    
    // constructors
    /**
     * by default, the no-arg constructor calls
     * the no-arg constructor in Practitioner
     */
    public Pharmacist()
    {
        // no-arg constructor of Practitioner is implicitly called
        location = "unknown";
    }

    /**
     * constructor for when information is available
     * super class constructor arguments
     * @param String firstName
     * @param String lastName
     * @param String gender
     */
    public Pharmacist(String firstName, String lastName, String sign, String location)
    {
        // note the explicit call to a Practitioner constructor
        super(firstName, lastName, sign);
        this.location = location;
    }
    
    // getters specific to this class
    public String getLocation(){
        return location;
    } 
    
    // setters specific to this class
    public void setLocation(String location){
        this.location = location;
    }
    
    // others 
    @Override
    public String toString(){
        return "hello!";
    }
}