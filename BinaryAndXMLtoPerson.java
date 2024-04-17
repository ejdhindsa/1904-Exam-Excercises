// import statements
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileInputStream;
import java.beans.XMLDecoder;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import java.io.EOFException;

public class BinaryAndXMLtoPerson
{
    public static void main(String[] args) throws ClassNotFoundException,IOException
    {
        // creating a binary file reader using JOptionPane
        String binaryInput = JOptionPane.showInputDialog("Enter Binary file name: ");
        ObjectInputStream is = null;
        
        // creating a try catch to check if the file is found
        boolean fileFoundBinary = false;
        
        while(!fileFoundBinary)
        {
            try
            {
                is = new ObjectInputStream(new FileInputStream(binaryInput));
                System.out.println("File Found Successfully!");
            
                // sets fileFound to true
                fileFoundBinary = true;
                
            } // end of try
            
            catch (IOException e)
            {
                System.out.println("File name is inorrect, please try again!");
                binaryInput = JOptionPane.showInputDialog("Enter Binary file name: ");
            } // end of catch
            
        } // end of while
        
        // creating the same with the XML file
        XMLDecoder decoder = null;
        
        // creating a binary file reader using JOptionPane
        String XMLInput = JOptionPane.showInputDialog("Enter XML file name: ");
        
        // creating a try catch to check if the file is found
        boolean fileFoundXML = false;
        
        while(!fileFoundXML)
        {
            try
            {
                decoder = new XMLDecoder(new FileInputStream(XMLInput));
                System.out.println("File Found Successfully!");
            
                // sets fileFound to true
                fileFoundXML = true;
                
            } // end of try
            
            catch (IOException e)
            {
                System.out.println("File name is inorrect, please try again!");
                XMLInput = JOptionPane.showInputDialog("Enter Binary file name: ");
            } // end of catch
            
        } // end of while
        
        // now making an array of the persons to print it out
        int totalItems = 0;
        boolean endOfFile = false;
        
        ArrayList<Person> binaryArray = new ArrayList<>();
        ArrayList<Person> XMLArray = new ArrayList<>();
        
        while(!endOfFile)
        {
            try
            {
                binaryArray.add((Person) is.readObject());
                XMLArray.add((Person) decoder.readObject());
                System.out.println("Added to arraylist");
                totalItems++;
            } // end of try
            
            catch(EOFException e)
            {   
                is.close();
                decoder.close();
                
                endOfFile = true;
            } // end of try

        } // end of while
                
        System.out.println(totalItems);
        
        // printing the arrays
        System.out.println("\nBinary Array: ");
        for (Person p : binaryArray)
        {
            System.out.println(p);
        } // end of for-each
        
        System.out.println("\nXML Array: ");
        for (Person p : XMLArray)
        {
            System.out.println(p);
        } // end of for-each
        
        
    } // end of main
    
} // end of class