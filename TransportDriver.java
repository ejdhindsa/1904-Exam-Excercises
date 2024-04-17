// import
import java.util.Arrays;

public class TransportDriver
{
    public static void main (String[] args)
    {
        // creating passengers
        Passenger p1 = new Person("Ekam", 2003);
        Passenger p2 = new Person("Anmol", 2008);
        Passenger p3 = new Person("Gurvir", 1975);
        Passenger p4 = new Person("Khuswant", 1978);
        
        // array of person
        Passenger p[] = {
            new Person("Bruce", 1980),
            new Person("Thomas", 1950),
            new Person("Martha", 1955),
            new Person("Alfred", 1940)
        }; // end of p[]
        
        // creating a bus
        Bus bus = new Bus("Bus");
        
        // adding passengers to teh bus
        bus.addPassenger(p1);
        bus.addPassenger(p2);
        bus.addPassenger(p3);
        bus.addPassenger(p4);
        
        // setting bus to the passenger
        p1.setBus(bus);
        p2.setBus(bus);
        p3.setBus(bus);
        p4.setBus(bus);
        
        // printing the list of passengers
        bus.displayPassengerNames();
        
        Arrays.sort(p, new OrderByName());
        
        for (Passenger v : p)
        {
            System.out.println(v.getName());
        } // end of enhaced for
        
    } // end of main
    
} // end of class