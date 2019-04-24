
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
//////////////////////////////////////////////////////////////////////////////////////////
public class Deck
{

    public ArrayList<Card> cards = new ArrayList<Card>();
    public ArrayList<Card> discards = new ArrayList<Card>();

    /**
     * Constructor for objects of class Deck, does not initialize anything
     */
    public Deck()
    {

    }

    /**
     * Shuffles a deck of cards (randomly)
     * 
     */
    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    /**
     * adds all discards to the deck of cards, then shuffles 
     */
    public void shuffleWithDiscards(){
        cards.addAll(discards);
        discards.clear();
        Collections.shuffle(cards);        
    }

    /**
     * draws a card from the deck, shuffles if necessary
     * @return the card that is being drawn.
     */
    public Card draw(){
        if(cards.size() ==0 ){
            shuffleWithDiscards();
        }
        Card temp = cards.remove(cards.size()-1);
        return temp;
    }

    /**
     * Adds the specified card to the discard pile
     * @param c the card to discard
     */
    public void discard(Card c){//could also return a void
        discards.add(c);
    }

    /**
     * Adds the specified card to the discard pile
     * @param deck The Deck to remove the card from
     * @param index The index of the card to discard from the deck
     */
    public void discard(ArrayList<Card> deck, int index){//could also return a void
        Card temp = deck.remove(index);
        discards.add(temp);
    }

}
