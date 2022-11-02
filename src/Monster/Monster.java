package Monster;

public class Monster {
    private String name;
    private int maxHealth;
    private int damage;

    public Monster(String name, int maxHealth, int damage){
        this.name = name;
        this.maxHealth = maxHealth;
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public String getName(){
        return name;
    }
}
