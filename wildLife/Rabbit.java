package edu.iastate.cs228.hw1;

/**
 * @author
 */

/*
 * A rabbit eats grass and lives no more than three years.
 */
public class Rabbit extends Animal {

    /**
     * Creates a Rabbit object.
     *
     * @param plain:  plain
     * @param row:    row position
     * @param column: column position
     * @param age:    age
     */
    public Rabbit(Plain plain, int row, int column, int age) {
        super.plain = plain;
        super.row = row;
        super.column = column;
        super.age = age;
    }

    // Rabbit occupies the square.
    public State who() {
        // TODO
        return State.RABBIT;
    }

    /**
     * A rabbit dies of old age or hunger. It may also be eaten by a badger or a fox.
     *
     * @param pNew plain of the next cycle
     * @return Living  new life form occupying the same square
     */
    public Living next(Plain pNew) {
        int[] neighbors = new int[Living.NUM_LIFE_FORMS];
        pNew.grid[row][column].census(neighbors, pNew);
        if (age == Living.RABBIT_MAX_AGE) {
            return pNew.grid[row][column] = new Empty(pNew, row, column);
        } else if (neighbors[Living.GRASS] == 0) {
            return pNew.grid[row][column] = new Empty(pNew, row, column);
        } else if (neighbors[Living.RABBIT] == neighbors[Living.FOX] + neighbors[Living.BADGER]
                && neighbors[Living.FOX] > neighbors[Living.BADGER]) {
            return pNew.grid[row][column] = new Fox(pNew, row, column, 0);
        } else if (neighbors[Living.BADGER] > neighbors[Living.RABBIT]) {
            return pNew.grid[row][column] = new Badger(pNew, row, column, 0);
        } else {
            return pNew.grid[row][column] = new Rabbit(pNew, row, column, myAge() + 1);
        }
    }

    @Override
    public String toString() {
        return "R" + age;
    }
}
