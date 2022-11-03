import Armor.Armor;
import Elements.*;
import Weapon.Weapon;
public class Player {
    private String name;
    private int maxHealth;
    private int health;
    private int attack;
    private Weapon weapon;
    private Armor armor;
    private Element element;


    public Player(String name, Element element) {
        this.name = name;
        this.maxHealth = 50;
        this.attack = 5;
        this.element = element;
        regenerate();
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
        if(armor != null){
            health = maxHealth + armor.getDefence();
        }
        health = maxHealth;
    }
    public int getHealth() {
        return health;
    }
    public int getmaxHealth(){
        if(armor != null){
            return maxHealth+armor.getDefence();
        }
        return maxHealth;
    }
    public void equipArmor(Armor armor){
        this.armor = armor;
    }
    public int getDamage(){
        int damage;
        if(weapon != null){
            damage = attack + weapon.getDamage();
        }
        else damage = attack;
        return damage;
    }
    public Element getElement(){
        return element;
    }
    public Armor getArmor(){
        return armor;
    }
    public Weapon getWeapon(){
        return weapon;
    }
}
