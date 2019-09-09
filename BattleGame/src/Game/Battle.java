package Game;

class Battle {
    private Enemy enemy;
    private Warrior warrior;

    Battle(Enemy enemy, Warrior warrior) {
        this.enemy = enemy;
        this.warrior = warrior;
    }

    void battle() {
        System.out.println("\nBattle BEGINS");
        System.out.println("--------------\n");
        System.out.println("Warrior has lvl " + warrior.getLevelWarrior());
        System.out.println("Enemy has lvl " + enemy.getLevelEnemy());
        System.out.println("");
        levelEnemyCheck();
        levelWarriorCheck();
        battleCheck();
    }

    private boolean levelEnemyCheck() {
        //проверка уровня врага
        if (enemy.getLevelEnemy() < 0 & enemy.getLevelEnemy() > 100) {
            System.out.println("Invalid enemy level");
            return false;
        } else {
            return true;
        }
    }

    private boolean levelWarriorCheck() {
        //проверка уровня героя
        //не достиг ли он максимального уровня
        if (warrior.getLevelWarrior() <= 100) {
            return true;
        } else {
            System.out.println("Your Warrior has MAX level");
            return false;
        }
    }

    private void battleCheck() {
        if (levelEnemyCheck() && levelWarriorCheck()) {
            System.out.println("Enemy has correct level");
            System.out.println("Warrior has correct level");

            if (warrior.getLevelWarrior() == enemy.getLevelEnemy()) {
                warrior.setExperienceWarrior(warrior.getExperienceWarrior() + 10);
                System.out.println("Warrior won and has get +10ex");
                //Завершение битвы с врагом того же уровня,
                //что и ваш воин, принесет вам 10 очков опыта.

            } else if (warrior.getLevelWarrior() - enemy.getLevelEnemy() == 1) {
                warrior.setExperienceWarrior(warrior.getExperienceWarrior() + 5);
                System.out.println("Warrior won and has get +5ex");
                //Завершение битвы с врагом, который на один уровень ниже
                //вашего воина, будет стоить 5 очков опыта.

            } else if (Math.abs(warrior.getLevelWarrior() - enemy.getLevelEnemy()) <= 2) {
                warrior.setExperienceWarrior(warrior.getExperienceWarrior() + 0);
                System.out.println("Warrior won and has get +0ex");
                //Завершение битвы с врагом, который на два уровня ниже или
                //выше вашего воина, даст 0 очков опыта.
                //оставил +0 чтобы было понятно и в случае изменений в логике(например после патча будут
                // давать не +0 , а +1, было понятно и просто было найти)

            } else if (Math.abs(warrior.getLevelWarrior() - enemy.getLevelEnemy()) <= 5) {
                int diff = warrior.getLevelWarrior() - enemy.getLevelEnemy();
                warrior.setExperienceWarrior(warrior.getExperienceWarrior()+20 * diff * diff);
                System.out.println("Warrior won and has get +" + 20 * diff * diff + "ex");
                //Завершение битвы с врагом, который на один уровень
                //выше или выше вашего воина, ускорит ваш опыт. Чем больше разница
                //между уровнями, тем больше опыта приобретет ваш воин.
                //Формула равна 20 * diff * diff,
                //где diff равняется разнице уровней между врагом и вашим воином.

            } else {
                System.out.println("You've been defeated");
                //Однако, если ваш воин как минимум на один ранг ниже своего
                //врага и как минимум на 5 уровней ниже, ваш воин не может сражаться с
                //таким сильным врагом и должен вместо этого вернуть «Вы были побеждены».
            }
        } else {
            System.out.println("Invalid Warrior or Enemy level");
        }
        System.out.println("\nWarrior: " + warrior.getNameWarrior());
        System.out.println("lvl " + warrior.getLevelWarrior());
        System.out.println("ex " + warrior.getExperienceWarrior());
    }

}
