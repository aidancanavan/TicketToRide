import java.util.ArrayList;
import java.awt.Color;
/**
 * Tester to make sure Card classes work properly and variables can be accessed.
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class CardTester
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

        for (Card cards: ticketlist){
            if (cards instanceof DestTickCard){
                DestTickCard temp = ( DestTickCard) cards;
                System.out.println("TC:" + temp.a + " " +  temp.b + " " + temp.value);
            }
        }

    }
}
