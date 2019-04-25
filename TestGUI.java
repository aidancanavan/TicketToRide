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
            f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("theMap.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //buttongroup contructions
        f.setPreferredSize(new Dimension(2000,1024));
        f.setResizable(false);

        //creating buttons to coorespond with each location on game board
        JButton lincolnCenter = new JButton();
        lincolnCenter.setBackground(Color.RED);
        lincolnCenter.setBounds(775,25, 30,30);
        lincolnCenter.setOpaque(true);
        lincolnCenter.setContentAreaFilled(true);
        lincolnCenter.setBorderPainted(false);
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
        centralPark.setBounds(965,13,30,30);
        centralPark.setOpaque(true);;
        centralPark.setContentAreaFilled(true);
        centralPark.setBorderPainted(false);
        centralPark.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Central Park");
                    selection(1);
                }
            });

        JButton midtownWest = new JButton();
        midtownWest.setBounds(750,221, 30,30);
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
        timesSquare.setBounds(882,190, 30,30);
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
        unitedNations.setBounds(1125,180, 30,30);
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
        empireState.setBounds(962,303, 30,30);
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
        chelsea.setBounds(800,415, 30,30);
        chelsea.setOpaque(true);;
        chelsea.setContentAreaFilled(true);
        chelsea.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Chelsea");
                    selection(6);
                }
            });

        JButton gramercyPark = new JButton();
        gramercyPark.setBounds(1030,403, 30,30);
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
        greenwichVillage.setBounds(1000,579, 30,30);
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
        eastVillage.setBounds(1190,568, 30,30);
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
        soho.setBounds(892,745, 30,30);
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
        chinaTown.setBounds(1037,765, 30,30);
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
        lowerEast.setBounds(1170,693, 30,30);
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
        wallStreet.setBounds(965,903, 30,30);
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
        brooklyn.setBounds(1225,925, 30,30);
        brooklyn.setOpaque(true);;
        brooklyn.setContentAreaFilled(true);
        brooklyn.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Brooklyn");
                    selection(14);
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

                    JOptionPane.showMessageDialog(null,"You've Selected the Linc-Mid Route");

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
                    JOptionPane.showMessageDialog(null,"You've Selected the Linc-Cen Route");

                }
            });

        JButton times_Nations = new JButton();
        times_Nations.setBounds(290,185,145,35);
        times_Nations.setOpaque(true);;
        times_Nations.setContentAreaFilled(true);
        times_Nations.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Times_Nation Route");

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

        points.add(linc_Mid);
        points.add(linc_Cen);
        points.add(times_Nations);

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