package Game;

public class Main {

    public static void main(String[] args) {
        Enemy enemy = new Enemy(-5);
        Enemy enemy1 = new Enemy(4);
        Warrior warrior = new Warrior("Optimus");

        Battle battle = new Battle(enemy,warrior);
        battle.battle();

        Battle battle1 = new Battle(enemy1,warrior);
        battle1.battle();
    }
}
