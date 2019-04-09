import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

/**
 * class used to test and build the board GUI for TTR
 * currently used for finding button locations of nodes and
 * paths
 * 
 * author(Matt Fletcher)
 * version(1.0)
 */
public class TestGUI extends JPanel implements MouseListener {
    public void mouseEntered( MouseEvent e ) { }

    public void mouseExited( MouseEvent e ) { }

    public void mousePressed( MouseEvent e ) { }

    public void mouseReleased( MouseEvent e ) { }

    public void mouseClicked( MouseEvent e ) {
        System.out.println("You clicked!!");
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        try {
            f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("theMap.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //creating buttons to coorespond with each location on game board
        JButton lincolnCenter = new JButton();
        lincolnCenter.setBounds(117,42, 20,20);
        lincolnCenter.setBackground(Color.RED);
        lincolnCenter.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Lincoln Center");

                }
            });

        JButton centralPark = new JButton();
        centralPark.setBounds(303,30, 20,20);
        centralPark.setBackground(Color.BLUE);
        centralPark.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Central Park");

                }
            });

        JButton midtownWest = new JButton();
        midtownWest.setBounds(94,236, 20,20);
        midtownWest.setBackground(Color.YELLOW);
        midtownWest.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected MidTown West");

                }
            });

        JButton timesSquare = new JButton();
        timesSquare.setBounds(222,205, 20,20);
        timesSquare.setBackground(Color.BLACK);
        timesSquare.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected TimesSquare");

                }
            });

        JButton unitedNations = new JButton();
        unitedNations.setBounds(465,195, 20,20);
        unitedNations.setBackground(Color.GREEN);
        unitedNations.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected United Nations");

                }
            });

        JButton empireState = new JButton();
        empireState.setBounds(297,318, 20,20);
        empireState.setBackground(Color.GREEN);
        empireState.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Empire State Building");

                }
            });

        JButton chelsea = new JButton();
        chelsea.setBounds(140,430, 20,20);
        chelsea.setBackground(Color.GREEN);
        chelsea.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Chelsea");

                }
            });

        JButton gramercyPark = new JButton();
        gramercyPark.setBounds(375,418, 20,20);
        gramercyPark.setBackground(Color.GREEN);
        gramercyPark.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Gramercy Park");

                }
            });

        JButton greenwichVillage = new JButton();
        greenwichVillage.setBounds(338,594, 20,20);
        greenwichVillage.setBackground(Color.GREEN);
        greenwichVillage.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Greenwich Village");

                }
            });

        JButton eastVillage = new JButton();
        eastVillage.setBounds(525,583, 20,20);
        eastVillage.setBackground(Color.GREEN);
        eastVillage.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected East Village");

                }
            });

        JButton soho = new JButton();
        soho.setBounds(227,758, 20,20);
        soho.setBackground(Color.GREEN);
        soho.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Soho");

                }
            });

        JButton chinaTown = new JButton();
        chinaTown.setBounds(387,780, 20,20);
        chinaTown.setBackground(Color.GREEN);
        chinaTown.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected ChinaTown");

                }
            });

        JButton lowerEast = new JButton();
        lowerEast.setBounds(505,708, 20,20);
        lowerEast.setBackground(Color.GREEN);
        lowerEast.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Lower East");

                }
            });

        JButton wallStreet = new JButton();
        wallStreet.setBounds(330,918, 20,20);
        wallStreet.setBackground(Color.BLUE);
        wallStreet.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Wall Street");

                }
            });

        JButton brooklyn = new JButton();
        brooklyn.setBounds(590,940, 20,20);
        brooklyn.setBackground(Color.YELLOW);
        brooklyn.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Brooklyn");

                }
            });

        //creating pathbuttons
        JButton linc_Mid = new JButton();
        linc_Mid.setBounds(95,70,35,135);
        linc_Mid.setOpaque(false);
        // linc_Mid.setBorderPainted(false);
        linc_Mid.setContentAreaFilled(false);
        linc_Mid.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Linc-Mid Route");

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

        // add all path buttons
        f.add(linc_Mid);

        f.pack();
        f.setVisible(true);
    }

}