// import statements
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.util.ArrayList;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class PractitionerFiles
{
    public static void main(String[] args) throws IOException
    {
        // creating practitioner objects
        Practitioner p1 = new Practitioner("Ekamjot", "Singh", "Male");
        Practitioner p2 = new Practitioner("Anmol", "Kaur", "Female");
        Practitioner p3 = new Practitioner("Gurvir", "Singh", "Male");
        Practitioner p4 = new Practitioner("Khuswant", "Kaur", "Female");
        
        // creating an arrayList in which we add objects
        ArrayList<Practitioner> practitioners = new ArrayList<>();
        
        // adding practitioners to the arraylist
        practitioners.add(p1);
        practitioners.add(p2);
        practitioners.add(p3);
        practitioners.add(p4);
        
        // creating a nwe Binary Output Stream
        DataOutputStream ds = new DataOutputStream(new FileOutputStream("Practitioners.ser"));
        
        // using a for loop to write out the data in form of a string
        for (int i = 0; i < practitioners.size(); i++)
        {
            ds.writeUTF(practitioners.get(i).getFirstName() + " " + practitioners.get(i).getLastName() + " " + practitioners.get(i).getMedID());
            
        } // end of for
        
        // now that the required strings are written, data output stream is closed
        ds.close();
        
        // now creating an XMLEncoder that writes the data
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("practitioners.xml"));
        
        // using a for loop to write XML data to file
        for (int i = 0; i < practitioners.size(); i++)
        {
            encoder.writeObject(practitioners.get(i).getFirstName() + " " + practitioners.get(i).getLastName() + " " + practitioners.get(i).getMedID());
            
        } // end of for
        
        // since encoder's job is finished, closing the encoder
        encoder.close();
        
    } // end of main
    
} // end of class