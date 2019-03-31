package TicketToRide;


import java.util.*;
/**
* This class is used to show the players in the game  

 */
public class Player2
{
    //declares the player number and color
    public Player player;

    //the score of the player 
    int score = 0; 
    //player can only claim 2 routes
    int maxRouteClaim = 2; 


    // list of the users transportation tickets  
    ArrayList<TransDeck> playerTransportation;
    // list of the users destination tickets
    ArrayList<DestDeck> playerDestination ; 

    // list of completed paths the player claimed
    ArrayList<Pathway> compPathways; 

    /**
     * Constructor for the player Object  
     * 
     */
    public Player2(Player players){
        // need to set the player ident
        this.player = players; 

        // score set to starting value of 0 already

        // player starts with no cards
        this.playerTransportation = new ArrayList<>();
        this.playerDestination= new ArrayList<>();
        

   

 

        //initalize the compPathways arraylist, 
        //player has yet to claim a pathway
        compPathways = new ArrayList<>();

    }

        }