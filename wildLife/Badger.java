package edu.iastate.cs228.hw1;

/**
 * @author
 */

/**
 * A badger eats a rabbit and competes against a fox.
 */
public class Badger extends Animal {

    /**
     * Constructor
     *
     * @param plain:  plain
     * @param row:    row position
     * @param column: column position
     * @param age:    age
     */

    public Badger(Plain plain, int row, int column, int age) {
        super.plain = plain;
        super.row = row;
        super.column = column;
        super.age = age;
    }

    /**
     * A badger occupies the square.
     */

    public State who() {
        return State.BADGER;
    }

    /**
     * A badger dies of old age or hunger, or from isolation and attack by a group of foxes.
     *
     * @param pNew plain of the next cycle
     * @return Living  life form occupying the square in the next cycle.
     */

    public Living next(Plain pNew) {
        int[] neighbors = new int[Living.NUM_LIFE_FORMS];
        pNew.grid[row][column].census(neighbors, pNew);
        if (age >= Living.BADGER_MAX_AGE) {
            return pNew.grid[row][column] = new Empty(pNew, row, column);
        } else if (neighbors[Living.BADGER] == 1 && neighbors[Living.FOX] > 1) {
            return pNew.grid[row][column] = new Fox(pNew, row, column, 0);
        } else if (neighbors[Living.BADGER] + neighbors[Living.FOX] > neighbors[Living.RABBIT]) {
            return pNew.grid[row][column] = new Empty(pNew, row, column);
        } else {
            return pNew.grid[row][column] = new Badger(pNew, row, column, myAge() + 1);
        }

    }

    @Override
    public String toString() {
        return "B" + age;
    }
}
