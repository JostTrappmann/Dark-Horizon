import Elements.*;
import java.util.Scanner;
public class Menue {
    Scanner sc = new Scanner(System.in);
    public Menue(){

    }
    public  Player createPlayer(){
        System.out.println("Choose your name");
        String name = sc.nextLine();
        Element element = selectElement();
        System.out.println("Der Spieler " + name + " wurde mit dem Element " + element.getName() + "erstellt.");
        return new Player(name, element);


    }
    public Element selectElement(){
        Element element;

        while(true) {
            System.out.println("Which Element do you want to choose");
            System.out.println("(0) Wind");
            System.out.println("(1) Fire");
            System.out.println("(2) Water");
            System.out.println("(3) Earth");
            switch (sc.nextLine()) {
                case "0":
                    return new Wind();
                case "1":
                    return new Fire();
                case "2":
                    return new Water();
                case "3":
                    return new Earth();
                default: System.out.println("Please try again");
            }
        }
    }

    public void printPlayer(Player player){
        System.out.println(player.getName());
        System.out.println("Health: " + player.getHealth() + "/" + player.getmaxHealth());
        System.out.println("Damage : " + player.getDamage());
        System.out.println("Element : " + player.getElement().getName());
        if(player.getArmor()!= null){
            System.out.println("Armor : " + player.getArmor().getName());
        }else{
            System.out.println("Armor : ---");
        }
        if(player.getWeapon() != null){
            System.out.println("Weapon : " + player.getWeapon());
        }else{
            System.out.println("Weapon : ---");
        }
    }
}
