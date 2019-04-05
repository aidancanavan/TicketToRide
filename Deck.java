
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
public class Deck
{

    protected ArrayList<Card> cards = new ArrayList<Card>();
    protected ArrayList<Card> discards = new ArrayList<Card>();

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public void shuffleWithDiscards(){
        cards.addAll(discards);
        discards.clear();
        Collections.shuffle(cards);
        
        
    }

    public Card draw(){
        if(cards.size() ==0 ){
            shuffleWithDiscards();
        }
        Card temp = cards.remove(cards.size()-1);
        return temp;
    }

    public void discard(Card c){//could also return a void
         discards.add(c);
    }
}
