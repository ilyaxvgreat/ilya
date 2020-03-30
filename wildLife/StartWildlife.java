package edu.iastate.cs228.hw1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StartWildlife {
    private Plain plain;

    /**
     * This method prints menu for Wildlife
     */
    public void printWildlifeMenu() {
        System.out.println("-----------------" + "\n" +
                "This is Wildlife" + "\n" +
                "-----------------" + "\n" +
                "Please enter:\n" +
                "1 : Generate a random plain\n" +
                "2 : read a plain from an input file \n" +
                "3 : End the simulation \n" +
                "-----------------\n" +
                "Waiting for input...");
    }

    /**
     * Method returns int num from 1 to 3 witch user will write in console.
     *
     * @return inputNum
     */
    public int getMenuInput() {
        int inputNum;
        Scanner scanner = new Scanner(System.in);
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("... wrong input ...");
                scanner.next();
            }
            inputNum = scanner.nextInt();
        } while (inputNum < 1 || inputNum > 3);
        return inputNum;
    }

    public void generateRandomPlain() {
        Scanner scanner = new Scanner(System.in);
        int plainWidth;
        System.out.println("Input Plain width");
        while (!scanner.hasNextInt()) {
            System.out.println("... wrong input ...");
            scanner.next();
        }

        plainWidth = scanner.nextInt();
        plain = new Plain(plainWidth);
        plain.randomInit();
    }

    public void readPlainFromFile() throws FileNotFoundException {
        String inputFileName;
        System.out.println("Input File name");
        Scanner fileNameScanner = new Scanner(System.in);
        inputFileName = fileNameScanner.next();
        plain = new Plain(inputFileName);

    }

    public void startSimulation(int daysQnt) {
        int thisDay = 0;
        while (thisDay < daysQnt) {
            Wildlife.updatePlain(plain, plain);
            for (int i = 1; i < plain.grid.length - 1; i++) {
                for (int j = 1; j < plain.grid[i].length - 1; j++) {
                    System.out.format("%-2s%2s", plain.grid[i][j], "  ");
                }
                System.out.print("\n");
            }
            thisDay++;
            System.out.println(thisDay + " day(s) is passed");
        }
        try {
            plain.write("result.txt");
        } catch (IOException e) {
            System.out.println("Error. File has not written");
        }
    }

    public int inputDayQnt() {
        int dayQnt;
        System.out.println("Input day(s) quantity ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("... wrong input ...");
            scanner.next();
        }
        dayQnt = scanner.nextInt();
        return dayQnt;
    }

    public void endSimulation() {
        System.exit(0);
    }
}
