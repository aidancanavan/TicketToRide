import java.util.ArrayList;
import java.awt.Color;

/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    public Deck transDeck = new Deck();//
    public ArrayList<Player> players = new ArrayList<Player>();
    public ArrayList<Color> colors = new ArrayList<Color>();
    public ArrayList<Node> map = new ArrayList<Node>();
    
    public Board(int numPlayers){
    colors.add(Color.RED);
    colors.add(Color.BLUE);
    colors.add(Color.GREEN);
    colors.add(Color.YELLOW);
    
    for(int i=0;i<numPlayers;i++){
    players.add(new Player("PLACEHOLDER",i,colors.get(i)));
    }
    
    map.add(new Node("Lincoln Center",false,0,0));//0
    map.add(new Node("Central Park",true,0,0));//1
    map.add(new Node("Midtown West",false,0,0));//2
    map.add(new Node("Times Square",true,0,0));//3
    map.add(new Node("United Nations",true,0,0));//4
    map.add(new Node("Empire State Building",true,0,0));//5
    map.add(new Node("Chelsea",true,0,0));//6
    map.add(new Node("Gramercy Park",false,0,0));//7
    map.add(new Node("Greenwich Village",true,0,0));//8
    map.add(new Node("East Village",false,0,0));//9
    map.add(new Node("Soho",false,0,0));//10
    map.add(new Node("Lower East Side",false,0,0));//11
    map.add(new Node("Chinatown",true,0,0));//12
    map.add(new Node("Wall Street",true,0,0));//13
    map.add(new Node("Brooklyn",true,0,0));//14
    
    //connections from Lincoln Center
    map.get(0).destinations.add(new Pathway(Color.ORANGE,map.get(1),2));
    map.get(0).destinations.add(new Pathway(Color.RED,map.get(2),2));
    map.get(0).destinations.add(new Pathway(Color.BLUE,map.get(3),2));
    map.get(0).destinations.add(new Pathway(Color.GREEN,map.get(3),2));
    
    //connections from Central Park
    map.get(1).destinations.add(new Pathway(Color.ORANGE,map.get(0),2));
    map.get(1).destinations.add(new Pathway(Color.PINK,map.get(4),3));
    map.get(1).destinations.add(new Pathway(Color.PINK,map.get(4),3));
    map.get(1).destinations.add(new Pathway(Color.RED,map.get(3),2));
    map.get(1).destinations.add(new Pathway(Color.BLACK,map.get(3),2));
    
    //connections from Midtown West
    map.get(2).destinations.add(new Pathway(Color.RED,map.get(0),2));
    map.get(2).destinations.add(new Pathway(null,map.get(3),1));
    map.get(2).destinations.add(new Pathway(Color.GREEN,map.get(5),2));
    map.get(2).destinations.add(new Pathway(Color.BLUE,map.get(6),2));
    
    //connections from Times Square
    map.get(3).destinations.add(new Pathway(Color.GREEN,map.get(0),2));
    map.get(3).destinations.add(new Pathway(Color.BLUE,map.get(0),2));
    map.get(3).destinations.add(new Pathway(Color.BLACK,map.get(1),2));
    map.get(3).destinations.add(new Pathway(Color.RED,map.get(1),2));
    map.get(3).destinations.add(new Pathway(null,map.get(2),1));
    map.get(3).destinations.add(new Pathway(null,map.get(4),2));
    map.get(3).destinations.add(new Pathway(Color.ORANGE,map.get(5),1));
    map.get(3).destinations.add(new Pathway(Color.PINK,map.get(5),1));
    
    //connections from United Nations
    map.get(4).destinations.add(new Pathway(Color.PINK,map.get(1),3));
    map.get(4).destinations.add(new Pathway(null,map.get(3),2));
    map.get(4).destinations.add(new Pathway(Color.GREEN,map.get(7),3));
    map.get(4).destinations.add(new Pathway(Color.BLACK,map.get(5),2));
    
    //connections from Empire State Building
    map.get(5).destinations.add(new Pathway(Color.GREEN,map.get(2),2));
    map.get(5).destinations.add(new Pathway(Color.BLACK,map.get(4),2));
    map.get(5).destinations.add(new Pathway(Color.PINK,map.get(3),1));
    map.get(5).destinations.add(new Pathway(Color.ORANGE,map.get(3),1));
    map.get(5).destinations.add(new Pathway(Color.RED,map.get(7),1));
    map.get(5).destinations.add(new Pathway(Color.BLUE,map.get(7),1));
    map.get(5).destinations.add(new Pathway(null,map.get(6),2));
    map.get(5).destinations.add(new Pathway(null,map.get(6),2));
    
    //connections from Chelsea
    map.get(6).destinations.add(new Pathway(Color.BLUE,map.get(2),2));
    map.get(6).destinations.add(new Pathway(null,map.get(5),2));
    map.get(6).destinations.add(new Pathway(null,map.get(5),2));
    map.get(6).destinations.add(new Pathway(Color.ORANGE,map.get(7),2));
    map.get(6).destinations.add(new Pathway(Color.RED,map.get(8),3));
    map.get(6).destinations.add(new Pathway(Color.GREEN,map.get(8),3));
    map.get(6).destinations.add(new Pathway(Color.PINK,map.get(10),4));
    
    //connections from Gramercy Park
    map.get(7).destinations.add(new Pathway(Color.GREEN,map.get(4),3));
    map.get(7).destinations.add(new Pathway(Color.BLUE,map.get(5),1));
    map.get(7).destinations.add(new Pathway(Color.RED,map.get(5),1));
    map.get(7).destinations.add(new Pathway(Color.ORANGE,map.get(6),2));
    map.get(7).destinations.add(new Pathway(Color.BLACK,map.get(8),2));
    map.get(7).destinations.add(new Pathway(Color.PINK,map.get(8),2));
    map.get(7).destinations.add(new Pathway(null,map.get(9),2));
    
    //connections from Greenwich Village
    map.get(8).destinations.add(new Pathway(Color.GREEN,map.get(6),3));
    map.get(8).destinations.add(new Pathway(Color.RED,map.get(6),3));
    map.get(8).destinations.add(new Pathway(Color.BLACK,map.get(7),2));
    map.get(8).destinations.add(new Pathway(Color.PINK,map.get(7),2));
    map.get(8).destinations.add(new Pathway(Color.BLUE,map.get(9),2));
    map.get(8).destinations.add(new Pathway(null,map.get(11),2));
    map.get(8).destinations.add(new Pathway(null,map.get(12),2));
    map.get(8).destinations.add(new Pathway(null,map.get(12),2));
    map.get(8).destinations.add(new Pathway(Color.ORANGE,map.get(10),2));
    
    //connections from East Village
    map.get(9).destinations.add(new Pathway(null,map.get(7),2));
    map.get(9).destinations.add(new Pathway(Color.BLACK,map.get(11),1));
    map.get(9).destinations.add(new Pathway(Color.BLUE,map.get(8),2));
    
    //connections from Soho
    map.get(10).destinations.add(new Pathway(Color.PINK,map.get(6),4));
    map.get(10).destinations.add(new Pathway(Color.ORANGE,map.get(8),2));
    map.get(10).destinations.add(new Pathway(null,map.get(13),2));
    
    //connections from Lower East Side
    map.get(11).destinations.add(new Pathway(null,map.get(9),2));
    map.get(11).destinations.add(new Pathway(null,map.get(14),3));
    map.get(11).destinations.add(new Pathway(Color.BLUE,map.get(12),1));
    map.get(11).destinations.add(new Pathway(Color.BLACK,map.get(9),1));
    
    //connections from Chinatown
    map.get(12).destinations.add(new Pathway(null,map.get(8),2));
    map.get(12).destinations.add(new Pathway(null,map.get(8),2));
    map.get(12).destinations.add(new Pathway(Color.BLUE,map.get(11),1));
    map.get(12).destinations.add(new Pathway(Color.GREEN,map.get(13),1));
    map.get(12).destinations.add(new Pathway(Color.PINK,map.get(13),1));
    map.get(12).destinations.add(new Pathway(Color.RED,map.get(14),3));
    map.get(12).destinations.add(new Pathway(Color.ORANGE,map.get(14),3));
    
    //connections from Wall Street
    map.get(13).destinations.add(new Pathway(null,map.get(10),2));
    map.get(13).destinations.add(new Pathway(Color.GREEN,map.get(12),1));
    map.get(13).destinations.add(new Pathway(Color.PINK,map.get(12),1));
    map.get(13).destinations.add(new Pathway(Color.BLUE,map.get(14),3));
    map.get(13).destinations.add(new Pathway(Color.BLACK,map.get(14),3));
    
    //connections from Brooklyn
    map.get(14).destinations.add(new Pathway(Color.BLUE,map.get(13),3));
    map.get(14).destinations.add(new Pathway(Color.BLACK,map.get(13),3));
    map.get(14).destinations.add(new Pathway(Color.RED,map.get(12),3));
    map.get(14).destinations.add(new Pathway(Color.ORANGE,map.get(12),3));
    map.get(14).destinations.add(new Pathway(null,map.get(11),3));
    
    
    
    }
    
    public boolean checkPathwayAvailability(Player turn,ArrayList<TransportationCard> inputCards,int locationStart,int locationEnd){
        
        //inputCards is the cards picked
        //locationStart and Locationend correspond to the int value of city nodes
        Color c = inputCards.get(0).color;
        for(TransportationCard t:inputCards){
            if(!c.equals(t.color) ){
                System.out.println("Cards picked have the wrong color.");
                return false;
            }
            c = t.color;
        }
        //loop before checks to see if all the colors of the inputted cards are the same
        Node endNode = map.get(locationEnd);
        
        int length = inputCards.size();
        Node start = map.get(locationStart);
        for(Pathway p:start.destinations){
            if(p.color.equals(c)){
                if(p.end.name.equals(endNode.name)){
                System.out.println("Path taken from "+start.name+" to "+endNode.name);
                turn.takenPaths.add(p);
                start.destinations.remove(p);
                return true;
                }
            }
        }
        System.out.println("Path does not exist or has been taken.");
        return false;
    }
    
}
