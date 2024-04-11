/**
 * The Doctor class
 * - a subclass of Practitioner
 * - a Doctor "is a" practitioner
 */
public class Doctor extends Practitioner {
    // fields specific to this class
    private String specialty;
    
    // constructors
    /**
     * no-arg constructor, recall default call 
     * to Practitioner no-arg constructor
     */
    public Doctor()
    {
        // no-arg constructor of Practitioner is implicitly called
        specialty = "unknown";
    }
    
    /**
     * constructor with firstname etc
     * super class constructor arguments
     * @param String firstName
     * @param String lastName
     * @param String sign
     */
    //public Practitioner(String firstName, String lastName, String gender)
    public Doctor(String firstName, String lastName, String sign, String specialty)     {
        // note call to superclass constructor
        super(firstName, lastName, sign);
        this.specialty = specialty;
    }
    
    // getters specific to this class
    public String getSpecialty(){
        return specialty;
    }
    
    // setters specific to this class
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }
    
    /* other methods specific to this class
     * not the call to getFirstName() and getLastName(),
     * where do they come from ?
     * 
     * Note that this is overriding the method of the same name in Practitioner
     */
    @Override
    public String getName(){
        return "Dr. " + getFirstName() + " " + getLastName() + ", " + getSpecialty();
        //return "Dr. " + getName() + ", " + getSpecialty();
        //return "Dr. " + super.getName() + ", " + getSpecialty();
    }
}