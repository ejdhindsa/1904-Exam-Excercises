public class MobileSimDriver
{
    public static void main (String[] args) throws InvalidNumberException
    {
        // creatig new sims in try catch
        
        try
        {
            MobileSim sim1 = new MobileSim("7974490398", "Jio");
            System.out.println("Sim 1 created Successfully");
            
            MobileSim sim2 = new MobileSim("2046199335", "Bell");
            System.out.println("Sim 2 created Successfully");
            
            MobileSim sim3 = new MobileSim("441021", "Tel");
            System.out.println("Sim 3 created Successfully");
        } // end of try
        catch (InvalidNumberException e)
        {
            System.out.println("The number is incorrect!");
            e.printStackTrace();
        }
        
    } // end of main
    
} // end of class