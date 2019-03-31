
/**
 * Destination Ticket for for Ticket to Ride,  
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class DestTickCard extends Card
{
    protected Node a;
    protected Node b;
    int value;

    /**
     * Constructor for objects of class DestTickCard
     * @param A One point on card
     * @param B Other point on card
     * @param value Value of dest ticket card
     */
    public DestTickCard(Node A, Node B, int val){
        a = A;
        b = B;
        value = val;
    }

    
}
