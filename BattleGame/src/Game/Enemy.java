package Game;

public class Enemy {
    private int levelEnemy;
    private String nameEnemy;

    Enemy(String nameEnemy,int levelEnemy) {
        this.levelEnemy = levelEnemy;
        this.nameEnemy = nameEnemy;
    }

    int getLevelEnemy() {
        return levelEnemy;
    }

    public String getNameEnemy() {
        return nameEnemy;
    }
}
