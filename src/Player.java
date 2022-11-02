import Armor.Armor;
import Weapon.Weapon;
public class Player {
    private int maxHealth;
    private int health;
    private int attack;
    private Weapon weapon;
    private Armor armor;


    public Player(int maxHealth, int attack, Weapon weapon, Armor armor) {
        this.maxHealth = health;
        this.attack = health;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void lowerHealth(int lowerHealth){
        health = health - lowerHealth;
        if(health <= 0) {
            health = 0;
        }
    }
    public int getHealth() {
        return health;
    }
    public int getmaxHealth(){
        return maxHealth;
    }
    public void equipArmor(Armor armor){
        this.armor = armor;
    }
}
