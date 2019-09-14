package Game;

public class Warrior {
    private String nameWarrior;
    private int levelWarrior;
    private int experienceWarrior;
    private boolean statusWarrior;
    private String rankWarrior;
    private int rankLevelWarrior;


    Warrior(String nameWarrior) {
        this.nameWarrior = nameWarrior;
        this.levelWarrior = 1;
        this.experienceWarrior = 100;
        statusWarrior = true;
//        rankWarrior = getRankWarrior();
//        rankLevelWarrior = getRankLevelWarrior();
    }

    public void levelProgress() {
        setLevelWarrior(getExperienceWarrior() / 100);
        //зависимость уровня воина от количества опыта
    }

    public void rankWarriorChanging() {
        if (levelWarrior > 0 && levelWarrior < 10) {
            setRankWarrior("Pushover");
            setRankLevelWarrior(0);
        } else if (levelWarrior >= 10 && levelWarrior < 20) {
            setRankWarrior("Novice");
            setRankLevelWarrior(1);
        } else if (levelWarrior >= 20 && levelWarrior < 30) {
            setRankWarrior("Fighter");
            setRankLevelWarrior(2);
        } else if (levelWarrior >= 30 && levelWarrior < 40) {
            setRankWarrior("Warrior");
            setRankLevelWarrior(3);
        } else if (levelWarrior >= 40 && levelWarrior < 50) {
            setRankWarrior("Veteran");
            setRankLevelWarrior(4);
        } else if (levelWarrior >= 50 && levelWarrior < 60) {
            setRankWarrior("Sage");
            setRankLevelWarrior(5);
        } else if (levelWarrior >= 60 && levelWarrior < 70) {
            setRankWarrior("Elite");
            setRankLevelWarrior(6);
        } else if (levelWarrior >= 70 && levelWarrior < 80) {
            setRankWarrior("Conqueror");
            setRankLevelWarrior(7);
        } else if (levelWarrior >= 80 && levelWarrior < 90) {
            setRankWarrior("Champion");
            setRankLevelWarrior(8);
        } else if (levelWarrior >= 90 && levelWarrior < 100) {
            setRankWarrior("Master");
            setRankLevelWarrior(9);
        } else if (levelWarrior == 100) {
            setRankWarrior("Greatest");
            setRankLevelWarrior(10);
        }
        System.out.println("Warrior rank is " + getRankWarrior());
    }

    public boolean getStatusWarrior() {
        return statusWarrior;
    }

    public void setStatusWarrior(boolean statusWarrior) {
        this.statusWarrior = statusWarrior;
    }

    int getLevelWarrior() {
        return levelWarrior;
    }

    public String getNameWarrior() {
        return nameWarrior;
    }

    public void setLevelWarrior(int levelWarrior) {
        this.levelWarrior = levelWarrior;
    }

    public int getRankLevelWarrior() {
        return rankLevelWarrior;
    }

    public void setRankLevelWarrior(int rankLevelWarrior) {
        this.rankLevelWarrior = rankLevelWarrior;
    }

    public int getExperienceWarrior() {
        return experienceWarrior;
    }

    public void setExperienceWarrior(int experienceWarrior) {
        this.experienceWarrior = experienceWarrior;
    }

    public String getRankWarrior() {
        return rankWarrior;
    }

    public void setRankWarrior(String rankWarrior) {
        this.rankWarrior = rankWarrior;
    }
}
