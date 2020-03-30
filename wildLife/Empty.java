package edu.iastate.cs228.hw1;

/**
 * @author
 */

/**
 * Empty squares are competed by various forms of life.
 */
public class Empty extends Living {

    /**
     * Constructor
     *
     * @param plain:  plain
     * @param row:    row position
     * @param column: column position
     */

    public Empty(Plain plain, int row, int column) {
        super.plain = plain;
        super.row = row;
        super.column = column;
    }

    /**
     * A empty occupies the square.
     */

    public State who() {
        return State.EMPTY;
    }

    /**
     * An empty square will be occupied by a neighboring Badger, Fox, Rabbit, or Grass,
     * or remain empty.
     *
     * @param pNew plain of the next life cycle.
     * @return Living  life form in the next cycle.
     */
    public Living next(Plain pNew) {
        int[] neighbors = new int[Living.NUM_LIFE_FORMS];
        pNew.grid[row][column].census(neighbors, pNew);
        if (neighbors[Living.RABBIT] > 1) {
            return pNew.grid[row][column] = new Rabbit(pNew, row, column, 0);
        } else if (neighbors[Living.FOX] > 1) {
            return pNew.grid[row][column] = new Fox(pNew, row, column, 0);
        } else if (neighbors[Living.BADGER] > 1) {
            return pNew.grid[row][column] = new Badger(pNew, row, column, 0);
        } else if (neighbors[Living.GRASS] > 1) {
            return pNew.grid[row][column] = new Grass(pNew, row, column);
        } else {
            return pNew.grid[row][column] = new Empty(pNew, row, column);
        }
    }

    @Override
    public String toString() {
        return "E";
    }
}
