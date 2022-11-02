import Armor.Armor;
import Weapon.Weapon;
public class Player {
    private String name;
    private int maxHealth;
    private int health;
    private int attack;
    private Weapon weapon;
    private Armor armor;


    public Player(String name, int maxHealth, int attack, Weapon weapon, Armor armor) {
        this.name = name;
        this.maxHealth = health;
        this.attack = health;
        this.weapon = weapon;
        this.armor = armor;
    }
    public String getName(){
        return name;
    }

    public boolean lowerHealth(int lowerHealth){
        health = health - lowerHealth;
        if(health <= 0) {
            health = 0;
            System.out.println(name + "ist gestorben");
            return true;
        }
        return false;
    }
    public void regenerate(){
        health = maxHealth;
    }
    public int getHealth() {
        return health;
    }
    public int getmaxHealth(){
        return maxHealth+armor.getDefence();
    }
    public void equipArmor(Armor armor){
        this.armor = armor;
    }
    public int getDamage(){
        return attack + weapon.getDamage();
    }
}
