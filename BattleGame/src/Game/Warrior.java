package Game;

public class Warrior {
    private String nameWarrior;
    private int levelWarrior;
    private int experienceWarrior;
//    private String rankWarrior;
//    private int rankLevelWarrior;


    Warrior(String nameWarrior) {
        this.nameWarrior = nameWarrior;
        this.levelWarrior = 1;
        this.experienceWarrior = 100;
//        rankWarrior = getRankWarrior();
//        rankLevelWarrior = getRankLevelWarrior();
    }

//    public void rankWarriorChanging() {
//        if (levelWarrior > 0 && levelWarrior < 10) {
//            setRankWarrior("Pushover");
//            setRankLevelWarrior(0);
//        } else if (levelWarrior >= 10 && levelWarrior < 20) {
//            setRankWarrior("Novice");
//            setRankLevelWarrior(1);
//        } else if (levelWarrior >= 20 && levelWarrior < 30) {
//            setRankWarrior("Fighter");
//            setRankLevelWarrior(2);
//        } else if (levelWarrior >= 30 && levelWarrior < 40) {
//            setRankWarrior("Warrior");
//            setRankLevelWarrior(3);
//        } else if (levelWarrior >= 40 && levelWarrior < 50) {
//            setRankWarrior("Veteran");
//            setRankLevelWarrior(4);
//        } else if (levelWarrior >= 50 && levelWarrior < 60) {
//            setRankWarrior("Sage");
//            setRankLevelWarrior(5);
//        } else if (levelWarrior >= 60 && levelWarrior < 70) {
//            setRankWarrior("Elite");
//            setRankLevelWarrior(6);
//        } else if (levelWarrior >= 70 && levelWarrior < 80) {
//            setRankWarrior("Conqueror");
//            setRankLevelWarrior(7);
//        } else if (levelWarrior >= 80 && levelWarrior < 90) {
//            setRankWarrior("Champion");
//            setRankLevelWarrior(8);
//        } else if (levelWarrior >= 90 && levelWarrior < 100) {
//            setRankWarrior("Master");
//            setRankLevelWarrior(9);
//        } else if (levelWarrior == 100) {
//            setRankWarrior("Greatest");
//            setRankLevelWarrior(10);
//        }
//    }
//
//    public void experienceWarriorChanging() {
//        if (getExperienceWarrior() > 0 && getExperienceWarrior() < 1000) {
//            setLevelWarrior(1);
//        } else if (getExperienceWarrior() >= 1000 && getExperienceWarrior() < 2000) {
//            setLevelWarrior(2);
//        } else if (getExperienceWarrior() >= 2000 && getExperienceWarrior() < 3000) {
//            setLevelWarrior(3);
//        } else if (getExperienceWarrior() >= 3000 && getExperienceWarrior() < 4000) {
//            setLevelWarrior(4);
//        } else if (getExperienceWarrior() >= 4000 && getExperienceWarrior() < 5000) {
//            setLevelWarrior(5);
//        } else if (getExperienceWarrior() >= 5000 && getExperienceWarrior() < 6000) {
//            setLevelWarrior(6);
//        } else if (getExperienceWarrior() >= 6000 && getExperienceWarrior() < 7000) {
//            setLevelWarrior(7);
//        } else if (getExperienceWarrior() >= 7000 && getExperienceWarrior() < 8000) {
//            setLevelWarrior(8);
//        } else if (getExperienceWarrior() >= 8000 && getExperienceWarrior() < 9000) {
//            setLevelWarrior(9);
//        } else if (getExperienceWarrior() >= 9000 && getExperienceWarrior() < 10000) {
//            setLevelWarrior(10);
//        }
//    }

    int getLevelWarrior() {
        return levelWarrior;
    }

    public String getNameWarrior() {
        return nameWarrior;
    }

    public void setLevelWarrior(int levelWarrior) {
        this.levelWarrior = levelWarrior;
    }

//    public int getRankLevelWarrior() {
//        return rankLevelWarrior;
//    }
//
//    public void setRankLevelWarrior(int rankLevelWarrior) {
//        this.rankLevelWarrior = rankLevelWarrior;
//    }

    public int getExperienceWarrior() {
        return experienceWarrior;
    }

    public void setExperienceWarrior(int experienceWarrior) {
        this.experienceWarrior = experienceWarrior;
    }

//    public String getRankWarrior() {
//        return rankWarrior;
//    }
//
//    public void setRankWarrior(String rankWarrior) {
//        this.rankWarrior = rankWarrior;
//    }
}
