
/**
 * Card object for ticketToRide
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
//////////////////////////////////////////////////////////////////////////////////////////
public class Card
{
    //there should be an instance variable for some sort of image
    //but right now not sure what type of object that would be 
    //would be protected
    
    protected boolean isFaceUp = false; //set faceUp to false on construction 
    
    /**
     * Turns a card faceUp
     */
    public void turnFaceUp(){
        isFaceUp = true;
    }
    
    /**
     * Turns a card faceDown
     */
    public void turnFaceDown(){
        isFaceUp = false;
    }
    

}
