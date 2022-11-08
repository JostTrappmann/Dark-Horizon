import javax.swing.*;
import java.awt.*;
import Monster.*;

public class GUI {
    private JFrame frame = new JFrame();
    private JPanel background = new JPanel();

    public GUI(){


        frame.setSize(1200,675);
        frame.setResizable(false);

        background.setBounds(0,0,1200,675);
        background.setAlignmentX(0);
        background.setAlignmentY(0);


        background.setBackground(Color.BLACK);
        frame.add(background);


        background.setVisible(true);
        frame.setVisible(true);


    }
    public void fight(Monster monster,Player player){
        JButton attack = new JButton();
        JButton items = new JButton();
        JButton element = new JButton();
        JLabel label = new JLabel();
        attack.setText("Attack");


        attack.setForeground(Color.WHITE);
        attack.setBackground(Color.BLACK);
        attack.setBounds(350, 500,500,50 );
        attack.setActionCommand("ATTACK");
        background.add(attack, 0);

        items.setText("Items");
        items.setForeground(Color.WHITE);
        items.setBackground(Color.BLACK);
        items.setBounds(75, 575, 500,50 );
        items.setActionCommand("ITEMS");
        background.add(items, 0);

        element.setText("Element");
        element.setForeground(Color.WHITE);
        element.setBackground(Color.BLACK);
        element.setBounds(625, 575,500,50 );
        element.setActionCommand("ELEMENT");
        background.add(element, 0);

        frame.setIconImage(monster.getImageIcon().getImage());
        label.setBounds(450, 100, 300,300);
        label.setIcon(monster.getImageIcon());
        label.setBackground(Color.BLACK);
        background.add(label, 0);



        label.setVisible(true);
        attack.setVisible(true);
        items.setVisible(true);
        element.setVisible(true);
    }

}
