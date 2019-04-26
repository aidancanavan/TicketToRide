import java.util.ArrayList;
import java.awt.Color;
import java.util.*;

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
    public ArrayList<TransportationCard> faceUps = new ArrayList<TransportationCard>();

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
            players.add(new Player("PLACEHOLDER "+ i,i,colors.get(i)));
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
     * Method used to claim a route for a given player
     * //NEEDS MORE TESTING
     * @param p Player who is claiming route
     * @param locationStart Number of the starting location
     * @param locationEnd Number of the end location
     */
    public void claimRoute(Player p, int locationStart,int locationEnd){
        Scanner scan = new Scanner(System.in);
        ArrayList<TransportationCard> inputCards = new ArrayList<TransportationCard>();
        System.out.print("How many cards are you using to claim a route?");
        int numCards = scan.nextInt();

        //see if user is using any rainbow cards
        System.out.print("How many rainbow cards are you using to claim a route?");
        int numRainbow = scan.nextInt();
        int count = 0;
        for (int i =0; i < p.hand.size();i++){
            if (count == numRainbow) break; //exit loop once proper amount of taxi cards
            //were selected
            //check here to see if the current card is the color we are looking for,
            //if it is, remove it from the player and add it to the cards to check
            if (p.hand.get(i).color.equals(null)){
                count++;
                TransportationCard temp = p.hand.remove(i);
                inputCards.add(temp);
            }           
        }
        if (count!=numRainbow){
            System.out.println("You do not have " + numRainbow + " rainbow cards.");
        }
        boolean isValidColor=false;
        Color c = Color.white; //just set to white to instantiate
        String color; 
        //ask user what color they are using
        do {
            System.out.print("What color cards are you using?");
            color = scan.next();
            //blue, green, black, pink, red, orange
            if (color.equals("red")){
                c = Color.red;
                isValidColor=true;
            }
            else if (color.equals("blue")){
                c = Color.blue;
                isValidColor=true;
            }
            else if (color.equals("black")){
                c = Color.black;
                isValidColor=true;
            }
            else if (color.equals("pink")){
                c = Color.pink;
                isValidColor=true;
            }
            else if (color.equals("orange")){
                c = Color.orange;
                isValidColor=true;
            }
            else if (color.equals("green")){
                c = Color.green;
                isValidColor=true;
            }
            else{
                System.out.println("Invalid color");
            }
        }
        while (!isValidColor);

        //prompt user for how many colored cards they will be using
        System.out.print("How many " + color + " cards are you using to claim a route?");
        int numColor = scan.nextInt();
        int count1 = 0;
        for (int i =0; i < p.hand.size();i++){
            if (count1 == numColor) break; //exit loop once proper amount of colored cards
            //were selected
            //check here to see if the current card is the color we are looking for,
            //if it is, remove it from the player and add it to the cards to check
            if (p.hand.get(i).color.equals(c)){ 
                count1++;
                TransportationCard temp = p.hand.remove(i);
                inputCards.add(temp);
            }           
        }
        if (count1!=numColor){ //if they don't have the proper number of color cards
            System.out.println("You do not have " + numColor + " " + color + " cards.");
        }

        //if the player did not select the proper amount of taxis and colored cards
        //or they don't have the amount that they asked to select
        //tell them they did not select the correct amount of cards and move to the next turn
        if (count + count1 != numCards){
            System.out.println("You do not have " + numCards + " valid cards.");
            return;
        }

        if(!checkPathwayAvailability(p,inputCards, locationStart, locationEnd)){
            //give the player their cards back
            p.hand.addAll(inputCards);
        }

        //otherwise you can claim the path and we are done
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

    /**
     * This lets a player choose cards from the deck  
     * should reveal two cards from top of deck
     * user can add both, and must add 1
     * returned cards are placed at bottom of deck
     * This is a text version for now, gui update later
     * //TESTED AND WORKS
     * @param p Player that will be drawing cards
     */
    public void drawDestCards(Player p){
        //draw the two cards from the top 
        DestTickCard card1 = (DestTickCard)destDeck.draw();
        if (destDeck.cards.size()==1 && destDeck.discards.isEmpty()){
            p.myDestCards.add(card1); // player has to draw a card if only one left
        }

        DestTickCard card2 = (DestTickCard)destDeck.draw();

        //reveal the two cards 
        System.out.println("You drew a " + card1 + " and a " + card2);
        System.out.print("Would you like to keep both?");
        Scanner scan = new Scanner(System.in);
        if(scan.next().equals("yes")){ //user keeps both cards
            p.myDestCards.add(card1);
            p.myDestCards.add(card2);
            System.out.println("You added a " + card1 + " and a " + card2);
            return;
        }
        else{
            System.out.print("You must keep at least 1, which one would you like to keep?");
            if (scan.next().equals("1")){ //user keeps the first card
                p.myDestCards.add(card1);
                System.out.println("You added a " + card1);
                destDeck.cards.add(0,card2); //add other card back to bottom of deck
                return;
            }
            else { //user keeps the second card
                p.myDestCards.add(card2);
                System.out.println("You added a " + card2);
                destDeck.cards.add(0,card1); //add other card back to bottom of deck
                return;
            }
        }       
    }   

    /**
     * This is if the player chooses to draw transcards during their turn
     * Tested and works!
     * @param p Player that is drawing the transportation card
     * 
     */
    public void drawTransCard(Player p){
        Scanner scan = new Scanner(System.in);
        System.out.println("This is your first draw."); 
        System.out.print("Would you like to draw from the deck or the face up cards?");
        if (scan.next().equals("deck")){ //draw a card from the top of the deck
            TransportationCard card1 = drawFromDeck(p);
            p.hand.add(card1);
            System.out.println("You added a " + card1);
        }
        else { //draw a card from the face up cards
            TransportationCard card1 = drawFromFaceUp(p);
            p.hand.add(card1);
            System.out.println("You added a " + card1);
            if (card1.color.equals(null)){
                //if player draws a taxi, they can't draw another card
                System.out.println("You added a taxi, so you cannot draw anymore cards this turn");
                return;
            }
        }
        System.out.println("This is your second draw."); 
        System.out.print("Would you like to draw from the deck or the face up cards?");
        if (scan.next().equals("deck")){
            TransportationCard card2 = drawFromDeck(p);
            p.hand.add(card2);
            System.out.println("You added a " + card2);
        }
        else {
            TransportationCard card2 = drawFromFaceUp(p);
            p.hand.add(card2);
            System.out.println("You added a " + card2);
        }

    }

    /**
     * Provides new faceUp cards for the faceUp deck
     * Will only ever be called if stupidTaxiCondition returns true
     */
    public void newFaceUps(){

        transDeck.discards.addAll(faceUps);
        faceUps.clear();
        for (int i = 0; i <5;i++){
            faceUps.add((TransportationCard)transDeck.draw());
        }
    }

    /**
     * Checks to see if there is three or more taxi cards in the faceUp Deck
     * If there is, then the cards need to be discarded into the the discard pile
     * I named it stupidTaxiCondition because it is an antiquated rule
     * @return true if condition is fullfilled, else false
     */    
    public boolean stupidTaxiCondition(){
        int count = 0;
        for (TransportationCard card: faceUps){
            if (card.color.equals(null)){
                count++;
            }            
        }
        if (count>=3) return true;
        return false;
    }

    /**
     * This lets a player draw cards from the deck, just draws from the top of the deck
     * Tested and works!
     * @param p Player that is drawing the card
     */
    public TransportationCard drawFromDeck(Player p){
        return (TransportationCard)transDeck.draw();
    }

    /**
     * This lets a player choose cards from the face up cards 
     * Tested and works!
     * @param p Player that is drawing the card
     */
    public TransportationCard drawFromFaceUp(Player p){
        boolean isTaxi = false;
        int index =0;
        TransportationCard card = null; //just instantiating outside loop
        do {
            System.out.println("Choose which card you would like to draw (range 0 - 4");
            Scanner scan = new Scanner(System.in);
            index = scan.nextInt();
            if (!faceUps.get(index).color.equals(null)){ //if this is a taxi, you can't draw it, so gotta check that
                card = faceUps.remove(index);   
                faceUps.add((TransportationCard)transDeck.draw());
                isTaxi = false;
            }
            else {
                isTaxi=true;
                System.out.println("You can't pick a taxi as your second card");
            }
        } while(isTaxi);       
        return card;
    }

    ////////////////////////////////////////////////////////////////////////////////
    /**
     * Simply a method to initialize all the cards for the game
     * Makes the appropriate amount of each card
     */
    public void initializeAllCards(){
        //Rainbow Cards, color is null
        String color = "RAINBOW";
        for(int i =0;i<=7;i++){
            TransportationCard c =
                new TransportationCard(null,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "BLACK";
        for(int i =0;i<=5;i++){
            TransportationCard c = 
                new TransportationCard(Color.BLACK,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "BLUE";
        for(int i =0;i<=5;i++){
            TransportationCard c = 
                new TransportationCard(Color.BLUE,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "GREEN";
        for(int i =0;i<=5;i++){
            TransportationCard c = new 
                TransportationCard(Color.GREEN,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "ORANGE";
        for(int i =0;i<=5;i++){
            TransportationCard c = new 
                TransportationCard(Color.ORANGE,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "PINK";
        for(int i =0;i<=5;i++){
            TransportationCard c = new 
                TransportationCard(Color.PINK,"./TRANSCARDS/"+color+".jpg");
            transDeck.discard(c);
        }
        color = "RED";
        for(int i =0;i<=5;i++){
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

        destDeck.shuffleWithDiscards(); //all cards are in the discard pile

        for (int i =0; i <5; i++){ // make 5 cards faceUp
            faceUps.add((TransportationCard)transDeck.draw());
        }
        //so add them to the cards pile

        // for(Card g: transDeck.cards){
        // System.out.println((TransportationCard)g);
        // }
        // System.out.println();
        // for(Card g: destDeck.cards){
        // System.out.println((DestTickCard)g);
        // }

        dealingStartingHand();
    }

    /**
     * Method that will deal the starting hand for each player. 
     */
    public void dealingStartingHand(){
        //deals 5 trans cards to each player
        for(int i=0; i<players.size(); i++){
            //deals 5 trans cards to each player
            for(int j=0; j<5;j++){
                Player p = players.get(i);
                p.hand.add((TransportationCard)transDeck.draw());
            }
            //deals 2 dest cards to each player
            for(int k=0; k<2;k++){
                Player p = players.get(i);
                p.myDestCards.add((DestTickCard)destDeck.draw());
            }
        }
    }
    //THIS IS ONE POSSIBLE WAY TO SEE IF A DEST TICK CARD IS COMPLETED 
    // // Prints all paths from
    // // 's' to 'd'
    // public void printAllPaths(Node start, Node dest) 
    // {
    // //boolean[] isVisited = new boolean[v];
    // //dont need this, it would be a boolean array each vertex as visited
    // // ours just will set the Node's visited to true and falsemarking 
    // ArrayList<Pathway> pathList = new ArrayList<Pathway>(); 

    // //add source to path[]
    // //pathList.add(new Node());this should be the source node A

    // //Call recursive utility 
    // //(so rather than printing all the paths, add them to a list)
    // printAllPathsUtil(start, dest, pathList);
    // }

    // // A recursive function to print
    // // all paths from 'u' to 'd'.
    // // isVisited[] keeps track of
    // // vertices in current path.
    // // localPathList<> stores actual
    // // vertices in the current path
    // private void printAllPathsUtil(Node u, Node d, ArrayList<Pathway> localPathList) {

    // // Mark the current node
    // u.setVisited();
    // //isVisited[u] = true;

    // if (u.equals(d)) //this is where we would add to the list
    // {
    // System.out.println(localPathList);
    // }

    // // Recur for all the vertices
    // // adjacent to current vertex
    // //need to create a list of all adjacent vertices (nodes) here 
    // for (Pathway i : u.destinations) 
    // {

    // }
    // for (Pathway i : u.destinations) 
    // {

    // if (!i.end.visited)
    // {
    // // store current node 
    // // in path[]
    // localPathList.add(i);
    // printAllPathsUtil(u, d, localPathList);

    // // remove current node
    // // in path[]
    // localPathList.remove(i);
    // }
    // }

    // // Mark the current node
    // //isVisited[u] = false;
    // u.resetVisited();
    // }

    // public boolean pathExists(DestTickCard card){
    // // each player has their list of pathways claimed.
    // Node a = card.a;
    // Node b = card.b;
    // // each dest card has Nodes A and B 
    // // could make a list of all possible paths from A to B or B to A (of length < 10)

    // // if the players have all the pathways in that path, then we found one

    // // so basically a method needs to generate all the paths from one place to another (A to B on the destination card)

    // // loop through every path
    // // then check to see if the players list of pathways claims          contains everything on that path. 
    // // If so, then card is fullfilled

    // // if we searched through every single path, and found nothing, card is not fulfilled and player loses points

    // return false;
    // }

    //THIS IS ANOTHER WAY TO CHECK TO SEE IF WE HAVE COMPLETED A DEST TICKET CARD
    // /**
    // * Method for traversing the graph to figure out
    // * which destination cards are completed for each player
    // * 
    // * @param p Player
    // */
    // protected void traverseDestinations(Player p) 
    // {
    // for (DestinationCard card : p.destinations) 
    // {
    // boolean done = false;
    // ArrayList<City> reachableCities = new ArrayList<City>();
    // while (!done) 
    // {
    // done = true; 
    // for (Route route : p.controlledRoutes) 
    // {
    // City city1 = route.twoCities.get(0);
    // City city2 = route.twoCities.get(1);
    // if(reachableCities.isEmpty())
    // {
    // if(allCities.get(card.city1).equals(city1) || 
    // allCities.get(card.city2).equals(city1)) 
    // {
    // reachableCities.add(city1);
    // done = false;
    // }
    // else if(allCities.get(card.city1).equals(city2) || 
    // allCities.get(card.city2).equals(city2)) 
    // {
    // reachableCities.add(city2);
    // done = false;
    // }
    // }
    // else if(!city1.isCountry && 
    // reachableCities.contains(city1) && 
    // !reachableCities.contains(city2)) 
    // {
    // reachableCities.add(city2);
    // done = false;
    // }
    // else if(!city2.isCountry && 
    // reachableCities.contains(city2) &&
    // !reachableCities.contains(city1)) 
    // {
    // reachableCities.add(city1);
    // done = false;
    // }
    // }
    // }
    // //Check if both card cities are reachable to complete card
    // if(reachableCities.contains(allCities.get(card.city1)) && 
    // reachableCities.contains(allCities.get(card.city2))) 
    // {
    // p.completedDestinations.add(card);
    // p.numCompletedDest++;
    // }
    // }

    // for(DestinationCard completed : p.completedDestinations) 
    // {
    // p.destinations.remove(completed);
    // }
    // }

    /**
     * Main method, really just to be used for testing purposes 
     * @param args An array of String (Do not use)
     * 
     */
    public static void main(String args[]){
        //some tests
        Board b = new Board(4);
        // for(Node n:b.map){
        // System.out.println(n);
        // }
        Player p = new Player("player1", 1,Color.red);
        // System.out.println(p);
        // System.out.println(b.destDeck.cards.size());

        //b.drawDestCards(p);
        // System.out.println(b.transDeck.cards.size());

        // for (Card c: b.transDeck.cards){
        // System.out.println((TransportationCard)c);
        // }

        //b.drawTransCard(p);

        // for (TransportationCard c: b.faceUps){
        // System.out.println(c);
        // }
        // System.out.println(b.transDeck.cards.size());

        // for (Player p: b.players){
        // System.out.println(p);
        // }

    }
}
