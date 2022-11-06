package Elements;

import Movement.*;

public class Earth extends Element {

    ElementAttack attack;
    public Earth(){
        super("Earth", "Smash");
        attack = new ElementAttack("Earthquake", 50, 10, "Magic");
    }
}
