package Armor;

public class Armor {
    private int defence;

    public String name;

    public Armor(int defence, String name){
        this.defence = defence;
        this.name = name;
    }
    public int getDefence(){
        return defence;
    }
    public String getName(){
        return name;
    }
}
