package Game;

public class Main {

    public static void main(String[] args) {
        Enemy enemy = new Enemy("Enemy",4);
        Warrior warrior = new Warrior("Optimus");
        Enemy enemy1 = new Enemy("sss",1);
        Battle battle = new Battle(enemy,warrior);
        battle.battle();
//        Battle battle1 = new Battle(enemy1,warrior);
//        battle1.battle();

//        Battle battle1 = new Battle(enemy1,warrior);
//        battle1.battle();
    }
}
