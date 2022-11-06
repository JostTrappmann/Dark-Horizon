package Movement;
import Elements.Element;
import Movement.Attack;
public class ElementAttack extends Attack {
    private Element element;

    public ElementAttack(String name, int damage, int costs, String type) {
        super(name, damage, costs, type);
    }

    public Element getElement() {
        return element;
    }
}
