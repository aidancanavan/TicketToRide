import java.awt.Color;
import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    int value;//one two or three
    String name;//maybe we implement adding a name
    Color myColor;//players color
    int tokens = 20;
    public ArrayList<Pathway> takenPaths = new ArrayList<Pathway>();
    public ArrayList<TransportationCard> hand = new ArrayList<TransportationCard>();
    public ArrayList<DestTickCard> myDestCards = new ArrayList<DestTickCard>();
    public Player(String name, int value, Color c){
    this.name = name;
    this.value = value;
    myColor = c;
    
    }
}
