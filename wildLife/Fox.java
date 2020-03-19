package edu.iastate.cs228.hw1;

/**
 * @author
 */

/**
 * A fox eats rabbits and competes against a badger.
 */
public class Fox extends Animal {

    /**
     * Constructor
     *
     * @param plain:  plain
     * @param row:    row position
     * @param column: column position
     * @param age:    age
     */
    public Fox(Plain plain, int row, int column, int age) {
        // TODO
        super.plain = plain;
        super.row = row;
        super.column = column;
        super.age = age;
    }

    /**
     * A fox occupies the square.
     */
    public State who() {
        // TODO
        return State.FOX;
    }

    /**
     * A fox dies of old age or hunger, or from attack by numerically superior badgers.
     *
     * @param pNew plain of the next cycle
     * @return Living  life form occupying the square in the next cycle.
     */
    public Living next(Plain pNew) {
        int[] neighbors = new int[Living.NUM_LIFE_FORMS];
        pNew.grid[row][column].census(neighbors, pNew);
        if (age >= Living.FOX_MAX_AGE) {
            return pNew.grid[row][column] = new Empty(pNew, row, column);
        } else if (neighbors[Living.BADGER] > neighbors[Living.FOX]) {
            return pNew.grid[row][column] = new Badger(pNew, row, column, 0);
        } else if (neighbors[Living.BADGER] + neighbors[Living.FOX] > neighbors[Living.RABBIT]) {
            return pNew.grid[row][column] = new Empty(pNew, row, column);
        } else {
            return pNew.grid[row][column] = new Fox(pNew, row, column, myAge() + 1);
        }
    }

    @Override
    public String toString() {
        return "F" + age;
    }
}
