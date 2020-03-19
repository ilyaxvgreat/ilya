package edu.iastate.cs228.hw1;

/**
 * @author
 */

/**
 * Grass remains if more than rabbits in the neighborhood; otherwise, it is eaten.
 */
public class Grass extends Living {
    public Grass(Plain plain, int row, int column) {
        super.plain = plain;
        super.row = row;
        super.column = column;
    }

    public State who() {
        // TODO
        return State.GRASS;
    }

    /**
     * Grass can be eaten out by too many rabbits. Rabbits may also multiply fast enough to take over Grass.
     */
    public Living next(Plain pNew) {
        int[] neighbors = new int[Living.NUM_LIFE_FORMS];
        pNew.grid[row][column].census(neighbors, pNew);
        if (neighbors[Living.GRASS] < 3 * neighbors[Living.RABBIT]) {
            return pNew.grid[row][column] = new Empty(pNew, row, column);
        } else if (neighbors[Living.RABBIT] > 3) {
            return pNew.grid[row][column] = new Rabbit(pNew, row, column, 0);
        } else {
            return pNew.grid[row][column] = new Grass(pNew, row, column);
        }
    }

    @Override
    public String toString() {
        return "G";
    }
}
