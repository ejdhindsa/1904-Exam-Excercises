import java.util.Comparator;

public class OrderByName implements Comparator<Passenger>
{
    public int compare(Passenger p1, Passenger p2)
    {
        return p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());
    } // end of compare
    
} // end of OrderByName
 