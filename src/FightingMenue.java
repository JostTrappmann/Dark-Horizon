import Monster.Monster;
public class FightingMenue {
    private Player player;
    private Monster monster;

    public FightingMenue(Player player, Monster monster){
        this.player = player;
        this.monster = monster;
        fight();
    }
    public void fight(){
        player.regenerate();
        battle(monster.getMaxHealth());
    }
    public void battle(int monsterHealth){

        boolean battleOver = false;
        monsterHealth = monsterHealth - player.getDamage();
        System.out.println(monster.getName()+ " Health = " + monsterHealth);
        if(monsterHealth <= 0) {
            System.out.println(player.getName() + " won");
            battleOver = true;
            monster = null;
        }else{
            battleOver = player.lowerHealth(monster.getDamage());
            System.out.println(player.getName() + " Health = " + player.getHealth());
        }
        if(battleOver != true) {
            battle(monsterHealth);
        }
    }

    public static class ElementAttack {
        private int Damage;
    }
}
