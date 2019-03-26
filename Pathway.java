import java.awt.Color;
/**
 * Object equivalent to Route in ticket to ride
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
public class Pathway
{
   
    protected int length; //length of pathway
    protected Color color; //color of pathwat
    protected Point start; //start of path
    protected Point end; //end of path
    protected boolean isTaken = false; 
    

    /**
     * Constructor for objects of class Pathway
     */
    public Pathway(int len, Color col, Point st, Point e)
    {
        length = len;
        color = col;
        start = st;
        end = e;
    }
    
    /**
     * Set a Pathway to be taken (unuseable)
     */
    public void setTaken(){
        isTaken = true;
    }

}
