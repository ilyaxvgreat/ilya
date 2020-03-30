package edu.iastate.cs228.hw1;

/**
 * @author
 */

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

/**
 * The plain is represented as a square grid of size width x width.
 */
public class Plain {
    private int width; // grid size: width X width

    public Living[][] grid;

    /**
     * Default constructor reads from a file
     */
    public Plain(String inputFileName) throws FileNotFoundException {
        File fileReader = new File(inputFileName);
        Scanner fileScanner = new Scanner(fileReader);
        while (fileScanner.hasNextLine()) {
            width++;
            fileScanner.nextLine();
        }
        fileScanner.close();
        Scanner scanner = new Scanner(fileReader);
        Plain plain = new Plain(width + 2);
        grid = new Living[width + 2][width + 2];
        System.out.println("... reading ...");
        while (scanner.hasNext()) {
            for (int j = 1; j < grid.length - 1; j++) {
                for (int k = 1; k < grid[j].length - 1; k++) {
                    String nextFileObj = scanner.next();
                    char firstLetter = nextFileObj.charAt(0);
                    int animalAge = 0;
                    if (nextFileObj.length() == 2) {
                        animalAge = Character.getNumericValue(nextFileObj.charAt(1));
                    }
                    switch (firstLetter) {
                        case 'B':
                            grid[j][k] = new Badger(plain, j, k, animalAge);
                            break;
                        case 'E':
                            grid[j][k] = new Empty(plain, j, k);
                            break;
                        case 'F':
                            grid[j][k] = new Fox(plain, j, k, animalAge);
                            break;
                        case 'G':
                            grid[j][k] = new Grass(plain, j, k);
                            break;
                        case 'R':
                            grid[j][k] = new Rabbit(plain, j, k, animalAge);
                            break;
                        default:
                            grid[j][k] = null;
                            break;
                    }
                }
            }
        }
        scanner.close();
        System.out.println(" reading complete ");
    }

    /**
     * Constructor that builds a w x w grid without initializing it.
     *
     * @param width the grid
     */
    public Plain(int width) {
        this.width = width;
    }

    /**
     * Initialize the plain by randomly assigning to every square of the grid
     * one of BADGER, FOX, RABBIT, GRASS, or EMPTY.
     * <p>
     * Every animal starts at age 0.
     */
    public void randomInit() {
        Plain plain = new Plain(width + 2);
        grid = new Living[width + 2][width + 2];
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length - 1; j++) {
                int randomNum = (int) (Math.random() * 5);
                switch (randomNum) {
                    case 0:
                        grid[i][j] = new Badger(plain, i, j, 0);
                        break;
                    case 1:
                        grid[i][j] = new Empty(plain, i, j);
                        break;
                    case 2:
                        grid[i][j] = new Fox(plain, i, j, 0);
                        break;
                    case 3:
                        grid[i][j] = new Grass(plain, i, j);
                        break;
                    case 4:
                        grid[i][j] = new Rabbit(plain, i, j, 0);
                        break;
                }
            }
        }
    }


    /**
     * Output the plain grid. For each square, output the first letter of the living form
     * occupying the square. If the living form is an animal, then output the age of the animal
     * followed by a blank space; otherwise, output two blanks.
     */
    public String toString() {
        // TODO
        return "Plain";
    }

    /**
     * Write the plain grid to an output file.  Also useful for saving a randomly
     * generated plain for debugging purpose.
     *
     * @throws FileNotFoundException
     */
    public void write(String outputFileName) throws IOException {
        FileWriter fileWriter = new FileWriter(outputFileName);

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length - 1; j++) {
                fileWriter.write(grid[i][j].toString() + " ");
                fileWriter.flush();
            }
            fileWriter.write("\n");
        }
        // TODO
        //
        // 1. Open the file.
        //
        // 2. Write to the file. The five life forms are represented by characters
        //    B, E, F, G, R. Leave one blank space in between. Examples are given in
        //    the project description.
        //
        // 3. Close the file.

    }

}
