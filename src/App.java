import Armor.Armor;
import Weapon.Weapon;
import Monster.*;
public class App {
    public static void main(String[] args){
        Slime slime = new Slime();
        GUI gui = new GUI();
        gui.fight(slime);
        Menue menue = new Menue();
        Player player = menue.createPlayer();
        menue.printPlayer(player);
        System.out.println("");
    }
}
