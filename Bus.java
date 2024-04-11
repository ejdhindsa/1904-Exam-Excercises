import java.util.ArrayList;
import java.util.Arrays;

public class Bus
{
    // fields
    private String busName;
    ArrayList<Passenger> passengers;
    
    // constructor
    public Bus()
    {
        busName = "unknown";
        passengers = new ArrayList<>();
    } // end no arg
    
    public Bus(String busName)
    {
        this.busName = busName;
        passengers = new ArrayList<>();
    } // end of ful-arg
    
    public void addPassenger(Passenger p)
    {
        passengers.add(p);
    } // end of addPassenger
    
    public void displayPassengerNames()
    {
        System.out.println("List of passengers: ");
        for(Passenger p : passengers)
        {
            System.out.println(p.getName());
        } // end of for
    } // end of displayPassengerNames()

}