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
    public int value;//one two or three
    String name;//maybe we implement adding a name
    Color myColor;//players color
    public int tokens = 15;
    public ArrayList<Pathway> takenPaths = new ArrayList<Pathway>();
    public ArrayList<TransportationCard> hand = new ArrayList<TransportationCard>();
    public ArrayList<DestTickCard> myDestCards = new ArrayList<DestTickCard>();
    public int score;    
    public int destCardsCompleted;

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
        score = 0;
        destCardsCompleted = 0;
    }

    /**
     * Updates the score for a player based on ticket to ride rules,
     * ignores failed destTicketCards (see final score)
     * 
     */
    public void updateScore(){

        int routeScore =0;
        int numTouristAttractions =0;
        ArrayList<Node> touristDests = new ArrayList<Node>();
        for (Pathway paths: takenPaths){
            if (paths.length==1){
               routeScore = routeScore + 1; 
            }
            else if (paths.length==2){
               routeScore = routeScore + 2; 
            }
            else if (paths.length==3){
               routeScore = routeScore + 4; 
            }
            else if (paths.length==4){
               routeScore = routeScore + 7; 
            }
            //score is updated based off of value of route length
            
            Node temp = paths.start; 
            Node temp2 = paths.end;
            boolean dup = false; //used to take care of duplicates

            // this checks to see if the node already exists in the 
            // tourist destination list
            for (Node dests: touristDests){
                if (temp.name.equals(dests.name)||temp2.name.equals(dests.name)) { 
                    dup=true; //this already exists in the list
                }  
            }
            
            //if it does not exist already in the list, and is a tourist
            //destinaton, then add it to the list
            if (!dup && temp.isTourDest){ 
                touristDests.add(temp);
            }
            
            //if it does not exist already in the list, and is a tourist
            //destinaton, then add it to the list
            if (!dup && temp2.isTourDest){
                touristDests.add(temp);
            }

        }
        numTouristAttractions = touristDests.size();
        
        score = routeScore + numTouristAttractions;
    }
    
    /**
     * Displays all the cards in a player's possession 
     * 
     */
    public void displayCards(){
        System.out.println(this.name + "'s hand:");
        System.out.println("Trans cards:");
        for (TransportationCard c: hand){
            System.out.println(c);
        }
        System.out.println("Dest cards:");
        for (DestTickCard c: myDestCards){
            System.out.println(c);
        }       
    }
    
    
    /**
     * THIS SHOULD COMPUTE FINAL SCORE
     * NEEDS TO CHECK DEST TICKET CARDS (WORK IN PROGRESS)
     */
    public int getfinalScore(){
        return 0;
    }
    
    /**
     * To string method for testing purposes
     * @return information about player
     */
    @Override
    public String toString(){
        return "Player " + name + " " + value + " " + myColor;        
    }
}

