package Weapon;

public class Weapon {
    private String name;
    private String type;
    private int damage;

    public Weapon(String name, int damage, String type){
        this.name = name;
        this.damage = damage;
        this.type = type;
    }


    public int getDamage(){
        return damage;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
}
