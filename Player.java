import java.awt.Color;
import java.util.ArrayList;
/**
 * Creates a player object for ticket to ride
 *
 * @author Aidan Canavan
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class Player
{
    int value;//one two or three
    String name;//maybe we implement adding a name
    Color myColor;//players color
    int tokens = 20;
    public ArrayList<Pathway> takenPaths = new ArrayList<Pathway>();
    public ArrayList<TransportationCard> hand = new ArrayList<TransportationCard>();
    public ArrayList<DestTickCard> myDestCards = new ArrayList<DestTickCard>();
    /**
     * Constructor for Player object, intitializes name, value and color
     * @param name The players name
     * @param value The turn the player will use 
     * @param c Color the color of the player's taxis
     */
    public Player(String name, int value, Color c){
        this.name = name;
        this.value = value;
        myColor = c;
    }
}
