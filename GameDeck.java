
import java.util.Collections;
import java.util.ArrayList;
/**
 * The full deck of transportation cards, with a list 
 * keeping track of cards in the deck, and another with
 * with cards that have been discarded
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
public class GameDeck
{

    protected ArrayList<Card> cards;
    protected ArrayList<Card> discards;

    /**
     * Constructor for objects of class Deck
     */
    public GameDeck()
    {
        
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public void shuffleWithDiscards(){
        while (!discards.isEmpty()){
            Card temp = discards.remove(cards.size()-1);
            cards.add(temp);
        }
        Collections.shuffle(cards);
    }

    public Card draw(){
        Card temp = cards.remove(cards.size()-1);
        return temp;
    }

    public Card discard(){//could also return a void
        return null;        
    }
}
