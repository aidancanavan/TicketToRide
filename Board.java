import java.util.ArrayList;
import java.awt.Color;

/**
 * Constructs a board object for the game
 * Holds a transportation Card deck,
 * a destination card deck,
 * A list of players,
 * a list if colors (for transportation cards),
 * and a list of nodes (for the map)
 * 
 *
 * @author Aidan Canavan
 * @version 1.0
 */
////////////////////////////////////////////////////////////////////////////////
public class Board
{
    public Deck transDeck = new Deck();
    public Deck destDeck = new Deck();

    public ArrayList<Player> players = new ArrayList<Player>();
    public ArrayList<Color> colors = new ArrayList<Color>();
    public ArrayList<Node> map = new ArrayList<Node>();
    /**
     * Constructor for board object
     * Takes as input the number of players for the game
     */
    public Board(int numPlayers){
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        colors.add(Color.ORANGE);

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
        map.get(0).destinations.
        add(new Pathway(Color.ORANGE,map.get(0),map.get(1),2));
        map.get(0).destinations
        .add(new Pathway(Color.RED,map.get(0),map.get(2),2));
        map.get(0).destinations.
        add(new Pathway(Color.BLUE,map.get(0),map.get(3),2));
        map.get(0).destinations.
        add(new Pathway(Color.GREEN,map.get(0),map.get(3),2));

        //connections from Central Park
        map.get(1).destinations.
        add(new Pathway(Color.ORANGE,map.get(1),map.get(0),2));
        map.get(1).destinations.
        add(new Pathway(Color.PINK,map.get(1),map.get(4),3));
        map.get(1).destinations.
        add(new Pathway(Color.PINK,map.get(1),map.get(4),3));
        map.get(1).destinations.
        add(new Pathway(Color.RED,map.get(1),map.get(3),2));
        map.get(1).destinations.
        add(new Pathway(Color.BLACK,map.get(1),map.get(3),2));

        //connections from Midtown West
        map.get(2).destinations.
        add(new Pathway(Color.RED,map.get(2),map.get(0),2));
        map.get(2).destinations.
        add(new Pathway(null,map.get(2),map.get(3),1));
        map.get(2).destinations.
        add(new Pathway(Color.GREEN,map.get(2),map.get(5),2));
        map.get(2).destinations.
        add(new Pathway(Color.BLUE,map.get(2),map.get(6),2));

        //connections from Times Square
        map.get(3).destinations.
        add(new Pathway(Color.GREEN,map.get(3),map.get(0),2));
        map.get(3).destinations.
        add(new Pathway(Color.BLUE,map.get(3),map.get(0),2));
        map.get(3).destinations.
        add(new Pathway(Color.BLACK,map.get(3),map.get(1),2));
        map.get(3).destinations.
        add(new Pathway(Color.RED,map.get(3),map.get(1),2));
        map.get(3).destinations.
        add(new Pathway(null,map.get(3),map.get(2),1));
        map.get(3).destinations.
        add(new Pathway(null,map.get(3),map.get(4),2));
        map.get(3).destinations.
        add(new Pathway(Color.ORANGE,map.get(3),map.get(5),1));
        map.get(3).destinations.
        add(new Pathway(Color.PINK,map.get(3),map.get(5),1));

        //connections from United Nations
        map.get(4).destinations.
        add(new Pathway(Color.PINK,map.get(4),map.get(1),3));
        map.get(4).destinations.
        add(new Pathway(null,map.get(4),map.get(3),2));
        map.get(4).destinations.
        add(new Pathway(Color.GREEN,map.get(4),map.get(7),3));
        map.get(4).destinations.
        add(new Pathway(Color.BLACK,map.get(4),map.get(5),2));

        //connections from Empire State Building
        map.get(5).destinations.
        add(new Pathway(Color.GREEN,map.get(5),map.get(2),2));
        map.get(5).destinations.
        add(new Pathway(Color.BLACK,map.get(5),map.get(4),2));
        map.get(5).destinations.
        add(new Pathway(Color.PINK,map.get(5),map.get(3),1));
        map.get(5).destinations.
        add(new Pathway(Color.ORANGE,map.get(5),map.get(3),1));
        map.get(5).destinations.
        add(new Pathway(Color.RED,map.get(5),map.get(7),1));
        map.get(5).destinations.
        add(new Pathway(Color.BLUE,map.get(5),map.get(7),1));
        map.get(5).destinations.
        add(new Pathway(null,map.get(5),map.get(6),2));
        map.get(5).destinations.
        add(new Pathway(null,map.get(5),map.get(6),2));

        //connections from Chelsea
        map.get(6).destinations.
        add(new Pathway(Color.BLUE,map.get(6),map.get(2),2));
        map.get(6).destinations.
        add(new Pathway(null,map.get(6),map.get(5),2));
        map.get(6).destinations.
        add(new Pathway(null,map.get(6),map.get(5),2));
        map.get(6).destinations.
        add(new Pathway(Color.ORANGE,map.get(6),map.get(7),2));
        map.get(6).destinations.
        add(new Pathway(Color.RED,map.get(6),map.get(8),3));
        map.get(6).destinations.
        add(new Pathway(Color.GREEN,map.get(6),map.get(8),3));
        map.get(6).destinations.
        add(new Pathway(Color.PINK,map.get(6),map.get(10),4));

        //connections from Gramercy Park
        map.get(7).destinations.
        add(new Pathway(Color.GREEN,map.get(7),map.get(4),3));
        map.get(7).destinations.
        add(new Pathway(Color.BLUE,map.get(7),map.get(5),1));
        map.get(7).destinations.
        add(new Pathway(Color.RED,map.get(7),map.get(5),1));
        map.get(7).destinations.
        add(new Pathway(Color.ORANGE,map.get(7),map.get(6),2));
        map.get(7).destinations.
        add(new Pathway(Color.BLACK,map.get(7),map.get(8),2));
        map.get(7).destinations.
        add(new Pathway(Color.PINK,map.get(7),map.get(8),2));
        map.get(7).destinations.
        add(new Pathway(null,map.get(7),map.get(9),2));

        //connections from Greenwich Village
        map.get(8).destinations.
        add(new Pathway(Color.GREEN,map.get(8),map.get(6),3));
        map.get(8).destinations.
        add(new Pathway(Color.RED,map.get(8),map.get(6),3));
        map.get(8).destinations.
        add(new Pathway(Color.BLACK,map.get(8),map.get(7),2));
        map.get(8).destinations.
        add(new Pathway(Color.PINK,map.get(8),map.get(7),2));
        map.get(8).destinations.
        add(new Pathway(Color.BLUE,map.get(8),map.get(9),2));
        map.get(8).destinations.
        add(new Pathway(null,map.get(8),map.get(11),2));
        map.get(8).destinations.
        add(new Pathway(null,map.get(8),map.get(12),2));
        map.get(8).destinations.
        add(new Pathway(null,map.get(8),map.get(12),2));
        map.get(8).destinations.
        add(new Pathway(Color.ORANGE,map.get(8),map.get(10),2));

        //connections from East Village
        map.get(9).destinations.
        add(new Pathway(null,map.get(9),map.get(7),2));
        map.get(9).destinations.
        add(new Pathway(Color.BLACK,map.get(9),map.get(11),1));
        map.get(9).destinations.
        add(new Pathway(Color.BLUE,map.get(9),map.get(8),2));

        //connections from Soho
        map.get(10).destinations.
        add(new Pathway(Color.PINK,map.get(10),map.get(6),4));
        map.get(10).destinations.
        add(new Pathway(Color.ORANGE,map.get(10),map.get(8),2));
        map.get(10).destinations.
        add(new Pathway(null,map.get(10),map.get(13),2));

        //connections from Lower East Side
        map.get(11).destinations.
        add(new Pathway(null,map.get(11),map.get(9),2));
        map.get(11).destinations.
        add(new Pathway(null,map.get(11),map.get(14),3));
        map.get(11).destinations.
        add(new Pathway(Color.BLUE,map.get(11),map.get(12),1));
        map.get(11).destinations.
        add(new Pathway(Color.BLACK,map.get(11),map.get(9),1));

        //connections from Chinatown
        map.get(12).destinations.
        add(new Pathway(null,map.get(12),map.get(8),2));
        map.get(12).destinations.
        add(new Pathway(null,map.get(12),map.get(8),2));
        map.get(12).destinations.
        add(new Pathway(Color.BLUE,map.get(12),map.get(11),1));
        map.get(12).destinations.
        add(new Pathway(Color.GREEN,map.get(12),map.get(13),1));
        map.get(12).destinations.
        add(new Pathway(Color.PINK,map.get(12),map.get(13),1));
        map.get(12).destinations.
        add(new Pathway(Color.RED,map.get(12),map.get(14),3));
        map.get(12).destinations.
        add(new Pathway(Color.ORANGE,map.get(12),map.get(14),3));

        //connections from Wall Street
        map.get(13).destinations.
        add(new Pathway(null,map.get(13),map.get(10),2));
        map.get(13).destinations.
        add(new Pathway(Color.GREEN,map.get(13),map.get(12),1));
        map.get(13).destinations.
        add(new Pathway(Color.PINK,map.get(13),map.get(12),1));
        map.get(13).destinations.
        add(new Pathway(Color.BLUE,map.get(13),map.get(14),3));
        map.get(13).destinations.
        add(new Pathway(Color.BLACK,map.get(13),map.get(14),3));

        //connections from Brooklyn
        map.get(14).destinations.
        add(new Pathway(Color.BLUE,map.get(14),map.get(13),3));
        map.get(14).destinations.
        add(new Pathway(Color.BLACK,map.get(14),map.get(13),3));
        map.get(14).destinations.
        add(new Pathway(Color.RED,map.get(14),map.get(12),3));
        map.get(14).destinations.
        add(new Pathway(Color.ORANGE,map.get(14),map.get(12),3));
        map.get(14).destinations.
        add(new Pathway(null,map.get(14),map.get(11),3));

        initializeAllCards();
        ////////////////////////////////////////////////////////////////////////////////
    }
    
    /**
     * Check to see if a pathway is available to claim
     * @param turn The player who's turn it is
     * @param inputCards The cards used to attempt a claim
     * @param locationStart the identity number for the start location
     * @param locationEnd the identity number the for the end location
     * 
     */
    public boolean checkPathwayAvailability(Player turn,
    ArrayList<TransportationCard> inputCards,
    int locationStart,int locationEnd){

        //inputCards is the cards picked
        //locationStart and Locationend correspond to the int 
        //value of city nodes
        Color c = inputCards.get(0).color;

        //need checks for rainbow cards (should be done in loop below)
        
        //makes sure all are the same color, or rainbow
        for(TransportationCard t:inputCards){
            if(t.color!=null && !c.equals(t.color)){ //if not a taxi and not the color
                System.out.println("Cards picked have the wrong color.");
                return false;
            }
            c = t.color;
        }
        //loop before checks to see if all the colors of the 
        //inputted cards are the same
        
        Node endNode = map.get(locationEnd);

        int length = inputCards.size();
        Node start = map.get(locationStart);
        for(Pathway p:start.destinations){
            //these if statements are complicated because they need to account
            //for there being two pathways with null color and same 
            //length with different end nodes

            if((p.color.equals(c) || p.color.equals(null)) 
            && (p.length == length)){
                if(p.end.name.equals(endNode.name)){
                    System.out.println
                    ("Path taken from "+start.name+" to "+endNode.name);
                    turn.takenPaths.add(p);
                    turn.tokens = turn.tokens - p.length;
                    //two paths are added to the players list one from
                    //(a to b) and one from (b to a)
                    //this will make traversal easier later
                    
                    
                    //destinations is an arraylist of path 
                    start.destinations.remove(p);
                    for(Pathway g:endNode.destinations){
                        if((g.color.equals(c) || g.color.equals(null)) 
                        && (g.length == length)){
                            if(g.end.name.equals(start.name)){
                                turn.takenPaths.add(p);
                                endNode.destinations.remove(g);
                            }
                        }
                    }

                    return true;
                }
            }
        }
        System.out.println("Path does not exist or has been taken.");
        return false;
        //method must remove not only the pathway from the start node list
        //but also the reverse pathway coming from the end node
    }
    ////////////////////////////////////////////////////////////////////////////////
    /**
     * Simply a method to initialize all the cards for the game
     * Makes the appropriate amount of each card
     */
    public void initializeAllCards(){
        //Rainbow Cards, color is null
        String color = "RAINBOW";
        for(int i =0;i<7;i++){
            TransportationCard c =
                new TransportationCard(null,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "BLACK";
        for(int i =0;i<5;i++){
            TransportationCard c = 
                new TransportationCard(Color.BLACK,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "BLUE";
        for(int i =0;i<5;i++){
            TransportationCard c = 
                new TransportationCard(Color.BLUE,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "GREEN";
        for(int i =0;i<5;i++){
            TransportationCard c = new 
                TransportationCard(Color.GREEN,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "ORANGE";
        for(int i =0;i<5;i++){
            TransportationCard c = new 
                TransportationCard(Color.ORANGE,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "PINK";
        for(int i =0;i<5;i++){
            TransportationCard c = new 
                TransportationCard(Color.PINK,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "RED";
        for(int i =0;i<5;i++){
            TransportationCard c = new 
                TransportationCard(Color.RED,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        transDeck.shuffleWithDiscards();

        DestTickCard c = new DestTickCard(map.get(2),
                map.get(4),3,"./DESTCARDS/0.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(13),map.get(11),2,"./DESTCARDS/1.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(0),map.get(5),3,"./DESTCARDS/2.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(5),map.get(8),3,"./DESTCARDS/3.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(2),map.get(1),3,"./DESTCARDS/4.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(7),map.get(12),4,"./DESTCARDS/5.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(1),map.get(7),4,"./DESTCARDS/6.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(10),map.get(9),4,"./DESTCARDS/7.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(9),map.get(3),4,"./DESTCARDS/8.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(6),map.get(1),5,"./DESTCARDS/9.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(6),map.get(13),6,"./DESTCARDS/10.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(10),map.get(3),6,"./DESTCARDS/11.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(8),map.get(0),6,"./DESTCARDS/12.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(5),map.get(14),7,"./DESTCARDS/13.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(1),map.get(12),8,"./DESTCARDS/14.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(14),map.get(6),8,"./DESTCARDS/15.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(14),map.get(3),8,"./DESTCARDS/16.jpg");
        destDeck.discard(c);
        c = new DestTickCard(map.get(13),map.get(4),8,"./DESTCARDS/17.jpg");
        destDeck.discard(c);

        destDeck.shuffleWithDiscards();
        for(Card g: destDeck.cards){
            System.out.println((DestTickCard)g);
        }
    }
    
    /**
     * Main method, really just to be used for testing purposes 
     * @param args An array of String (Do not use)
     * 
     */
    public static void main(String args[]){
        //some tests
        Board b = new Board(2);
        for(Node n:b.map){
            System.out.println(n);
        }

    }
}
