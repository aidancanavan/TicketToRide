package TicketToRide;

import java.awt.Color;
/**
 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum Player{
    
    /**
     * This enum represents the five players with each player
     * being assigned one color. 
    
     */


    Player1(Color.MAGENTA),

    Player2(Color.YELLOW),

    Player3(Color.BLUE),

    Player4(Color.WHITE);

    

    public Color playerColor;
    Player(Color playerColor){
        this.playerColor = playerColor;
    }

}
