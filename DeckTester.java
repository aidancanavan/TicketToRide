import java.util.ArrayList;
import java.awt.Color;
/**
 * Used to test functionality of Deck class 
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class DeckTester
{
    public static void main(String args[]){
        ArrayList<Card> translist = new ArrayList<Card>();

        for (int i = 1; i<=5;i++){
            translist.add(new TransCard(Color.GREEN));          
        }
        for (int i = 1; i<=5;i++){
            translist.add(new TransCard(Color.YELLOW));          
        }
        for (int i = 1; i<=5;i++){
            translist.add(new TransCard(Color.WHITE));          
        }

        Deck transDeck = new Deck(translist, new ArrayList<Card>()); 
        //most of the time, the discards will just start off as empty

        for (Card cards: translist){
            if (cards instanceof TransCard){
                TransCard temp = (TransCard) cards;
                System.out.println("Transcard - color - " + temp.color);
            }
        }

        System.out.println();

        //discard method needs to be tested

        transDeck.shuffleDeck();
        for (Card cards: translist){
            if (cards instanceof TransCard){
                TransCard temp = (TransCard) cards;
                System.out.println("Transcard - color - " + temp.color);
            }
        }

        ArrayList<Card> ticketlist = new ArrayList<Card>();
        for (int i = 1; i<=5;i++){
            ticketlist.add(new DestTickCard(new Point(),new Point(),i));          
        }

        Deck ticketDeck = new Deck(translist, null);
        //for ticketDecks, discards will always be null

    }
}
