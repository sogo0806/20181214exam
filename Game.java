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
    private ImageIcon icon5 = new ImageIcon("左2.png");
    private ImageIcon icon6 = new ImageIcon("右2.png");
    private ImageIcon icon7 = new ImageIcon("上2.png");
    private ImageIcon icon8 = new ImageIcon("下2.png");
    private ImageIcon icon9 = new ImageIcon("球.png");
    private JPanel jpnc = new JPanel(new GridLayout(5,8,1,1));
    private  JLabel jlbbackgroung = new JLabel();
    private JLabel jlbPlayer [][] = new JLabel[5][8];
    private JLabel jlb3 = new JLabel();
    private JLabel jlb4 = new JLabel();
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int screenw = screenSize.width;
    private int screenh = screenSize.height;
    private int frw =800 , frh =500 ;
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
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Login fr = new Login();
                fr.setVisible(true);
            }
        });
        this.setLayout(null);
        this.add(jlbbackgroung);
        this.setResizable(false);
        cp = this.getContentPane();
        cp.setLayout(null);

        jlbbackgroung.setOpaque(true);
        jlbbackgroung.setBounds(0, 0, 800, 500);
        jlbbackgroung.setIcon(iconbackgroung);


        jpnc.setLayout(null);


        for (int i = 0 ; i < 5 ; i ++){
            for (int j = 0 ; j < 8 ; j ++){
                jlbPlayer[i][j] = new JLabel();
                jpnc.add(jlbPlayer[i][j]);
                jlbPlayer[i][j].addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        switch (e.getKeyCode()){
                            case KeyEvent.VK_RIGHT:
                                jlbPlayer[x][y] = null;
                                x++;
                                jlbPlayer[x][y].setIcon(iconright);
                                System.out.println("11");
                                break;
                        }
                    }
                });
            }
        }

        jlbPlayer[0][0].setIcon(icondown);
        cp.add(jpnc,BorderLayout.CENTER);



//        this.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent keyEvent) {
//                switch (keyEvent.getKeyCode()){
//                    case KeyEvent.VK_RIGHT :
//
//                        break;
//
//                    case KeyEvent.VK_LEFT :
//                        jlb2.setIcon(icon1);
//                        if (jlb2.getX() > 0){
//                            jlb2.setLocation(jlb2.getX()-10,jlb2.getY());
//                        }
//                        break;
//
//                    case KeyEvent.VK_UP :
//                        jlb2.setIcon(icon3);
//                        if (jlb2.getY() > 0){
//                            jlb2.setLocation(jlb2.getX(),jlb2.getY()-10);
//                        }
//                        break;
//
//                    case KeyEvent.VK_DOWN :
//                        jlb2.setIcon(icon4);
//                        if ((jlb2.getY()+80 ) < hight){
//                            jlb2.setLocation(jlb2.getX(),jlb2.getY()+10);
//                        }
//                        break;
//
//                    case KeyEvent.VK_ENTER :
//                        ball = new Ball(jlb2.getX(),jlb2.getY());
//                        jlb.add(ball);
//                        Thread th = new Thread(ball);
//                        th.start();
//                        System.out.println("11");
//                        break;
//
//                    case KeyEvent.VK_A :
//                        jlb3.setIcon(icon5);
//                        if (jlb3.getX() > 0){
//                            jlb3.setLocation(jlb3.getX()-10,jlb3.getY());
//                        }
//                        break;
//
//                    case KeyEvent.VK_S :
//                        jlb3.setIcon(icon8);
//                        if ((jlb3.getY()+80 ) < hight){
//                            jlb3.setLocation(jlb3.getX(),jlb3.getY()+10);
//                        }
//                        break;
//
//                    case KeyEvent.VK_D :
//                        jlb3.setIcon(icon6);
//                        if ((jlb3.getX() + 80) < weight){
//                            jlb3.setLocation(jlb3.getX()+10,jlb3.getY());
//                        }
//                        break;
//
//                    case KeyEvent.VK_W :
//                        jlb3.setIcon(icon7);
//                        if (jlb3.getY() > 0){
//                            jlb3.setLocation(jlb3.getX(),jlb3.getY()-10);
//                        }
//                        break;
//
//                    case KeyEvent.VK_V :
////                        jlb4.setSize(80,80);
////                        jlb.add(jlb4);
////                        jlb4.setIcon(icon9);Z
//                        ball = new Ball(jlb2.getX(),jlb2.getY());
//                        jlb.add(ball);
//                        Thread thread = new Thread(ball);
//                        thread.start();
//                        System.out.println("11");
//                        break;
//                }
//            }
//        });
    }

}


