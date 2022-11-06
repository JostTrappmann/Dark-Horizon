package Movement;

public class Attack extends Movement{
    private int damage;
    private int costs;
    private String type;


    public Attack(String name, int damage, int costs, String type){
        super(name);
        this.damage = damage;
        this.costs = costs;
        this.type = type;

    }


    public String getType() {
        return type;
    }
    public int getCosts() {
        return costs;
    }
    public int getDamage() {
        return damage;
    }
}
