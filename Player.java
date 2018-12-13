import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Player extends JFrame {
    private ImageIcon iconbackgroung = new ImageIcon("backgroung.jpg");
    private  JLabel jlbbackgroung = new JLabel();
    private JPanel jpbackgroung = new JPanel(new GridLayout(6,10,1,1));
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int screenw = screenSize.width;
    private int screenh = screenSize.height;
    private int frw =800 , frh =500 ;
    public Player(){
        init();
    }
    public void init(){
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
        jlbbackgroung.setOpaque(true);
        jlbbackgroung.setIcon(iconbackgroung);
        jlbbackgroung.setBounds(0,0,800,500);
    }






    class Player extends JPanel implements KeyListener,Runnable{
        private int direction = 1;
        private ImageIcon imgPlayer = new ImageIcon("left.png");
    }
    private class Key extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){

            }
        }
    }
    @Override
    public void run(){

    }
}






