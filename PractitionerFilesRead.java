// import statements
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.beans.XMLDecoder;
import java.io.IOException;
import java.util.ArrayList;

public class PractitionerFilesRead
{
    public static void main(String[] args) throws IOException
    {
        // making a data input stream to read files
        DataInputStream ds = new DataInputStream(new FileInputStream("practitioners.ser"));
        
        // now that the stream is creating, adding all the information to the reader and printing it out
        ArrayList<String> binaryInput = new ArrayList<>();
        ArrayList<String> XMLInput = new ArrayList<>();
        
        // using a while loop to continue
        for(int i = 0; i < 4; i++)
        {
            binaryInput.add(ds.readUTF());
        } // end of for
        
        // printing binary read files
        System.out.println("Binary Read Files: ");
        for (String s : binaryInput)
        {
            System.out.println(s);
        } // end of enhanced for
        
        // making an XML Decoder to read files
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("practitioners.xml"));
        
        // reading from XML File
        for (int i = 0; i < 4; i++)
        {
            XMLInput.add((String) decoder.readObject());
        } // end of for
        
        // printing XML read files
        System.out.println("XML Read Files: ");
        for (String s : XMLInput)
        {
            System.out.println(s);
        } // end of enhanced for
        
    } // end of main
    
} // end of class