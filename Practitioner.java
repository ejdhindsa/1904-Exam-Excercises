public class Practitioner {
    private String firstName;
    private String lastName;
    private String medID;
    
    // no argument constructor
    public Practitioner()     {
        firstName = lastName = medID  = "unknown";
    }
    
    // full argument  constructor
    public Practitioner(String firstName, String lastName, String medID)     {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.medID    = medID;
    }
    
    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getMedID(){
        return medID;
    }
    
    // setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setMedID(String medID){
        this.medID = medID;
    }
    
    // other methods
    public String toString(){
        return getName() + " " + medID;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
}