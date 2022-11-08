import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame = new JFrame();
    private JPanel background = new JPanel();

    public GUI(){


        frame.setSize(1200,675);
        frame.setResizable(false);


        background.setBounds(frame.getBounds());



        background.setBackground(Color.BLACK);

        frame.add(background);

        background.setVisible(true);
        frame.setVisible(true);
    }
    public void createBattle(){

    }
}
