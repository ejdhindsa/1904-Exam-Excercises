import java.io.ObjectOutputStream;
import java.beans.XMLEncoder;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileOutputStream;

public class PersonToBinaryAndXML
{
    public static void main(String[] args) throws IOException
    {
        // creating a set of persons
        // creating passengers
        Person p1 = new Person("Ekam", 2003);
        Person p2 = new Person("Anmol", 2008);
        Person p3 = new Person("Gurvir", 1975);
        Person p4 = new Person("Khuswant", 1978);
        
        // now that persons are creating, creating an arraylist so that all persons
        // can be added to it for easier access
        ArrayList<Person> persons = new ArrayList<>();
        
        // adding persons to the arraylsit
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        
        // now writing all the persons to a binary file
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("persons.ser"));
        
        // creating an XML encoder to encode all person objects
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("persons.xml"));
        
        // using a for-loop to write items in both the binary and the XML file
        for (int i = 0; i < persons.size(); i++)
        {
            // writing values in the array
            encoder.writeObject(persons.get(i));
            os.writeObject(persons.get(i));
            
        } // end of for
        
        System.out.println("Persons have been successfully written to files");
        
        // closing both the encoder
        os.close();
        encoder.close();
        
    } // end of main
    
} // end of class