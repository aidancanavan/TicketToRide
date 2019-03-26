
/**
 * Destination Ticket for for Ticket to Ride,  
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class DestTickCard extends Card
{
    protected Point a;
    protected Point b;
    int value;

    /**
     * Constructor for objects of class DestTickCard
     * @param A One point on card
     * @param B Other point on card
     * @param value Value of dest ticket card
     */
    public DestTickCard(Point A, Point B, int val){
        a = A;
        b = B;
        value = val;
    }

    
}
