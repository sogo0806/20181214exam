import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

import java.awt.event.*;
import java.io.*;
import java.util.Vector;


public class Game extends JFrame {

    private ImageIcon iconbackgroung = new ImageIcon("backgroung.jpg");
    private ImageIcon iconleft = new ImageIcon("left.png");
    private ImageIcon iconright = new ImageIcon("右.png");
    private ImageIcon iconup = new ImageIcon("up.png");
    private ImageIcon icondown = new ImageIcon("down.png");
    private JPanel jpGrid = new JPanel(new GridLayout(7,11,0,0));
    private JPanel jpNull = new JPanel(null);
    private  JLabel jlbbackgroung = new JLabel();
    private JLabel jlbPlayer = new JLabel();
    private JLabel jlbBomb [][] = new JLabel[11][7];
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int screenw = screenSize.width;
    private int screenh = screenSize.height;
    private int frw =800 , frh =533 ;
    private Container cp;
//    private Ball ball=new Ball(jlbPlayer.getX(),jlbPlayer.getY());
//    private Vector<Ball> balls =new Vector<>();
    private int x = 0 , y = 0;
    public Game(){
        ex1();
    }
    public void ex1() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(screenw/2-frw/2,screenh/2-frh/2,frw,frh);
//        this.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosed(WindowEvent e) {
//                Login fr = new Login();
//                fr.setVisible(true);
//            }
//        });
        this.setLayout(null);
        this.add(jlbbackgroung);
        this.setResizable(false);
        cp = this.getContentPane();
        cp.setLayout(null);
        jlbPlayer.setIcon(icondown);
        jpNull.add(jlbPlayer);
        jpNull.setBounds(0,0,800,533);
        jpNull.setBackground(new Color(255,255,255,0));
        jpNull.setLayout(null);

        jpGrid.setBounds(0,0,800,533);
        jpGrid.setBackground(new Color(255,255,255,77));
        jpGrid.setOpaque(false);
        jpNull.setOpaque(false);
        jlbbackgroung.setOpaque(false);
        jlbbackgroung.setBounds(0, 0, 800, 533);
        jlbbackgroung.setIcon(iconbackgroung);
        cp.add(jpNull);
        cp.add(jpGrid);
        cp.add(jlbbackgroung);


        for (int i = 0 ; i < 7 ; i++){
            for (int j = 0 ; j < 11 ; j++){
                jlbBomb[j][i] = new JLabel();
                jlbBomb[j][i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                jlbBomb[0][0].setIcon(icondown);
                jpGrid.add(jlbBomb[j][i]);

            }
        }

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()){
                    case KeyEvent.VK_RIGHT :
                        jlbBomb[x][y].setIcon(null);
                        x++;
                        jlbBomb[x][y].setIcon(iconright);
                        System.out.println("0");
                        break;
                }
            }
        });

        

    }

}



