import Armor.Armor;
import Elements.Earth;
import Weapon.Weapon;
import Monster.*;
public class App {
    public static void main(String[] args){
        Slime slime = new Slime();
        GUI gui = new GUI();
        //Menue menue = new Menue();
        //Player player = menue.createPlayer();
        gui.fight(slime, slime.getMaxHealth(), new Player("Zyklopus", new Earth()));




        //menue.printPlayer(player);
        System.out.println("");
    }
}
