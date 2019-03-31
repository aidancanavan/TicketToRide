import java.util.ArrayList;
/**
 * Holds a destination object
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class Node
{
    protected String name; //name of location
    protected Boolean isTourDest; //whether or not it is a tourist dest
    public ArrayList<Pathway> destinations = new ArrayList<Pathway>(); //list of PathWays
    int Xpos;
    int Ypos;

    /**
     * Constructor for objects of class Point
     * @param inName Name of location
     * @param isTD whether or not it is a tourist dest
     * @param paths List of Pathways from point
     * @param inC Coordinates of point
     */
    public Node(String inName, boolean isTD, int Xpos,int Ypos){
        name = inName;
        isTourDest = isTD;
        
        this.Xpos = Xpos;
        this.Ypos = Ypos;
    }

    
}
