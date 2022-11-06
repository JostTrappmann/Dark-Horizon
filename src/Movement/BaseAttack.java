package Movement;

import Elements.Element;

public class BaseAttack {


    private String name;
    private int atk;
    private Element element;

    public BaseAttack(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }


    public void setElement(Element element) {
        this.element = element;
    }
}
