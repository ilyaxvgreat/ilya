package edu.iastate.cs228.hw1;

import java.io.*;

/**
 * @author
 */

/**
 * The Wildlife class performs a simulation of a grid plain with
 * squares inhabited by badgers, foxes, rabbits, grass, or none.
 */
public class Wildlife {


    /**
     * Repeatedly generates plains either randomly or from reading files.
     * Over each plain, carries out an input number of cycles of evolution.
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        int daysQnt;

        StartWildlife startWildlife = new StartWildlife();
        startWildlife.printWildlifeMenu();
        int inputNum = startWildlife.getMenuInput();

        if (inputNum == 1) {
            startWildlife.generateRandomPlain();
            daysQnt = startWildlife.inputDayQnt();
            startWildlife.startSimulation(daysQnt);
        } else if (inputNum == 2) {
            startWildlife.readPlainFromFile();
            daysQnt = startWildlife.inputDayQnt();
            startWildlife.startSimulation(daysQnt);
        } else if (inputNum == 3) {
            System.out.println("END");
            startWildlife.endSimulation();
        } else {
            System.out.println("wrong input");
        }
    }

    /**
     * Update the new plain from the old plain in one cycle.
     *
     * @param pOld old plain
     * @param pNew new plain
     */
    public static void updatePlain(Plain pOld, Plain pNew) {
        for (int i = 0; i < pOld.grid.length; i++) {
            for (int j = 0; j < pOld.grid[i].length; j++) {
                if (pOld.grid[i][j] != null) {
                    pNew.grid[i][j].next(pOld);
                }
            }
        }
    }
}

