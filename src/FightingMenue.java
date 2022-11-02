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
        if(monsterHealth <= 0) {
            System.out.println(player.getName() + " won");
            battleOver = true;
        }else{
            battleOver = player.lowerHealth(monster.getDamage());
        }
        if(battleOver != true) {
            battle(monsterHealth);
        }
    }
}
