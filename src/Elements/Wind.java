package Elements;

import Movement.ElementAttack;

public class Wind extends Element{
    ElementAttack attack;
    public Wind(){
        super("Wind", "Sword");
        attack = new ElementAttack("Air cut", 50, 15, "Magic");
    }
}
