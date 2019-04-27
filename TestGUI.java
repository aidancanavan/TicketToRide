import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * class used to test and build the board GUI for TTR
 * currently used for finding button locations of nodes and
 * paths
 * 
 * author(Matt Fletcher)
 * version(1.0)
 */
public class TestGUI extends JPanel implements MouseListener {
    public ArrayList<JButton> points= new ArrayList<>();
    public int firstSelection = -1;
    public int secondSelection = -1;
    public Board myBoard = new Board(4);
    public int playersTurn=0;
    public ArrayList<TransportationCard> input = new ArrayList<TransportationCard>();
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    static JFrame f = new JFrame();
    public void mouseEntered( MouseEvent e ) { }

    public void mouseExited( MouseEvent e ) { }

    public void mousePressed( MouseEvent e ) { }

    public void mouseReleased( MouseEvent e ) { }

    public void mouseClicked( MouseEvent e ) {

    }

    public void switchTurn(){
        if(playersTurn == myBoard.players.size()-1){
            playersTurn =0;
        }
        else{
            playersTurn++;
        }
    }

    public TestGUI(){

        try {
            f.add(new JLabel(new ImageIcon(ImageIO.read(new File("theMap.jpg")))),BorderLayout.WEST);
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        //buttongroup contructions
        f.setPreferredSize(new Dimension(1024,1024));
        f.setResizable(false);

        //creating buttons to coorespond with each location on game board
        JButton lincolnCenter = new JButton();
        lincolnCenter.setBackground(Color.RED);
        lincolnCenter.setBounds(115,20, 30,30);
        lincolnCenter.setOpaque(true);
        lincolnCenter.setContentAreaFilled(true);
        lincolnCenter.setBorderPainted(true);
        lincolnCenter.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    //add node numbers to return
                    //add handling for path selection
                    lincolnCenter.setBackground(Color.blue);
                    JOptionPane.showMessageDialog(null,"You've Selected Lincoln Center");
                    selection(0);
                }
            });
        //all buttons needs to be moved 635 to the right and 15 up
        JButton centralPark = new JButton();
        centralPark.setBounds(295,10,30,30);
        centralPark.setOpaque(true);;
        centralPark.setContentAreaFilled(true);
        centralPark.setBorderPainted(true);
        centralPark.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Central Park");
                    selection(1);
                }
            });

        JButton midtownWest = new JButton();
        midtownWest.setBounds(100,215, 30,30);
        midtownWest.setOpaque(true);;
        midtownWest.setContentAreaFilled(true);
        midtownWest.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected MidTown West");
                    selection(2);
                }
            });

        JButton timesSquare = new JButton();
        timesSquare.setBounds(200,190, 30,30);
        timesSquare.setOpaque(true);;
        timesSquare.setContentAreaFilled(true);
        timesSquare.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected TimesSquare");
                    selection(3);
                }
            });

        JButton unitedNations = new JButton();
        unitedNations.setBounds(460,180, 30,30);
        unitedNations.setOpaque(true);;
        unitedNations.setContentAreaFilled(true);
        unitedNations.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected United Nations");
                    selection(4);
                }
            });

        JButton empireState = new JButton();
        empireState.setBounds(300,303, 30,30);
        empireState.setOpaque(true);;
        empireState.setContentAreaFilled(true);
        empireState.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Empire State Building");
                    selection(5);
                }
            });

        JButton chelsea = new JButton();
        chelsea.setBounds(120,415, 30,30);
        chelsea.setOpaque(true);
        chelsea.setContentAreaFilled(true);
        chelsea.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Chelsea");
                    selection(6);
                }
            });

        JButton gramercyPark = new JButton();
        gramercyPark.setBounds(380,403, 30,30);
        gramercyPark.setOpaque(true);;
        gramercyPark.setContentAreaFilled(true);
        gramercyPark.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Gramercy Park");
                    selection(7);
                }
            });

        JButton greenwichVillage = new JButton();
        greenwichVillage.setBounds(335,579, 30,30);
        greenwichVillage.setOpaque(true);;
        greenwichVillage.setContentAreaFilled(true);
        greenwichVillage.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Greenwich Village");
                    selection(8);
                }
            });

        JButton eastVillage = new JButton();
        eastVillage.setBounds(525,568, 30,30);
        eastVillage.setOpaque(true);;
        eastVillage.setContentAreaFilled(true);
        eastVillage.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected East Village");
                    selection(9);
                }
            });

        JButton soho = new JButton();
        soho.setBounds(225,745, 30,30);
        soho.setOpaque(true);;
        soho.setContentAreaFilled(true);
        soho.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Soho");
                    selection(10);
                }
            });

        JButton chinaTown = new JButton();
        chinaTown.setBounds(380,765, 30,30);
        chinaTown.setOpaque(true);;
        chinaTown.setContentAreaFilled(true);
        chinaTown.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected ChinaTown");
                    selection(12);
                }
            });

        JButton lowerEast = new JButton();
        lowerEast.setBounds(505,693, 30,30);
        lowerEast.setOpaque(true);;
        lowerEast.setContentAreaFilled(true);
        lowerEast.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Lower East");
                    selection(11);
                }
            });

        JButton wallStreet = new JButton();
        wallStreet.setBounds(330,903, 30,30);
        wallStreet.setOpaque(true);;
        wallStreet.setContentAreaFilled(true);
        wallStreet.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Wall Street");
                    selection(13);
                }
            });

        JButton brooklyn = new JButton();
        brooklyn.setBounds(590, 925, 30, 30);
        brooklyn.setOpaque(true);;
        brooklyn.setContentAreaFilled(true);
        brooklyn.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Brooklyn");
                    selection(13);
                }
            });

        // 775,25, 30,30
        //creating pathbuttons
        JButton linc_Mid = new JButton();
        linc_Mid.setBounds(760,120,30,30);
        linc_Mid.setOpaque(true);
        linc_Mid.setContentAreaFilled(true);
        linc_Mid.setBorderPainted(false);
        // linc_Mid.setBorderPainted(true);
        //linc_Mid.setContentAreaFilled(true);
        linc_Mid.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    // Random rand = new Random();
                    // int ran = rand.nextInt(2);
                    // if (ran==0){
                    // linc_Mid.setBackground(Color.red);
                    // }
                    // else{
                    // linc_Mid.setBackground(Color.blue);
                    // }

                    JOptionPane.showMessageDialog(null,"You've Selected the Lincoln Center to Midwest Route");

                }
            });

        JButton linc_Cen = new JButton();
        linc_Cen.setBounds(152,20,140,30);
        linc_Cen.setOpaque(true);;
        linc_Cen.setBorderPainted(false);
        linc_Cen.setContentAreaFilled(true);
        linc_Cen.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Lincoln Center to Central Park Route");

                }
            });

        JButton times_Nations = new JButton();
        times_Nations.setBounds(290,185,145,35);
        times_Nations.setOpaque(true);;
        times_Nations.setBorderPainted(false);
        times_Nations.setContentAreaFilled(true);
        times_Nations.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Times Square to United Nations Route");

                }
            });

        JButton linc_Times1 = new JButton();
        linc_Times1.setBounds(290,185,145,35);
        linc_Times1.setOpaque(true);;
        linc_Times1.setBorderPainted(false);
        linc_Times1.setContentAreaFilled(true);
        linc_Times1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Lincoln Center to Times Square Route 1");

                }
            });

        JButton linc_Times2 = new JButton();
        linc_Times2.setBounds(290,185,145,35);
        linc_Times2.setOpaque(true);;
        linc_Times2.setBorderPainted(false);
        linc_Times2.setContentAreaFilled(true);
        linc_Times2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Lincoln Center to Times Square Route 2");

                }
            });

        JButton brook_Wall1 = new JButton();
        brook_Wall1.setBounds(152,20,140,30);
        brook_Wall1.setOpaque(true);;
        brook_Wall1.setBorderPainted(false);
        brook_Wall1.setContentAreaFilled(true);
        brook_Wall1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Brooklyn-Wall Street Route 1");

                }
            });

        JButton brook_Wall2 = new JButton();
        brook_Wall2.setBounds(152,20,140,30);
        brook_Wall2.setOpaque(true);;
        brook_Wall2.setBorderPainted(false);
        brook_Wall2.setContentAreaFilled(true);
        brook_Wall2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Brooklyn-Wall Street Route 2");

                }
            });

        JButton wall_Soho = new JButton();
        wall_Soho.setBounds(152,20,140,30);
        wall_Soho.setOpaque(true);;
        wall_Soho.setBorderPainted(false);
        wall_Soho.setContentAreaFilled(true);
        wall_Soho.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Wall Street to Soho Route");

                }
            });

        JButton wall_China1 = new JButton();
        wall_China1.setBounds(152,20,140,30);
        wall_China1.setOpaque(true);;
        wall_China1.setBorderPainted(false);
        wall_China1.setContentAreaFilled(true);
        wall_China1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Wall Street to Chinatown Route 1");

                }
            });

        JButton wall_China2 = new JButton();
        wall_China2.setBounds(152,20,140,30);
        wall_China2.setOpaque(true);;
        wall_China2.setBorderPainted(false);
        wall_China2.setContentAreaFilled(true);
        wall_China2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Wall Street to Chinatown Route 2");

                }
            });

        JButton brook_China1 = new JButton();
        brook_China1.setBounds(152,20,140,30);
        brook_China1.setOpaque(true);;
        brook_China1.setBorderPainted(false);
        brook_China1.setContentAreaFilled(true);
        brook_China1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Brooklyn to Chinatown Route 1");

                }
            });

        JButton brook_China2 = new JButton();
        brook_China2.setBounds(152,20,140,30);
        brook_China2.setOpaque(true);;
        brook_China2.setBorderPainted(false);
        brook_China2.setContentAreaFilled(true);
        brook_China2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Brooklyn to Chinatown Route 2");

                }
            });

        JButton brook_lowerEast = new JButton();
        brook_lowerEast.setBounds(152,20,140,30);
        brook_lowerEast.setOpaque(true);;
        brook_lowerEast.setBorderPainted(false);
        brook_lowerEast.setContentAreaFilled(true);
        brook_lowerEast.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Brooklyn to Lower East Side Route");

                }
            });

        JButton China_lowerEast = new JButton();
        China_lowerEast.setBounds(152,20,140,30);
        China_lowerEast.setOpaque(true);;
        China_lowerEast.setBorderPainted(false);
        China_lowerEast.setContentAreaFilled(true);
        China_lowerEast.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Chinatown to Lower East Side Route");

                }
            });

        JButton soho_Green = new JButton();
        soho_Green.setBounds(152,20,140,30);
        soho_Green.setOpaque(true);;
        soho_Green.setBorderPainted(false);
        soho_Green.setContentAreaFilled(true);
        soho_Green.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Soho to Greenwich Village Route");

                }
            });

        JButton lower_Green = new JButton();
        lower_Green.setBounds(152,20,140,30);
        lower_Green.setOpaque(true);;
        lower_Green.setBorderPainted(false);
        lower_Green.setContentAreaFilled(true);
        lower_Green.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Lower East Side to Greenwich Village Route");

                }
            });

        JButton lower_East = new JButton();
        lower_East.setBounds(152,20,140,30);
        lower_East.setOpaque(true);;
        lower_East.setBorderPainted(false);
        lower_East.setContentAreaFilled(true);
        lower_East.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Lower East Side to East Village Route");

                }
            });

        JButton green_East = new JButton();
        green_East.setBounds(152,20,140,30);
        green_East.setOpaque(true);;
        green_East.setBorderPainted(false);
        green_East.setContentAreaFilled(true);
        green_East.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Greenwich to East Village Route");

                }
            });

        JButton china_Green1 = new JButton();
        china_Green1.setBounds(152,20,140,30);
        china_Green1.setOpaque(true);;
        china_Green1.setBorderPainted(false);
        china_Green1.setContentAreaFilled(true);
        china_Green1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Chinatown to Greenwich Village Route 1");

                }
            });

        JButton china_Green2 = new JButton();
        china_Green2.setBounds(152,20,140,30);
        china_Green2.setOpaque(true);;
        china_Green2.setBorderPainted(false);
        china_Green2.setContentAreaFilled(true);
        china_Green2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Chinatown to Greenwich Village Route 2");

                }
            });

        JButton green_Gram1 = new JButton();
        green_Gram1.setBounds(152,20,140,30);
        green_Gram1.setOpaque(true);;
        green_Gram1.setBorderPainted(false);
        green_Gram1.setContentAreaFilled(true);
        green_Gram1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Greenwich Village to Gramercy Park Route 1");

                }
            });

        JButton green_Gram2 = new JButton();
        green_Gram2.setBounds(152,20,140,30);
        green_Gram2.setOpaque(true);;
        green_Gram2.setBorderPainted(false);
        green_Gram2.setContentAreaFilled(true);
        green_Gram2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Greenwich Village to Gramercy Park Route 2");

                }
            });

        JButton chelsea_Gram = new JButton();
        chelsea_Gram.setBounds(152,20,140,30);
        chelsea_Gram.setOpaque(true);;
        chelsea_Gram.setBorderPainted(false);
        chelsea_Gram.setContentAreaFilled(true);
        chelsea_Gram.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Chelsea to Gramercy Park Route");

                }
            });

        JButton east_Gram = new JButton();
        east_Gram.setBounds(152,20,140,30);
        east_Gram.setOpaque(true);;
        east_Gram.setBorderPainted(false);
        east_Gram.setContentAreaFilled(true);
        east_Gram.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the East Village to Gramercy Park Route");

                }
            });

        JButton soho_Chelsea = new JButton();
        soho_Chelsea.setBounds(152,20,140,30);
        soho_Chelsea.setOpaque(true);;
        soho_Chelsea.setBorderPainted(false);
        soho_Chelsea.setContentAreaFilled(true);
        soho_Chelsea.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Soho to Chelsea Route");

                }
            });

        JButton chelsea_Empire1 = new JButton();
        chelsea_Empire1.setBounds(152,20,140,30);
        chelsea_Empire1.setOpaque(true);;
        chelsea_Empire1.setBorderPainted(false);
        chelsea_Empire1.setContentAreaFilled(true);
        chelsea_Empire1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Chelsea to Empire State Building Route 1");

                }
            });

        JButton chelsea_Empire2 = new JButton();
        chelsea_Empire2.setBounds(152,20,140,30);
        chelsea_Empire2.setOpaque(true);;
        chelsea_Empire2.setBorderPainted(false);
        chelsea_Empire2.setContentAreaFilled(true);
        chelsea_Empire2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Chelsea to Empire State Building Route 2");

                }
            }); 
        JButton gram_Empire1 = new JButton();
        gram_Empire1.setBounds(152,20,140,30);
        gram_Empire1.setOpaque(true);;
        gram_Empire1.setBorderPainted(false);
        gram_Empire1.setContentAreaFilled(true);
        gram_Empire1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Gramercy Park to Empire State Building Route 1");

                }
            });

        JButton gram_Empire2 = new JButton();
        gram_Empire2.setBounds(152,20,140,30);
        gram_Empire2.setOpaque(true);;
        gram_Empire2.setBorderPainted(false);
        gram_Empire2.setContentAreaFilled(true);
        gram_Empire2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Gramercy Park to Empire State Building Route 2");

                }
            });

        JButton united_Empire = new JButton();
        united_Empire.setBounds(152,20,140,30);
        united_Empire.setOpaque(true);;
        united_Empire.setBorderPainted(false);
        united_Empire.setContentAreaFilled(true);
        united_Empire.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the United Nations to Empire State Building Route");

                }
            });

        JButton times_Mid = new JButton();
        times_Mid.setBounds(152,20,140,30);
        times_Mid.setOpaque(true);;
        times_Mid.setBorderPainted(false);
        times_Mid.setContentAreaFilled(true);
        times_Mid.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Times Square to Midtown West Route");

                }
            });

        JButton green_Chelsea1 = new JButton();
        green_Chelsea1.setBounds(152,20,140,30);
        green_Chelsea1.setOpaque(true);;
        green_Chelsea1.setBorderPainted(false);
        green_Chelsea1.setContentAreaFilled(true);
        green_Chelsea1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Greenwich Village to Chelsea 1");

                }
            });

        JButton green_Chelsea2 = new JButton();
        green_Chelsea2.setBounds(152,20,140,30);
        green_Chelsea2.setOpaque(true);;
        green_Chelsea2.setBorderPainted(false);
        green_Chelsea2.setContentAreaFilled(true);
        green_Chelsea2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Greenwich Village to Chelsea 2");

                }
            });

        JButton chelsea_Mid = new JButton();
        chelsea_Mid.setBounds(152,20,140,30);
        chelsea_Mid.setOpaque(true);;
        chelsea_Mid.setBorderPainted(false);
        chelsea_Mid.setContentAreaFilled(true);
        chelsea_Mid.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Chelsea to Midtown West");

                }
            });

        JButton gram_United = new JButton();
        gram_United.setBounds(152,20,140,30);
        gram_United.setOpaque(true);;
        gram_United.setBorderPainted(false);
        gram_United.setContentAreaFilled(true);
        gram_United.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Gramercy Park to United Nations Route");

                }
            });

        JButton central_Times1 = new JButton();
        central_Times1.setBounds(152,20,140,30);
        central_Times1.setOpaque(true);;
        central_Times1.setBorderPainted(false);
        central_Times1.setContentAreaFilled(true);
        central_Times1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Central Park to Times Square Route 1");

                }
            });

        JButton central_Times2 = new JButton();
        central_Times2.setBounds(152,20,140,30);
        central_Times2.setOpaque(true);;
        central_Times2.setBorderPainted(false);
        central_Times2.setContentAreaFilled(true);
        central_Times2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Central Park to Times Square Route 2");

                }
            });

        JButton central_United = new JButton();
        central_United.setBounds(152,20,140,30);
        central_United.setOpaque(true);;
        central_United.setBorderPainted(false);
        central_United.setContentAreaFilled(true);
        central_United.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Central Park to United Nations");

                }
            });

        JButton empire_Times1 = new JButton();
        empire_Times1.setBounds(152,20,140,30);
        empire_Times1.setOpaque(true);;
        empire_Times1.setBorderPainted(false);
        empire_Times1.setContentAreaFilled(true);
        empire_Times1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Empire State Building to Times Square 1");

                }
            });

        JButton empire_Times2 = new JButton();
        empire_Times2.setBounds(152,20,140,30);
        empire_Times2.setOpaque(true);;
        empire_Times2.setBorderPainted(false);
        empire_Times2.setContentAreaFilled(true);
        empire_Times2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Empire State Building to Times Square 2");

                }
            });

        JButton empire_Mid = new JButton();
        empire_Mid.setBounds(152,20,140,30);
        empire_Mid.setOpaque(true);;
        empire_Mid.setBorderPainted(false);
        empire_Mid.setContentAreaFilled(true);
        empire_Mid.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                { 
                    JOptionPane.showMessageDialog(null,"You've Selected the Empire State Building to Midtown West");

                }
            });

            
        //add all  dest buttons
        f.add(lincolnCenter);
        f.add(centralPark);
        f.add(midtownWest);
        f.add(timesSquare);
        f.add(unitedNations);
        f.add(empireState);
        f.add(chelsea);
        f.add(gramercyPark);
        f.add(greenwichVillage);
        f.add(eastVillage);
        f.add(soho);
        f.add(chinaTown);
        f.add(lowerEast);
        f.add(wallStreet);
        f.add(brooklyn);

        //add all buttons to group
        points.add(lincolnCenter);
        points.add(centralPark);
        points.add(midtownWest);
        points.add(timesSquare);
        points.add(unitedNations);
        points.add(empireState);
        points.add(chelsea);
        points.add(gramercyPark);
        points.add(greenwichVillage);
        points.add(eastVillage);
        points.add(soho);
        points.add(chinaTown);
        points.add(lowerEast);
        points.add(wallStreet);
        points.add(brooklyn);

        // add all path buttons
        f.add(linc_Mid);
        f.add(linc_Cen);
        f.add(times_Nations);
        f.add(linc_Times1);
        f.add(linc_Times2);
        f.add(brook_Wall1);
        f.add(brook_Wall2);
        f.add(wall_China1);
        f.add(wall_China2);
        f.add(brook_China1);
        f.add(brook_China2);
        f.add(brook_lowerEast);
        f.add(China_lowerEast);
        f.add(soho_Green);
        f.add(lower_Green);
        f.add(lower_East);
        f.add(green_East);
        f.add(china_Green1);
        f.add(china_Green2);
        f.add(green_Gram1);
        f.add(green_Gram2);
        f.add(chelsea_Gram);
        f.add(east_Gram);
        f.add(soho_Chelsea);
        f.add(chelsea_Empire1);
        f.add(chelsea_Empire2);
        f.add(gram_Empire1);
        f.add(gram_Empire2);
        f.add(united_Empire);
        f.add(times_Mid);
        f.add(green_Chelsea1);
        f.add(green_Chelsea2);
        f.add(chelsea_Mid);
        f.add(gram_United);
        f.add(central_Times1);
        f.add(central_Times2);
        f.add(central_United);
        f.add(empire_Times1);
        f.add(empire_Times2);
        f.add(empire_Mid);
        

        points.add(linc_Mid);
        points.add(linc_Cen);
        points.add(times_Nations);
        points.add(linc_Times1);
        points.add(linc_Times2);
        points.add(brook_Wall1);
        points.add(brook_Wall2);
        points.add(wall_China1);
        points.add(wall_China2);
        points.add(brook_China1);
        points.add(brook_China2);
        points.add(brook_lowerEast);
        points.add(China_lowerEast);
        points.add(soho_Green);
        points.add(lower_Green);
        points.add(lower_East);
        points.add(green_East);
        points.add(china_Green1);
        points.add(china_Green2);
        points.add(green_Gram1);
        points.add(green_Gram2);
        points.add(chelsea_Gram);
        points.add(east_Gram);
        points.add(soho_Chelsea);
        points.add(chelsea_Empire1);
        points.add(chelsea_Empire2);
        points.add(gram_Empire1);
        points.add(gram_Empire2);
        points.add(united_Empire);
        points.add(times_Mid);
        points.add(green_Chelsea1);
        points.add(green_Chelsea2);
        points.add(chelsea_Mid);
        points.add(gram_United);
        points.add(central_Times1);
        points.add(central_Times2);
        points.add(central_United);
        points.add(empire_Times1);
        points.add(empire_Times2);
        points.add(empire_Mid);

        f.pack();
        f.setVisible(true);
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("Line Drawn");
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(15));
        g2.setColor(Color.black);
        g2.draw(new Line2D.Float(x1, y1, x2, y2));

    }

    public void selection(int num){
        if(firstSelection != -1){

            secondSelection = num;
            Player turn = myBoard.players.get(playersTurn);
            //This needs to be inputted by user, selected
            if(1==1){//input.size() >1 && myBoard.checkPathwayAvailability(turn,input,firstSelection,secondSelection) ){
                System.out.println(myBoard.map.get(firstSelection));
                System.out.println(myBoard.map.get(secondSelection));
                x1 = myBoard.map.get(firstSelection).Xpos;
                y1 = myBoard.map.get(firstSelection).Ypos;
                x2 = myBoard.map.get(secondSelection).Xpos;
                y2 = myBoard.map.get(secondSelection).Ypos;
                //Container cp = f.getContentPane();
                // cp.add(new JComponent() {
                // public void paintComponent(Graphics g) {
                // System.out.println("Line Drawn");
                // Graphics2D g2 = (Graphics2D) g;
                // g2.setStroke(new BasicStroke(15));
                // g2.setColor(turn.myColor);
                // g2.draw(new Line2D.Float(x1, y1, x2, y2));
                // }
                // });
                repaint();
                input.clear();
                switchTurn();
            }

            firstSelection = -1;
            secondSelection = -1;
        }
        else{
            firstSelection = num;
        }
    }

    public void setButtonsVisible(){
        for(JButton b :points){
            b.setOpaque(true);
            b.setContentAreaFilled(true);
            b.setBorderPainted(true);
        }
    }

    public void setButtonsInvisible(){
        for(JButton b :points){
            b.setOpaque(false);
            b.setContentAreaFilled(false);
            b.setBorderPainted(false);
        }
    }

    public void setButtonsEnabled(){
        for(JButton b :points){
            b.setEnabled(true);
        }
    }

    public void setButtonsDisabled(){
        for(JButton b :points){
            b.setEnabled(false);
        }
    }

    public static void createAndShowGUI(){

        TestGUI panel = new TestGUI();
        f.getContentPane().add(panel);
        f.pack();
        f.setVisible(true);

    }

    public static void main(String[] args){
        createAndShowGUI();
    }

    // public static void main(String[] args){
    // TestGUI board = new TestGUI();
    // //board.setButtonsInvisible();
    // // board.setButtonsEnabled();

    // }
}