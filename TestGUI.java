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
        lincolnCenter.setBounds(115,30, 30,30);
        lincolnCenter.setOpaque(true);
        lincolnCenter.setContentAreaFilled(false);
        lincolnCenter.setBorderPainted(false);
        lincolnCenter.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Lincoln Center");

                }
            });

        JButton centralPark = new JButton();
        centralPark.setBounds(300,20, 30,30);
        centralPark.setOpaque(true);;
        centralPark.setContentAreaFilled(false);
        centralPark.setBorderPainted(false);
        centralPark.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Central Park");

                }
            });

        JButton midtownWest = new JButton();
        midtownWest.setBounds(94,236, 20,20);
        midtownWest.setOpaque(true);;
        midtownWest.setContentAreaFilled(false);
        midtownWest.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected MidTown West");

                }
            });

        JButton timesSquare = new JButton();
        timesSquare.setBounds(222,205, 20,20);
        timesSquare.setOpaque(true);;
        timesSquare.setContentAreaFilled(false);
        timesSquare.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected TimesSquare");

                }
            });

        JButton unitedNations = new JButton();
        unitedNations.setBounds(465,195, 20,20);
        unitedNations.setOpaque(true);;
        unitedNations.setContentAreaFilled(false);
        unitedNations.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected United Nations");

                }
            });

        JButton empireState = new JButton();
        empireState.setBounds(297,318, 20,20);
        empireState.setOpaque(true);;
        empireState.setContentAreaFilled(false);
        empireState.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Empire State Building");

                }
            });

        JButton chelsea = new JButton();
        chelsea.setBounds(140,430, 20,20);
        chelsea.setOpaque(true);;
        chelsea.setContentAreaFilled(false);
        chelsea.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Chelsea");

                }
            });

        JButton gramercyPark = new JButton();
        gramercyPark.setBounds(375,418, 20,20);
        gramercyPark.setOpaque(true);;
        gramercyPark.setContentAreaFilled(false);
        gramercyPark.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Gramercy Park");

                }
            });

        JButton greenwichVillage = new JButton();
        greenwichVillage.setBounds(338,594, 20,20);
        greenwichVillage.setOpaque(true);;
        greenwichVillage.setContentAreaFilled(false);
        greenwichVillage.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Greenwich Village");

                }
            });

        JButton eastVillage = new JButton();
        eastVillage.setBounds(525,583, 20,20);
        eastVillage.setOpaque(true);;
        eastVillage.setContentAreaFilled(false);
        eastVillage.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected East Village");

                }
            });

        JButton soho = new JButton();
        soho.setBounds(227,758, 20,20);
        soho.setOpaque(true);;
        soho.setContentAreaFilled(false);
        soho.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Soho");

                }
            });

        JButton chinaTown = new JButton();
        chinaTown.setBounds(387,780, 20,20);
        chinaTown.setOpaque(true);;
        chinaTown.setContentAreaFilled(false);
        chinaTown.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected ChinaTown");

                }
            });

        JButton lowerEast = new JButton();
        lowerEast.setBounds(505,708, 20,20);
        lowerEast.setOpaque(true);;
        lowerEast.setContentAreaFilled(false);
        lowerEast.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Lower East");

                }
            });

        JButton wallStreet = new JButton();
        wallStreet.setBounds(330,918, 20,20);
        wallStreet.setOpaque(true);;
        wallStreet.setContentAreaFilled(false);
        wallStreet.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Wall Street");

                }
            });

        JButton brooklyn = new JButton();
        brooklyn.setBounds(590,940, 20,20);
        brooklyn.setOpaque(true);;
        brooklyn.setContentAreaFilled(false);
        brooklyn.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected Brooklyn");

                }
            });

        //creating pathbuttons
        JButton linc_Mid = new JButton();
        linc_Mid.setBounds(95,70,35,135);
        linc_Mid.setOpaque(true);;
        linc_Mid.setBorderPainted(false);
        linc_Mid.setContentAreaFilled(false);
        linc_Mid.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Linc-Mid Route");

                }
            });

        JButton linc_Cen = new JButton();
        linc_Cen.setBounds(152,20,140,30);
        linc_Cen.setOpaque(true);;
        linc_Cen.setBorderPainted(false);
        linc_Cen.setContentAreaFilled(false);
        linc_Cen.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                {
                    JOptionPane.showMessageDialog(null,"You've Selected the Linc-Cen Route");

                }
            });

        JButton times_Nations = new JButton();
        times_Nations.setBounds(290,185,145,35);
        times_Nations.setOpaque(true);;
        times_Nations.setContentAreaFilled(false);
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

        // add all path buttons
        f.add(linc_Mid);
        f.add(linc_Cen);
        f.add(times_Nations);

        f.pack();
        f.setVisible(true);
    }

}