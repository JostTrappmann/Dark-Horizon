package Elements;

import Movement.ElementAttack;

public class Water extends Element{
    ElementAttack attack;
    public Water(){
        super("Water", "Spear");
        attack = new ElementAttack("whirlpool", 40, 8, "Magic");
    }
}
