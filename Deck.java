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

    protected ArrayList<Card> cards;
    protected ArrayList<Card> discards;

    /**
     * Constructor for objects of class Deck
     */
    public Deck(){

    }

    /**
     * Draw a card from a deck 
     * @return A Card object from the top of the deck (index 0)
     */
    public Card drawFromDeck(){
        Card temp = cards.get(0);//grab the first card from the top of the deck 
        //technically making the top the last index and not the first is 
        //more efficient, but this way is more readable, also,
        //we are not dealing with millions of cards 
        return temp;
    }

    /**
     * Standard Shuffle for a deck of cards
     */
    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    /**
     * Places all discards in same deck as others, then shuffles
     */
    public void shuffleWithDiscards(){
        while (!discards.isEmpty()){
            Card temp = discards.remove(0); //could be one line, but this
            // is more readable
            cards.add(temp);
        }
        Collections.shuffle(cards);
    }

    /**
     * Discards a destination ticket. This is differs from discard of transportation
     * cards, because this goes to the bottom of the pile, not a separate pile 
     * @param dtc A Destination ticket card to discard from a deck
     */
    public void discard(DestTickCard dtc,Deck target){

        //this should be edited to remove a card from the players deck
        Card temp = this.cards.remove((this.cards.indexOf(dtc)));
        //temp = (DestTickCard)temp;
        target.cards.add(dtc);//adds the card to the bottom (end)
        // of the target deck (will always be the main deck for dtcs)
    }

    public void discard(TransCard tc,Deck target){//this is different for each type of deck
        Card temp = this.cards.remove((this.cards.indexOf(tc)));
        target.discards.add(0,tc); //adds card to top of discard deck
    }

}
