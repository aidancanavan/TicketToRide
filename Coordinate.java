
/**
 * Coordinate object for location
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class Coordinate
{
    protected double x; //we might want this to be a range of coordinates, but we'll see
    protected double y;

    /**
     * Constructor for objects of class Coordinate
     * @param inX The x coordinate
     * @param inY The y coordinate
     */
    public Coordinate(double inX, double inY)
    {
        x = inX;
        y = inY;
    }

    
}
