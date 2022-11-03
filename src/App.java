import Armor.Armor;
import Weapon.Weapon;
import Monster.Monster;
public class App {
    public static void main(String[] args){
        Menue menue = new Menue();
        Player player = menue.createPlayer();
        menue.printPlayer(player);
        System.out.println("");
    }
}
