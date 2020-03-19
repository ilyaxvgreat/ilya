package edu.iastate.cs228.hw1;

import java.io.*;
import java.util.Scanner;

/**
 * @author
 */

/**
 * The Wildlife class performs a simulation of a grid plain with
 * squares inhabited by badgers, foxes, rabbits, grass, or none.
 */
public class Wildlife {
    Plain even;                 // the plain after an even number of cycles
    Plain odd;                   // the plain after an odd number of cycles

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

    /**
     * Repeatedly generates plains either randomly or from reading files.
     * Over each plain, carries out an input number of cycles of evolution.
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        int inputNum;
        int thisDay = 0;
        String inputFileName;
        Plain plain;

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------" + "\n" +
                "This is Wildlife" + "\n" +
                "-----------------" + "\n" +
                "Please enter:\n" +
                "1 : Generate a random plain\n" +
                "2 : read a plain from an input file \n" +
                "3 : End the simulation \n" +
                "-----------------\n" +
                "Waiting for input...");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("... wrong input ...");
                scanner.next();
            }
            inputNum = scanner.nextInt();
        } while (inputNum < 1 || inputNum > 3);

        if (inputNum == 1) {
            int plainWidth;
            System.out.println("Input Plain width");
            while (!scanner.hasNextInt()) {
                System.out.println("... wrong input ...");
                scanner.next();
            }
            plainWidth = scanner.nextInt();
            plain = new Plain(plainWidth);
            plain.randomInit();
            System.out.println("random");
            scanner.close();
        } else if (inputNum == 2) {
            System.out.println("Input File name");
            while (!scanner.hasNextLine()) {
                System.out.println("... wrong input ...");
                scanner.next();
            }
            inputFileName = scanner.next();
            plain = new Plain(inputFileName);
            scanner.close();
            int daysQnt = 25;//TODO input this num
            for (int i = 0; i < plain.grid.length; i++) {
                for (int j = 0; j < plain.grid.length; j++) {
                    System.out.print(plain.grid[i][j] + "----");
                }
                System.out.print("\n");
            }
            while (thisDay < daysQnt) {
                updatePlain(plain, plain);
                System.out.println(thisDay + " days is passed");
                for (int i = 0; i < plain.grid.length; i++) {
                    for (int j = 0; j < plain.grid.length; j++) {
                        System.out.print(plain.grid[i][j] + "----");
                    }
                    System.out.print("\n");
                }
                thisDay++;
            }
        } else if (inputNum == 3) {
            System.out.println("END");
        } else {
            System.out.println("wrong input");
        }
        scanner.close();
    }
}
// TODO
//
// Generate wildlife simulations repeatedly like shown in the
// sample run in the project description.
//
// 1. Enter 1 to generate a random plain, 2 to read a plain from an input
//    file, and 3 to end the simulation. (An input file always ends with
//    the suffix .txt.)
//
// 2. Print out standard messages as given in the project description.
//
// 3. For convenience, you may define two plains even and odd as below.
//    In an even numbered cycle (starting at zero), generate the plain
//    odd from the plain even; in an odd numbered cycle, generate even
//    from odd.


// 4. Print out initial and final plains only.  No intermediate plains should
//    appear in the standard output.  (When debugging your program, you can
//    print intermediate plains.)
//
// 5. You may save some randomly generated plains as your own test cases.
//
// 6. It is not necessary to handle file input & output exceptions for this
//    project. Assume data in an input file to be correctly formated.


