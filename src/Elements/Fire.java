package Elements;

import Movement.ElementAttack;

public class Fire extends Element{
    ElementAttack attack;
    public Fire() {
        super("Fire", "ungeared");
        attack = new ElementAttack("Fire Fist", 30, 20, "Stamina");



    }
}
