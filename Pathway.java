import java.util.ArrayList;
import java.awt.Color;
/**
 * Pathway object for ticket to ride
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class Pathway
{
    public Color color;
    public Node end;
    public Node start;
    public int length;
    //public ArrayList<Pathway> takenPaths = new ArrayList<Pathway>();
    /**
     * Constructor for the Pathway class
     * Initializes a color, start node, end node, and lenth of the path
     * @param c Color of path
     * @param start The starting node for the path
     * @param end The end node for the path
     * @param lenth The lenght of the path
     */
    public Pathway(Color c,Node start,Node end, int length){
        this.color = c;
        this.end = end;
        this.start = start;
        this.length = length;
    }
    
    /**
     * Standard tostring method
     * @return a String with the name of the path's start, end, length, and color 
     * 
     */
    public String toString(){
        return " "+start.name+" to "+end.name+" "+color+" "+length;
    }
}
