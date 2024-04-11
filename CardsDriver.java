// import statements
import java.util.ArrayList;
import java.util.Collections;

public class CardsDriver
{
    public static void main(String[] args)
    {
        // creating an arraylist of cards
        ArrayList<Card> deck = new ArrayList();
        
        for (Suit s: Suit.values())
        {
            for (Face f: Face.values())
            {
               deck.add(new Card(s, f));
            } // end of inner for
                
        } // end of outer for
        
        // shuffling the deck
        Collections.shuffle(deck);
        
        // adding five cards to the player
        ArrayList<Card> playerOne = new ArrayList<>();
        
        // using for loop to add cards to the player
        int i = 0;
        while (i < 5)
        {
            playerOne.add(deck.remove(i));
            i++;
        } // end of while loop
        
        // printing values
        for (int j = 0; i < playerOne.size(); i++)
        {
            System.out.println(playerOne.get(i)); 
        } // end of for
        
        

    } // end of main
    
} // end of CardsDriver