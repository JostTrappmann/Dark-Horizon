package Monster;

import javax.swing.*;

public class Monster {
    private String name;
    private int maxHealth;
    private int damage;
    private ImageIcon i;

    public Monster(String name, int maxHealth, int damage, ImageIcon i){
        this.name = name;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.i = i;

    }
    public int getDamage(){
        return damage;
    }
    public ImageIcon getImageIcon(){
        return i;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public String getName(){
        return name;
    }
    public void setImageIcon(ImageIcon i) {
        this.i = i;
    }
}
