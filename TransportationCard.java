import java.awt.Color;
/**
 * Transportation card for ticket to ride. Called "trans"
 * card because frankly we need to minimize variable
 * name length as much as possible
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class TransportationCard extends Card
{
    //these are protected so they can accessed anywhere in package or subclass
    protected Color color; //COLORS: BLUE, GREEN, BLACK, PINK, RED, ORANGE, null(RAINBOW)
    protected boolean isFaceUp; 
    public String imagePath;

    /**
     * Constructor for objects of class TransCard
     * @param color of the card
     */
    public TransportationCard(Color c,String imagePath){
        color = c;
        this.imagePath = imagePath;
    }   
    
    public String toString(){
        return "Color: " + color + " Is face up: " + isFaceUp + " Image path: " +
        imagePath;
    }
    
}
