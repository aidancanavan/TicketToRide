import java.util.ArrayList;
/**
 * Holds a destination object
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class Point
{
    protected String name; //name of location
    protected Boolean isTourDest; //whether or not it is a tourist dest
    protected ArrayList<Pathway> paths; //list of PathWays
    protected Coordinate xy;
    public Point(){}
    
    /**
     * Constructor for objects of class Point
     * @param inName Name of location
     * @param isTD whether or not it is a tourist dest
     * @param paths List of Pathways from point
     * @param inC Coordinates of point
     */
    public Point(String inName, boolean isTD, ArrayList<Pathway> inP, Coordinate inC){
        name = inName;
        isTourDest = isTD;
        paths = inP;
        xy = inC;
    }

    
}
