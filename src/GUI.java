import javax.swing.*;
import java.awt.*;
import Monster.*;

public class GUI {
    private JFrame frame = new JFrame();
    private JPanel background = new JPanel();
    private JLabel label = new JLabel();
    private ImageIcon icon = new ImageIcon();
    public GUI(){


        frame.setSize(1200,675);
        frame.setResizable(false);

        background.setBounds(frame.getBounds());



        background.setBackground(Color.BLACK);

        frame.add(background);
        createBattle();
        background.setVisible(true);
        frame.setVisible(true);

    }
    public void createBattle(){
        ImageIcon icon = new ImageIcon("slime.png");
        Slime i = new Slime();
        i.setImageIcon(icon);
        label.setIcon(i.getImageIcon());
        label.setSize(500,500);
        background.add(label);
        label.setVisible(true);
        frame.setIconImage(icon.getImage());
    }
}
