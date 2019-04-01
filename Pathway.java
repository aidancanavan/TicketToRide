import java.util.ArrayList;
import java.awt.Color;
/**
 * Write a description of class TakenPathway here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pathway
{
    public Color color;
    public Node end;
    public int length;
    //public ArrayList<Pathway> takenPaths = new ArrayList<Pathway>();
    public Pathway(Color c,Node end, int length){
    this.color = c;
    this.end = end;
    this.length = length;
    
    }
}
