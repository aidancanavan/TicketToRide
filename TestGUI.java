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
    JFrame f = new JFrame();
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
        f.setResizable(false);

        //creating buttons to coorespond with each location on game board
        JButton lincolnCenter = new JButton();
        lincolnCenter.setBounds(115,30, 30,30);
        lincolnCenter.setOpaque(false);
        lincolnCenter.setContentAreaFilled(false);
        lincolnCenter.setBorderPainted(false);
        lincolnCenter.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    //add node numbers to return
                    //add handling for path selection

                    JOptionPane.showMessageDialog(null,"You've Selected Lincoln Center");
                    selection(0);
                }
            });

        JButton centralPark = new JButton();
        centralPark.setBounds(300,20, 30,30);
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
        midtownWest.setBounds(94,236, 20,20);
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
        timesSquare.setBounds(222,205, 20,20);
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
        unitedNations.setBounds(465,195, 20,20);
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
        empireState.setBounds(297,318, 20,20);
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
        chelsea.setBounds(140,430, 20,20);
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
        gramercyPark.setBounds(375,418, 20,20);
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
        greenwichVillage.setBounds(338,594, 20,20);
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
        eastVillage.setBounds(525,583, 20,20);
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
        soho.setBounds(227,758, 20,20);
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
        chinaTown.setBounds(387,780, 20,20);
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
        lowerEast.setBounds(505,708, 20,20);
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
        wallStreet.setBounds(330,918, 20,20);
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
        brooklyn.setBounds(590,940, 20,20);
        brooklyn.setOpaque(true);;
        brooklyn.setContentAreaFilled(true);
        brooklyn.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Brooklyn");
                    selection(14);
                }
            });

        //creating pathbuttons
        // JButton linc_Mid = new JButton();
        // linc_Mid.setBounds(95,70,35,135);
        // linc_Mid.setOpaque(true);;
        // linc_Mid.setBorderPainted(false);
        // linc_Mid.setContentAreaFilled(true);
        // linc_Mid.addMouseListener(new MouseAdapter(){
        // public void mouseClicked(MouseEvent e)
        // {
        // JOptionPane.showMessageDialog(null,"You've Selected the Linc-Mid Route");

        // }
        // });

        // JButton linc_Cen = new JButton();
        // linc_Cen.setBounds(152,20,140,30);
        // linc_Cen.setOpaque(true);;
        // linc_Cen.setBorderPainted(false);
        // linc_Cen.setContentAreaFilled(true);
        // linc_Cen.addMouseListener(new MouseAdapter(){
        // public void mouseClicked(MouseEvent e)
        // {
        // JOptionPane.showMessageDialog(null,"You've Selected the Linc-Cen Route");

        // }
        // });

        // JButton times_Nations = new JButton();
        // times_Nations.setBounds(290,185,145,35);
        // times_Nations.setOpaque(true);;
        // times_Nations.setContentAreaFilled(true);
        // times_Nations.addMouseListener(new MouseAdapter(){
        // public void mouseClicked(MouseEvent e)
        // {
        // JOptionPane.showMessageDialog(null,"You've Selected the Times_Nation Route");

        // }
        // });

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
        // f.add(linc_Mid);
        // f.add(linc_Cen);
        // f.add(times_Nations);

        f.pack();
        f.setVisible(true);
    }

    public void selectCard(){
        //update input arrayList

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
                Container cp = f.getContentPane();
                cp.add(new JComponent() {
                        public void paintComponent(Graphics g) {
                            System.out.println("Line Drawn");
                            Graphics2D g2 = (Graphics2D) g;
                            g2.setStroke(new BasicStroke(15));
                            g2.setColor(turn.myColor);
                            g2.draw(new Line2D.Float(x1, y1, x2, y2));
                        }
                    });
                //f.repaint();
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

    public static void main(String[] args){
        TestGUI board = new TestGUI();
        board.setButtonsInvisible();
        // board.setButtonsEnabled();

    
    }
}